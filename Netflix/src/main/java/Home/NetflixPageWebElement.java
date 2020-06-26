package Home;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NetflixPageWebElement {
    public static final String signinButtonXP="//a[@class='authLinks redButton']";
    public static final String userNameFieldXP ="//input[@id='id_userLoginId']";
    public static final String passWordFieldXP="//input[@id='id_password']";
    public static final String signinButton2XP="//button[@class='btn login-button btn-submit btn-small']";
    @FindBy(how= How.XPATH,using=signinButtonXP)
    public static WebElement signinButton;
    @FindBy(how= How.XPATH,using=userNameFieldXP)
    public static WebElement userNameField;
    @FindBy(how= How.XPATH,using=passWordFieldXP)
    public static WebElement passWordField;
    @FindBy(how= How.XPATH,using=signinButton2XP)
    public static  WebElement signinButton2;
    public static final String enterSearchXPATH ="//div[@class='our-story-card hero-card vlv']//input[@name='email']";
    @FindBy(how= How.XPATH,using= enterSearchXPATH)
    public static WebElement enterSearch;








}
