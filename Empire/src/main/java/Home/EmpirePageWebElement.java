package Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmpirePageWebElement {

    public static final String IndividualAndFamilyXP ="//*[@id=\"mbr-page-wrapper\"]/div[1]/div/div[1]/div/div/div[4]/div/div[1]/div[2]/ul/li[1]/a";
    public static final String HealthInsuranceXP ="//*[@id=\"individualfamily-topmenu-1439337551017\"]";
    public static final String VisionInsuranceXP="//*[@id=\"individualfamily-topmenu-1439337940998\"]";
    public static final String DentalInsuranceXP="//*[@id=\"individualfamily-topmenu-1439339586522\"]";
    public static final String SelectLanguageXP ="//*[@id=\"psButtonlng-ddl\"]/span[1]";
    public static final String SelectChineeseLanguageXP="//*[@id=\"psDropdownlng-ddl\"]/ul/li[2]/a/span[1]";
    public static final String LoginXP="//*[@id=\"individualfamily-topmenu-1439339362269\"]";
    public static final String UserNameXP="//*[@id=\"txtUsername\"]";
    public static final String PassWordXP ="//*[@id=\"txtPassword\"]";


    @FindBy(how = How.XPATH,using = IndividualAndFamilyXP)
    public static WebElement IndividualAndFamily;
    @FindBy(how = How.XPATH,using = HealthInsuranceXP)
    public static WebElement HealthInsurance;
    @FindBy(how = How.XPATH,using = VisionInsuranceXP)
    public static WebElement VisionInsurance;
    @FindBy(how = How.XPATH,using = DentalInsuranceXP)
    public static WebElement DentalInsurance;
    @FindBy(how = How.XPATH,using = SelectLanguageXP)
    public static WebElement selectLanguage;
    @FindBy(how = How.XPATH,using = SelectChineeseLanguageXP)
    public static WebElement selectChineeseLanguage;
    @FindBy(how = How.XPATH,using = LoginXP)
    public static WebElement Login;
    @FindBy(how = How.XPATH,using = UserNameXP)
    public static WebElement UserName;
    @FindBy(how = How.XPATH,using = PassWordXP)
    public static WebElement PassWord;


}
