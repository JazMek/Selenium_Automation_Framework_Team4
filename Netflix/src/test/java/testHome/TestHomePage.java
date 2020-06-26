package testHome;

import common.WebAPI;
import databases.ConnectToSqlDB;
import databases.User1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static Home.HomePage.*;
import static Home.HomePage.init;
import static Home.NetflixPageWebElement.*;
import static Home.NetflixPageWebElement.signinButton2;
import static databases.ConnectToSqlDB.*;

public class TestHomePage extends WebAPI {



public String  username;

   // public String  username;
    @Test
    public void searchField() throws InterruptedException, SQLException, IOException, ClassNotFoundException {
        init();
        loadProperties();
        connectToSqlDatabase();
        readUse1rProfileFromSqlTable();

        List<User1> list = readUse1rProfileFromSqlTable();
        for(User1 user:list){
            System.out.println(user.getUsername() + " " + user.getPassword());
            signinButton.click();
            userNameField.sendKeys(user.getUsername());
            passWordField.sendKeys(user.getPassword());
            signinButton2.click();
            sleepFor(2);
            teamAccountClick.click();
            sleepFor(3);
            HoverMouseAndClickt(driver, moushover);
            logOutclick.click();
            sleepFor(2);
            clickBack.click();
            sleepFor(1);
        }

    }
    // test case -  check the page broken links
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
    @Test
    public  void testClickEnterKeyboard() throws AWTException, InterruptedException {
    init();
      homePage.clickEnterKeyboard1();
      sleepFor(6);



}

    }





