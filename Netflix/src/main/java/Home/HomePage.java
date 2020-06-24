
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utility.DataReaderTeam4;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import static Home.NetflixPageWebElement.*;
import static Home.NetflixPageWebElement.signinButton2;
public class HomePage extends WebAPI {
    public static HomePage homePage;
    public static NetflixPageWebElement netflixPageWebElement;
    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        netflixPageWebElement = PageFactory.initElements(driver,NetflixPageWebElement.class); }
    public static void loginToNetflixAccount(){
        signinButton.click();
        userNameField.sendKeys("team4WDNY2020@gmail.com");
        passWordField.sendKeys("Team42020");
        signinButton2.click(); }
    public void SelectProfile() throws InterruptedException {
        loginToNetflixAccount();
        sleepFor(3);
        profile.click();
        String expectedTitle="Netflix";
        getTitle(expectedTitle); }
    public void movie() {
        loginToNetflixAccount();
        profile.click();
        clickByXpath(movieXP); }
    public void getMovieList() {
        loginToNetflixAccount();
        profile.click();
        clickByXpath(movieXP);
        clickByXpath(GenresXP);
        getTextFromWebElements(listCss); }
    public void playButton() {
        driver.manage().deleteAllCookies();
        loginToNetflixAccount();
        clickByXpath(profileXP);
        clickByXpath(movieXP);
        clickOnElement(playCss); }
    public void email() {
typeOnElementNEnter(emailXP,"achour@gmail.fr",driver); }
    public void searchFields() {
        loginToNetflixAccount();
        clickByXpath(profileXP);
        clickByXpath(SearchButtonXP);
    }}

