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
    }
}
