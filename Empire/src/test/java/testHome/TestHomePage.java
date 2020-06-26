package testHome;

import common.WebAPI;
import org.testng.annotations.Test;

import java.io.IOException;

import static Home.EmpirePageWebElement.*;

public class TestHomePage extends WebAPI {

    // hakim test cases:
    @Test
    public void TestEmpirehomepagelink(){
       init();
       homePage.Empirehomepagelink();
    }
    @Test
    public void TestEmpirehomepageTitle() {
        init();
        homePage.EmpirehomepageTitle();


    }
    @Test
    public void Testempirecompare_Text () {
        init();
        homePage.empirecompare();


    }
    @Test
    public void Check_brokenLink() throws IOException {
        init();
        brokenLink();
    }
    @Test
    public void getPageLinksList() throws IOException, InterruptedException {
        init();
        PageLinksList(driver);
    }






    }




