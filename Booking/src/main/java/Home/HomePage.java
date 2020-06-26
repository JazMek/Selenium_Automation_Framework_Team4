package Home;
import common.WebAPI;

import java.io.IOException;
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
    //**** Check Broken Links  ******************
    public void Check_brokenLink() throws IOException, InterruptedException {
        brokenLink();
    }
    //String confirmPassword;
    public void registerBooking(String emailAddress, String password, String confirmPassword) throws IOException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        setUpWindow();
// step1 click on register button
        //registerToBooking.click();
        signinButton2.click();
// step2 signUp click
        signUp.click();
// enter the email data on text box
        enterEmail.sendKeys(emailAddress);
// click on next button
        clickGetStarted.click();
// enter password data in text box
        enterPassword.sendKeys(password);
// reenter password data in text box
        reEnterPassword.sendKeys(confirmPassword);
// click on create account button
        clickCreateAccount.click();



    }
    
    
}
