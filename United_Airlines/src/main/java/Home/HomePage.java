package Home;


import common.WebAPI;
import databases.UnitedList;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import static Home.United_AirlinesPageWebElement.*;
import static databases.ConnectToSqlDB.getUnitedListFromSqlTable;
import static databases.ConnectToSqlDB.loadProperties;

public class HomePage extends WebAPI {
    public static United_AirlinesPageWebElement united_airlinesPageWebElement;
    public static HomePage homePage;
    public static void init() throws InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        united_airlinesPageWebElement = PageFactory.initElements(driver, United_AirlinesPageWebElement.class);
        setUpWindow();
    }

    public void SetBookPage() throws InterruptedException {
        BookButton.click();
        RouteMapButton.click();
        sleepFor(10);
        MaxiMiniizeMapButton.click();
        for (int i = 0; i < 5; i++) {ZoomInMButton.click(); }
        for (int i = 0; i < 5; i++) {ZoomOutMButton.click(); }
        MaxiMiniizeMapButton.click();
    }

    public void SetRouteSearchBox() throws InterruptedException {
        BookButton.click();
        RouteMapButton.click();
        sleepFor(3);
        SearchBox.sendKeys("New York, NY (LGA - LaGuardia)");
        SearchBoxButton.click();
        ChicagoRouteFrom.click();
        sleepFor(5);
    }




        public void SetBook_a_RoundtripDB () throws
        IOException, SQLException, ClassNotFoundException, InterruptedException {
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
                waitForSeconds(10);
            }
        }



}
