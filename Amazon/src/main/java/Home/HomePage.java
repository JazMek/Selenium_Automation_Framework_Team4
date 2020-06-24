package Home;
import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import static Home.AmazonPageWebElement.*;
public class HomePage extends WebAPI {
public void LoginToAmazon() {
        HamburgerMenu.click();
        hmenuCustomerName.click();
        ApEmail.sendKeys("team4WDNY2020@gmail.com",Keys.ENTER);
        ApPassword.sendKeys("Team42020", Keys.ENTER);
    }
}
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import static Home.AmazonPageWebElement.*;
public class HomePage extends WebAPI {
    public static HomePage homePage;
    public static AmazonPageWebElement amazonPageWebElement;
    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        amazonPageWebElement = PageFactory.initElements(driver, AmazonPageWebElement.class);
    }
    
    //******** LAMARAs *********************
    public void BestSellersPage() {
        ClickBestSellers.click();
    }
    public void VerifyBestSellersUrl(){
        Assert.assertEquals(driver.getCurrentUrl(),ExpectedUrl,"the url used didn't navigate to the Best Sellers Page");
    }
    public void BooksPage() {
        ClickBooks.click();
  }
    public void VerifyBooksUrl() {
        Assert.assertEquals(driver.getCurrentUrl(),ExpectedUrl1,"Didn't navigate to 'Amazon Books' functionality");
    }
    public void ChooseTheBestBook() {
        ChooseTheBestBook.click();
    }
    public void SelectPaperBackFormat() {
        SelectPaperBackFormat.click();
    }
    public void AddToCart() {
      AddToCart.click();
    }
    public void clickOnCreateListElement() {
        ClickCreateList.click();
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.AssertJUnit;
import utility.DataReaderTeam4;

import java.io.IOException;
import java.util.List;
import static Home.AmazonPageWebElement.*;
import static reporting.TestLogger.log;
public class HomePage extends WebAPI {
    public static AmazonPageWebElement amazonPageWebElement;
    public static HomePage homePage;
    public static String url="https://www.amazon.com/";
    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        amazonPageWebElement = PageFactory.initElements(driver, AmazonPageWebElement.class);}
  /* public static void loginToAmazonAccount(){
       signin.click();
        userNameField.sendKeys("team4WDNY2020@gmail.com");
       continueButton.click();
        passWordField.sendKeys("Team42020");
        loginButton.click();}*/
//30182NY_Achour Test case N01:
public void AmazonPage() {
    String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
    log(message);
    getTitle(expectedTitle); }
/*30182NY_Achour Test case N02:*/
    public void todaysDealsPage() throws InterruptedException {
        String expectedTitle="Amazon.com: Please Confirm Your Action";
        todaysDealsButton.click();
        //clickByXpath("/html/body/div[1]/header/div/div[2]/div[3]/div[2]/div/a[5]");
        SubscribeButton.click();
       // BacktoHomeBage.click();
        sleepFor(3);
        getTitle(expectedTitle); }
    /*30182NY_Achour Test case N03:*/
    public void WareHouseDealsPage() throws InterruptedException {
        String expectedTitle="Amazon Warehouse | Great deals on quality used products";
        todaysDealsButton.click();
        warehouseSection.click();
        seeAllCategories.click();
        sleepFor(3);
        getTitle(expectedTitle);
        cleanUp();}
    /*30182NY_Achour Test case N04:*/
    public void checkbox() throws InterruptedException {
        String expectedTitle="Gold Box Deals | Today's Deals - Amazon.com";
        todaysDealsButton.click();
        amazonDevice.click();

        getTitle(expectedTitle);
        cleanUp();}
    /*30182NY_Achour Test case N05:*/
    public void spoortOutdoors() throws InterruptedException {
        String expectedTitle="Amazon Prime Benefits | Woot";
        todaysDealsButton.click();
        seedetauils.click();
        addAllToList.click();
        sleepFor(3);
        getTitle(expectedTitle);
        cleanUp();}
    /*30182NY_Achour Test case N06:*/
    public void arowLeftRight() throws InterruptedException {
        String expectedTitle="Gold Box Deals | Today's Deals - Amazon.com";
        todaysDealsButton.click();
        PageScrollToElement(rightArow);
        PageScrollToElement(leftArow);
        getTitle(expectedTitle);
        cleanUp();}
    /*30182NY_Achour Test case N07:*/
    public void sorBy() throws InterruptedException {
        todaysDealsButton.click();
        sortBy.click();
        sleepFor(5);
        cleanUp();
    }
    /*30182NY_Achour Test case N08:*/
    public void DealofTheDay() {
        todaysDealsButton.click();
        dealOfTheDay.click();
        navigateBack();
        lightningDeal.click();
        navigateBack();
        savingDeal.click();
        navigateBack();
        coupons.click();
        navigateBack();
        primeAccess.click();
        cleanUp();}
    /*30182NY_Achour Test case N09:*/
    public void todaysDealsCategories() {
        todaysDealsButton.click();
        WootDeal.click();
        navigateBack();
        DigitalDeal.click();
        navigateBack();
        outlest.click();
        navigateBack();
        renewedDeals.click();
        navigateBack();
        wareHouseDeal.click();
        String expectedTitle="Amazon Warehouse | Great deals on quality used products";
        getTitle(expectedTitle);
        cleanUp();}
    /*30182NY_Achour Test case N10:*/
    public void NextPageAndGoToTop() throws InterruptedException {
        todaysDealsButton.click();
        Page_Scroll_DownToElement(next);
        sleepFor(8);
        backtoTop.click();
        String expectedTitle="Gold Box Deals | Today's Deals - Amazon.com";
        getTitle(expectedTitle);
        cleanUp();}
    public void  GetList() {
        clickByXpath( AllXp );
        getListOfWebElementsByXpath(AllXp); }
    public void CheckDropDownSearchList(String prodactName) throws IOException, InvalidFormatException {
        Object[] data1 = DataReaderTeam4.fileReader3("sheet1","/Users/ashorouali/Desktop/Ashor.xlsx");
        Select select =new Select(searchDropdown);
        List<WebElement> ActuelResult=select.getOptions();
        for(int i =1; i<57 ; i++){ select.hashCode(); Assert.assertEquals(ActuelResult.get(i).getText(),data1[i]);} }}

