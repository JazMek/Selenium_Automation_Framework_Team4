package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static Home.NetflixPageWebElement.*;
import static Home.NetflixPageWebElement.signinButton2XP;
;

public class HomePage extends WebAPI {

    public static HomePage homePage;
    public static NetflixPageWebElement netflixwebelement;


    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        netflixwebelement = PageFactory.initElements(driver, NetflixPageWebElement.class);
        setUpWindow();
    }

    public static void loginToAmazonAccount(){
        signinButton.click();
        userNameField.sendKeys("team4WDNY2020@gmail.com");
        passWordField.sendKeys("Team42020");
        signinButton2.click();
    }
    public static void setDVD(){
        signinButton.click();
        userNameField.sendKeys("team4WDNY2020@gmail.com");
        passWordField.sendKeys("Team42020");
        signinButton2.click();
        clickByXpath(Team4ProfileXP);
        clickByXpath(DVDButtonXP);
    }
    public static void setDVDPageTitle(){
        signinButton.click();
        userNameField.sendKeys("team4WDNY2020@gmail.com");
        passWordField.sendKeys("Team42020");
        signinButton2.click();
        clickByXpath(Team4ProfileXP);
        clickByXpath(DVDButtonXP);
        String expectedTitle="Rent Movies and TV Shows on DVD and Blu-ray - DVD Netflix";
        getTitle(expectedTitle);
    }
    public static void setKidsTitle(){
        signinButton.click();
        userNameField.sendKeys("team4WDNY2020@gmail.com");
        passWordField.sendKeys("Team42020");
        signinButton2.click();
        clickByXpath(Team4ProfileXP);
        clickByXpath(KidsXP);
        String expectedTitle="Netflix";
        getTitle(expectedTitle);
    }
    public static void setPokemonSeries(){
        signinButton.click();
        userNameField.sendKeys("team4WDNY2020@gmail.com");
        passWordField.sendKeys("Team42020");
        signinButton2.click();
        clickByXpath(Team4ProfileXP);
        clickByXpath(KidsXP);
        clickByXpath(PokemonSeriesXP);
        clickByXpath(ReturnArrowXP);
    }
    public void clickEnterKeyboard1() {
        clickEnterKeyboard (enterSearch,"lhaja@gmail.com");
    }
    public void movie() {
        profile.click();
        clickByXpath(movieXP); }
    public void getMovieList() {
        profile.click();
        clickByXpath(movieXP);
        clickByXpath(GenresXP);
        getTextFromWebElements(listCss); }
    public void playButton() {
        driver.manage().deleteAllCookies();
        clickByXpath(profileXP);
        clickByXpath(movieXP);
        clickOnElement(playCss); }
    public void email() {
        typeOnElementNEnter(emailXP,"achour@gmail.fr",driver); }
    public void searchFields() {
        clickByXpath(profileXP);
        clickByXpath(SearchButtonXP);
    }

}
