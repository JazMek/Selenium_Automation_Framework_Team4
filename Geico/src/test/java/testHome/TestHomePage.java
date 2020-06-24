package testHome;
import common.WebAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReader;
import utility.DataReaderTeam4;

import java.io.IOException;

import static Home.HomePage.homePage;
import static Home.HomePage.init;
public class TestHomePage extends WebAPI {
    @Test
    public void testUrl(){
        init();
        homePage.url(); }
    @Test
    public void testInsaranceButton() throws InterruptedException {
        init();
        homePage.InsaranceButton(); }
        @Test
    public void testInformation(){
        init();
        homePage.Information(); }
        @Test
    public void testCovid19Updata(){
        init();
        homePage.Covid19Updata(); }
        @Test
    public void testNewCostumer(){
        init();
        homePage.newCostumer(); }
        @Test
    public void testMakePayment(){
        init();
        homePage.makePayment(); }
        @Test
    public void testScrollDwn(){
        init();
        homePage.ScrollDwn(); }


    @DataProvider
    public Object[] getTestData()throws IOException, InvalidFormatException {
        Object[] data = DataReaderTeam4.fileReader3("sheet1","/Users/ashorouali/Desktop/zipcode.xlsx");
        return data;}
    @Test (dataProvider = "getTestData")
    public void TestCheckZipCood(String ZipCood) {
        init();
        homePage.CheckZipCood(ZipCood);
    }





}
