package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SprintPageWebElement extends WebAPI {
  public static SprintPageWebElement sprintPageWebElement;
  public static  HomePage homePage;

  public static void init(){

         sprintPageWebElement = PageFactory.initElements(driver,SprintPageWebElement.class);
         homePage =PageFactory.initElements(driver,HomePage.class);
         setUpBroserbases(driver);

 }
    public static final String actualcompareXP="//span[contains(text(),'We stand in solidarity & support.')]";
    @FindBy(how= How.XPATH,using =actualcompareXP)
    public static WebElement actualcompare;




    public static final String CheckZIPCoodXP ="//input[@placeholder='Enter ZIP Code']";
    @FindBy(how= How.XPATH,using = CheckZIPCoodXP )
    public static WebElement CheckZIPCood;






}
