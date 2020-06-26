package Home;
import utility.DataReader;
import utility.DataReader.*;
import common.WebAPI;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import static Home.BookingPageWebElement.*;
import static Home.BookingPageWebElement.loginButtonXP;

public class LoginPage extends WebAPI {

    public  static HomePage homePage;
    public  static  LoginPage  loginPage;
    public static AirportTaxis airportTaxis;
    public static DataReader dataReader;
    public static BookingPageWebElement bookingPageWebElement;
    public static String ExcelPath="/Users/karimmekdoud/Desktop/Booking.comExcelData.xlsx";

    public static void init(){
        homePage= PageFactory.initElements(driver, HomePage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        airportTaxis = PageFactory.initElements(driver,AirportTaxis.class);
        bookingPageWebElement = PageFactory.initElements(driver,BookingPageWebElement.class);
        dataReader=PageFactory.initElements(driver, DataReader.class);
    }
    public void check_LindingPage() {
        String expected_SprintUrl="https://www.booking.com/";
        String expected_SprintTitle="Booking.com | Official site | The best hotels & accommodations";
        getUrl(expected_SprintUrl);
        getTitle(expected_SprintTitle);
    }
    public static void loginToBooking(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        signinButton2.click();
        emailField.sendKeys("team4WDNY2020@gmail.com");
        nextButton.click();
        passWordField.sendKeys("Team42020");
        loginButton.click();
    }
    public void My_dashboard() {
        profile_menu.click();
        My_dashboard.click();
    }
    public void check_text_in_dashboard(){
        dataReader.ExcelDataProvider(ExcelPath);
        String expectedText  =dataReader.getStringData("Sheet1",0,0);
        String expectedtitle =dataReader.getStringData("Sheet1",0,1);
        compare_Text(expectedText,actual_textd);
        getTitle(expectedtitle );
    }
    public void Find_the_best_deals() throws InterruptedException {
        My_dashboard();
        dashboard_container.click();
        travel_purpose_checkbox.click();
        dataReader.ExcelDataProvider(ExcelPath);
        String expected_searchbox_destination=dataReader.getStringData("Sheet1",1,0);
        autocomplete_input_searchbox_destination.sendKeys(expected_searchbox_destination);
        date_field_calendar.click();
        ImplicitWaitTime(4);
        for(int i=1;i<5 ;i++){calendar_control_next.click();waitForSeconds(1);}
        calendar_date1.click();
        calendar_date2.click();
        guests__toggle.click();
        waitForSeconds(1);
        for(int i=2;i<7;i++){Adults.click();waitForSeconds(1); }
        for(int i=0;i<5;i++){Children.click();waitForSeconds(1);}
        for(int i=0;i<8;i++){Romms.click(); waitForSeconds(1);}
        selectOptionByIndex(children_ages1, 6);
        waitForSeconds(1);
        selectOptionByIndex(children_ages2, 8);
        waitForSeconds(1);
        selectOptionByIndex(children_ages3, 5);
        waitForSeconds(1);
        selectOptionByIndex(children_ages4, 4);
        waitForSeconds(1);
        selectOptionByIndex(children_ages5, 9);
        waitForSeconds(1);
        Search_Button.click();
        waitForSeconds(1);
    }
    public void check_Error_Mesage(){
        dataReader.ExcelDataProvider(ExcelPath);
        String expected_ErrorMessage=dataReader.getStringData("Sheet1",1,1);
        compare_Text(expected_ErrorMessage,Error_message);
    }
    public void adding_your_details() throws InterruptedException {
        My_dashboard();
        Adding_Your_Details.click();
        dataReader.ExcelDataProvider(ExcelPath);
        String expected_Display_name=dataReader.getStringData("BookingNames",1,0);
        Display_name.sendKeys(expected_Display_name);
        selectOptionByIndex(Day_Birthday, 7);
        selectOptionByIndex(Month_Birthday, 7);
        selectOptionByIndex(Year_Birthday, 40);
        selectOptionByVisibleText(Country_region,"United States of America");
        waitForSeconds(2);
    }
    public void Get_rewarded_for_dreaming() {
        profile_menu.click();
        My_wishlist.click();
    }
    public void check_Get_rewarded_for_dreaming() throws InterruptedException {
        dataReader.ExcelDataProvider(ExcelPath);
        String expected_Text=dataReader.getStringData("BookingNames",1,1);
        compare_Text(expected_Text,banner_title);
        waitForSeconds(2);
    }
    public void Check_brokenLink() throws IOException {
        brokenLink();
    }
    public void CheckPagelistLinks() {
        PageLinksList(driver);
    }
}
