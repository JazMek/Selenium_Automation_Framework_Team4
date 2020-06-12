package Home;
import common.WebAPI;
import java.util.concurrent.TimeUnit;
import static Home.BookingPageWebElement.*;
public class HomePage extends WebAPI {
//*******   Login Method ************
    public static void loginToBooking(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        signinButton2.click();
        emailField.sendKeys("team4WDNY2020@gmail.com");
        nextButton.click();
        passWordField.sendKeys("Team42020");
        loginButton.click();
    }
    public void checkTitle() {
        String ExpectTitle="Booking.com Account";
        getTitle(ExpectTitle);
        
    }
    //---------------------------------------
    
    public void CarRentalsClick(){
        CarRentalsClick.click();
    }

    public void FillUpCheckBox() {
        //CheckBox.click();
        //CheckBox.sendKeys("New");
        CarRentalsClick.click();
        //CheckBox.click();
        Type.sendKeys("New York City - John F Kennedy Intl, US (JFK)");
        
        
    }
}
