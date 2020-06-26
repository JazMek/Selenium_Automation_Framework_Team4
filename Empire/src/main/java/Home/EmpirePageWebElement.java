package Home;

import common.WebAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.DataReader;

public class EmpirePageWebElement extends WebAPI {

    public  static HomePage homePage;
    public  static WebAPI webAPI;
    public static DataReader dataReader;
    public static EmpirePageWebElement empirePageWebElement;
    public static void init(){
        WebAPI webAPI= PageFactory.initElements(driver, WebAPI.class);
        homePage= PageFactory.initElements(driver, HomePage.class);
        empirePageWebElement = PageFactory.initElements(driver,EmpirePageWebElement.class);
        dataReader=PageFactory.initElements(driver, DataReader.class);
        setUpBroserbases(driver);
    }

//phone number verification
    public static final String EmpirePhonNumdXP ="/html/body/section[1]/div/div/div[2]/p/a";
    @FindBy(how= How.XPATH,using = EmpirePhonNumdXP )
    public static WebElement EmpirePhonNumd;










}
