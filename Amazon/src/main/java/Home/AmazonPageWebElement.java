package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonPageWebElement  {

    public static final String searchBoxCSS ="#twotabsearchtextbox";
    public static final String searchButtonCSS ="#nav-search > form > div.nav-right > div > input";
    public static final String signinButtonXP="//*[@id=\"nav-signin-tooltip\"]/a/span";
    public static final String signinButton2CSS="#nav-flyout-ya-signin > a > span";
    public static final String userNameFieldXP =" //input[@id='ap_email']";
    public static final String continueButtonXP="//input[@id='continue']";
    public static final String passWordFieldXP=" //input[@id='ap_password']";
    public static final String loginButtonID="signInSubmit";
    public static final String signinCSS ="#nav-link-accountList > div > span";

//*************************Salah webelement find a gift ***********************
//30181NY_salah test case1:
    public static final String FindAGiftXP ="//*[@id=\"nav-xshop\"]/a[4]";
//30181NY_salah test case2:
    public static final String FindAGiftPageTextXP = "//*[@id=\"notification-provider\"]/div/div/div[1]/h2";
//30181NY_salah test case3:
    public static final String EGIFTSXP="//span[contains(text(),'e-Gifts')]";
//30181NY_salah test case4:
    public static final String EGiftWrapIconXP="//*[@id=\"notification-provider\"]/div/div[2]/div/div/div[3]/div[2]/div/div/label/i";
//30181NY_salah test case5:
    public static final String AllPricesScrollDownXP="//*[@id=\"notification-provider\"]/div/div[2]/div/div/div[3]/div[1]/div/div/span[2]";
//30181NY_salah test case6:



    public static final String amazonWomenPageXP ="//*[@id=\"notification-provider\"]/div/div/div[1]/div/a[3]/div/div[2]/span";
    @FindBy(how = How.XPATH,using = amazonWomenPageXP)
    public static WebElement amazonWomenPage;
    public static final String AgeGroupXP ="//*[@id=\"notification-provider\"]/div/div[3]/div/div/div[1]/div/div/div[1]/div/span[2]";
    @FindBy(how = How.XPATH,using = AgeGroupXP)
    public static WebElement AgeGroup;
    public static final String GenderXP ="//*[@id=\"notification-provider\"]/div/div[3]/div/div/div[1]/div/div/div[2]/div/span[2]";
    @FindBy(how = How.XPATH,using = GenderXP)
    public static WebElement Gender;
    public static final String AllPricesXP ="//*[@id=\"notification-provider\"]/div/div[3]/div/div/div[3]/div[1]/div/div/span[2]";
    @FindBy(how = How.XPATH,using = AllPricesXP)
    public static WebElement AllPrices;
    public static final String GiftWrapCheckBoxXP ="//*[@id=\"notification-provider\"]/div/div[3]/div/div/div[3]/div[2]/div/div/label/i";
    @FindBy(how = How.XPATH,using = GiftWrapCheckBoxXP)
    public static WebElement GiftWrapCheckBox;


    public static final String PreschoolerXP ="//*[@id=\"notification-provider\"]/div/div/div[1]/div/a[7]";
    @FindBy(how = How.XPATH,using = PreschoolerXP)
    public static WebElement Preschooler;

    public static final String PlayDohXP ="//*[@id=\"gcx-gf-section-0\"]/div/section/div[3]/figure/div/a/div/div";
    @FindBy(how = How.XPATH,using = PlayDohXP)
    public static WebElement PlayDoh;

    public static final String PlayDohAddToCardXP ="//*[@id=\"add-to-cart-button\"]";
    @FindBy(how = How.XPATH,using = PlayDohAddToCardXP)
    public static WebElement PlayDohAddToCard;


    @FindBy(how= How.XPATH,using=signinButtonXP) public static WebElement signinButton;
    @FindBy(how= How.CSS,using=signinButton2CSS) public static WebElement signinButton2;
    @FindBy(how= How.XPATH,using=userNameFieldXP) public static WebElement userNameField;
    @FindBy(how= How.XPATH,using=continueButtonXP) public static WebElement continueButton;
    @FindBy(how= How.XPATH,using=passWordFieldXP) public static WebElement passWordField;
    @FindBy(how= How.ID,using=loginButtonID) public static  WebElement loginButton;
    @FindBy(how= How.CSS ,using = signinCSS) public static  WebElement signin;
    @FindBy(how= How.CSS ,using=searchBoxCSS) public static WebElement searchBox;
    @FindBy(how= How.CSS ,using=searchButtonCSS) public static WebElement searchButton;
    // Find a Gift Webelement (salah):
    // test #1 :
    @FindBy(how= How.XPATH ,using=FindAGiftXP) public static WebElement FindAGift;
    @FindBy(how= How.XPATH ,using=FindAGiftPageTextXP) public static WebElement FindAGiftPageText;
    // test #2 :
    @FindBy(how = How.XPATH ,using = EGIFTSXP) public static WebElement EGIFTS;
    // test #3 :
    @FindBy(how = How.XPATH ,using =EGiftWrapIconXP ) public static WebElement EGiftWrapIcon;
    // test #4 :
    @FindBy(how = How.XPATH ,using =AllPricesScrollDownXP) public static WebElement AllPricesScrollDown;

    public static final String searchDropdownXP ="//*[@id=\"searchDropdownBox\"]";
    public static final String AllXp="//*[@id=\"searchDropdownBox\"]";
    public static WebElement All;
    @FindBy(how= How.XPATH ,using=searchDropdownXP )
    public static WebElement searchDropdown;




    //search Dropdown Box webElements

















}

