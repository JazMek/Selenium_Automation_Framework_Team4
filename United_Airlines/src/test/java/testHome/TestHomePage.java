package testHome;
import common.WebAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;
import static Home.HomePage.*;
import static Home.HomePage.init;
public class TestHomePage extends WebAPI { 
    //*******  LAMARAs Book a "One Way" flight *******************
    @Test
    public void testFlightStatus() throws InterruptedException {
        init();
        homePage.FlightStatus();
    }
    //********** LAMARAs Data base connection for United Account to Book a Round Trip Flight  **************************
    @Test
    public void TestBookRoundtripDB() throws SQLException, IOException, ClassNotFoundException, InterruptedException, IOException, SQLException {
        init();
        homePage.BookRoundtripDB();
        sleepFor(5);
    }
    //********** my United Search List  ************************
    public String pathName = "C:\\Users\\lamar\\Desktop\\Selenium\\UnitedList.xlsx";
    @DataProvider
    public Object[][] getUnitedList() throws IOException, InvalidFormatException {
        Object data [][]= DataReader.fileReader3("UnitedSheet",pathName);
        return data;
    }
    @Test(dataProvider = "getUnitedList")
    public void TestUnitedSearchBox(String inputData) throws InterruptedException {
        init();
        homePage.CheckUnitedSearchBox(inputData);
        sleepFor(5);
    }
    //**** LAMARAs Check Broken Links  ******************
    @Test
    public void TestCheck_brokenLink() throws IOException, InterruptedException {
        init();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        homePage.Check_brokenLink();
    }
    //******* LAMARAs get page links  ***********
    @Test
    public void getPageLinksList() throws IOException, InterruptedException {
        init();
        PageLinksList(driver);
    }
    //-----------LAMARAs my United Flight List   --------------------
    public String path="C:\\Users\\lamar\\Desktop\\Selenium\\United_Booking_file.xlsx";
    @DataProvider
    public Object[][] getTestData() throws IOException, InvalidFormatException {
        Object data [][]=DataReader.fileReader3("Sheet1", path);
        return data;
    }
    @Test (dataProvider = "getTestData")
    public void FlightStatus(String from, String to) throws IOException, InterruptedException {
        init();
        homePage.FlightStatus(from,to);
        
    }
    
    
    
    }
