package Home;
import common.WebAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utility.DataReaderTeam4;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import static Home.SprintPageWebElement.*;
public class DealPage extends WebAPI {
    public static  DealPage dealpage;
   // public static  SprintPageWebElement sprintPageWebElement;
    public static void init(){
        dealpage = PageFactory.initElements(driver,DealPage.class);
     //  sprintPageWebElement= PageFactory.initElements(driver,SprintPageWebElement.class);
        }
    public void DealPage() {
    clickByCss(dealCss);}
    public void dealText() {
        clickOnElement( dealCss);
        getTextByCss(hotDealsCss); }
    public void BuildYourPhonePage() {
        clickOnElement( dealCss);
       clickByXpath(showNowXP); }
    public void BuildYourPhone() {
        clickOnElement( dealCss);
        clickByXpath(showNowXP);
        clickOnElement(StorageCss);
        clickOnElement(ClrCss); }
    public void SprintPhones() {
        clickOnElement( dealCss);
        clickByXpath(showNowXP);
        String iphone="iphone";
        getTextByCss(imageCss);
        captureScreenshot(driver,iphone); }
    public void Feature() {
        clickOnElement( dealCss);
        clickByXpath(showNowXP);
        clickOnElement(featureCss); }
    public void allPhones() {
        clickOnElement( dealCss);
        clickByXpath(showNowXP);
       clickByXpath(AllPhonesXp); }
    public void FilterByCategory() {
        clickOnElement( dealCss);
        clickByXpath(showNowXP);
        clickByXpath(AllPhonesXp);
        clickOnElement(filterCss);
        clickOnElement(samsungCss);}
    public void list() {
        clickOnElement( dealCss);
        clickByXpath(showNowXP);
        clickByXpath(AllPhonesXp);
        getTextFromWebElements(listCss,driver) ; }
    public void compareText() throws IOException, InvalidFormatException {
        clickOnElement( dealCss);
        clickByXpath(showNowXP);
        clickByXpath(AllPhonesXp);
        //clickByXpath(listCss);
        List<String> Acttual=getTextFromWebElements(listCss,driver) ;
        List<String> expectedData= Arrays.asList(DataReaderTeam4.fileReader3("sheet1", "/Users/ashorouali/Desktop/Sprint.xlsx"));
        if (1<=4) {
            Assert.assertEquals(Acttual,expectedData); }}
    public void CheckOrder() {
        clickOnElement( dealCss);
        clickByXpath(signInXP);
        clickOnElement(checkStatusCss);
        String expected="OM Dashboard";
        getTitle(expected);
    }
}
