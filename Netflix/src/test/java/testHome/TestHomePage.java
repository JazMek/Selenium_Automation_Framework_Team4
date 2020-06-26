package testHome;


import Home.HomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.awt.*;

import static Home.HomePage.*;

public class TestHomePage extends WebAPI {



    @Test
    public void searchField() throws InterruptedException {
        init();
        homePage.loginToAmazonAccount();
    }
    @Test
    public void TestDVDButton(){
        init();
        homePage.setDVD();
    }
    @Test
    public void TestDVDPageTitle(){
        init();
        homePage.setDVDPageTitle();
    }
    @Test
    public void TestKidsTitle(){
        init();
        homePage.setKidsTitle();
    }
    @Test
    public void TestPokemonSeries(){
    init();
    homePage.setPokemonSeries();
}
    @Test
    public void testClickEnterKeyboard() throws AWTException, InterruptedException {
        init();
        homePage.clickEnterKeyboard1();
}
}