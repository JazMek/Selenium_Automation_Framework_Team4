package testHome;
import Home.BookingPageWebElement;
import Home.HomePage;
import common.WebAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.TestRunner;
import org.testng.annotations.*;
import utility.DataReader;

import java.awt.*;
import java.io.IOException;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import static Home.HomePage.*;
public class TestHomePage extends WebAPI {
    public  static HomePage homePage;
    public  static BookingPageWebElement bookingPageWebElement;
    @BeforeTest
    public static void init(){
        homePage= PageFactory.initElements(driver, HomePage.class);
        bookingPageWebElement = PageFactory.initElements(driver,BookingPageWebElement.class);
    }
    
// ------LAMARAs  check if the given Title  navigate to : booking.com.
    @Test
       public void testcheckTitle(){
        init();
        loginToBooking();
        homePage.checkTitle();
    }
    // -----------  LAMARAs check if the user can book after Login
    @Test
    public void longinToBook() {
        init();
        loginToBooking();
    }
    //-----  LAMARAs Check 'Car Rentals' button-----------
    @Test
    public void ClickCarRentalsButton() throws InterruptedException {
       init();
       //step1: Navigate to Booking.com
        setUpWindow();
        //step2: Click on 'Car Rentals' link
        sleepFor(3);
        homePage.CarRentalsClick();
        driver.quit();
    }
    //------ LAMARAs check Deals Search Box ----------------
    @Test
    public void testFillUpCheckBox() throws InterruptedException {
        init();
        loginToBooking();
        sleepFor(5);
        setUpWindow();
        homePage.CarRentalsClick();
        homePage.FillUpCheckBox();
        driver.quit();
    }
    //**** LAMARAs Check Broken Links  ******************
    @Test
    public void TestCheck_brokenLink() throws IOException, InterruptedException {
        init();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        homePage.Check_brokenLink();
    }
    //******* LAMARAs get page links  ***********
    @Test
    public void getPageLinksList() throws IOException, InterruptedException {
        init();
        PageLinksList(driver);
    }
//*************** LAMARAs registration to booking account with Excel Read File ****************************
    public String path="C:\\Users\\lamar\\Desktop\\Selenium\\Booking_register_File.xlsx";
    @AfterTest
    @DataProvider
    public Object[][] getTestData3() throws IOException, InvalidFormatException {
        Object data1 [][]= DataReader.fileReader4(path,"Sheet1");
        return data1;
    }
    @Test(dataProvider = "getTestData3") 
    public void testBookingRegister(String emailAddress,String password,String confirmPassword) throws IOException, AWTException {
        init();
        homePage.registerBooking(emailAddress,password,confirmPassword);
        
    }
}
