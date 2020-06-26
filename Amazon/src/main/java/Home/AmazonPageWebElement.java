package Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonPageWebElement {

        //********************** hakim web element ******************


    public static final String signinButtonXP="//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]";
    @FindBy(how= How.XPATH,using=signinButtonXP)
    public static WebElement signinButton;

    public static final String signinButton2CSS="#nav-flyout-ya-signin > a > span";
    @FindBy(how= How.CSS,using=signinButton2CSS)
    public static WebElement signinButton2;


    public static final String userNameFieldXP =" //input[@id='ap_email']";
    @FindBy(how= How.XPATH,using=userNameFieldXP)
    public static WebElement userNameField;

    public static final String continueButtonXP="//input[@id='continue']";
    @FindBy(how= How.XPATH,using=continueButtonXP)
    public static WebElement continueButton;

    public static final String passWordFieldXP=" //input[@id='ap_password']";
    @FindBy(how= How.XPATH,using=passWordFieldXP)
    public static WebElement passWordField;

    public static final String loginButtonID="signInSubmit";
    @FindBy(how= How.ID,using=loginButtonID)
    public static  WebElement loginButton;

    public static final String signinCSS ="#nav-link-accountList > div > span";
    @FindBy(how= How.CSS ,using = signinCSS)
    public static  WebElement signin;

    public static final String searchBoxCSS ="#twotabsearchtextbox";
    @FindBy(how= How.CSS ,using=searchBoxCSS)
    public static WebElement searchBox;

    public static final String searchButtonCSS ="#nav-search > form > div.nav-right > div > input";
    @FindBy(how= How.CSS ,using=searchButtonCSS)
    public static WebElement searchButton;

    // Hakim webelementconnection:


    public static final String amazonWholefoodstextCSS ="#nav-subnav > a.nav-a.nav-hasImage > span > img";
    @FindBy(how= How.CSS ,using=amazonWholefoodstextCSS)
    public static WebElement amazonWholefoodstext;

    public static final String amazonWholefoodsbuttonXP ="//*[@id='nav-xshop']/a[6]";
    @FindBy(how= How.XPATH ,using=amazonWholefoodsbuttonXP)
    public static WebElement amazonWholefoodsbutton;

    public static final String amazonDealstextCSS ="#nav-subnav > a:nth-child(3) > span";
    @FindBy(how= How.CSS ,using=amazonDealstextCSS)
    public static WebElement amazonDealstext;

    //*******Check Best sellers Page Url******************
    public static final String ClickBestSellersCSS ="#nav-xshop > a:nth-child(2)";
    @FindBy(how= How.CSS ,using=ClickBestSellersCSS)
    public static WebElement ClickBestSellers;

    //search Dropdown Box webElements
    public static final String searchDropdownBoxXP ="//select[@id='searchDropdownBox']";
    @FindBy(how= How.XPATH ,using=searchDropdownBoxXP )
    public static WebElement searchDropdownBox;

    public static void loginToAmazonAccount(){
        signin.click();
        userNameField.sendKeys("team4WDNY2020@gmail.com");
        continueButton.click();
        passWordField.sendKeys("Team42020");
        loginButton.click();




    }


    public static final String actualtestXP="//h2[@class='headline']";
    @FindBy(how= How.XPATH,using =actualtestXP)
    public static WebElement actualtest;


    public static final String SearchtextboxFieldXP ="//input[@id='twotabsearchtextbox']";
    @FindBy(how= How.XPATH ,using=SearchtextboxFieldXP )
    public static WebElement SearchtextboxField;

    public static final String SearchTextBoxFieldCSS ="#twotabsearchtextbox";
    @FindBy(how= How.CSS ,using=SearchTextBoxFieldCSS )
    public static WebElement SearchTextBoxField;





}
