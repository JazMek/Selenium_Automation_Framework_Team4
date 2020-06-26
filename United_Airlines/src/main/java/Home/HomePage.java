package Home;

import common.WebAPI;
import databases.ConnectToSqlDB;
import databases.UnitedList;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import static Home.United_AirlinesPageWebElement.*;
import static databases.ConnectToSqlDB.*;

public class HomePage extends WebAPI {
    public void Testcheck_LindingPage() {
        String expected_SprintUrl="https://www.united.com/en/us";
        String expected_SprintTitle="United Airlines - Airline Tickets, Travel Deals and Flights";
        getUrl(expected_SprintUrl);
        getTitle(expected_SprintTitle);
    }
    public HomePage() throws SQLException, IOException, ClassNotFoundException {
    }
    public void Book_a_Roundtrip(String From, String To) {
        BookLink.click();
//        RoundtripCheckBox.click();
        FromTextField.click();
        FromTextField_ClearButton.click();
        FromTextField.sendKeys(From);
        ToTextField.sendKeys(To);
        DepartDateLink.click();
        DepartDate.click();
        ReturnDateLink.click();
        ReturnDate.click();
        TravelersPassengers.click();
        for (int i=1;i<2 ;i++){Adults.click();}
        for (int i=0;i<1 ;i++){Seniors.click();}
//        for (int i=0;i<4 ;i++){Infants.click();}
//        for (int i=0;i<4 ;i++){Infantslap.click();}
        for (int i=0;i<1 ;i++){Children_15_17.click();}
        for (int i=0;i<1 ;i++){Children_12_14.click();}
//        for (int i=0;i<4 ;i++){Children_5_11.click();}
//        for (int i=0;i<4 ;i++){Children_2_4.click();}
    }
    public void Book_a_RoundtripDB() throws IOException, SQLException, ClassNotFoundException, InterruptedException {
        List<UnitedList> list = getUnitedListFromSqlTable();
        loadProperties();
        for(UnitedList user :list){
        BookLink.click();
        checkBoxOneWay.click();
        FromTextField.click();
        FromTextField_ClearButton.click();
        FromTextField.sendKeys(user.getFrom());
        ToTextField.sendKeys(user.getTo());
        DepartDateLink.click();
//        int month=0;
//        for (int i=0;i<month ;i++){Month_ClickBtn.click();}
         DepartDate.click();
         TravelersPassengers.click();
        for (int i=5;i<2 ;i++){Adults.click();}
        for (int i=0;i<2 ;i++){Seniors.click();}
//        for (int i=0;i<2 ;i++){Children_15_17.click();}
//        for (int i=0;i<2 ;i++){Children_12_14.click();}
        exitButton.click();
        Find_flightsButton.click();
        navigatebacward();
            waitForSeconds(10);
        }
    }
    public void Book_a_RoundtripDB1() throws IOException, SQLException, ClassNotFoundException, InterruptedException {
        List<UnitedList> list = getUnitedListFromSqlTableArry();
        loadProperties();
        for(UnitedList user1 :list){
            BookLink.click();
            waitForSeconds(1);
            checkBoxOneWay.click();
            waitForSeconds(1);
            FromTextField.click();
            waitForSeconds(1);
            FromTextField_ClearButton.click();
            FromTextField.sendKeys(user1.getFrom1());
            ToTextField.sendKeys(user1.getTo1());
            DepartDateLink.click();
        for (int i=0;i<user1.getMonth1() ;i++){Month_ClickBtn1.click();waitForSeconds(1);}
            DepartDate.click();
            waitForSeconds(1);
            TravelersPassengers.click();
        for (int i=0;i<user1.getAdults1() ;i++){Adults.click();}
            waitForSeconds(1);
        for (int i=0;i<user1.getSeniors1() ;i++){Seniors.click();}
            waitForSeconds(1);
        for (int i=0;i<user1.getChildren11() ;i++){Children_15_17.click();}
            waitForSeconds(1);
        for (int i=0;i<user1.getChildren21() ;i++){Children_12_14.click();}
            waitForSeconds(1);
            exitButton.click();
            Find_flightsButton.click();
            navigatebacward();
            waitForSeconds(1);
        }
    }
    public void Check_brokenLink() throws IOException {
        brokenLink();
    }
    public void CheckPagelistLinks() {
        PageLinksList(driver);
    }

    public void FlightStatus(String from, String to) throws InterruptedException {
        setUpWindow();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

// sleepFor(2);
        checkBoxOneWay.click();
        clickLink.click();
        clearTextBox.click();
// sleepFor(2);
        enterDestinationFrom.click();

        enterDestinationFrom.sendKeys(from);
// sleepFor(2);
        enterDestinationTo.sendKeys(to);
// sleepFor(2);
        clickOnDateBox.click();
// sleepFor(2);
        selectDepartureDate.click();
// sleepFor(2);
        AdultClickBox.click();
// sleepFor(2);
// Integer. parseInt(NumAdults);
// int i = Integer.parseInt(s.trim())
//int NumAdult1= Integer.parseInt(NumAdult.trim());

        for( int i= 0; i<= 3; i++ ){ NumOfAdults.click();
//sleepFor(2);
        }

        for( int i= 0; i<= 2; i++ ){ NumOfSeniors.click(); }

        CloseTravelersPanel.click();
        ClickFindFlightButton.click();
        sleepFor(3);
    }

}
