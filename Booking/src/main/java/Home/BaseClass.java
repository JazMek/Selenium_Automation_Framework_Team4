package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


import java.util.concurrent.TimeUnit;

import static Home.BookingPageWebElement.*;
import static Home.LoginPage.*;


public class BaseClass extends WebAPI {

    public  static HomePage homePage;
    public  static  LoginPage  loginPage;
    public static AirportTaxis airportTaxis;


    @BeforeTest
    public static void init(){
        homePage= PageFactory.initElements(driver, HomePage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        airportTaxis = PageFactory.initElements(driver,AirportTaxis.class);


    }


    public void loginToBooking() {
    }
}

