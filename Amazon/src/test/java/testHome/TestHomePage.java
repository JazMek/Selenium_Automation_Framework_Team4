package testHome;


import Home.AmazonPageWebElement;
import Home.HomePage;
import common.WebAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReader;
import utility.DataReaderSami;

import java.io.IOException;



public class TestHomePage extends WebAPI {

    public static HomePage homePage;
    public static AmazonPageWebElement amazonPageWebElement;
    public static DataReaderSami dataReaderSami;
    public static DataReader dataReader;
    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        amazonPageWebElement = PageFactory.initElements(driver, AmazonPageWebElement.class);
        dataReaderSami =PageFactory.initElements(driver,DataReaderSami.class);
        dataReader =PageFactory.initElements(driver,DataReader.class);
    }
    @Test
    public void Testcheck_LindingPage(){
        init();
        homePage.check_LindingPage();
    }

   @Test
    public void TestLoginToAmazon()  {
         init();
         homePage.LoginToAmazon();
}

    @Test
    public void TestsearchDropdownDescription(){
        init();
        homePage.searchDropdownDescription();
 }
   @Test
     public void TestCreate_a_List(){
        init();
        homePage.Create_a_List();
 }

   @Test
     public void TestSearchMansClothes(){
        init();
        homePage.SearchMensClothing();
 }
   @Test
    public void TestApps_and_Games(){
        init();
       homePage.Apps_and_Games();
   }
   @DataProvider
        public  Object[] getTestData()throws IOException, InvalidFormatException {
    Object[] data = DataReader.fileReader3("AmazonDropDownList","../Generic/src/DataDocuments/AmazonExcel.xlsx");
    return data;}

   @Test (dataProvider="getTestData")
   public  void TestChecksearchBox(String ProdactName){
       init();
       homePage.ChecksearchBox(ProdactName);
   }
   @Test
   public  void TestCheckDropDownSearchList() throws IOException, InvalidFormatException {
       init();
       homePage.CheckDropDownSearchList();
   }
  @Test
    public void  TestCheck_SearchDropdownBox(){
        init();
        homePage.Check_SearchDropdownBox();
  }
  @Test
    public void Check_brokenLink() throws IOException {
        init();
        homePage.brokenLink();
    }
    @Test
    public void TestCheckPagelistLinks(){
        init();
        homePage.CheckPagelistLinks();
    }







}