package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AmazonPageWebElement extends WebAPI {

//    karim WebElements
//    WebElements for Amazon login
    public static final String HamburgerMenuXP ="//*[@id='nav-hamburger-menu']/i";
    @FindBy(how= How.XPATH ,using=HamburgerMenuXP)
    public static WebElement HamburgerMenu;
    public static final String hmenuCustomerNameID ="hmenu-customer-name";
    @FindBy(how= How.ID ,using=hmenuCustomerNameID)
    public static WebElement hmenuCustomerName;
    public static final String ApEmailXP ="//*[@id='ap_email']";
    @FindBy(how= How.XPATH ,using=ApEmailXP)
    public static WebElement ApEmail;
    public static final String ApPasswordXP ="//*[@id='ap_password']";
    @FindBy(how= How.XPATH ,using=ApPasswordXP)
    public static WebElement ApPassword;
//    WebElements for Search Dropdown Description
    public static final String SearchDropdownDescriptiondCostomXP ="//*[@id='searchDropdownBox']";
    @FindBy(how= How.XPATH ,using=SearchDropdownDescriptiondCostomXP )
    public static WebElement SearchDropdownDescriptionCostom;
    public static final String SearchtextboxFieldXP ="//input[@id='twotabsearchtextbox']";
    @FindBy(how= How.XPATH ,using=SearchtextboxFieldXP )
    public static WebElement SearchtextboxField;
//    WebElements for  Create a List
    public static final String CreateAccountListXP ="//*[@id='nav-link-accountList']";
    @FindBy(how= How.XPATH ,using=CreateAccountListXP )
    public static WebElement CreateAccountList;
    public static final String create_A_ListXP ="//*[@id='nav-al-wishlist']/a[1]/span";
    @FindBy(how= How.XPATH ,using=create_A_ListXP )
    public static WebElement create_A_List;
//  SearchMansClothes
    public static final String SearchtextboxFieldCSS ="#twotabsearchtextbox";
    @FindBy(how= How.CSS ,using=SearchtextboxFieldCSS )
    public static WebElement SearchtextboxFieldCss;
    public static final String AmazonPrimecheckboxXP ="//*[@id='p_85/2470955011']/span/a/div/label/i";
    @FindBy(how= How.XPATH ,using=AmazonPrimecheckboxXP )
    public static WebElement AmazonPrimecheckbox;
    public static final String EligibleforFreeShippingXP ="//*[@id='p_76/2661625011']/span/a/div[1]/label/i";
    @FindBy(how= How.XPATH ,using=EligibleforFreeShippingXP )
    public static WebElement EligibleforFreeShipping;
    public static final String adidasLinkXP ="//*[@id='search']/div[1]/div[2]/div/span[3]/div[2]/div[25]/div/span/div/div/div[2]/div/span/a/div/img";
    @FindBy(how= How.XPATH ,using=adidasLinkXP )
    public static WebElement adidasLink;
//  Apps_and_Games
    public static final String hamburger_menuCSS ="#nav-hamburger-menu";
    @FindBy(how= How.CSS ,using=hamburger_menuCSS )
    public static WebElement hamburger_menu;
//  Test Search Box Web Elements
    public static final String SearchTextBoxFieldCSS ="#twotabsearchtextbox";
    @FindBy(how= How.CSS ,using=SearchTextBoxFieldCSS )
    public static WebElement SearchTextBoxField;
//search Dropdown Box
    public static final String searchDropdownBoxXP ="//select[@id='searchDropdownBox']";
    @FindBy(how= How.XPATH ,using=searchDropdownBoxXP )
    public static WebElement searchDropdownBox;






}
