package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EmpirePageWebElement extends WebAPI {
    public static EmpirePageWebElement empirePageWebElement;
    public static HomePage homePage;

    public static void init() {
      empirePageWebElement = PageFactory.initElements(driver,EmpirePageWebElement.class);
      homePage=PageFactory.initElements(driver,HomePage.class);
        setUpBroserbases(driver);


 }
    public static final String actualtestXP="//p[contains(text(),'The Anthem family of companies provides health cov')]";
    @FindBy(how= How.XPATH,using =actualtestXP)
    public static WebElement actualtest;










}
