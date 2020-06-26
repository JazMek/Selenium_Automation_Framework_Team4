package Home;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomePage extends WebAPI {

    public static HomePage homePage;
    public static GeicoPageWebElement geicoPageWebElement;

    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        geicoPageWebElement = PageFactory.initElements(driver, GeicoPageWebElement.class);
    }
    // method for page broken links
    public void CheckBrokenLink() throws IOException {
        setUpWindow();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        brokenLink();
    }



}
