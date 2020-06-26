package Home ;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReader;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static Home.SprintPageWebElement.*;
import static databases.ConnectToSqlDB.loadProperties;

public class HomePage extends WebAPI {

//************************************************************************************
    public  static HomePage homePage;
    public  static SprintPageWebElement sprintPageWebElement;

    public static void init(){
        homePage= PageFactory.initElements(driver, HomePage.class);
        sprintPageWebElement= PageFactory.initElements(driver, SprintPageWebElement.class);
    }


    public void enterDataToSearcheBox(String product) throws InterruptedException {
        setUpWindow();
        searchBox.click();
        sleepFor(3);
        enterDataSearchBox.sendKeys(product);
        sleepFor(3);
        enterDataSearchBox.sendKeys(Keys.ENTER);

    }

    // method for page broken links
    public void CheckBrokenLink() throws IOException {
        setUpWindow();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        brokenLink();
    }


    public void CheckZipCood(String ZipCood) {

        CheckZIPCood.sendKeys(ZipCood, Keys.ENTER);
    }




}
