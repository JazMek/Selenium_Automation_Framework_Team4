package testHome;

import common.WebAPI;
import org.testng.annotations.Test;

import java.io.IOException;

import static Home.HomePage.homePage;
import static Home.HomePage.init;

public class TestHomePage extends WebAPI {


    // test to get all the page links
    @Test
    public void getPageLinks(){
        init();
        PageLinksList(driver);

    }
    // test case to get all broken links
    @Test
    public void TestCheckBrokenLink() throws IOException {
        init();
        homePage.CheckBrokenLink();
    }
@Test
    public static void testClickEnterKeyboard() throws InterruptedException {
    init();
      homePage.ClickEnterKeyboard1();


}


}
