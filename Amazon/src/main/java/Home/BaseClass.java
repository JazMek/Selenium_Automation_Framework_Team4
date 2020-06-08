package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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

//    //Hakim webelementconnection:
//    @FindBy(how= How.XPATH ,using=amazonWholefoodsbuttonXP)
//    public static WebElement amazonWholefoodsbutton;
//
//    @FindBy(how= How.CSS ,using=amazonWholefoodstextCSS)
//    public static WebElement amazonWholefoodstext;


    //*******Check Best sellers Page Url******************
    @FindBy(how= How.CSS ,using=ClickBestSellersCSS)
    public static WebElement ClickBestSellers;

    public static BaseClass baseClass;
    public static void loginToAmazonAccount(){
        signin.click();
        userNameField.sendKeys("team4WDNY2020@gmail.com");
        continueButton.click();
        passWordField.sendKeys("Team42020");
        loginButton.click();
    }

}

