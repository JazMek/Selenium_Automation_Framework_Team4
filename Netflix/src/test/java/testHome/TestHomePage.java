package testHome;

import Home.HomePage;
import Home.NetflixPageWebElement;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

import static Home.HomePage.*;

public class TestHomePage extends WebAPI {
    @Test
    public void Testcheck_LindingPage(){
        init();
        homePage.Testcheck_LindingPage();
    }

    @Test(priority = 1)
        public void testloginToNetflixAccount() {
        init();
        homePage.loginToNetflixAccount();
       }
    @Test(priority = 2)
        public void testaddProfileIconToNetflix(){
        init();
        homePage.loginToNetflixAccount();
        homePage.addProfileIconToNetflix();
        }
    @Test
    public void Check_brokenLink() throws IOException {
        init();
        brokenLink();
    }
    @Test
    public void TestCheckPagelistLinks(){
        init();
        homePage.CheckPagelistLinks();
    }
    @Test
    public void testClickEnterKeyboard()  {
        init();
        homePage.clickEnterKeyboard1();
    }

}