package testHome;


import Home.BookingPageWebElement;
import Home.HomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends WebAPI {
    public  static HomePage homePage;
    public static BookingPageWebElement bookingPageWebElement;
    public static void init(){
        bookingPageWebElement= PageFactory.initElements(driver,BookingPageWebElement.class);
        homePage= PageFactory.initElements(driver, HomePage.class);
        setUpWindow();
    }
    @Test
    public void verifyloginToBooking (){
        init();
        homePage.loginToBooking();
    }
    @Test
    public void verifycheckTitle(){
        init();
        homePage.checkTitle();
    }

    @Test
    public void verifyHomePageText (){
        init();
        homePage.checkTexte();
    }
    @Test
    public void TestFlightsPage () throws InterruptedException {
    init();
        homePage.setFlights();
    }
    @Test
    public void TestFlightsPageText () throws InterruptedException {
        init();
       homePage.setFlightsPageText();
    }
    @Test
    public void TestRoundTripButton () throws InterruptedException {
        init();
        homePage.setRoundTripButton();}
    @Test
    public void TestMultiDestinationButton () throws InterruptedException {
        init();
        homePage.setMultiDestinationButton();}
    @Test
    public void TestOneWayButton () throws InterruptedException {
        init();
        homePage.setOneWayButton();}
    @Test
    public void TestGoingTo () throws InterruptedException {
        init();
        homePage.setGoingTo();}
    @Test
    public void TestDepartingFrom () throws InterruptedException {
        init();
        homePage.setDepartingFrom();}
    @Test
    public void TestDetartingDate () throws InterruptedException {
        init();
        homePage.setDepartingDate();}
    @Test
    public void TestReturningDate (){
        init();
        homePage.setReturningDate();}

}
