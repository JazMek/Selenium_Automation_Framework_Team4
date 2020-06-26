package Home;

import common.WebAPI;

import org.openqa.selenium.support.PageFactory;
import utility.DataReader;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import static Home.BookingPageWebElement.*;


public class HomePage  extends WebAPI {


    public  static HomePage homePage;
    public static BookingPageWebElement  bookingPageWebElement;
    public  static DataReader dataReader;

    public static void init(){
        homePage= PageFactory.initElements(driver, HomePage.class);
        bookingPageWebElement = PageFactory.initElements(driver, BookingPageWebElement.class);
         dataReader = PageFactory.initElements(driver, DataReader.class);

    }


    // method to login to booking page
    public static void loginToBooking(){
   //     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        signinButton2.click();
        emailField.sendKeys("team4WDNY2020@gmail.com");
        nextButton.click();
        passWordField.sendKeys("Team42020");
        loginButton.click();
    }


//    String emailAddress;
//     String      Password;
//      String confirmePassword;


//    public void registerToBooking(String emailAddress,String Password, String confirmePassword) throws InterruptedException {
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        signinButton2.click();
//        signUp.click();
//        enterEmail.sendKeys(emailAddress);
//        clickGetStarted.click();
//        enterPassword.sendKeys(Password);
//        reEnterPassword.sendKeys(confirmePassword);
//        clickCreateAccount.click();
//
//
//
//    }

//*******************************************method using data excel***************************
//String emailAddress;
//String password;
//String confirmPassword;

    public void registerBooking(String emailAddress, String password, String confirmPassword) throws IOException {

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // step1 click on register button
        signinButton2.click();
        // step2  signUp click
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

    // method for page broken links
    public void CheckBrokenLink() throws IOException {
        setUpWindow();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        brokenLink();
    }



    }

