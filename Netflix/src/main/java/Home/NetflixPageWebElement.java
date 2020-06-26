package Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NetflixPageWebElement {


    public static final String signinButtonXP="//a[@class='authLinks redButton']";
    public static final String userNameFieldXP ="//input[@id='id_userLoginId']";
    public static final String passWordFieldXP="//input[@id='id_password']";
    public static final String signinButton2XP="//button[@class='btn login-button btn-submit btn-small']";
    public static final String Team4ProfileXP="//*[@id=\"appMountPoint\"]/div/div/div[1]/div[1]/div[2]/div/div/ul/li[1]/div/a/div/div";
    public static final String DVDButtonXP="//*[@id=\"appMountPoint\"]/div/div/div[1]/div[1]/div[1]/div/div/div/div[3]/a";
    public static final String DVDPageTextXP="//*[@id=\"add-dvds\"]/div/div/h2";
    public static final String KidsXP="//*[@id=\"appMountPoint\"]/div/div/div[1]/div[1]/div[1]/div/div/div/div[2]/a";
    public static final String PokemonSeriesXP="//*[@id=\"appMountPoint\"]/div/div/div[1]/div[1]/div[2]/div/span/div/div/div/div/div/div[2]/div/div/div[3]/a[2]/button/span";
    public static final String ReturnArrowXP="//*[@id=\"appMountPoint\"]/div/div/div[1]/div/div/div[2]/div/div[3]/div/div[5]/div[1]/button";
    public static final String enterSearchXPATH ="//div[@class='our-story-card hero-card vlv']//input[@name='email']";
    @FindBy(how= How.XPATH,using= enterSearchXPATH)
    public static WebElement enterSearch;
    @FindBy(how = How.XPATH,using = DVDPageTextXP)
    public static WebElement DVDPageText;
    @FindBy(how= How.XPATH,using=signinButtonXP)
    public static WebElement signinButton;
    @FindBy(how= How.XPATH,using=userNameFieldXP)
    public static WebElement userNameField;
    @FindBy(how= How.XPATH,using=passWordFieldXP)
    public static WebElement passWordField;
    @FindBy(how= How.XPATH,using=signinButton2XP)
    public static  WebElement signinButton2;


    public static final String addProfileIconXP="//*[@id='appMountPoint']/div/div/div[1]/div[1]/div[2]/div/div/ul/li[3]/a/div";
    @FindBy(how= How.CLASS_NAME,using=addProfileIconXP)
    public static WebElement addProfileIcon;
    public static final String addProfileNameXP="//*[@id='add-profile-name']";
    @FindBy(how= How.XPATH,using=addProfileNameXP)
    public static WebElement addProfileName;
    public static final String CONTINUEButtonXP="//*[@id='appMountPoint']/div/div/div[1]/div[1]/div[2]/div/div/span[1]/span";
    @FindBy(how= How.XPATH,using=addProfileNameXP)
    public static WebElement CONTINUEButton;

    public static final String profileXP ="//*[@id=\"appMountPoint\"]/div/div/div[1]/div[1]/div[2]/div/div/ul/li[1]/div/a/div/div";
    @FindBy(how= How.XPATH,using=profileXP)
    public static  WebElement profile;

    public static final String movieXP="//*[@id=\"appMountPoint\"]/div/div/div[1]/div[1]/div[1]/div/div/ul/li[4]/a";
    public static final String GenresXP="//*[@id=\"appMountPoint\"]/div/div/div[1]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div/div/div/div";
    public static final String listCss="#appMountPoint > div > div > div:nth-child(1) > div.bd.dark-background > div.pinning-header > div > div.sub-header > div > div > div > div.aro-genre-details > div.subgenres > div > div > div > div.sub-menu.theme-lakira";
    @FindBy(how= How.XPATH,using=listCss)
    public static  WebElement list1;

    public static final String list2XP="//*[@id=\"appMountPoint\"]/div/div/div[1]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div/div/div/div[2]";
    @FindBy(how= How.XPATH,using=list2XP)
    public static  WebElement list2;

    public static final String playCss="#appMountPoint > div > div > div:nth-child(1) > div.bd.dark-background > div.mainView > div > div.aro-genre > div > span > div > div > div > div > div > div.fill-container > div > div > div.billboard-links.button-layer.forward-leaning > a.playLink > button";

    public static final String emailXP="//div//div//div//div//div//div//div//div[2]//form[1]//div[1]//ul[1]//li[1]//div[1]//div[1]//label[1]//input[1]";
    public static final String SearchButtonXP="//body/div/div/div/div/div/div/div/div/div/div/div/button/span[1]";
    @FindBy(how= How.XPATH,using=SearchButtonXP)
    public static  WebElement SearchButton;

}








