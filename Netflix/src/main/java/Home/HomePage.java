package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static Home.NetflixPageWebElement.*;
import static Home.NetflixPageWebElement.signinButton2;

public class HomePage extends WebAPI {

    public static HomePage homePage;
    public static NetflixPageWebElement netflixPageWebElement;

    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        netflixPageWebElement = PageFactory.initElements(driver, NetflixPageWebElement.class);
    }


// method to login to netflix Account
    public static void loginToNetflixAccount(String username, String password){
        signinButton.click();
        userNameField.sendKeys(username);
        passWordField.sendKeys(password);
        signinButton2.click();
    }
    // method for page broken links
    public void CheckBrokenLink() throws IOException {
        setUpWindow();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        brokenLink();
    }


    public void clickEnterKeyboard1() {

//        typeOnInputBox(enterSearchXPATH, "brahim@yahoo.fr");
        clickEnterKeyboard (enterSearch,"lhaja@gmail.com");

    }
}

