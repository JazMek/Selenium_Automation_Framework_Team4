package testHome;
import Home.HomePage;
import Home.NetflixPageWebElement;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static Home.HomePage.loginToAmazonAccount;
public class TestHomePage extends WebAPI {
public static HomePage homePage;
public static NetflixPageWebElement netflixPageWebElement;
public static void init() {
homePage = PageFactory.initElements(driver, HomePage.class);
netflixPageWebElement = PageFactory.initElements(driver, NetflixPageWebElement.class);
}
@Test
public void searchField() {
init();
loginToAmazonAccount();
}
}
