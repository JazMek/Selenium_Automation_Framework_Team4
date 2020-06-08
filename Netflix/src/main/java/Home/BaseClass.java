package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static Home.NetflixPageWebElement.*;


public class BaseClass extends WebAPI {


    @FindBy(how= How.XPATH,using=signinButtonXP)
    public static WebElement signinButton;



    @FindBy(how= How.XPATH,using=userNameFieldXP)

    public static WebElement userNameField;



    @FindBy(how= How.XPATH,using=passWordFieldXP)
    public static WebElement passWordField;

    @FindBy(how= How.XPATH,using=signinButton2XP)
    public static  WebElement signinButton2;





public static BaseClass baseClass;
    public static void loginToAmazonAccount(){
        signinButton.click();
        userNameField.sendKeys("team4WDNY2020@gmail.com");
        passWordField.sendKeys("Team42020");
        signinButton2.click();
    }

}

