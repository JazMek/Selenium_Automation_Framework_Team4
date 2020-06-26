package Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BookingPageWebElement {



//*************** Login to https://www.booking.com/ ***********************************************
   public static final String signinButtonXP="//*[@id='b_tt_holder_4']/div/span";

    public static final String signinButton2CSS= "#b2indexPage > div.fly-dropdown.fly-dropdown--onload-shower.fly-dropdown_bottom.fly-dropdown_arrow-right > div > div.header-signin-prompt__body > a > span";

    public static final String emailFieldXP ="//input[@id='username']";

    public static final String nextButtonXP=" //span[@class='bui-button__text']";

    public static final String passWordFieldXP="//input[@id='password']";

    public static final String loginButtonXP="//span[@class='bui-button__text']";

//******************************************Logo in Home Page ****************************************************



 public static final String BookingLogoClassName="part_of_priceline_logo";


//******************************************Test get tect from the page ******************************************


 public static final String gettexteXP="//span[@class='sb-searchbox__title-text']";


 @FindBy(how= How.XPATH,using=signinButtonXP)
 public static WebElement signinButton;

 @FindBy(how= How.CSS,using=signinButton2CSS)
 public static WebElement signinButton2;


 @FindBy(how= How.XPATH,using=emailFieldXP)

 public static WebElement emailField;

 @FindBy(how= How.XPATH,using=nextButtonXP)
 public static WebElement nextButton;

 @FindBy(how= How.XPATH,using=passWordFieldXP)
 public static WebElement passWordField;

 @FindBy(how= How.XPATH,using=loginButtonXP)
 public static WebElement loginButton;

 @FindBy(how= How.XPATH,using=gettexteXP)
 public static WebElement gettexte;

 public static final String flightslinkXP="//*[@id='cross-product-bar']/div/a[1]/span[2]";
 @FindBy(how= How.XPATH,using=flightslinkXP)
 public static WebElement flightslink;

 public static final String onewaycheckingbottonXP="//*[@id='__next']/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div[1]/form/div[1]/div[2]/label";
 @FindBy(how= How.XPATH,using=onewaycheckingbottonXP)
 public static WebElement onewaycheckingbotton;
 public static final String DepartingfromtextfeldXP="//*[@id='flights.0.startLocation-typeahead-input']";
 @FindBy(how= How.XPATH,using=DepartingfromtextfeldXP)
 public static WebElement Departingfromtextfeld;

 public static final String CarrentalslinkXP="//*[@id='cross-product-bar']/div/a[3]/span[2]";
 @FindBy(how= How.XPATH,using=CarrentalslinkXP)
 public static WebElement Carrentalslink;





 public static final String flightXP="//div[@id='cross-product-bar']//a[1]";
 @FindBy(how= How.XPATH,using=flightXP)
 public static WebElement flight;

 public static final String OnewaytripXP="//*[name()='path' and contains(@d,'M12 7c-2.8')]";
 @FindBy(how= How.XPATH,using=OnewaytripXP)
 public static WebElement Onewaytrip;

 public static final String tripfromXP="//input[@id='flights.0.startLocation-typeahead-input']";
 @FindBy(how= How.XPATH,using=tripfromXP)
 public static WebElement tripfrom;

 public static final String goingtoXP="//input[@id='flights.0.endLocation-typeahead-input']";
 @FindBy(how= How.XPATH,using=goingtoXP)
 public static WebElement goingto;

 public static final String departingXP="//input[@id='flight-date-range-0']";
 @FindBy(how= How.XPATH,using=departingXP)
 public static WebElement departing;

 public static final String departuredayXP="//div[@class='CalendarCard__Card-sc-1jxm5yu-0 dXbiom sc-kUaPvJ jTqjsm']//div[2]//div[3]//div[25]//div[1]//div[1]";
 @FindBy(how= How.XPATH,using=departuredayXP)
 public static WebElement departureday;

 public static final String actualtestXP="//h2[@id='bh-promotion-accommodation-types']";
 @FindBy(how= How.XPATH,using =actualtestXP)
 public static WebElement actualtest;






}

