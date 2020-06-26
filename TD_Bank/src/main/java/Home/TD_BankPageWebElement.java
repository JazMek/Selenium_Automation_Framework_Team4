package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.DataReader;

public class TD_BankPageWebElement extends WebAPI {

    public  static HomePage homePage;
    public  static WebAPI webAPI;
    public static DataReader dataReader;
    public static TD_BankPageWebElement td_bankPageWebElement;
    public static void init(){
        WebAPI webAPI= PageFactory.initElements(driver, WebAPI.class);
        homePage= PageFactory.initElements(driver, HomePage.class);
        td_bankPageWebElement = PageFactory.initElements(driver,TD_BankPageWebElement.class);
        dataReader=PageFactory.initElements(driver, DataReader.class);
        setUpBroserbases(driver);
    }

//    //phone number verification
//    public static final String EmpirePhonNumdXP ="/html/body/section[1]/div/div/div[2]/p/a";
//    @FindBy(how= How.XPATH,using = EmpirePhonNumdXP )
    public static WebElement EmpirePhonNumd;
//Check International Travel Tips
    public static final String ServicesTBXP ="//header//a[contains(text(),'Services')]//span[1]";
    @FindBy(how= How.XPATH,using = ServicesTBXP )
    public static WebElement ServicesTB;
    public static final String DeletPoPXP ="//*[@id='ensCall']/span[2]";
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
//Ibrahim Web element
    public static final String switchWindowsCSS ="#main > footer > div > div > div > div.td-footer-social.td-copy-align-centre > ul > li:nth-child(2) > a > div > span.td-icon.td-icon-twitterIcon";
    @FindBy(how= How.CSS,using=switchWindowsCSS)
    public static WebElement switchWindows;
    public static final String useChildWindowXPATH="//*[@id='react-root']/div/div/div[2]/header/div[2]/div[1]/div/div[2]/div[1]/div[2]/a/div/span/span";
    @FindBy(how= How.XPATH,using=useChildWindowXPATH)
    public static WebElement useChildWindow;
    public static final String clickFacbookLinkCSS ="#main > footer > div > div > div > div.td-footer-social.td-copy-align-centre > ul > li:nth-child(1) > a > div > span.td-icon.td-icon-facebookIcon";
    @FindBy(how= How.CSS,using=clickFacbookLinkCSS)
    public static WebElement clickFacbookLink;
    public static final String closePopupWindowXPATH ="//*[@id='ensCall']/span[2]";
    @FindBy(how= How.XPATH,using=closePopupWindowXPATH )
    public static WebElement closePopupWindow ;
//************************************
    public static final String openNowXPATH ="//body/div/div/div/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]";
    @FindBy(how= How.XPATH,using=openNowXPATH )
    public static WebElement  openNow;

}
