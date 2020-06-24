package testHome;
import common.WebAPI;
import databases.Airlines;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import static Home.HomePage.homePage;
import static Home.HomePage.init;
import static databases.ConnectToSqlDB.*;
public class TestHomePage extends WebAPI {
    @Test
    public void testTravelInfoSection(){
        init();
        homePage.TravelInfoSection(); }
    @Test
    public void testgetInfosSection2(){
        init();
        homePage.getInfosSection2(); }
     @Test
        public void testDayOfTravelSection(){
        init();
            homePage.DayOfTravelSection(); }
    @Test
    public void testSpecialTravelNeeds(){
        init();
        homePage.SpecialTravelNeeds(); }
    @Test
    public void testSpecialTravelNeeds2(){
        init();
        homePage.SpecialTravelNeeds2(); }
     @Test
    public void testBagageInfossection(){
        init();
        homePage.bagageInfosSection(); }
    @Test
    public void testCompareText() throws IOException, InvalidFormatException {
        init();
        homePage.compareText(); }
        @Test
    public void testBookAFlightDB() throws SQLException, IOException, ClassNotFoundException, InterruptedException {
        init();
        homePage.BookAFlightDB();
        loadProperties();
        connectToSqlDatabase();
        readUnitedAirLinesProfileFromSqlTable();
        List<Airlines> list  =readUnitedAirLinesProfileFromSqlTable(); }
        @Test
    public void testTimeTableDB() throws IOException, SQLException, ClassNotFoundException, InterruptedException {
        init();
            homePage.TimeTableDB();
            loadProperties();
            connectToSqlDatabase();
            readUnitedAirLinesProfileFromSqlTable();
            List<Airlines> list  =readUnitedAirLinesProfileFromSqlTable(); }
            @Test
    public void testWhenStatusDB() throws IOException, SQLException, ClassNotFoundException {
                init();
                homePage.WhenStatusDB();
                loadProperties();
                connectToSqlDatabase();
                readUnitedAirLinesProfileFromSqlTable();
                List<Airlines> list  =readUnitedAirLinesProfileFromSqlTable(); }
                @Test
    public void testAlertMethode() throws InterruptedException {
        init();
        homePage.AlertMethode();

                }



}
