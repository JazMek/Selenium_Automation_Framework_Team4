package testHome;

import common.WebAPI;
import databases.UnitedList;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReader;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;


import static Home.HomePage.*;
import static Home.United_AirlinesPageWebElement.*;
import static databases.ConnectToSqlDB.getUnitedListFromSqlTable;
import static databases.ConnectToSqlDB.loadProperties;

public class TestHomePage extends WebAPI {
//    @Test
    public void Testcheck_LindingPage(){
        init();
        homePage.Testcheck_LindingPage();
    }

    @DataProvider
    public Object[][] getTestData1() throws IOException, InvalidFormatException {
        Object data1 [][]= DataReader.fileReader3("united","../Generic/src/DataDocuments/unitedExcelData.xlsx");

        return data1;
    }

//    @Test(dataProvider = "getTestData1")
    public void TestBook_a_Roundtrip(String From,String To){
        init();
        homePage.Book_a_Roundtrip(From,To);

    }

//   @Test
    public  void Test_Book_a_RoundtripDB() throws SQLException, IOException, ClassNotFoundException, InterruptedException {
        init();
        homePage.Book_a_RoundtripDB();
   }


//    @Test
    public  void Test_Book_a_RoundtripDB1() throws SQLException, IOException, ClassNotFoundException, InterruptedException {
        init();
        homePage.Book_a_RoundtripDB1();
    }
    @Test
    public void Check_brokenLink() throws IOException {
        init();
        brokenLink();
    }
//    @Test
    public void TestCheckPagelistLinks(){
        init();
        homePage.CheckPagelistLinks();
    }
    public String path="/Users/karimmekdoud/IdeaProjects/Selenium_Automation_Framework_Team4/Generic/src/DataDocuments/United_Booking_file.xlsx";
    @DataProvider
    public Object[][] getTestData() throws IOException, InvalidFormatException {
        Object data [][]=DataReader.fileReader3("Sheet1", path);

        return data;
    }
//    @Test (dataProvider = "getTestData")
    public void FlightStatus(String from, String to) throws IOException, InterruptedException {
        init();
        homePage.FlightStatus(from,to);
    }
}
