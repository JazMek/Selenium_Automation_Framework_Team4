package testHome;
import common.WebAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import static Home.HomePage.homePage;
import static Home.HomePage.init;
import static common.WebAPI.sleepFor;

//****** LAMARAs  *************
public class TestHomePage extends WebAPI {
    public static String path="C:\\Users\\lamar\\Desktop\\Selenium/SprintSearch.xlsx";
    @DataProvider
    public Object[][] getTestData2() throws IOException, InvalidFormatException {
        Object data1 [][]= DataReader.fileReader4(path,"Sheet1");
        return data1;
    }
    @Test(dataProvider = "getTestData2")
    public static void testSearchBox(String product ) throws SQLException, IOException, ClassNotFoundException, InterruptedException {
        init();
        homePage.enterDataToSearcheBox(product);
        sleepFor(1);
    }
    //**** LAMARAs Check Broken Links  ******************
    @Test
    public void TestCheck_brokenLink() throws IOException, InterruptedException {
        init();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        homePage.Check_brokenLink();
        PageLinksList(driver);
    }
    //***** LAMARAs Test: get Page Links List ***************
    @Test
    public void getPageLinksList() throws IOException, InterruptedException {
        init();
        PageLinksList(driver);
        
    }
}
