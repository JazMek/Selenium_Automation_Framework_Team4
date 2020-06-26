package testHome;

import common.WebAPI;
import org.testng.annotations.Test;

import java.io.IOException;

import static Home.TD_BankPageWebElement.*;

public class TestHomePage extends WebAPI {
    @Test
    public void Testcheck_LindingPage(){
        init();
        homePage.Testcheck_LindingPage();
    }

    @Test
    public void TestCheckTD_BankLinkToHomePage(){
        init();
        homePage.CheckTD_BankLinkToHomePage();

    }
    @Test

    public void TestCheckTD_BankHomePageTitle(){
        init();
        homePage.CheckTD_BankHomePageTitle();
    }
    @Test
    public void TestCheck_International_Travel_Tips() throws InterruptedException {
        init();
        homePage.Check_International_Travel_Tips();
    }
    @Test
    public void Check_brokenLink() throws IOException {
        init();
        brokenLink();
    }
    @Test
    public void TestCheckPagelistLinks(){
        init();
        homePage.CheckPagelistLinks();
    }
    @Test
    public void testSwitchWindows() throws InterruptedException {
        init();
        homePage.SwitchWindows();
    }
    @Test
    public void TestChek_Link_isDisplayed(){
        init();
        homePage.Chek_Link_isDisplayed();
    }
    @Test
    public void TestChekLink_isDisplayed(){}
}
