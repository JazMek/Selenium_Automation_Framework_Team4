package testHome;

import common.WebAPI;
import org.testng.annotations.Test;

import java.io.IOException;

import static Home.LoginPage.*;

public class TestHomePage extends WebAPI {

    public static String url;
    @Test
    public void Testcheck_LindingPage(){
        init();
        homePage.check_LindingPage();
    }
  @Test
       public void testcheckTitle(){
       init();
       homePage.checkTitle();
   }
  @Test
       public void testcheckTexte(){
       init();
       homePage.checkTexte();
   }
   @Test
        public void Testcheck_Punta_Cana() throws InterruptedException {
        init();
        loginPage.loginToBooking();
        homePage.check_Punta_Cana();
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
