package testHome;

import Home.HomePage;
import Home.NetflixPageWebElement;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

import static Home.HomePage.loginToAmazonAccount;

public class TestHomePage extends WebAPI {


    public static HomePage homePage;
    public static NetflixPageWebElement netflixPageWebElement;

    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        netflixPageWebElement = PageFactory.initElements(driver, NetflixPageWebElement.class);
    }

    // hakim test cases:

        @Test
    public void searchField() throws InterruptedException {
        init();

        loginToAmazonAccount();

    }
    @Test
    public void TestNetflixhomepagelimk() {
        init();
        homePage.Netflixhomepagelimk();
    }

        @Test
    public void TestNetflixhomepageTitle() {
        init();
        homePage.NetflixhomepageTitle();


    }

        @Test
    public void Testnetflixcompare_Text() {
        init();
        homePage.Netflixcompare();


    }

        @Test
    public void Check_brokenLink() throws IOException {
        init();
        brokenLink();
    }

    @Test
    public void getPageLinksList() throws IOException, InterruptedException {
        init();
        PageLinksList(driver);
    }
  @Test
    public void testClickEnterKeyboard() throws AWTException, InterruptedException {
        init();
        homePage.clickEnterKeyboard1();
        sleepFor(6);
    }
}