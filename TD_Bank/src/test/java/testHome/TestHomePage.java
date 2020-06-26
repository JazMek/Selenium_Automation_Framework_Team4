package testHome;

import common.WebAPI;

import org.testng.annotations.Test;

import static Home.HomePage.homePage;
import static Home.HomePage.init;

public class TestHomePage extends WebAPI {
    @Test
    public void TestsetInvestingAndWealth() throws InterruptedException {
        init();
     homePage.setInvestingAndWealth();
    }
    @Test
    public void TestsetIndividualsAndFamilies() throws InterruptedException {
        init();
        homePage.setIndividualsAndFamilies();
    }
    @Test
    public void TestsetBusinessOwners() throws InterruptedException {
        init();
        homePage.setBusinessOwners();
    }
    @Test
    public void TestsetRetirementPlanning() throws InterruptedException {
        init();
        homePage.setRetirementPlanning();
    }
    @Test
    public void TestsetTdAmeritrade() throws InterruptedException {
        init();
        homePage.setTdAmeritrade();
    }
    @Test
    public void TestsetRetirementPlanningVideoDisplay() throws InterruptedException {
        init();
        homePage.setRetirementPlanningVideoDisplay();
    }



}
