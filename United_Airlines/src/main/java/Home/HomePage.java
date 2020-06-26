package Home;

import common.WebAPI;
import databases.UnitedList;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import static Home.United_AirlinesPageWebElement.*;
import static databases.ConnectToSqlDB.getUnitedListFromSqlTable;
import static databases.ConnectToSqlDB.loadProperties;

public class HomePage extends WebAPI {


    public static void unitedAirlinehomepagelink() {
        String expectedUrl = "https://www.united.com/en/us";
        getUrl(expectedUrl);
    }

    public static void unitedAirlinehomepageTitle() {
        String expectedTitle = "United Airlines - Airline Tickets, Travel Deals and Flights";
        getTitle(expectedTitle);
    }

    public void unitedflightfonction(String from, String to) {

        Onewaytrip.click();
        tripfrom.click();
        cleenbotton.click();
        tripfrom.sendKeys(from);
        goingto.click();
        goingto.sendKeys(to);
        departingdateslink.click();
        departureday.click();
        travelers.click();
        for (int i = 0; i < 3; i++) {
            adult16_64.click();
        }


    }
// sql connexion data provider:
    public void Book_a_RoundtripDB() throws IOException, SQLException, ClassNotFoundException, InterruptedException {
        List<UnitedList> list = getUnitedListFromSqlTable();
        loadProperties();
        for (UnitedList user : list) {


            BookLink.click();
            checkBoxOneWay.click();
// RoundtripCheckBox.click();
            FromTextField.click();
            FromTextField_ClearButton.click();
            FromTextField.sendKeys(user.getFrom());
            ToTextField.sendKeys(user.getTo());
            DepartDateLink.click();
// int month=0;
// for (int i=0;i<month ;i++){Month_ClickBtn.click();}
            DepartDate.click();
            TravelersPassengers.click();
            for (int i = 5; i < 2; i++) {
                Adults.click();
            }
            for (int i = 0; i < 2; i++) {
                Seniors.click();
            }
// for (int i=0;i<2 ;i++){Children_15_17.click();}
// for (int i=0;i<2 ;i++){Children_12_14.click();}
            exitButton.click();
            Find_flightsButton.click();
            navigatebacward();


        }


    }
    public void Check_brokenLink() throws IOException {
        brokenLink();
    }
    public void unitedcompare() {
        String expectedcompare_Text = "We're here for you";
        compare_Text(expectedcompare_Text,acyualtext);
    }
}