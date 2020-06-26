package testHome;

import common.WebAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReaderTeam4;
import java.io.IOException;
import static Home.HomePage.homePage;
import static Home.HomePage.init;

public class TestHomePage extends WebAPI {


//    @Test
//    public void testBusinessInsurance() throws InterruptedException {
//        init();
//        homePage.setBusinessInsurance();
//    }
    @Test
    public void testBusinessOwner() throws InterruptedException {
        init();
        homePage.setBusinessOwner();
    }
    @Test
    public void testGeneralLiability(){
        init();
        homePage.setGeneralLiability();
    }
    @Test
    public void testProfessionalLiability(){
        init();
        homePage.setProfessionalLiability();
    }
    @Test
    public void testMedicalMalpractice(){
        init();
        homePage.setMedicalMalpractice();
    }
    @Test
    public void testWellnessAndFitness(){
        init();
        homePage.setWellnessAndFitness();
    }
    @Test
    public void testCommercialAuto(){
        init();
        homePage.setCommercialAuto();
    }
    @Test
    public void testRideShare(){
        init();
        homePage.setRideShare();
    }
    @Test
    public void testInsaranceButton() throws InterruptedException {
        init();
        homePage.InsaranceButton();
    }


    @DataProvider
    public Object[] getTestData() throws IOException, InvalidFormatException {
        Object[] data = DataReaderTeam4.fileReader3("Sheet1","/Users/salahmouloudi/Desktop/geicoXl.xlsx");
        return data;}
    @Test (dataProvider = "getTestData")
    public void TestCheckZipCood(String ZipCood) {
        init();
        homePage.CheckZipCood(ZipCood);
    }
}
