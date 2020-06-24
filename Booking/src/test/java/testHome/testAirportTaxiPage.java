package testHome;
import common.WebAPI;
import org.testng.annotations.Test;
import static Home.AirportTaxisPage.init;
import static Home.AirportTaxisPage.*;
public class testAirportTaxiPage extends WebAPI {
    @Test
    public void testcheckTitle(){
        init();
        airportTaxisPage.checkTitle();}
    @Test
    public void testFillUpCheckBox() throws InterruptedException {
        init();
        airportTaxisPage.FillUpCheckBox(); }
    @Test
    public void testlogo(){
        init();
        airportTaxisPage.logo();
        String screenshotName = "logo";
        captureScreenshot( driver, screenshotName); }
    @Test
    public void testlogintoBooking(){
        init(); }
    @Test
    public void testTaxiPage() throws InterruptedException {
        init();
        airportTaxisPage.TaxiPage(); }

    @Test
    public void TestRoundTripButton () throws InterruptedException {
        init();
        airportTaxisPage.setRoundTripButtonXP();}
    @Test
    public void TestMultiDestinationButton () throws InterruptedException {
        init();
        airportTaxisPage.setMultiDestinationButton();}
    @Test
    public void TestOneWayButton () throws InterruptedException {
        init();
        airportTaxisPage.setOneWayButtonXP();}
    @Test
    public void TestGoingTo () throws InterruptedException {
        init();
        airportTaxisPage.setGoingTo();}
    @Test
    public void TestDepartingFrom () throws InterruptedException {
        init();
        airportTaxisPage.setDepartingFrom();}



}
