package Home;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import static Home.BookingPageWebElement.*;
public class AirportTaxisPage extends WebAPI {
    public  static AirportTaxisPage airportTaxisPage;
    public  static BookingPageWebElement bookingPageWebElement;
    public static void init(){
        bookingPageWebElement= PageFactory.initElements(driver, BookingPageWebElement.class);
        airportTaxisPage=PageFactory.initElements(driver, AirportTaxisPage.class);
        loginToBooking();}
    public static void loginToBooking(){
        signinButton2.click();
        emailField.sendKeys("team4WDNY2020@gmail.com");
        nextButton.click();
        passWordField.sendKeys("Team42020");
        loginButton.click(); }
    public void checkTitle() {
        String ExpectTitle="Booking.com Account";
        String ActualTitle= driver.getTitle();
        Assert.assertEquals(ActualTitle,ExpectTitle,"The expected Title does mot mutch"); }
    public void checkTexte() {
        String expectTexte ="Find deals for any season";
        Assert.assertEquals(gettexte.getText(),expectTexte,"The texte is not fond"); }
    public void FillUpCheckBox() throws InterruptedException {
        carrental.click();
        checkbox.click();
        Type.sendKeys("manhatan");
        sleepFor(5);
        String expectedTitle="Cheap car rentals: Find best car deals & worldwide locations";
        getTitle(expectedTitle); }
    public void logo() {
        BookingLogo.isDisplayed();
    }
    public void TaxiPage() throws InterruptedException { clickByXpath(airportTaxixp); }
    public void BookYourAirportTaxi() { clickByXpath(airportTaxixp);clickByXpath(oneWayXP); }
    public void setRoundTripButtonXP() throws InterruptedException { clickByXpath(FlightsXP); }
    public void setOneWayButtonXP() throws InterruptedException {
        clickByXpath(FlightsXP);
//        clickByXpath(OneWayButtonXP);
//        sleepFor(3);
//        cleanUp();
       }
    public void setMultiDestinationButton() throws InterruptedException {
        clickByXpath(FlightsXP);
//        clickByXpath(MultiDestinationButtonXP);
//        sleepFor(3);
//        cleanUp();
    }
    public void setDepartingFrom() throws InterruptedException {
        clickByXpath(FlightsXP);
       // DepartingFrom.sendKeys("JFK");
        //clickByXpath();
//        typeOnInputField(DepartingFromXp,"JFK");
//        sleepFor(3);
//        cleanUp();
    }
    public void setGoingTo() throws InterruptedException {
        clickByXpath(FlightsXP);
        //GoingTo.sendKeys("paris");
//       typeOnInputBox(GoingToXP,"Madrid");
//        sleepFor(3);
    }
}


//*****************************
//public static final String CheckZIPCoodXP ="//input[@placeholder='Enter ZIP Code']";
//@FindBy(how= How.XPATH,using = CheckZIPCoodXP )
//public static WebElement CheckZIPCood;
//        ******************************
//        String path="/Users/salahmouloudi/Desktop/GeicoListZipCood.xlsx";
//@DataProvider
//public Object[][] getTestDataSprint() throws IOException, InvalidFormatException {
//        Object data [][]= DataReader.fileReader3("ListZipCood", path);
//
//        return data;
//        }
//@Test (dataProvider = "getTestDataSprint")
//
//public void TestCheckZipCood(String ZipCood) throws InterruptedException {
//        init();
//        homePage.CheckZipCood(ZipCood);
//        }
