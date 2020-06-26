package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.DataReader;

public class GeicoPageWebElement extends WebAPI{

    public  static HomePage homePage;
    public  static GeicoPageWebElement geicoPageWebElement;

    public static void init(){
        homePage= PageFactory.initElements(driver, HomePage.class);
        geicoPageWebElement = PageFactory.initElements(driver,GeicoPageWebElement.class);
        setUpBroserbases(driver);
    }

    public static final String LogoXP ="//body/header/div/a[1]";
    @FindBy(how= How.XPATH,using = LogoXP)
    public static WebElement Logo;
    public static final String Enter_your_Zip_codeXP ="//input[@placeholder='Enter Your ZIP']";
    @FindBy(how= How.XPATH,using = Enter_your_Zip_codeXP)
    public static WebElement Enter_your_Zip_code;








}
