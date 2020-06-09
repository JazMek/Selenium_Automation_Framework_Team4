package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static Home.AmazonPageWebElement.*;
import static Home.BaseClass.*;

public class HomePage extends WebAPI {
    //30182NY_Achour Test case N01:
    public void todaysDealsPage() {
        String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        todaysDealsButton.click();
        SubscribeButton.click();
        BacktoHomeBage.click();
        String title=driver.getTitle();
        Assert.assertEquals(title ,expectedTitle,"title doesn't match");
    }
    //30182NY_Achour Test case N02:
    public void WareHouseDealsPage() {
        String expectedTitle="Amazon Warehouse | Great deals on quality used products";
        todaysDealsButton.click();
        warehouseSection.click();
        seeAllCategories.click();
        String title=driver.getTitle();
        Assert.assertEquals(title ,expectedTitle,"title doesn't match");
}
    //30182NY_Achour Test case N03:
    public void checkbox() throws InterruptedException {
        String expectedTitle="Gold Box Deals | Today's Deals - Amazon.com";
        todaysDealsButton.click();
        amazonDevice.click();
        AddToCart.click();
        sleepFor(3);
        String title=driver.getTitle();
        Assert.assertEquals(title ,expectedTitle,"title doesn't match");
    }
    //30182NY_Achour Test case N04:
    public void spoortOutdoors() {
        String expectedTitle="Amazon Prime Benefits | Woot";
        todaysDealsButton.click();
        seedetauils.click();
        addAllToList.click();
        String title=driver.getTitle();
        Assert.assertEquals(title ,expectedTitle,"title doesn't match");
    }
    //30182NY_Achour Test case N04:
    public void WatchnowComercial() {
        String expectedTitle="Amazon Prime Benefits | Woot";
        watchNow.click();
        closeButton.click();
        String title=driver.getTitle();
        Assert.assertEquals(title ,expectedTitle,"title doesn't match");
    }
}
