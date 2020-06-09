package Home;

import common.WebAPI;
import org.testng.Assert;

import static Home.BaseClass.ClickBestSellers;

public class HomePage extends WebAPI {

    //    public void wholefoodsPage() {
//        amazonWholefoodsbutton.click();
//
//
//    }
//public static String expecttext="";
//    public void verifywholefoodslogo() {
//        amazonWholefoodstext.isDisplayed();
//
//    }
//
    public void BestSellersPage() {
        ClickBestSellers.click();

    }

    public static String ExpectedUrl="https://www.amazon.com/gp/bestsellers/?ref_=nav_cs_bestsellers";
    public void VerifyBestSellersUrl(){

        Assert.assertEquals(driver.getCurrentUrl(),ExpectedUrl,"the url used didn't navigate to the Best Sellers Page");


    }





}
