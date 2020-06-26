package testHome;

import common.WebAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReader;

import java.io.IOException;

import static Home.SprintPageWebElement.*;

public class TestHomePage extends WebAPI {

    // hakim test cases:
    @Test
    public void Testhomepagelink() {
        init();
        homePage.homepagelink();

    }

    @Test
    public void TesthomepageTitle() {
        init();
        homePage.homepageTitle();

    }
    @Test
    public void TestSprintcompare_Text () {
        init();
        homePage.Sprintcompare();


    }
//    @Test
    public void Check_brokenLink() throws IOException {
        init();
        brokenLink();
    }
    @Test
    public void getPageLinksList() throws IOException, InterruptedException {
        init();
        PageLinksList(driver);
    }
    String path="/Users/hakimbouaraba/Desktop/GeicoListZipCood.xlsx";
    @DataProvider
    public Object[][] getTestDataSprint() throws IOException, InvalidFormatException {
        Object data [][]= DataReader.fileReader3("ListZipCood", path);

        return data;
    }
    @Test (dataProvider = "getTestDataSprint")

    public void TestCheckZipCood(String ZipCood){
        init();
        homePage.CheckZipCood(ZipCood);
    }
}