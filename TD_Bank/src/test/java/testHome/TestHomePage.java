package testHome;
import Home.HomePage;
import Home.TD_BankPageWebElement;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static Home.TD_BankPageWebElement.*;

public class TestHomePage extends WebAPI {
    public  static HomePage homePage;
    public  static TD_BankPageWebElement bookingPageWebElement;
    @BeforeTest
    public static void init(){
        homePage= PageFactory.initElements(driver, HomePage.class);
        bookingPageWebElement = PageFactory.initElements(driver,TD_BankPageWebElement.class);
    }
    //**** Check Broken Links  ******************
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
    //**** LAMARAs Test case using Scroll Down methods and switching windows *********
    @Test
    public void testSwitchWindows() throws InterruptedException {
        init();
        scrollPageDown(driver);
        setUpWindow();
        sleepFor(2);
        PopUpWindowClose2( driver,closePopupWindowXPATH);
        switchWindows.click();
        switchWindowTOChildWindow ( driver);
        useChildWindow.click();
        sleepFor(4);
        switchChildWindowTOParentWindow ( driver);
        sleepFor(5);
        clickFacbookLink.click();
        sleepFor(5);
    }
    //**** LAMARAs Test case using Hover Mouse method and switching Windows *********
    @Test
    public void TestServicesForeignExchange() throws InterruptedException {
        init();
        homePage.ServicesForeignExchange();
    }


}
