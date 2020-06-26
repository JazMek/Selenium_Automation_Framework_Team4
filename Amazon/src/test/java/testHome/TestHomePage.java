package testHome;
import Home.HomePage;
import common.WebAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReaderTeam4;

import java.io.IOException;

import static Home.HomePage.homePage;
import static Home.HomePage.init;
public class TestHomePage extends WebAPI {

    //30181NY_salah  test case #1:
 @Test
 public void testloginToAmazonAccount(){
     init();
     homePage.loginToAmazonAccount();
 }
    @Test
    public void testclickOnFindaGift(){
        init();
        homePage.setFindGift();
 }
    //30181NY_salah  test case #2:
 @Test
    public void testamazonFindAGiftText(){
     init();
        homePage.amazonFindAGiftText(); }
 @Test
    public void testamazonEGIFTSButton(){
        init();
     homePage.amazonEGIFTSButton();}
 @Test
    public void testPriceAllPricesScrollDown(){
        init();
        homePage.PriceAllPricesScrollDown();}

    @Test
    public void TestFinfGistScrollPageDown() throws InterruptedException {
     init();
     homePage.setScrollPageDown();
    }
    @Test
    public void TestsetamazonWomenPage() throws InterruptedException {
        init();
        homePage.setamazonWomenPage();
    }
    @Test
    public void TestsetamazonFindAGiftPreschooler() throws InterruptedException {
     init();
     homePage.setamazonFindAGiftPreschooler();
    }
    @Test
    public void TestsetsetamazonFindAGiftPreschoolerPlayDohAddToCard() throws InterruptedException {
        init();
        homePage.setamazonFindAGiftPreschoolerPlayDohAddToCard();
    }
    @DataProvider
    public Object[] getTestData()throws IOException, InvalidFormatException {
        Object[] data = DataReaderTeam4.fileReader3("Sheet1","/Users/salahmouloudi/Desktop/Salah.xlsx");
        return data;}

    @Test (dataProvider="getTestData")
    public void TestChecksearchBox(String ProdactName) throws IOException, InvalidFormatException {
        init();
        homePage.CheckDropDownSearchList(ProdactName);
    }}


