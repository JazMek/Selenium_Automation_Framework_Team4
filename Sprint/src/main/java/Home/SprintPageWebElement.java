package Home;

import common.WebAPI;
import databases.ConnectToSqlDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.DataReader;

public class SprintPageWebElement extends WebAPI{

    public  static HomePage homePage;
    public  static WebAPI webAPI;
    public static DataReader dataReader;
    public static SprintPageWebElement sprintPageWebElement;
    public static ConnectToSqlDB connectToSqlDB;
    public static void init(){
     connectToSqlDB= PageFactory.initElements(driver,ConnectToSqlDB.class);
    WebAPI webAPI= PageFactory.initElements(driver, WebAPI.class);
    homePage= PageFactory.initElements(driver, HomePage.class);
    sprintPageWebElement = PageFactory.initElements(driver,SprintPageWebElement.class);
    dataReader=PageFactory.initElements(driver, DataReader .class);
    setUpBroserbases(driver);
}
//SprintPage WebElement
    public static final String SprintPhonNumXP ="/html/body/div[1]/div/div[1]/div/header/div/div[1]/div/div[2]/span/a/span/span[3]";
    @FindBy(how= How.XPATH,using = SprintPhonNumXP )
    public static WebElement SprintPhonNum;
    public static final String next_arrowXP ="//body/div/div/div/div/div/div/div/div/div/div/div/div/div/button[2]/div[1]";
    @FindBy(how= How.XPATH,using = next_arrowXP )
    public static WebElement next_arrow;

    public static final String CheckZIPCoodXP ="//input[@placeholder='Enter ZIP Code']";
    @FindBy(how= How.XPATH,using = CheckZIPCoodXP )
    public static WebElement CheckZIPCood;










}
