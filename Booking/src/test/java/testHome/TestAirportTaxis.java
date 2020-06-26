package testHome;

import Home.AirportTaxis;
import Home.BookingPageWebElement;
import Home.HomePage;
import Home.LoginPage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static Home.AirportTaxis.*;
import static Home.HomePage.*;
import static Home.LoginPage.*;


public class TestAirportTaxis extends WebAPI {


    public  static HomePage homePage;
    public  static LoginPage loginPage;
    public static AirportTaxis airportTaxis;
    public static BookingPageWebElement bookingPageWebElement;

    public static void init(){
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        airportTaxis = PageFactory.initElements(driver,AirportTaxis.class);
        bookingPageWebElement = PageFactory.initElements(driver,BookingPageWebElement.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
    }
    @Test
    public void Testcheck_LindingPage(){
        init();
        airportTaxis.check_LindingPage();
    }
    @Test
    public void testBookYourAirportTaxi(){
         init();
         loginPage.loginToBooking();
         airportTaxis.testBookYourAirportTaxi();
    }
     @Test
    public void TestScrollDownairportTaxis() throws InterruptedException {
         init();
         loginPage.loginToBooking();
         airportTaxis.ScrollDownairportTaxis();
     }
    @Test
    public void TestScrollUPairportTaxis() throws InterruptedException {
        init();
        loginPage.loginToBooking();
        airportTaxis.ScrollUPairportTaxis();
    }
    @Test
    public void Check_brokenLink() throws IOException {
        init();
        airportTaxis.brokenLink();
    }
    @Test
    public void TestCheckPagelistLinks(){
        init();
        airportTaxis.CheckPagelistLinks();
    }

    public void CheckPagelistLinks() {
        airportTaxis.PageLinksList(driver);
    }
}
