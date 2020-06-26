package Home;
import common.WebAPI;
import databases.User2United;
import org.openqa.selenium.support.PageFactory;
import utility.DataReader;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static Home.United_AirlinesPageWebElement.*;
import static databases.ConnectToSqlDB.*;
public class HomePage extends WebAPI {
    public static HomePage homePage;
    public static United_AirlinesPageWebElement united_AirlinesPageWebElement;
    public static DataReader dataReader;
    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        united_AirlinesPageWebElement = PageFactory.initElements(driver, United_AirlinesPageWebElement.class);
        dataReader=PageFactory.initElements(driver,DataReader.class);
    }
    //*******  LAMARAs Book a "One Way" flight *******************
    public void FlightStatus() throws InterruptedException {
        checkBoxOneWay.click();
        clickLink.click();
        clearTextBox.click();
        enterDestinationFrom.click();
        enterDestinationFrom.sendKeys("New York/Newark EWR");
        enterDestinationTo.sendKeys("Algiers ALG");
        clickOnDateBox.click();
        sleepFor(1);
        selectDepartureDate.click();
        AdultClickBox.click();
        for (int i = 1; i <= 2; i++) {
            NumOfAdults.click();
            NumOfSeniors.click();
            sleepFor(2);
        }
    }
    //********** LAMARAs Data base connection for United Account to Book a Round Trip Flight **************************
    public static List<User2United> getUnitedListFromSqlTable() throws IOException, SQLException, ClassNotFoundException {
        List<User2United> list = new ArrayList<>();
        User2United user = null;
        try {
            Connection conn = connectToSqlDatabase();
            String query = "SELECT * FROM united";
// create the java statement
            Statement st = conn.createStatement();
// execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);
// iterate through the java resultset
            while (rs.next()) {
                String from = rs.getString("from");
                String to = rs.getString("to");
                String month = rs.getString("month");
                String Adults = rs.getString("Adults");
                String Seniors = rs.getString("Seniors");
                String Children = rs.getString("Children");
                user = new User2United(from, to, month, Adults, Seniors, Children);
                list.add(user);
            }
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return list;
    }
    public void BookRoundtripDB() throws IOException, SQLException, ClassNotFoundException, InterruptedException {
        List<User2United> list = getUnitedListFromSqlTable();
        for (User2United user : list) {
            System.out.println(user.getFrom() + " " + user.getTo() + " " + user.getMonth() + " " + user.getAdults() + " " + user.getSeniors() + " " + user.getChildren());
            BookLink.click();
            //checkBoxOneWay.click();
            FromTextField.click();
            FromTextField_ClearButton.click();
            FromTextField.sendKeys(user.getFrom());
            ToTextField.sendKeys(user.getTo());
            DepartDateLink.click();
            DepartDate.click();
            TravelersPassengers.click();
            for (int i = 5; i < 2; i++) {
                Adults.click();
            }
            for (int i = 0; i < 2; i++) {
                Seniors.click();
            }
            exitButton.click();
            Find_flightsButton.click();
            navigatebackward(); 
        }
    }
    //********** LAMARAs United Search List  ************************  
    public void CheckUnitedSearchBox(String inputData) {
        UnitedSearch.click();
        Search.click();
        Search.sendKeys(inputData);
    }
    //**** LAMARAs Check Broken Links  ******************
    public void Check_brokenLink() throws IOException, InterruptedException {
        brokenLink();
    }
    //--------- LAMARAs my United Flight List  --------------------
    public void FlightStatus(String from, String to) throws InterruptedException {
        setUpWindow();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        checkBoxOneWay.click();
        clickLink.click();
        clearTextBox.click();
        enterDestinationFrom.click();
        enterDestinationFrom.sendKeys(from);
        enterDestinationTo.sendKeys(to);
        clickOnDateBox.click();
        selectDepartureDate.click();
        AdultClickBox.click();
        for( int i= 0; i<= 3; i++ ){ NumOfAdults.click();
        }
        for( int i= 0; i<= 2; i++ ){ NumOfSeniors.click(); }
        CloseTravelersPanel.click();
        ClickFindFlightButton.click();
        sleepFor(3);
    }
    
}
