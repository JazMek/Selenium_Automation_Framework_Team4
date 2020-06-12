package testHome;

import Home.BookingPageWebElement;
import Home.HomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static Home.HomePage.loginToBooking;

public class TestHomePage extends WebAPI {
    public  static HomePage homePage;
    public  static BookingPageWebElement bookingPageWebElement;
    @BeforeTest
    public static void init(){
        homePage= PageFactory.initElements(driver, HomePage.class);
        bookingPageWebElement = PageFactory.initElements(driver,BookingPageWebElement.class);
    }
// Test case 01: check if the given Title  navigate to : booking.com.
    public static String url;
    @Test
       public void testcheckTitle(){
        init();
        loginToBooking();
        homePage.checkTitle();
    }
    // Test case 02: check if the user can book after Login
    @Test
    public void longinToBook() {
        init();
        loginToBooking();
    }
    //-----Check 'Car Rentals' button-----------
    
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
    @Test
    public void testFillUpCheckBox() throws InterruptedException {
        init();
        //loginToBooking();
        sleepFor(5);
        //setUpWindow();
        //homePage.CarRentalsClick();
        homePage.FillUpCheckBox();
        //driver.quit();
        
    }
    


}
