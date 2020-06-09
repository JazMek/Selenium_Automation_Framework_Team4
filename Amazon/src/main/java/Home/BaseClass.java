package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.swing.*;

import static Home.AmazonPageWebElement.*;


public class BaseClass extends WebAPI {


    @FindBy(how= How.XPATH,using=signinButtonXP)
    public static WebElement signinButton;

    @FindBy(how= How.CSS,using=signinButton2CSS)
    public static WebElement signinButton2;

    @FindBy(how= How.XPATH,using=userNameFieldXP)
    public static WebElement userNameField;

    @FindBy(how= How.XPATH,using=continueButtonXP)
    public static WebElement continueButton;

    @FindBy(how= How.XPATH,using=passWordFieldXP)
    public static WebElement passWordField;

    @FindBy(how= How.ID,using=loginButtonID)
    public static  WebElement loginButton;

    @FindBy(how= How.CSS ,using = signinCSS)
    public static  WebElement signin;

    @FindBy(how= How.CSS ,using=searchBoxCSS)
    public static WebElement searchBox;

    @FindBy(how= How.CSS ,using=searchButtonCSS)
    public static WebElement searchButton;

// Find a Gift Webelement (salah):

   // test #1 :
    @FindBy(how= How.XPATH ,using=amazonFindAGiftbuttonXP)
    public static WebElement amazonFindAGiftbutton;
    @FindBy(how= How.XPATH ,using=amazonFindAGiftTextXP)
    public static WebElement amazonFindAGiftText;

    // test #2 :
    @FindBy(how = How.XPATH ,using = amazonEGIFTSButtonXP)
    public static WebElement amazonEGIFTSButton;

    // test #3 :
    @FindBy(how = How.XPATH ,using =amazonGiftWrapIconXP )
    public static WebElement amazonGiftWrapIcon;

    // test #4 :
    @FindBy(how = How.XPATH ,using =PriceAllPricesScrollDownXP)
    public static WebElement PriceAllPricesScrollDown;

    @FindBy(how = How.XPATH,using = amazonFindGiftHarryPotterandtheSorcerersStoneXP)
    public static WebElement amazonFindGiftHarryPotterandtheSorcerersStone;
    @FindBy(how = How.XPATH,using = amazonFindGiftHarryPotterReadForFreeXP)
    public static WebElement amazonFindGiftHarryPotterReadForFree;


    public static BaseClass baseClass;


    public static void loginToAmazonAccount(){
        signin.click();
        userNameField.sendKeys("team4WDNY2020@gmail.com");
        continueButton.click();
        passWordField.sendKeys("Team42020");
        loginButton.click();
    }






}

