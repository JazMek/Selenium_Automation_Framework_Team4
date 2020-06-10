package testHome;

import Home.BaseClass;
import Home.HomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestHomePage extends WebAPI {


    public static HomePage homePage;
    public static BaseClass baseClass;






    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        baseClass = PageFactory.initElements(driver, BaseClass.class);

    }



    @Test(priority = 1)
    public void testloginToNetflixAccount() {
              init();
              baseClass.loginToNetflixAccount();

    }

    @Test(priority = 2)

        public void testaddProfileIconToNetflix(){
                init();
                baseClass.loginToNetflixAccount();
                homePage.addProfileIconToNetflix();


    }

}