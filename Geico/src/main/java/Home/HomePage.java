package Home;
import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static Home.GeicoPageWebElement.*;
public class HomePage extends WebAPI {
    public static GeicoPageWebElement geicoPageWebelements;
    public static HomePage homePage;
    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        geicoPageWebelements= PageFactory.initElements(driver, GeicoPageWebElement.class);}
    public void url() {
        String expectedUrl="https://www.geico.com/";
        getUrl( expectedUrl); }
    public void InsaranceButton() throws InterruptedException {
        clickByXpath(insaranceXP );
        sleepFor(5);
        HoverMouseAndClickt(driver,businessInsarance);
        PageScrollToElement(professionnel); }
    public void Information() {
        clickByXpath(informationsXP );
        getListOfWebElementsById(informationsXP ); }
    public void Covid19Updata() {
        clickByXpath(covid19UpdateXP);
        getListOfWebElementsByXPath( covid19TextXP); }
    public void newCostumer() {
        clickOnElement(newCostumerCss,driver);
        clickOnElement(sendKeyCss,driver);
        typeOnInputBox(sendKeyCss,Birth); }
    public void makePayment() {
        clickByXpath(makePaymentXpath);
        clickByXpath(IdentificationXp);
        clickByXpath(IdentificationXp);
        typeOnInputBox(senkKesphoneCss,phone);
        typeOnInputBox(zipCss,zipcode); }
    public void ScrollDwn() {
        Page_Scroll_Down( driver); }

    public void CheckZipCood(String ZipCood) {
        CheckZIPCood.sendKeys(ZipCood, Keys.ENTER); }


}
