package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


import java.util.concurrent.TimeUnit;

import static Home.BookingPageWebElement.*;

public class HomePage extends WebAPI {



    public static void loginToBooking(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginButton.click();
        emailField.sendKeys("team4WDNY2020@gmail.com");
        nextButton.click();
        passWordField.sendKeys("Team42020");
        signinButton2.click();
    }

    public void checkTitle() {
        String ExpectTitle="Booking.com | Official site | The best hotels & accommodations";
        String ActualTitle= driver.getTitle();
        Assert.assertEquals(ActualTitle,ExpectTitle,"The expected Title does mot mutch");
    }

    public void checkTexte() {
        goBackToHomeWindow();
        String expectTexte ="Find deals for any season";
        Assert.assertEquals(gettexte.getText(),expectTexte,"The texte is not fond");
    }

    public void setFlights() throws InterruptedException {
        Flights.click();
        sleepFor(5);
        cleanUp();
    }
    public void setFlightsPageText() throws InterruptedException {
        Flights.click();
        String expectedText="Looking for a flight?";
        String Text=FlightsPageText.getText();
        Assert.assertEquals(Text,expectedText,"Does not match");
        sleepFor(5);
        String expected = "Flights: Find Cheap Flights & Airfares | Priceline";
        getTitle(expected);
        cleanUp();
    }
    public void setRoundTripButton() throws InterruptedException {
        Flights.click();
        RoundTripButton.click();
        sleepFor(5);
        cleanUp();
    }
    public void setOneWayButton() throws InterruptedException {
        Flights.click();
        OneWayButton.click();
        sleepFor(5);
        cleanUp();
    }
    public void setMultiDestinationButton() throws InterruptedException {
        Flights.click();
        MultiDestinationButton.click();
        sleepFor(3);
        cleanUp();
    }

    public void setDepartingFrom() throws InterruptedException {

        Flights.click();
        handleNewTab(driver);
        DepartingFrom.sendKeys("JFK");
        sleepFor(3);
        cleanUp();
    }
        public void setGoingTo() throws InterruptedException {

            Flights.click();
            sleepFor(3);
            GoingTo.sendKeys("paris");
            sleepFor(3);
            cleanUp();
    }
    public void setDepartingDate() throws InterruptedException {

        Flights.click();
        sleepFor(5);
        DetartingDate.click();
        cleanUp();
    }
    public void setReturningDate(){

        Flights.click();
        ReturningDate.click();
        cleanUp();
    }
}
