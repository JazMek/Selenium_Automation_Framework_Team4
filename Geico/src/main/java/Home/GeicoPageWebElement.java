package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class GeicoPageWebElement extends WebAPI {
    public static GeicoPageWebElement geicoPageWebElement;
    public static HomePage homePage;


    public static void init(){
         geicoPageWebElement = PageFactory.initElements(driver,GeicoPageWebElement.class);
         homePage=PageFactory.initElements(driver,HomePage.class);
        setUpBroserbases(driver);


    }

    public static final String actualtextXP="//h1[@id='section1heading']";
    @FindBy(how= How.XPATH,using =actualtextXP)
    public static WebElement actualtext;




    public static final String Enter_your_Zip_codeXP ="//input[@placeholder='Enter Your ZIP']";
    @FindBy(how= How.XPATH,using = Enter_your_Zip_codeXP)
    public static WebElement Enter_your_Zip_code;






}
