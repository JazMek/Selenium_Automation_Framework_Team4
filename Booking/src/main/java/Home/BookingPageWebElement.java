package Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BookingPageWebElement {



//Login Page
    public static final String signinButtonXP="//*[@id='b_tt_holder_4']/div/span";
    @FindBy(how= How.XPATH,using=signinButtonXP)
    public static WebElement signinButton;
    public static final String signinButton2CSS= "#b2indexPage > div.fly-dropdown.fly-dropdown--onload-shower.fly-dropdown_bottom.fly-dropdown_arrow-right > div > div.header-signin-prompt__body > a > span";
    @FindBy(how= How.CSS,using=signinButton2CSS)
    public static WebElement signinButton2;
    public static final String emailFieldXP ="//input[@id='username']";
    @FindBy(how= How.XPATH,using=emailFieldXP)
    public static WebElement emailField;
    public static final String nextButtonXP=" //span[@class='bui-button__text']";
    @FindBy(how= How.XPATH,using=nextButtonXP)
    public static WebElement nextButton;
    public static final String passWordFieldXP="//input[@id='password']";
    @FindBy(how= How.XPATH,using=passWordFieldXP)
    public static WebElement passWordField;
    public static final String loginButtonXP="//span[@class='bui-button__text']";
    @FindBy(how= How.XPATH,using=loginButtonXP)
    public static WebElement loginButton;
//Airport Taxis
    public static final String CarRentalsclickLinkXP="//*[@id='cross-product-bar']/div/a[4]/span[2]";
    @FindBy(how= How.XPATH,using=CarRentalsclickLinkXP)
    public static WebElement  CarRentalsclickLink;
//Home page
    public static final String gettexteXP="//span[@class='sb-searchbox__title-text']";
    @FindBy(how= How.XPATH,using=gettexteXP)
    public static WebElement gettexte;
//My_dashboard WebElements
    public static final String profile_menuXP="//*[@id='profile-menu-trigger--content']/span/span[1]";
    @FindBy(how= How.XPATH,using=profile_menuXP)
    public static WebElement profile_menu;
    public static final String My_dashboardXP="//*[@id='profile-menu']/div[1]/a";
    @FindBy(how= How.XPATH,using=My_dashboardXP)
    public static WebElement My_dashboard;
    public static final String expected_textdXP="//*[@id='dashboard_container']/div/div/div[1]/div[1]/div[1]/h2";
    @FindBy(how= How.XPATH,using=expected_textdXP)
    public static WebElement actual_textd;
//Find_the_best_deals Web Elemnts
    public static final String dashboard_containerXP="//*[@id='dashboard_container']/div/div/div[1]/div[1]/div[2]/div/div/a[1]/span[2]";
    @FindBy(how= How.XPATH,using=dashboard_containerXP)
    public static WebElement dashboard_container;
    public static final String travel_purpose_checkboxCss="#frm > div.bui-checkbox.xp__travel-purpose > label";
    @FindBy(how= How.CSS,using=travel_purpose_checkboxCss)
    public static WebElement travel_purpose_checkbox;
    public static final String autocomplete_input_searchbox_destinationCss="#ss";
    @FindBy(how= How.CSS,using=autocomplete_input_searchbox_destinationCss)
    public static WebElement autocomplete_input_searchbox_destination;
    public static final String date_field_calendardXP="//*[@id='frm']/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span";
    @FindBy(how= How.XPATH,using=date_field_calendardXP)
    public static WebElement date_field_calendar;
    public static final String calendar_control_nextXP="//*[@id='frm']/div[1]/div[2]/div[2]/div/div/div[2]";
    @FindBy(how= How.XPATH,using=calendar_control_nextXP)
    public static WebElement calendar_control_next;
    public static final String calendar_date1XP="//*[@id='frm']/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[3]/td[4]";
    @FindBy(how= How.XPATH,using=calendar_date1XP)
    public static WebElement calendar_date1;
    public static final String calendar_date2XP="//*[@id='frm']/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[4]/td[5]/span/span";
    @FindBy(how= How.XPATH,using=calendar_date2XP)
    public static WebElement calendar_date2;
    public static final String guests__toggleID="xp__guests__toggle";
    @FindBy(how= How.ID,using=guests__toggleID)
    public static WebElement guests__toggle;
    public static final String AdultsXP="//*[@id='xp__guests__inputs-container']/div/div/div[1]/div/div[2]/button[2]";
    @FindBy(how= How.XPATH,using=AdultsXP)
    public static WebElement Adults;
    public static final String ChildrenXP="//*[@id='xp__guests__inputs-container']/div/div/div[2]/div/div[2]/button[2]";
    @FindBy(how= How.XPATH,using=ChildrenXP)
    public static WebElement Children;
    public static final String RoomsXP="//*[@id='xp__guests__inputs-container']/div/div/div[3]/div/div[2]/button[2]/span";
    @FindBy(how= How.XPATH,using=RoomsXP)
    public static WebElement Romms;
    public static final String children_ages1XP="//*[@id='xp__guests__inputs-container']/div/div/div[4]/select[1]";
    @FindBy(how= How.XPATH,using=children_ages1XP)
    public static WebElement children_ages1;
    public static final String children_ages2XP="//*[@id='xp__guests__inputs-container']/div/div/div[4]/select[3]";
    @FindBy(how= How.XPATH,using=children_ages2XP)
    public static WebElement children_ages2;
    public static final String children_ages3XP="//*[@id='xp__guests__inputs-container']/div/div/div[4]/select[5]";
    @FindBy(how= How.XPATH,using=children_ages3XP)
    public static WebElement children_ages3;
    public static final String children_ages4XP="//*[@id='xp__guests__inputs-container']/div/div/div[4]/select[2]";
    @FindBy(how= How.XPATH,using=children_ages4XP)
    public static WebElement children_ages4;
    public static final String children_ages5XP="//*[@id='xp__guests__inputs-container']/div/div/div[4]/select[4]";
    @FindBy(how= How.XPATH,using=children_ages5XP)
    public static WebElement children_ages5;
    public static final String Search_ButtonXP="//*[@id='frm']/div[1]/div[4]/div[2]/button/span[1]";
    @FindBy(how= How.XPATH,using=Search_ButtonXP)
    public static WebElement Search_Button;
    public static final String Error_messageCss="#frm > div.xp__fieldset.accommodation > div.xp__dates.xp__group > div.xp__dates-inner > div:nth-child(1) > div > div";
    @FindBy(how= How.CSS,using=Error_messageCss)
    public static WebElement Error_message;
//adding_your_details
    public static final String Adding_Your_DetailsXP="//*[@id='dashboard_container']/div/div/div[1]/div[1]/div[2]/div/div/a[2]/span[1]";
    @FindBy(how= How.XPATH,using=Adding_Your_DetailsXP)
    public static WebElement Adding_Your_Details;
    public static final String Display_nameCss="#nickname";
    @FindBy(how= How.CSS,using=Display_nameCss)
    public static WebElement Display_name;
    public static final String Day_BirthdayCss="#bday";
    @FindBy(how= How.CSS,using=Day_BirthdayCss)
    public static WebElement Day_Birthday;
    public static final String Month_BirthdayCss="#bmonth";
    @FindBy(how= How.CSS,using=Month_BirthdayCss)
    public static WebElement Month_Birthday;
    public static final String Year_BirthdayCss="#byear";
    @FindBy(how= How.CSS,using=Year_BirthdayCss)
    public static WebElement Year_Birthday;
    public static final String Country_regionCss="#nationality";
    @FindBy(how= How.CSS,using=Country_regionCss)
    public static WebElement Country_region;
//menu_wishlist
    public static final String My_wishlistXP="//*[@id='profile-menu']/div[7]/a";
    @FindBy(how= How.XPATH,using=My_wishlistXP)
    public static WebElement My_wishlist;
    public static final String banner_titleXP="//*[@id='b2mywishlistPage']/div[5]/div[3]/div[1]/div[1]/div[2]/div[1]/div/h2";
    @FindBy(how= How.XPATH,using=banner_titleXP)
    public static WebElement banner_title;
//check_Punta_Cana
    public static final String Punta_CanaXP="//*[@id='booking-footer']/div[4]/div[1]/div[1]/a";
    @FindBy(how= How.XPATH,using=Punta_CanaXP)
    public static WebElement Punta_Cana;


    //-------------------------------------------------------------------------------------------------------------
// public static final String BookingLogoClassName="part_of_priceline_logo";
   public static String ExpectTitle="Booking.com | Official site | The best hotels & accommodations";
   public static String expectTexte ="Find deals for any season";























}
