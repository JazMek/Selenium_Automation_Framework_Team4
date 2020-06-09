package testHome;

import Home.BaseClass;
import Home.HomePage;
import Home.LoginPage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static Home.BaseClass.*;
import static Home.LoginPage.loginToBooking;

public class TestLoginPage extends WebAPI {


    @Test
    public void longinToBook() {

        init();
        loginToBooking();

    }


}
