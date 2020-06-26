package testHome;


import Home.BookingPageWebElement;
import Home.HomePage;
import common.WebAPI;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReader;
import java.io.IOException;
import static Home.HomePage.init;
import static Home.HomePage.*;


public class TestHomePage extends WebAPI {
// Test case 01: check if the given Title  navigate to : booking.com.


   @BeforeTest
   public static void init(){
       homePage= PageFactory.initElements(driver, HomePage.class);
       bookingPageWebElement = PageFactory.initElements(driver, BookingPageWebElement.class);
       dataReader = PageFactory.initElements(driver, DataReader.class);

   }


   //  test case-01 user can login to homepage
    @Test
    public void longinToBook() {
     init();
        loginToBooking();
    }

    @Test
       public void testcheckTitle(){
        String ExpectTitle="Booking.com Account";
           init();
           // step1 login to booking page
           loginToBooking();
           //step2 check the text
//           homePage.checkTitle();
        // check 1 page
           homePage.getTitle( ExpectTitle);

   }
   //****************************************************testMethod using excel***************************


    // test case 07 to check the page broken links
    @Test
    public void TestCheckBrokenLink() throws IOException {
        init();
        homePage.CheckBrokenLink();
    }
    // test to get all the page links
    @Test
    public void getPageLinks(){
       init();
        PageLinksList(driver);

    }

    public  String path="C:\\Users\\ssbra\\Desktop\\Excel_files_Project\\Booking_register_File.xlsx";
    @DataProvider
    public Object[][] getTestData3() throws IOException, InvalidFormatException {

        Object data1 [][]=DataReader.fileReader4(path,"Sheet1");

        return data1;
    }
    // test case - user can register to booking account
@Test (dataProvider = "getTestData3")
    public void testBookingRegister(String emailAddress,String password,String confirmPassword) throws IOException {
  init();
    homePage.registerBooking(emailAddress,password,confirmPassword);
}






}