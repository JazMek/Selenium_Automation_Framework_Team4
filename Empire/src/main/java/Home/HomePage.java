package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static Home.EmpirePageWebElement.*;

public class HomePage extends WebAPI {

    public static HomePage homePage;
    public static EmpirePageWebElement empirePageWebElement;

    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        empirePageWebElement = PageFactory.initElements(driver, EmpirePageWebElement.class);
        setUpWindow();
    }


    // method for page broken links
    public void CheckBrokenLink() throws IOException {
        setUpWindow();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        brokenLink();
    }


    public void ClickEnterKeyboard1() throws InterruptedException {
        sleepFor(2);

//        enterTextToBox.isDisplayed();
//        System.out.println("the result is "+enterTextToBox.isDisplayed());
        loginClick.click();
        sleepFor(4);
        loginClick2.click();
        clickEnterKeyboard ( enterTextToBox,"planning");

    }
}
