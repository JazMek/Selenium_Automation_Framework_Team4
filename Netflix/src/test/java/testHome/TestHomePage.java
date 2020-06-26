package testHome;
import Home.HomePage;
import Home.NetflixPageWebElement;
import common.WebAPI;
import databases.User;
import databases.User2Netflix;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static Home.HomePage.SignInToNetflixAccount;
import static Home.NetflixPageWebElement.*;
import static databases.ConnectToSqlDB.*;
public class TestHomePage extends WebAPI {
    public static HomePage homePage;
    public static NetflixPageWebElement netflixPageWebElement;
    public String username;
    public String password;
    public static void init() { 
        homePage = PageFactory.initElements(driver, HomePage.class);
        netflixPageWebElement = PageFactory.initElements(driver, NetflixPageWebElement.class);
    }
    @Test
    public void SignInToNetflix() throws InterruptedException {
        init();
        homePage.SignInToNetflixAccount(username,password);
        sleepFor(5);
    }
//**************   LAMARAs Login to Netflix using Sql DataBase   ****************
    @Test
    public void LoginNetflix () throws Exception {
        init();
        loadProperties();
        connectToSqlDatabase();
        readUser2ProfileFromSqlTable();
        List<User2Netflix> list = readUser2ProfileFromSqlTable();
        for(User2Netflix user:list){
            System.out.println(user.getUsername() + " " + user.getPassword());
            signinButton.click();
            userNameField.sendKeys(user.getUsername());
            passWordField.sendKeys(user.getPassword());
            signinButton2.click();
            sleepFor(5);
            driver.close();
        }
    }
    //**** Check Broken Links  ******************
    @Test
    public void TestCheck_brokenLink() throws IOException, InterruptedException {
        init();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        homePage.Check_brokenLink();
    }
    //***** LAMARAs Test: get Page Links List ***************
    @Test
    public void getPageLinksList() throws IOException, InterruptedException {
        init();
        PageLinksList(driver);
    }
    //**************
    @Test
    public void testClickEnterKeyboard() throws AWTException, InterruptedException {
        init();
        homePage.clickEnterKeyboard1();
        sleepFor(6); 
    }	

}
    



