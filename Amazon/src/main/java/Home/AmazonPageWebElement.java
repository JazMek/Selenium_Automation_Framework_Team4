package Home;
import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class AmazonPageWebElement  {
//loginToAmazon
    public static final String searchBoxCSS ="#twotabsearchtextbox";
    public static final String searchButtonCSS ="#nav-search > form > div.nav-right > div > input";
    public static final String signinButtonXP="//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]";
    public static final String signinButton2CSS="#nav-flyout-ya-signin > a > span";
    public static final String userNameFieldXP =" //input[@id='ap_email']";
    public static final String continueButtonXP="//input[@id='continue']";
    public static final String passWordFieldXP=" //input[@id='ap_password']";
    public static final String loginButtonID="signInSubmit";
    public static final String signinCSS ="#nav-link-accountList > div > span";
 //    public static final String signinButton2CSS="#nav-flyout-ya-signin > a > span";
//    public static final String userNameFieldXP =" //input[@id='ap_email']";
//    public static final String continueButtonXP="//input[@id='continue']";
//    public static final String passWordFieldXP=" //input[@id='ap_password']";
//    public static final String loginButtonID="signInSubmit";
//    public static final String signinCSS ="#nav-link-accountList > div > span";
public class AmazonPageWebElement extends WebAPI {
//*****************************30182NY_Achour_locators*********************************************************
//30182NY_Achour testLocators#1
public static final String message="Amazon is launching";
//30182NY_Achour testLocators#2:
    public static final String todaysDealsButtonXP ="//*[@id=\"nav-xshop\"]/a[5]";
    public static final String SubscribeButtonXP ="//*[@id=\"gbox-item-0.0.0\"]/div/div/div[2]/a";
    public static final String BacktoHomeBageXP="/html/body/div[4]/div/div/form/span/a";
    //30182NY_Achour Webelement case N02:
    @FindBy(how= How.XPATH ,using = todaysDealsButtonXP)
    public static WebElement todaysDealsButton;
    @FindBy(how= How.XPATH ,using=SubscribeButtonXP)
    public static WebElement SubscribeButton;
    @FindBy(how= How.XPATH ,using=BacktoHomeBageXP)
    public static WebElement BacktoHomeBage;
//30182NY_Achour testLocators#3:
    public static final String warehouseSectionXP ="//*[@id=\"nav-subnav\"]/a[5]/span";
    public static final String seeAllCategoriesXP="//*[@id=\"leftNav\"]/ul/div/li[8]/span/a/span";
//karim WebElements
//WebElements for Amazon login
    public static final String HamburgerMenuXP ="//*[@id='nav-hamburger-menu']/i";
    @FindBy(how= How.XPATH ,using=HamburgerMenuXP)
    public static WebElement HamburgerMenu;
    public static final String hmenuCustomerNameID ="hmenu-customer-name";
    @FindBy(how= How.ID ,using=hmenuCustomerNameID)
    public static WebElement hmenuCustomerName;
    public static final String ApEmailXP ="//*[@id='ap_email']";
    @FindBy(how= How.XPATH ,using=ApEmailXP)
    public static WebElement ApEmail;
//30182NY_Achour testLocators#3:
    public static final String amazonDeviceXP ="//*[@id=\"widgetFilters\"]/div[1]/div[2]/span[1]/div/label/input";
    public static final String AddToCartXP="//*[@id=\"101 0a1d0fbc-announce\"]";
    public static final String ApPasswordXP ="//*[@id='ap_password']";
    @FindBy(how= How.XPATH ,using=ApPasswordXP)
    public static WebElement ApPassword;
//    WebElements for Amazon login
    //30182NY_Achour Webelement case N03:
    @FindBy(how= How.XPATH ,using=warehouseSectionXP)
    public static WebElement warehouseSection;
    @FindBy(how= How.XPATH ,using=seeAllCategoriesXP)
    public static WebElement seeAllCategories;
//30182NY_Achour testLocators#4:
    public static final String amazonDeviceXP ="//*[@id=\"widgetFilters\"]/div[1]/div[2]/span[1]/div/label/input";
    public static final String AddToCartXP="//*[@id=\"101 321f2b09-announce\"]";
    //30182NY_Achour Webelement case N04:
    @FindBy(how= How.XPATH ,using=amazonDeviceXP)
    public static WebElement amazonDevice;
    @FindBy(how= How.XPATH ,using=AddToCartXP)
    public static WebElement AddToCart;
//30182NY_Achour testLocators#5:
    public static final String spportoutdoorsXP ="//*[@id=widgetFilters]/div/div[3]/div[9]/span/a/div/div[2]/span";
    public static final String seedetauilsXP="//*[@id=\"nav-subnav\"]/a[7]/span";
    public static final String addAllToListXP="//*[@id=\"bxw-woot-page\"]/div[1]/div[2]/p/a";
//30182NY_Achour testLocators#5
    public static final String watchNowXP="//*[@id=\"live-flagship-root\"]/div/div[2]/div[1]/div/div[2]/button/span";
    public static final String closeButtonCS="closeButton--2QLC8";
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class AmazonPageWebElement {
    //*********************LAMARAs WebElements***********************
           //----Check Best sellers Page Url-------
    public static final String ClickBestSellersCSS="#nav-xshop > a:nth-child(2)";
    @FindBy(how= How.CSS ,using=ClickBestSellersCSS)
    public static WebElement ClickBestSellers;
    public static String ExpectedUrl="https://www.amazon.com/gp/bestsellers/?ref_=nav_cs_bestsellers";
    //----Check Books Page Url--------
    public static final String ClickBooksCSS ="#zg_browseRoot > ul > li:nth-child(11) > a";
    @FindBy(how= How.CSS, using=ClickBooksCSS)
    public static WebElement ClickBooks;
    public static String ExpectedUrl1="https://www.amazon.com/best-sellers-books-Amazon/zgbs/books/ref=zg_bs_nav_0";
    //----choose the best Book in 'Best Sellers in Books'--------
    public static final String ChooseTheBestBookXP ="//*[@id=\"zg-ordered-list\"]/li[1]/span/div/span/a/span/div/img";
    @FindBy (how= How.XPATH, using=ChooseTheBestBookXP)
    public static WebElement ChooseTheBestBook;
    //----------Select PaperBack Format for the best book--------------
    public static final String SelectPaperBackFormatCSS="#a-autoid-8-announce > span:nth-child(1)";
    @FindBy(how= How.CSS, using=SelectPaperBackFormatCSS)
    public static WebElement SelectPaperBackFormat;
    //--------- test 'Add To Cart' Functionality----
    public static final String AddToCartXP="//*[@id=\"add-to-cart-button\"]";
    @FindBy(how= How.XPATH, using=AddToCartXP)
    public static WebElement AddToCart;
    //------- Test Mouse Hover  ---------
    public static final String HoverMouseCSS="#nav-link-accountList > span.nav-line-2";
    @FindBy(how= How.CSS, using=HoverMouseCSS)
    public static WebElement HoverMouse;
    //--------- click On 'Create List'  --------
    public static final String ClickCreateListXP="//*[@id=\"nav-al-wishlist\"]/a[1]/span";
    @FindBy(how= How.XPATH, using=ClickCreateListXP)
    public static WebElement ClickCreateList;
    //30182NY_Achour Webelement case N05:
    @FindBy(how= How.XPATH ,using=spportoutdoorsXP)
    public static WebElement spportoutdoors;
    @FindBy(how= How.XPATH ,using=seedetauilsXP)
    public static WebElement seedetauils;
    @FindBy(how= How.XPATH ,using=addAllToListXP)
    public static WebElement addAllToList;
//30182NY_Achour testLocators#6:
    public static final String rightArowXP="//*[@id=\"nextButtonDisableArrow\"]/a/i";
    public static final String leftArowXP="//*[@id=\"prevButton\"]/a/i";
    //30182NY_Achour Webelement case N06:
    @FindBy(how= How.XPATH ,using=rightArowXP)
    public static WebElement rightArow;
    @FindBy(how= How.XPATH ,using=leftArowXP)
    public static WebElement leftArow;
//30182NY_Achour testLocators#7:
    public static final String sortByXP="//*[@id=\"a-autoid-0-announce\"]/span";
    //30182NY_Achour Webelement case N07:
    @FindBy(how= How.XPATH ,using=sortByXP)
    public static WebElement sortBy;
//30182NY_Achour testLocators#8:
    public static final String dealOfTheDayXP="//*[@id=\"widgetFilters\"]/div[2]/span[2]/div/a";
    public static final String lightningDealXP="//*[@id=\"widgetFilters\"]/div[2]/span[3]/div/a";
    public static final String savingDealXP="//*[@id=\"widgetFilters\"]/div[2]/span[4]/div/a";
    public static final String couponsXP="//*[@id=\"widgetFilters\"]/div[2]/span[5]/div/a";
    public static final String primeAccessXP="//*[@id=\"widgetFilters\"]/div[2]/span[6]/div/a";
    //30182NY_Achour Webelement case N08:
    @FindBy(how= How.XPATH ,using=dealOfTheDayXP)
    public static WebElement dealOfTheDay;
    @FindBy(how= How.XPATH ,using=lightningDealXP)
    public static WebElement lightningDeal;
    @FindBy(how= How.XPATH ,using=savingDealXP)
    public static WebElement savingDeal;
    @FindBy(how= How.XPATH ,using= couponsXP)
    public static WebElement coupons;
    @FindBy(how= How.XPATH ,using=primeAccessXP)
    public static WebElement primeAccess;
//30182NY_Achour testLocators#9:
    public static final String WootDealXP="//*[@id=\"nav-subnav\"]/a[7]/span";
    public static final String DigitalDealXP="//*[@id=\"nav-subnav\"]/a[6]/span";
    public static final String outlestXP="//*[@id=\"nav-subnav\"]/a[4]/span";
    public static final String renewedDealsXP="//*[@id=\"nav-subnav\"]/a[3]/span";
    public static final String wareHouseDealXp="//*[@id=\"nav-subnav\"]/a[5]/span";
    //30182NY_Achour Webelement case N09:
    @FindBy(how= How.XPATH ,using=WootDealXP)
    public static WebElement WootDeal;
    @FindBy(how= How.XPATH ,using=DigitalDealXP)
    public static WebElement DigitalDeal;
    @FindBy(how= How.XPATH ,using=outlestXP)
    public static WebElement  outlest;
    @FindBy(how= How.XPATH ,using= renewedDealsXP)
    public static WebElement renewedDeals;
    @FindBy(how= How.XPATH ,using=wareHouseDealXp)
    public static WebElement wareHouseDeal;
//30182NY_Achour testLocators#10:
    public static final String nextXP="//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td[1]/a";
    public static final String backtoTopXP="//*[@id=\"navBackToTop\"]/div/span";
    //30182NY_Achour Webelement case N10:
    @FindBy(how= How.XPATH ,using= nextXP)
    public static WebElement next;
    @FindBy(how= How.XPATH ,using=backtoTopXP)
    public static WebElement backtoTop;
    public static final String getlistXP= "//*[@id=\"searchDropdownBox\"]";
    public static WebElement getlist;
    //30182NY_Achour Webelement case N11:
    public static final String searchDropdownXP ="//*[@id=\"searchDropdownBox\"]";
    public static final String AllXp="//*[@id=\"searchDropdownBox\"]";
    public static WebElement All;
    @FindBy(how= How.XPATH ,using=searchDropdownXP )
    public static WebElement searchDropdown;
}
