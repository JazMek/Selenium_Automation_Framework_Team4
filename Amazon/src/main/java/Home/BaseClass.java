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



    public static BaseClass baseClass;
    public static void loginToAmazonAccount(){
        signin.click();
        userNameField.sendKeys("team4WDNY2020@gmail.com");
        continueButton.click();
        passWordField.sendKeys("Team42020");
        loginButton.click();
    }




    //30182NY_Achour Webelements *********************************************
//30182NY_Achour Webelement case N01:
    @FindBy(how= How.XPATH ,using = todaysDealsButtonXP)
    public static WebElement todaysDealsButton;

    @FindBy(how= How.XPATH ,using=SubscribeButtonXP)
    public static WebElement SubscribeButton;

    @FindBy(how= How.XPATH ,using=BacktoHomeBageXP)
    public static WebElement BacktoHomeBage;
//30182NY_Achour Webelement case N02:

   @FindBy(how= How.XPATH ,using=warehouseSectionXP)
   public static WebElement warehouseSection;

    @FindBy(how= How.XPATH ,using=seeAllCategoriesXP)
    public static WebElement seeAllCategories;

//30182NY_Achour Webelement case N03:

   @FindBy(how= How.XPATH ,using=amazonDeviceXP)
   public static WebElement amazonDevice;

    @FindBy(how= How.XPATH ,using=AddToCartXP)
    public static WebElement AddToCart;

//30182NY_Achour Webelement case N04:

    @FindBy(how= How.XPATH ,using=spportoutdoorsXP)
    public static WebElement spportoutdoors;

    @FindBy(how= How.XPATH ,using=seedetauilsXP)
    public static WebElement seedetauils;

    @FindBy(how= How.XPATH ,using=addAllToListXP)
    public static WebElement addAllToList;

//30182NY_Achour Webelement case N04:

   @FindBy(how= How.XPATH ,using=watchNowXP)
    public static WebElement watchNow;

    @FindBy(how= How.CLASS_NAME,using=closeButtonCS)
    public static WebElement closeButton;
}
