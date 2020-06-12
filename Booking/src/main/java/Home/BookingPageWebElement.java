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
   

//******************************************Logo in Home Page ****************************************************
 public static final String BookingLogoClassName="part_of_priceline_logo";
//******************************************Test get tect from the page ******************************************
 public static final String gettexteXP="//span[@class='sb-searchbox__title-text']";
 @FindBy(how= How.XPATH,using=gettexteXP)
 public static WebElement gettexte;
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

 // always respect the following order:
    public static final String loginButtonXP="//span[@class='bui-button__text']";
    @FindBy(how= How.XPATH,using=loginButtonXP) 
    public static WebElement loginButton;
//---------- Check 'Car Rentals' button ------------------------------
    public static final String CarRentalsClickXP="//*[@id=\"cross-product-bar\"]/div/a[3]";
    @FindBy(how= How.XPATH,using=CarRentalsClickXP)
    public static WebElement CarRentalsClick;
    
    //---------- check box for pick up location--------
    public static final String CheckBoxXP="//*[@id=\"ss_origin\"]";
    @FindBy(how= How.XPATH,using=CheckBoxXP)
    public static WebElement CheckBox;
    
    public static final String TypeXP="//*[@id=\"ss_origin\"]";
    @FindBy(how= How.XPATH,using= TypeXP)
    public static WebElement Type;
    


}
