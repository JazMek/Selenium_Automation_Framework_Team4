package testHome;

import Home.BaseClass;
import Home.HomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

public class TestHomePage extends WebAPI {


    public  static HomePage homePage;
    public  static  BaseClass  baseClass;

    public static void init(){
        homePage= PageFactory.initElements(driver, HomePage.class);
        baseClass = PageFactory.initElements(driver, BaseClass.class);
    }



    @Test
    public void searchField() throws InterruptedException {
        init();
        baseClass.loginToBooking();

    }

import org.testng.Assert;
import org.testng.annotations.Test;

import static Home.BaseClass.*;
import static Home.HomePage.*;

public class TestHomePage extends WebAPI {


// Test case 01: check if the given Title  navigate to : booking.com.

   public static String url;

    @Test
       public void testcheckTitle(){

           init();
           homePage.checkTitle();


    }

    @Test
    public void testcheckTexte(){



         }

  @Test


       public void testcheckTexte(){



      init();
      homePage.checkTexte();
  }







}
