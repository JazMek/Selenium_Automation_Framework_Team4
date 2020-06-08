package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import static Home.BookingPageWebElement.*;
import static Home.BookingPageWebElement.loginButtonXP;

public class LoginPage extends WebAPI {






    @FindBy(how= How.XPATH,using=signinButtonXP)
    public static WebElement signinButton;

    @FindBy(how= How.CSS,using=signinButton2CSS)
    public static WebElement signinButton2;


    @FindBy(how= How.XPATH,using=emailFieldXP)

    public static WebElement emailField;

    @FindBy(how= How.XPATH,using=nextButtonXP)
    public static WebElement nextButton;

    @FindBy(how= How.XPATH,using=passWordFieldXP)
    public static WebElement passWordField;

    @FindBy(how= How.XPATH,using=loginButtonXP)
    public static WebElement loginButton;


    public static void loginToBooking(){

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        signinButton2.click();

        emailField.sendKeys("team4WDNY2020@gmail.com");

        nextButton.click();

        passWordField.sendKeys("Team42020");

        loginButton.click();

    }



}
