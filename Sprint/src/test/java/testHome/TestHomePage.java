package testHome;

import common.WebAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReader;
import java.io.IOException;
import java.util.Properties;
import static Home.SprintPageWebElement.*;
import static databases.ConnectToSqlDB.loadProperties;

public class TestHomePage extends WebAPI {

    public TestHomePage() throws IOException {
    }

    @Test
    public void Testcheck_LindingPage(){
        init();
        homePage.Testcheck_LindingPage();
    }
    @Test
    public void TestCheck_Sprint_PhonNum(){
        init();
        homePage.Check_Sprint_PhonNum();
    }
    @Test
    public void Testscheck_carousel_arrow_next_arrow() throws InterruptedException {
        init();
        homePage.scheck_carousel_arrow_next_arrow();
    }

    @Test
    public void TestCheck_Sprint_brokenLink() throws IOException {
        init();
        homePage.Check_Sprint_brokenLink();
    }
    @Test
    public void TestCheckPagelistLinks(){
        init();
       homePage.CheckPagelistLinks();
    }
    Properties prop = loadProperties();
    String path=prop.getProperty("pathZipCood");
    @DataProvider
    public Object[][] getTestDataSprint() throws IOException, InvalidFormatException {
        Object data [][]= DataReader.fileReader3("ListZipCood",path );
        return data;
    }
    @Test (dataProvider = "getTestDataSprint")
    public void TestCheckZipCood(String ZipCood){
        init();
        homePage.CheckZipCood(ZipCood);
    }
}
