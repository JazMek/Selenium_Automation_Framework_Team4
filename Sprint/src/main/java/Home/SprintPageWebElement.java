package Home;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class SprintPageWebElement {
    public static final String searchBoxCSS ="#twotabsearchtextbox";
    public static final String searchButtonCSS ="#nav-search > form > div.nav-right > div > input";
    public static final String signinButtonXP="//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]";
    public static final String signinButton2CSS="#nav-flyout-ya-signin > a > span";
    public static final String userNameFieldXP =" //input[@id='ap_email']";
    public static final String continueButtonXP="//input[@id='continue']";
    public static final String passWordFieldXP=" //input[@id='ap_password']";
    public static final String loginButtonID="signInSubmit";
    public static final String signinCSS ="#nav-link-accountList > div > span";
    
//****** LAMARAs  *************
public static final String searchBoxXPATH="/html/body/div[1]/div/div[1]/div/header/div/div[2]/div/div[2]/div[1]/div/div[2]/a/span";
    @FindBy(how= How.XPATH,using=searchBoxXPATH)
    public static WebElement searchBox;
    public static final String enterDataSearchBoxCSS="#globalSearch";
    @FindBy(how= How.CSS,using=enterDataSearchBoxCSS)
    public static WebElement enterDataSearchBox;









}
