package testHome;
import Home.GeicoPageWebElement;
import Home.HomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;



public class TestHomePage extends WebAPI {
    public  static HomePage homePage;
    public  static GeicoPageWebElement bookingPageWebElement;
    @BeforeTest
    public static void init(){
        homePage= PageFactory.initElements(driver, HomePage.class);
        bookingPageWebElement = PageFactory.initElements(driver,GeicoPageWebElement.class);
    }
    //**** LAMARAs Check Broken Links  ******************
    @Test
    public void TestCheck_brokenLink() throws IOException, InterruptedException {
        init();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        homePage.Check_brokenLink();
    }
    //******* LAMARAs get page links  ***********
    @Test
    public void getPageLinksList() throws IOException, InterruptedException {
        init();
        PageLinksList(driver);
    }

}
