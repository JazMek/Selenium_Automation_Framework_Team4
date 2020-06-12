package testHome;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static Home.AmazonPageWebElement.*;
import static Home.HomePage.*;
public class TestHomePage extends WebAPI { 
    //***** LAMARA Test1: Automate 'Amazon Best Sellers' Functionality  ********
    @Test
    public void testBestSellersPage() {
        init();
        driver.getCurrentUrl();
        //Step1:Open link: https://www.amazon.com/
        //Step2:Click on 'Best Sellers'
        homePage.BestSellersPage();
        //Step3: Verify the name of the Url which has been used.
        homePage.VerifyBestSellersUrl();
    }
   //*******LAMARA Test2: Automates 'Books' Functionality  ******************
    @Test
    public void testBooksPage() throws InterruptedException {
        init();
        //Step1: Click on 'Books'
        homePage.BestSellersPage();
        sleepFor(5);
        homePage.BooksPage();
        //Step2: Verify the name of the Url which has been used.
        homePage.VerifyBooksUrl();

    }
    //****LAMARA Test3: choose the best Book in 'Best Sellers in Books' Functionality ******************
    @Test
    public void testChooseTheBestBook() throws InterruptedException {
        init();
        //Step1:Open link: https://www.amazon.com/
        //Step2:Click on 'Best Sellers'
        homePage.BestSellersPage();
        sleepFor(3);
        //Step3: Click on 'Books'
        homePage.BooksPage();
        sleepFor(3);
        //Step4: Click on the best book in 'Best Sellers in Books' page.
        homePage.ChooseTheBestBook();
    }
    //****LAMARA Test4: Select PaperBack Format for the best book 
    @Test
    public void testSelectPaperBackFormat() throws InterruptedException {
        init();
        //Step1:Open link: https://www.amazon.com/ and setUpWindow
        homePage.setUpWindow();
        //waitUntilClickAble(By.cssSelector("#nav-xshop > a:nth-child(2)"));
        //Step2:Click on 'Best Sellers'
        homePage.BestSellersPage();
        sleepFor(3);
        //Step3: Click on 'Books'
        homePage.BooksPage();
        sleepFor(3);
        //Step4: Click on the best book in 'Best Sellers in Books' page.
        homePage.ChooseTheBestBook();
        sleepFor(3);
        //Step5: Select PaperBack Format for the best book
        homePage.SelectPaperBackFormat();
        sleepFor(3);
        driver.quit();
        //driver.close();
    }
    //****LAMARA Test5: test 'Add To Cart' Functionality
    @Test
    public void testAddToCart() throws InterruptedException {
        init();
        //Step1:Open link: https://www.amazon.com/ and setUpWindow
        homePage.setUpWindow();
        //waitUntilClickAble( );
        //Step2:Click on 'Best Sellers'
        homePage.BestSellersPage();
        sleepFor(1);
        //Step3: Click on 'Books'
        homePage.BooksPage();
        sleepFor(1);
        //Step4: Click on the best book in 'Best Sellers in Books' page.
        homePage.ChooseTheBestBook();
        sleepFor(1);
        //Step5: Select PaperBack Format for the best book
        homePage.SelectPaperBackFormat();
        sleepFor(1);
        homePage.AddToCart();
        sleepFor(3);
        driver.quit();
    }
    //****LAMARA Test6: mouse hover test
    @Test
    public void testHoverMouse() throws InterruptedException {
        init();
        //Step1:Open link: https://www.amazon.com/ and setUpWindow
        homePage.setUpWindow();
        //Step2: Move your cursor over 'Accounts & Lists' link on the header
        HoverMouseAndClick( driver, HoverMouse);
        sleepFor(2);
        //Step3: click On 'Create List'
        homePage.clickOnCreateListElement();
        sleepFor(3);
        driver.quit();
    }
    
    }

    
    
    
