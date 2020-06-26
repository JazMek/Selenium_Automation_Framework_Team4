package testHome;

import Home.AmazonPageWebElement;
import Home.HomePage;
import common.WebAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReader;

import java.io.IOException;

public class TestHomePage extends WebAPI {
    public static HomePage homePage;
    public static AmazonPageWebElement amazonPageWebElement;
    public static DataReader dataReader;

    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        amazonPageWebElement = PageFactory.initElements(driver, AmazonPageWebElement.class);
        dataReader =PageFactory.initElements(driver,DataReader.class);
    }


    @Test
    public void TestsearchField() throws InterruptedException {
        init();
        amazonPageWebElement.loginToAmazonAccount();
        homePage.searchField();



    }


    @Test
    public void testwholefoods() {
        init();
        homePage.wholefoodsPage();
        homePage.verifywholefoodslogo();
    }

    @Test
    public void testdeals() {
        init();
        homePage.wholefoodsPage();
        homePage.verifydealspage();
    }
    @Test
        public void testBestSellersPage(){
            init();
            homePage.BestSellersPage();
            homePage.VerifyBestSellersUrl();
        }

    @Test
    public void TestCheckDropDownSearchList() {
        init();
        homePage.CheckDropDownSearchList();


    }
    @Test
    public void Testamazoncompare_Text () {
        init();
        homePage.amazoncompare();


    }

    @Test
    public void Check_brokenLink() throws IOException {
        init();
        brokenLink();
    }

    @Test
    public void getPageLinksList() throws IOException, InterruptedException {
        init();
        PageLinksList(driver);
    }
//check searchbox excel:
    @DataProvider
    public Object[] getTestData()throws IOException, InvalidFormatException {
        Object[] data = DataReader.fileReader3("hakim1","/Users/hakimbouaraba/Library/Containers/com.microsoft.Excel/Data/Desktop/hakimAmazon.xlsx");
        return data;}

    @Test (dataProvider="getTestData")
    public void TestChecksearchBox(String ProdactName){
        init();
        homePage.ChecksearchBox(ProdactName);
    }

    }
