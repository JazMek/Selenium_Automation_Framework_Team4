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

// **************************************       AirportTaxis ******************************************************


// Step 1: click on the Airport Taxis link to be redergeted to the page
 public static final String AirportTaxisclickLinkXP="//*[@id='root']/div[2]/div[1]/div/div/div[2]/ul/li[6]/a/div[2]";

 @FindBy(how= How.XPATH,using=AirportTaxisclickLinkXP)
 public static WebElement  AirportTaxisclickLink;




}
