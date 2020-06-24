package Home;
import common.WebAPI;
import databases.Airlines;
import org.apache.poi.openxml4j.exceptions.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utility.DataReaderTeam4;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import static Home.UnitedAirlinesPageWebElement.*;
import static databases.ConnectToSqlDB.readUnitedAirLinesProfileFromSqlTable;
public class HomePage extends WebAPI {
    @FindBy(how= How.XPATH,using =travelInfoXP )
    public static WebElement travelInfo;
    public static UnitedAirlinesPageWebElement unitedAirlinesPageWebElement;
    public static HomePage homePage;
    public static String url="https://www.united.com/";
    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        unitedAirlinesPageWebElement= PageFactory.initElements(driver, UnitedAirlinesPageWebElement.class);}
    public void TravelInfoSection() {
        clickByXpath(travelInfoXP );
      clickByXpath(timeTablePageXP );
        navigateBack();
        navigatetourl(url);
        clickByXpath(travelInfoXP );
       clickByXpath(destinationXP);
        navigatetourl(url);
        clickByXpath(travelInfoXP );
        clickByXpath(internationalInfoXP);
        navigateBack();
        navigatetourl(url);
        clickByXpath(travelInfoXP );
       clickByXpath(travelWithKidsXP );
        navigateBack();
        navigatetourl(url); }
    public void DayOfTravelSection() {
        clickByXpath(travelInfoXP );
       clickOnElement(baggageinfoCss);
        navigatetourl(url);
        clickByXpath(travelInfoXP );
        clickOnElement(flightStatusCss);
        navigatetourl(url);
        clickByXpath(travelInfoXP );
        clickOnElement(airportAircraftInfoCss);
        navigatetourl(url);
        clickByXpath(travelInfoXP );
        clickOnElement(onboardServiceCss);
        navigatetourl(url);
        clickByXpath(travelInfoXP );
        clickOnElement(travelAlertsCss);
        cleanUp(); }
    public void SpecialTravelNeeds() {
        clickByXpath(travelInfoXP );
        clickOnElement(TravelingWhilePregnantCss);
        navigatetourl(url);
        clickByXpath(travelInfoXP );
        clickOnElement(TravelforPetsCss);
        navigatetourl(url);
        clickByXpath(travelInfoXP );
        clickOnElement(ServiceAnimalsCss);
        navigatetourl(url);
        }
    public void bagageInfosSection() {
        clickByXpath(travelInfoXP );
        clickOnElement(baggageinfoCss);
        getTextFromWebElements( bagageInfosTextBudyXP);
        //getListOfWebElementsByXPath(bagageInfosTextBudyXP);
        }
    public void compareText() throws IOException, InvalidFormatException {
        clickByXpath(travelInfoXP );
        clickOnElement(baggageinfoCss);
        List<String> Acttual=getTextFromWebElements( bagageInfosTextBudyXP);
        List<String> expectedData= Arrays.asList(DataReaderTeam4.fileReader3("sheet1", "/Users/ashorouali/Desktop/unitedExpectedLines.xlsx"));
        if (1<=2) {Assert.assertEquals(expectedData,Acttual); }}
    public void BookAFlightDB() throws SQLException, IOException, ClassNotFoundException, InterruptedException {
        List<Airlines> list = readUnitedAirLinesProfileFromSqlTable();
        for(Airlines user:list){
            System.out.println(user.getFrom() + " " + user.getTo());
            clickByXpath("//*[@id=\"bookFlightForm\"]/div[1]/fieldset/div/label[2]");
            cleanField.clear();
            cleanField.click();
            typeOnInputField(fromCss,(user.getFrom()));
            clickOnElement(toCss);
            typeOnInputField(toCss,(user.getTo()));
        navigateForward(); } }
    public void getInfosSection2() {
        clickByXpath(travelInfoXP );
        clickByXpath(UnaccompaniedminorsXP );
        navigateBack();
        navigatetourl(url);
        clickByXpath(travelInfoXP );
        clickByXpath(TravelFAQsXP);
        navigateBack();
        navigatetourl(url);
        clickByXpath(travelInfoXP );
        clickByXpath(allTravelInformationXP );
        navigateBack();
        navigatetourl(url);
        clickByXpath(travelInfoXP );
        clickByXpath( FlexibleBookingXP );
        navigateBack(); }
    public void TimeTableDB() throws SQLException, IOException, ClassNotFoundException {
        List<Airlines> list = readUnitedAirLinesProfileFromSqlTable();
        for(Airlines user:list){
            clickByXpath(travelInfoXP );
            clickByXpath(timeTablePageXP );
            System.out.println(user.getFrom() + " " + user.getTo());
            typeOnInputField(timeFromCss,(user.getFrom()));
            typeOnInputField(timeToCss,(user.getTo()));
            clickOnElement(timeSearchCss);
            navigateForward(); } }
    public void SpecialTravelNeeds2() {
        clickByXpath(travelInfoXP );
        clickOnElement( TravelersWithDisabilitiesCss);
        navigatetourl(url);
        clickByXpath(travelInfoXP );
        clickOnElement(SpecialMealsAndfoodAllergiesCss);
        navigatetourl(url);
        clickByXpath(travelInfoXP );
        clickOnElement(TravelforSeniorsCss);
        navigatetourl(url);
        clickByXpath(travelInfoXP );
        clickOnElement(ExtraSeatingCss);
        navigatetourl(url); }
    public void WhenStatusDB() throws SQLException, IOException, ClassNotFoundException {
        List<Airlines> list = readUnitedAirLinesProfileFromSqlTable();
        for(Airlines user:list){
            clickByXpath(travelInfoXP );
            clickOnElement(flightStatusCss);
            System.out.println(user.getFrom() + " " + user.getTo());
            typeOnInputField(FlightStatusFromCss,(user.getFrom()));
            typeOnInputField(FlightStatusToCss,(user.getTo()));
            clickOnElement( CheckCss); } }


    public void AlertMethode() throws InterruptedException {
      //  okAlert();
        sleepFor(5);

    }
}



