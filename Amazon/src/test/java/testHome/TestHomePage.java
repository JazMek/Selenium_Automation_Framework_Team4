package testHome;

import Home.BaseClass;
import Home.HomePage;
import common.WebAPI;
import okio.Timeout;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends WebAPI {
    public static HomePage homePage;
    public static BaseClass baseClass;

    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        baseClass = PageFactory.initElements(driver, BaseClass.class);

    }


    //@Test
//       public void searchField() throws InterruptedException {
//        init();
//        baseClass.loginToAmazonAccount();
//
//        homePage.searchBox.sendKeys("t shirt");
//        homePage.searchButton.click();
//
//    }
//30181NY_salah first test case :
 @Test
    public void testclickOnFindaGift(){
        init();
        homePage.clickOnFindaGift();

 }
    //30181NY_salah  test case #2:
 @Test

    public void testamazonFindAGiftText(){
     init();
        homePage.amazonFindAGiftText();

 }
 @Test
    public void testamazonEGIFTSButton(){
        init();
     homePage.amazonEGIFTSButton();
 }
    @Test
    public void testPriceAllPricesScrollDown(){
        init();
        homePage.PriceAllPricesScrollDown();
    }

    @Test
    public void testamazonFindGiftHarryPotterandtheSorcerersStoneXP(){
        init();
        homePage.amazonFindGiftHarryPotterandtheSorcerersStoneXP();

    }










}