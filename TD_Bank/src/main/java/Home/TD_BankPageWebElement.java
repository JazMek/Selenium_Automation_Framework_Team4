package Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TD_BankPageWebElement {

    public static final String searchBoxCSS ="#twotabsearchtextbox";
    public static final String searchButtonCSS ="#nav-search > form > div.nav-right > div > input";
    public static final String signinButtonXP="//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]";
    public static final String signinButton2CSS="#nav-flyout-ya-signin > a > span";
    public static final String userNameFieldXP =" //input[@id='ap_email']";
    public static final String continueButtonXP="//input[@id='continue']";
    public static final String passWordFieldXP=" //input[@id='ap_password']";
    public static final String loginButtonID="signInSubmit";
    public static final String signinCSS ="#nav-link-accountList > div > span";

// brahim- Web Elements
  //scrolldown
    public static final String scrollDownCSS ="#question";

    @FindBy(how= How.CSS,using=scrollDownCSS)
    public static WebElement scrollDown;
    public static final String clickPopUpwindowCloseXPATH="//*[@id=\"ensCall\"]/span[2]";
    @FindBy(how= How.XPATH,using=clickPopUpwindowCloseXPATH)
    public static WebElement clickPopUpwindowClose;

    public static final String getlinkManageYourLoanCSS ="#main > section.td_rq_simple-slidedown.td-article-list > div > div > ul > li:nth-child(3) > div.td-col-xs-12.td-col-sm-7.td-col-md-6.td-col-lg-5 > h3 > a";
    @FindBy(how= How.CSS,using=getlinkManageYourLoanCSS)
    public static WebElement getlinkManageYourLoan;

    public static final String clickAsqNowButtonCSS="#main > question > div > question-input > section > div > div > div > div:nth-child(2) > form > div.td-col-xs-12.td-col-sm-4.td-col-lg-3 > button";
    @FindBy(how= How.CSS,using=clickAsqNowButtonCSS)
    public static WebElement clickAsqNowButton;

    // switch Windows Web Elements
    public static final String switchWindowsCSS ="#main > footer > div > div > div > div.td-footer-social.td-copy-align-centre > ul > li:nth-child(2) > a > div > span.td-icon.td-icon-twitterIcon";
    @FindBy(how= How.CSS,using=switchWindowsCSS)
    public static WebElement switchWindows;

    public static final String useChildWindowXPATH="//*[@id=\"react-root\"]/div/div/div[2]/header/div[2]/div[1]/div/div[2]/div[1]/div[2]/a/div/span/span";

    @FindBy(how= How.XPATH,using=useChildWindowXPATH)
    public static WebElement useChildWindow;
    public static final String clickFacbookLinkCSS ="#main > footer > div > div > div > div.td-footer-social.td-copy-align-centre > ul > li:nth-child(1) > a > div > span.td-icon.td-icon-facebookIcon";
    @FindBy(how= How.CSS,using=clickFacbookLinkCSS)
    public static WebElement clickFacbookLink;

    public static final String closePopupWindowXPATH  ="//*[@id='ensCall']/span[2]";
    @FindBy(how= How.XPATH,using=closePopupWindowXPATH )
    public static WebElement closePopupWindow ;
//******************************
//Check International Travel Tips
public static final String ServicesTBXP ="//header//a[contains(text(),'Services')]//span[1]";
    @FindBy(how= How.XPATH,using = ServicesTBXP )
    public static WebElement ServicesTB;
    public static final String DeletPoPXP ="//*[@id=\"ensCall\"]/span[2]";
    @FindBy(how= How.XPATH,using = DeletPoPXP )
    public static WebElement DeletPoP;
    public static final String Foreign_ExchangeXP ="//body//div//div//header//div//div//div//nav//ul//li//ul//li//a[contains(text(),'Foreign Exchange Services')]";
    @FindBy(how= How.XPATH,using = Foreign_ExchangeXP )
    public static WebElement Foreign_Exchange;
    public static final String OrderOnlineXP ="//body/div/div/section/div/div/div/div/div/button[1]";
    @FindBy(how= How.XPATH,using = OrderOnlineXP )
    public static WebElement OrderOnline;
    public static final String clearPOP2XP ="//span[@class='td-icon icon-regular td-icon-close']";
    @FindBy(how= How.XPATH,using = clearPOP2XP)
    public static WebElement clearPOP2;
    public static final String Order_CurrencyButtonXP ="//a[contains(text(),'Order Currency')]";
    @FindBy(how= How.XPATH,using = Order_CurrencyButtonXP )
    public static WebElement Order_CurrencyButton;
    public static final String destinationCurrencyXP ="//select[@name='destinationCurrency']";
    @FindBy(how= How.XPATH,using = destinationCurrencyXP )
    public static WebElement selectdestinationCurrency;



}


