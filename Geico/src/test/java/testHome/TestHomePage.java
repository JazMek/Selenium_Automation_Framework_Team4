package testHome;

import common.WebAPI;
import org.testng.annotations.Test;

import java.io.IOException;

import static Home.HomePage.homePage;
import static Home.HomePage.init;

public class TestHomePage extends WebAPI {

    // test case 07 to check the page broken links
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
}
