package testHome;

import common.WebAPI;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReader;

import java.io.IOException;

import static Home.HomePage.homePage;
import static Home.HomePage.init;

public class TestHomePage extends WebAPI {

   @Test
    public void TestsetPlansDropDown() throws InterruptedException {
       init();
      homePage.setPlans();
   }
    @Test
    public void TestsetsetUnlimitedPlans() throws InterruptedException {
        init();
        homePage.setUnlimitedPlans();
    }
    @Test
    public void TestsetUnlimitedPlansPage() throws InterruptedException {
       init();
       homePage.setUnlimitedPlansPage();
    }
    @Test
    public void TestsetUsVsThemPlanPage() throws InterruptedException {
        init();
     homePage.setUsVsThemPlan();
    }
    @Test
    public void TestsetOtherPlansPlanXP()throws InterruptedException{
       init();
       homePage.setOtherPlansPlan();
    }
    @Test
    public void TestsetOtherPlans()throws InterruptedException{
        init();
        homePage.setOtherPlans();
    }

    String path="/Users/salahmouloudi/Desktop/GeicoListZipCood.xlsx";
    @DataProvider
    public Object[][] getTestDataSprint() throws IOException, InvalidFormatException {
        Object data [][]= DataReader.fileReader3("ListZipCood", path);

        return data;
    }
    @Test (dataProvider = "getTestDataSprint")

    public void TestCheckZipCood(String ZipCood) throws InterruptedException {
        init();
        homePage.CheckZipCood(ZipCood);
    }



}
