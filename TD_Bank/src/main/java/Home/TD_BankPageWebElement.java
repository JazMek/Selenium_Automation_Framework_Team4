package Home;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;

public class TD_BankPageWebElement extends WebAPI{
    public static TD_BankPageWebElement td_bankPageWebElement;
    public static  HomePage homePage;

    public static void init(){
    td_bankPageWebElement = PageFactory.initElements(driver,TD_BankPageWebElement.class);
    homePage =PageFactory.initElements(driver,HomePage.class);
        setUpBroserbases(driver);
  }











}
