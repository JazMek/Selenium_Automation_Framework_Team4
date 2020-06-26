package testHome;

import Home.HomePage;
import common.WebAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReader;

import java.io.IOException;
import java.sql.SQLException;

import static Home.United_AirlinesPageWebElement.*;

public class TestHomePage extends WebAPI {
    @Test
    public void TestunitedAirlinehomepagelink() {
        init();
        HomePage.unitedAirlinehomepagelink();
    }
    @Test
        public void TestunitedAirlinehomepageTitle (){
            init();
            HomePage.unitedAirlinehomepageTitle();


        }
    @DataProvider
    public Object[][] getTestunitedairlinedestinationlist() throws IOException, InvalidFormatException {
        Object data [][]= DataReader.fileReader3("hakim","/Users/hakimbouaraba/Desktop/booking.xlsx");
        return data;


    }


    @Test(dataProvider ="getTestunitedairlinedestinationlist")
    public void Testunitedflightfonction(String from,String to) {
        init();
//        driver.manage().deleteAllCookies();
        homePage.unitedflightfonction(from, to);
    }
//    SQL connexion :
    @Test
    public void Test_Book_a_RoundtripDB() throws SQLException, IOException, ClassNotFoundException, InterruptedException {
        init();
        homePage.Book_a_RoundtripDB();
    }
    @Test
    public void Check_brokenLink() throws IOException {
        init();
        brokenLink();
    }
    @Test
    public void Testunitedcompare_Text () {
        init();
        homePage.unitedcompare();

    }
    @Test
    public void getPageLinksList() throws IOException, InterruptedException {
        init();
        PageLinksList(driver);
    }
    }


