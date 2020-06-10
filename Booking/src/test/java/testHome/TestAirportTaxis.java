package testHome;

import Home.AirportTaxis;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static Home.AirportTaxis.*;
import static Home.BaseClass.*;

public class TestAirportTaxis extends WebAPI {



//    public static AirportTaxis airportTaxis;
//    public static void init(){
//        airportTaxis = PageFactory.initElements(driver,AirportTaxis.class);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
//    }

    @Test
    public void testBookYourAirportTaxi(){
         init();
        airportTaxis.testBookYourAirportTaxi();

    }




}
