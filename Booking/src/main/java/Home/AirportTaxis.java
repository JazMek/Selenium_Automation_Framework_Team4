package Home;

import common.WebAPI;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import static Home.BookingPageWebElement.*;
public class AirportTaxis extends WebAPI {

    public void check_LindingPage() {
        String expected_SprintUrl="https://www.booking.com/";
        String expected_SprintTitle="Booking.com | Official site | The best hotels & accommodations";
        getUrl(expected_SprintUrl);
        getTitle(expected_SprintTitle);
    }
    public void testBookYourAirportTaxi() {
        CarRentalsclickLink.click();
    }
    public void ScrollDownairportTaxis() throws InterruptedException {
        Page_Scroll_Down(driver);
        waitForSeconds(5);
    }
    public void ScrollUPairportTaxis() throws InterruptedException {
        Page_Scroll_Up(driver);
        waitForSeconds(5);
    }
    public void CheckPagelistLinks() {
        PageLinksList(driver);
    }
}
