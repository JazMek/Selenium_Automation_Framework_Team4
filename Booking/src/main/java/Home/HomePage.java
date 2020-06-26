package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static Home.BookingPageWebElement.*;

public class HomePage extends WebAPI {
    public static void loginToBooking(){

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        signinButton2.click();

        emailField.sendKeys("team4WDNY2020@gmail.com");

        nextButton.click();

        passWordField.sendKeys("Team42020");

        loginButton.click();

    }

    @FindBy(how= How.XPATH,using=gettexteXP)
    public static WebElement gettexte;

    public static String ExpectTitle="Booking.com | Official site | The best hotels & accommodations";
    public static String expectTexte ="Find deals for any season";
    public void checkTitle() {

        String ActualTitle= driver.getTitle();
        Assert.assertEquals(ActualTitle,ExpectTitle,"The expected Title does mot mutch");

    }


    public void Find_your_next_flight_deal() {
        flightslink.click();
        onewaycheckingbotton.click();


    }

    public void Carrentals() {
        Carrentalslink.click();
    }

    public void bookingflightfonction(String from,String to) {
        flight.click();
        Onewaytrip.click();
        tripfrom.click();
        tripfrom.sendKeys(from);
        goingto.click();
        goingto.sendKeys(to);
        departing.click();
        departureday.click();
    }
    public void Check_brokenLink() throws IOException {
        brokenLink();
    }
    public void bookingcompare() {
        String expectedcompare_Text = "Browse by property type";
        compare_Text(expectedcompare_Text,actualtest);
    }
}
