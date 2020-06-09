package testHome;

import Home.BaseClass;
import Home.HomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends WebAPI {
    public static HomePage homePage;
    public static BaseClass baseClass;

    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        baseClass = PageFactory.initElements(driver, BaseClass.class);

    }



















































//30182NY_Achour Test cases************************************************************************************

/*test case#01:-As customer i should navigate to amazon home page
               - As customer i should click in the todays deals button and get the next page
               -As customer i should have option to subscribe to todays deals then get back to the main page*/
@BeforeMethod
public void navigateTourl(){
    String url="https://www.amazon.com/";
    driver.get(url);}


   @Test
    public void testTodaysDealsPage(){
        init();
        homePage.todaysDealsPage();
    }
/*30182NY_Achour test case#02:-As customer i should navigate to amazon home page
               - As customer i should click in the todays deals button and get the next page
               -As customer i should see warehouse section
               -As customer i want to see all departements */
  @Test
    public void testWareHouseDealsPage(){
      init();
      homePage.WareHouseDealsPage();
  }
/*30182NY_Achour test case#03:-As customer i should navigate to amazon home page
               - As customer i should click in the todays deals button and get the next page
               -As customer i should have a check box to select Amazon devices
               -As customer i should  want to get option to add to cart */
    @Test
    public void testcheckbox() throws InterruptedException {
        init();
        homePage.checkbox();
    }

/*30182NY_Achour test case#04:-As customer i should navigate to amazon home page
                             - As customer i should click in the todays deals button and get the next page
                              -As customer i want to explore the next section*/

    @Test
    public void testspoortOutdoors(){
        init();
        homePage.spoortOutdoors();
    }
/*30182NY_Achour test case#05:-As customer i should navigate to amazon home page
                             - As customer i should click in the todays deals button and get the next page*/



   @Test

   public void testWatchnowComercial(){
       init();
       homePage.WatchnowComercial();
   }











    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}