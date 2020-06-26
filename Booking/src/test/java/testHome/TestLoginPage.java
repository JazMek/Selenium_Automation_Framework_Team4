package testHome;

import common.WebAPI;
import org.testng.annotations.Test;

import java.io.IOException;

import static Home.HomePage.*;
import static Home.LoginPage.*;


public class TestLoginPage extends WebAPI {

    @Test
    public void Testcheck_LindingPage(){
        init();
        loginPage.check_LindingPage();
    }
    @Test
    public void longinToBook() {
        init();
        loginToBooking();
    }
    @Test
    public void TestMy_dashboard(){
        init();
        loginToBooking();
        loginPage.My_dashboard();
        loginPage.check_text_in_dashboard();
    }
    @Test
    public void Test_Find_the_best_deals() throws InterruptedException {
        init();
        loginToBooking();
        loginPage.Find_the_best_deals();
        loginPage.check_Error_Mesage();
    }
    @Test
    public void Testadding_your_details() throws InterruptedException {
        init();
        loginToBooking();
        loginPage.adding_your_details();
    }
    @Test
    public void TestGet_rewarded_for_dreaming() throws InterruptedException {
        init();
        loginToBooking();
        loginPage.Get_rewarded_for_dreaming();
        loginPage.check_Get_rewarded_for_dreaming();
    }
    @Test
    public void Check_brokenLink() throws IOException {
        init();
        homePage.brokenLink();
    }
    @Test
    public void TestCheckPagelistLinks(){
        init();
        homePage.CheckPagelistLinks();
    }
}
