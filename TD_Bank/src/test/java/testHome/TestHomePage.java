package testHome;

import common.WebAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;

import static Home.HomePage.*;
import static Home.TD_BankPageWebElement.*;

public class TestHomePage extends WebAPI {

// test case-1- user can scroll down to the wanted element
   @Test
    public static void testScrollDownToElement() throws InterruptedException {
       init();
       scrollIntoView(getlinkManageYourLoan,  driver);
       sleepFor(3);
       PopUpWindowClose2( driver, clickPopUpwindowCloseXPATH);

      // deletCookies(driver);
        homePage.typeInSearchBox();
   }
  // test case to get all broken links
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
 // test case: user can click on twitter link and perform actions on twitter child Window
   @Test
    public void testSwitchWindows() throws InterruptedException {
       init();
       homePage.switchWindow();
   }
   //test case - user can get the  travelers Foreign Exchange Calculator by country
    @Test
    public void TestCheck_International_Travel_Tips() throws InterruptedException {
        init();
        homePage.Check_International_Travel_Tips();
    }





}
