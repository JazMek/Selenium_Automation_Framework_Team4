package testHome;
import static Home.AmazonPageWebElement.*;
import Home.HomePage;
import static Home.HomePage.*;
import common.WebAPI;
import static Home.HomePage.init;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import utility.DataReaderTeam4;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
public class TestHomePage extends WebAPI {
 public static HomePage homePage;
 public static AmazonPageWebElement amazonPageWebElement;
 public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        amazonPageWebElement = PageFactory.initElements(driver, AmazonPageWebElement.class);
    }
@Test
    public void TestLoginToAmazon(){
      init();
      homePage.LoginToAmazon();
}
 
    //***** LAMARA Test1: Automate 'Amazon Best Sellers' Functionality  ********

//30182NY_Achour Test cases************************************************************************************
/*test case#01:-As customer i should navigate to amazon home page*/
    @Test
    public void testAmazonPage() throws InterruptedException { init();
    homePage.AmazonPage();
}
   @Test
    public void testTodaysDealsPage() throws InterruptedException { init();homePage.todaysDealsPage(); }
  @Test
    public void testWareHouseDealsPage(){
      init();
      homePage.WareHouseDealsPage();
  }
    public void testWareHouseDealsPage() throws InterruptedException {init();homePage.WareHouseDealsPage(); }
    @Test
    public void testcheckbox() throws InterruptedException { init();homePage.checkbox(); }
    @Test
    public void testspoortOutdoors() throws InterruptedException { init();homePage.spoortOutdoors(); }
    @Test
    public void testArowsOnTodaysDeals() throws InterruptedException {
        init();
        driver.getCurrentUrl();
        //Step1:Open link: https://www.amazon.com/
        //Step2:Click on 'Best Sellers'
        homePage.BestSellersPage();
        //Step3: Verify the name of the Url which has been used.
        homePage.VerifyBestSellersUrl();

        homePage.checkbox();
    }

    @Test
    public void testSortByFilter() throws InterruptedException {
        init();
        homePage.sorBy(); }
@Test
    public void testDealOfTheDay(){
    init();
    homePage.DealofTheDay(); }
    @Test
    public void testTodayDealsCategories() throws InterruptedException {
    init();
    homePage.todaysDealsCategories(); }
       @Test
   public void testNextPageAndGoToTop() throws InterruptedException {
       init();

       homePage.WatchnowComercial();
   }
    @AfterMethod
    public void tearDown(){
        driver.quit();

    }
   //*******LAMARA Test2: Automates 'Books' Functionality  ******************
    @Test
    public void testBooksPage() throws InterruptedException {
        init();
        //Step1: Click on 'Books'
        homePage.BestSellersPage();
        sleepFor(5);
        homePage.BooksPage();
        //Step2: Verify the name of the Url which has been used.
        homePage.VerifyBooksUrl();
}
}
    //****LAMARA Test3: choose the best Book in 'Best Sellers in Books' Functionality ******************
    @Test
    public void testChooseTheBestBook() throws InterruptedException {
        init();
        //Step1:Open link: https://www.amazon.com/
        //Step2:Click on 'Best Sellers'
        homePage.BestSellersPage();
        sleepFor(3);
        //Step3: Click on 'Books'
        homePage.BooksPage();
        sleepFor(3);
        //Step4: Click on the best book in 'Best Sellers in Books' page.
        homePage.ChooseTheBestBook();
    }
    //****LAMARA Test4: Select PaperBack Format for the best book 
    @Test
    public void testSelectPaperBackFormat() throws InterruptedException {
        init();
        //Step1:Open link: https://www.amazon.com/ and setUpWindow
        homePage.setUpWindow();
        //waitUntilClickAble(By.cssSelector("#nav-xshop > a:nth-child(2)"));
        //Step2:Click on 'Best Sellers'
        homePage.BestSellersPage();
        sleepFor(3);
        //Step3: Click on 'Books'
        homePage.BooksPage();
        sleepFor(3);
        //Step4: Click on the best book in 'Best Sellers in Books' page.
        homePage.ChooseTheBestBook();
        sleepFor(3);
        //Step5: Select PaperBack Format for the best book
        homePage.SelectPaperBackFormat();
        sleepFor(3);
        driver.quit();
        //driver.close();
    }
    //****LAMARA Test5: test 'Add To Cart' Functionality
    @Test
    public void testAddToCart() throws InterruptedException {
        init();
        //Step1:Open link: https://www.amazon.com/ and setUpWindow
        homePage.setUpWindow();
        //waitUntilClickAble( );
        //Step2:Click on 'Best Sellers'
        homePage.BestSellersPage();
        sleepFor(1);
        //Step3: Click on 'Books'
        homePage.BooksPage();
        sleepFor(1);
        //Step4: Click on the best book in 'Best Sellers in Books' page.
        homePage.ChooseTheBestBook();
        sleepFor(1);
        //Step5: Select PaperBack Format for the best book
        homePage.SelectPaperBackFormat();
        sleepFor(1);
        homePage.AddToCart();
        sleepFor(3);
        driver.quit();
    }
    //****LAMARA Test6: mouse hover test
    @Test
    public void testHoverMouse() throws InterruptedException {
        init();
        //Step1:Open link: https://www.amazon.com/ and setUpWindow
        homePage.setUpWindow();
        //Step2: Move your cursor over 'Accounts & Lists' link on the header
        HoverMouseAndClick( driver, HoverMouse);
        sleepFor(2);
        //Step3: click On 'Create List'
        homePage.clickOnCreateListElement();
        sleepFor(3);
        driver.quit();
    }

       @Test
       public void testGetList(){
           init();
         homePage.GetList(); }
@DataProvider
 public Object[] getTestData()throws IOException, InvalidFormatException {
 Object[] data = DataReaderTeam4.fileReader3("sheet1","/Users/ashorouali/Desktop/Ashor.xlsx");
 return data;}

 @Test (dataProvider="getTestData")
 public void TestChecksearchBox(String ProdactName) throws IOException, InvalidFormatException {
 init();
 homePage.CheckDropDownSearchList(ProdactName);
 }

