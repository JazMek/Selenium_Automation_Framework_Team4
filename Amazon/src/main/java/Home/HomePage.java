package Home;
import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import static Home.AmazonPageWebElement.*;
public class HomePage extends WebAPI {
public void LoginToAmazon() {
        HamburgerMenu.click();
        hmenuCustomerName.click();
        ApEmail.sendKeys("team4WDNY2020@gmail.com",Keys.ENTER);
        ApPassword.sendKeys("Team42020", Keys.ENTER);
    }
}
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import static Home.AmazonPageWebElement.*;
public class HomePage extends WebAPI {
    public static HomePage homePage;
    public static AmazonPageWebElement amazonPageWebElement;
    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        amazonPageWebElement = PageFactory.initElements(driver, AmazonPageWebElement.class);
    }
    
    //******** LAMARAs *********************
    public void BestSellersPage() {
        ClickBestSellers.click();
    }
    public void VerifyBestSellersUrl(){
        Assert.assertEquals(driver.getCurrentUrl(),ExpectedUrl,"the url used didn't navigate to the Best Sellers Page");
    }
    public void BooksPage() {
        ClickBooks.click();
  }
    public void VerifyBooksUrl() {
        Assert.assertEquals(driver.getCurrentUrl(),ExpectedUrl1,"Didn't navigate to 'Amazon Books' functionality");
    }
    public void ChooseTheBestBook() {
        ChooseTheBestBook.click();
    }
    public void SelectPaperBackFormat() {
        SelectPaperBackFormat.click();
    }
    public void AddToCart() {
      AddToCart.click();
    }
    public void clickOnCreateListElement() {
        ClickCreateList.click();
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
