package Home;
import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utility.DataReader;
import java.io.IOException;
import java.util.List;
import static Home.AmazonPageWebElement.*;
public class HomePage extends WebAPI {
    public static HomePage homePage;
    public static AmazonPageWebElement amazonPageWebElement;
    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        amazonPageWebElement = PageFactory.initElements(driver, AmazonPageWebElement.class);
    }
    public void BestSellersPage() {
        ClickBestSellers.click();
    }
    //----LAMARAs; Check Best sellers Page Url-------
    public void VerifyBestSellersUrl(){
        Assert.assertEquals(driver.getCurrentUrl(),ExpectedUrl,"the url used didn't navigate to the Best Sellers Page");
    }
    //----LAMARAs; choose the best Book in 'Best Sellers in Books'--------
    public void BooksPage() {
        ClickBooks.click();
  }
    //----LAMARAs; Check Books Page Url--------
    public void VerifyBooksUrl() {
        Assert.assertEquals(driver.getCurrentUrl(),ExpectedUrl1,"Didn't navigate to 'Amazon Books' functionality");
    }
    //----LAMARAs; choose the best Book in 'Best Sellers in Books'--------
    public void ChooseTheBestBook() {
        ChooseTheBestBook.click();
    }
    //----------LAMARAs; Select PaperBack Format for the best book--------------
    public void SelectPaperBackFormat() {
        SelectPaperBackFormat.click();
    }
    //--------- LAMARAs; test 'Add To Cart' Functionality----
    public void AddToCart() {
      AddToCart.click();
    }
    //--------- LAMARAs; click On 'Create List'  --------
    public void clickOnCreateListElement() {
        ClickCreateList.click();
    }
    //********* LAMARAs; My Amazon shopping list with Excel read file ***************
    public void SearchBoxField(String inputData) {
        SearchBox.click();
        SearchBox.sendKeys(inputData);
    }
    //********* LAMARAs; compare "Amazon ALL Product" drop down list with my EXCEL sheet *********** 
    public static String pathExcel="C:\\Users\\lamar\\Desktop\\Selenium/AmazonALLProduct.xlsx";
    public void CheckDropDownSearchList() {
        List<String> list = DataReader.readExcelFile( pathExcel);
        Select select = new Select(searchDropdownBox);
        List<WebElement> ActualResult = select.getOptions();
        for (int i = 0; i < ActualResult.size(); i++) {
            select.selectByIndex(i);
            if (list.get(i).equalsIgnoreCase(ActualResult.get(i).getText()) ){
                System.out.println("The test is passed");
            } else {
                System.out.println("The test is failed");
            }
            System.out.println("*************************************************************************");
            System.out.println("this is the actual result "+ActualResult.get(i).getText());
            System.out.println("this is the expected result "+list.get(i));
        }
    }
    //**** LAMARAs Check Broken Links  ******************
    public void Check_brokenLink() throws IOException, InterruptedException {
        brokenLink();
    }
    
    
}


