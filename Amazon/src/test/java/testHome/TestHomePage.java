package testHome;



import Home.AmazonPageWebElement;
import Home.HomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends WebAPI {

    public static HomePage homePage;
    public static AmazonPageWebElement amazonPageWebElement;
    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        amazonPageWebElement = PageFactory.initElements(driver, AmazonPageWebElement.class);
    }

@Test
    public void TestLoginToAmazon(){
      init();
      homePage.LoginToAmazon();

}


}