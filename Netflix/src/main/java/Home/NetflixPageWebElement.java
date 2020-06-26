package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NetflixPageWebElement extends WebAPI {
   public static NetflixPageWebElement etflixPageWebElement;
   public static  HomePage homePage;

   public static void init(){

     etflixPageWebElement= PageFactory.initElements(driver,NetflixPageWebElement.class);
     homePage=PageFactory.initElements(driver,HomePage.class);
       setUpBroserbases(driver);



}



    public static final String signinButtonXP="//a[@class='authLinks redButton']";
    @FindBy(how= How.XPATH,using=signinButtonXP)
    public static WebElement signinButton;


    public static final String userNameFieldXP ="//input[@id='id_userLoginId']";
    @FindBy(how= How.XPATH,using=userNameFieldXP)
    public static WebElement userNameField;


    public static final String passWordFieldXP="//input[@id='id_password']";
    @FindBy(how= How.XPATH,using=passWordFieldXP)
    public static WebElement passWordField;

    public static final String signinButton2XP="//button[@class='btn login-button btn-submit btn-small']";
    @FindBy(how= How.XPATH,using=signinButton2XP)
    public static  WebElement signinButton2;

    public static final String actualtextXP="//h2[contains(text(),'Watch anywhere. Cancel anytime.')]";
    @FindBy(how= How.XPATH,using =actualtextXP)
    public static WebElement actualtext;

    public static final String enterSearchXPATH ="//div[@class='our-story-card hero-card vlv']//input[@name='email']";
    @FindBy(how= How.XPATH,using= enterSearchXPATH)
    public static WebElement enterSearch;




}
