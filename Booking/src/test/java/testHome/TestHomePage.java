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

import static Home.HomePage.loginToBooking;


public class TestHomePage extends WebAPI {
    public static HomePage homePage;

    public static BookingPageWebElement bookingPageWebElement;


    // hakim test cases:


    @BeforeTest
    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        bookingPageWebElement = PageFactory.initElements(driver, BookingPageWebElement.class);


    }


    @Test
    public void testcheckTitle() {

        init();
        homePage.checkTitle();


    }

    @Test
    public void testlonginToBook() {

        init();
        loginToBooking();
    }
        @Test
    public void testFind_your_next_flight_deal(){
        init();
        loginToBooking();
        homePage.Find_your_next_flight_deal();
    }

    @Test
    public void testCarrentals() {
        init();
        homePage.Carrentals();


    }


//@DataProvider
//public Object[][] getTestbookingdestinationlist() throws IOException, InvalidFormatException {
//    Object data [][]= DataReader.fileReader3("hakim","/Users/hakimbouaraba/Desktop/booking.xlsx");
//    return data;
//
//
//}
//
//
//    @Test(dataProvider ="getTestbookingdestinationlist")
//    public void Testbookingflightfonction(String from,String to) {
//        init();
////        driver.manage().deleteAllCookies();
//        homePage.bookingflightfonction(from, to);
//    }
    @Test
    public void Testbookingcompare_Text () {
        init();
        homePage.bookingcompare();


    }
//    @Test
    public void Check_brokenLink() throws IOException {
        init();
        brokenLink();
    }
    @Test
    public void getPageLinksList() throws IOException, InterruptedException {
        init();
        PageLinksList(driver);
    }
}



















