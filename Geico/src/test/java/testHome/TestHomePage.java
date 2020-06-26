package testHome;

import common.WebAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReader;

import java.io.IOException;
import java.util.Properties;

import static Home.GeicoPageWebElement.*;
import static databases.ConnectToSqlDB.loadProperties;


public class TestHomePage extends WebAPI {

    public TestHomePage() throws IOException {
    }

    //    @Test
    public void Testcheck_LindingPage(){
        init();
        homePage.Testcheck_LindingPage();
    }

//    @Test
    public void Check_brokenLink() throws IOException {
        init();
        homePage.brokenLink();
    }
//    @Test
    public void testcheckTitle(){
        init();
        homePage.checkTitle();
    }
//    @Test
    public void TestCheckPagelistLinks(){
        init();
        homePage.CheckPagelistLinks();
    }
//    @Test
    public void TestChekDisplayed(){
        init();
        homePage.ChekDisplayed();
    }
    Properties prop = loadProperties();
    String path=prop.getProperty("pathZipCood");
    @DataProvider
    public Object[][] getTestDataGeico() throws IOException, InvalidFormatException {
        Object data [][]= DataReader.fileReader3("ListZipCood", path);
        return data;
    }
    @Test (dataProvider = "getTestDataGeico")

    public void TestCheckZipCood(String ZipCood){
        init();
        homePage.CheckZipCood(ZipCood);
    }
}
