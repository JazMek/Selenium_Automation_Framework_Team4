package Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NetflixPageWebElement {


    public static final String signinButtonXP="//a[@class='authLinks redButton']";

    public static final String userNameFieldXP ="//input[@id='id_userLoginId']";

    public static final String passWordFieldXP="//input[@id='id_password']";

    public static final String signinButton2XP="//button[@class='btn login-button btn-submit btn-small']";


//    ********************************Test Create a Netflix Add profile *****************************************

    public static final String addProfileIconXP="//*[@id='appMountPoint']/div/div/div[1]/div[1]/div[2]/div/div/ul/li[3]/a/div";
    @FindBy(how= How.CLASS_NAME,using=addProfileIconXP)
    public static WebElement addProfileIcon;

    public static final String addProfileNameXP="//*[@id='add-profile-name']";
    @FindBy(how= How.XPATH,using=addProfileNameXP)
    public static WebElement addProfileName;

    public static final String CONTINUEButtonXP="//*[@id='appMountPoint']/div/div/div[1]/div[1]/div[2]/div/div/span[1]/span";
    @FindBy(how= How.XPATH,using=addProfileNameXP)
    public static WebElement CONTINUEButton;








}
