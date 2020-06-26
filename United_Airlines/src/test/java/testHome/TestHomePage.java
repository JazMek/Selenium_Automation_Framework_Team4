package testHome;

import common.WebAPI;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReader;
import java.io.IOException;
import java.util.List;

import static Home.HomePage.init;
import static Home.HomePage.*;
public class TestHomePage extends WebAPI {



    public  String path="C:\\Users\\ssbra\\Desktop\\Excel_files_Project\\United_Booking_file.xlsx";
    @DataProvider
    public Object[][] getTestData() throws IOException, InvalidFormatException {
        Object data [][]=DataReader.fileReader3("Sheet1", path);

        return data;
    }
    // test case user get the flight status when entered correct values
    @Test (dataProvider = "getTestData")
    public void FlightStatus(String from, String to,String NumAdult) throws IOException, InterruptedException {
        init();
        homePage.FlightStatus(from,to, NumAdult);
    }

// test case to check the page broken links
@Test
public void TestCheckBrokenLink() throws IOException {
    init();
    homePage.CheckBrokenLink();
}

@Test
// test to get all the page links
    public void getPageLinks(){
        init();
        PageLinksList(driver);
    }

    public String pathName = "C:\\Users\\ssbra\\Desktop\\Excel_files_Project\\UnitedList.xlsx";
    @DataProvider
    public Object[][] getUnitedList() throws IOException, InvalidFormatException {
        Object data [][]= DataReader.fileReader3("UnitedSheet",pathName);
        return data;
    }
    // test case- user can get result when enters products in search button
    @Test(dataProvider = "getUnitedList")
    public void TestUnitedSearchBox(String inputData) throws InterruptedException {
        init();
        homePage.CheckUnitedSearchBox(inputData);
        sleepFor(5);
    }


}
