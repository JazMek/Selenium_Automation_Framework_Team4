package testHome;

import Home.BaseClass;
import Home.HomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
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

      init();
      homePage.checkTexte();
  }






}
