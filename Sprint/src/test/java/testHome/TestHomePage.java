package testHome;

import common.WebAPI;
//import databases.SprintConnectToMySql;
import databases.User;
import databases.User1;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReader;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static Home.HomePage.homePage;
import static Home.HomePage.init;
import static databases.ConnectToSqlDB.*;

public class TestHomePage extends WebAPI {
    public TestHomePage() throws IOException {
    }

    //***************************************************************************************
// test case 07 to check the page broken links
@Test
public void TestCheckBrokenLink() throws IOException {
    init();
    homePage.CheckBrokenLink();
}
    // test to get all the page links
    @Test
    public void getPageLinks(){
        init();
        PageLinksList(driver);

    }

   //************************************************************************************************

    public static String path="C:\\Users\\ssbra\\Desktop\\Excel_files_Project\\Sprint_SearchProducts.xlsx";
    @DataProvider
    public Object[][] getTestData2() throws IOException, InvalidFormatException {

        Object data1 [][]= DataReader.fileReader3(path,"Sheet1");

        return data1;
    }

   @Test (dataProvider = "getTestData2")

   public static void testSearchBox(String product ) throws SQLException, IOException, ClassNotFoundException, InterruptedException {


       init();
            homePage.enterDataToSearcheBox(product);

        }

    Properties prop = loadProperties();
    String path1=prop.getProperty("SprintZipCodeListPath");
    @DataProvider
    public Object[][] getTestDataSprint() throws IOException, InvalidFormatException {
        Object data [][]= DataReader.fileReader3("ListZipCood",path1 );
        return data;
    }
    @Test(dataProvider = "getTestDataSprint")
    public void TestCheckZipCood(String ZipCood){
        init();
        homePage.CheckZipCood(ZipCood);
    }




    }






