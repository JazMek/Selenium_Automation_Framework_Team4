package testHome;
import common.WebAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reporting.TestLogger;
import utility.DataReader;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
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
        sleepFor(2);
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
        sleepFor(1);
        //Step3: Click on 'Books'
        homePage.BooksPage();
        sleepFor(1);
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
        driver.quit();
        //driver.close();
    }
    //****LAMARA Test5: test 'Add To Cart' Functionality
    @Test
    public void testAddToCart() throws InterruptedException {
        init();
        //Step1:Open link: https://www.amazon.com/ and setUpWindow
        homePage.setUpWindow();
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
        sleepFor(30);
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
        sleepFor(1);
        //Step3: click On 'Create List'
        homePage.clickOnCreateListElement();
        sleepFor(4);
        driver.quit();
    }
//*********  LAMARAs; Excel read sheet file   *****************    
    @DataProvider
    public Object[][] getTestAmazonList() throws IOException, InvalidFormatException {
        Object data [][]= DataReader.fileReader3("MySearchList","C:\\Users\\lamar\\Desktop\\Selenium/AmazonList.xlsx");
     return data;
    }
//******** LAMARAs; My Amazon shopping list with Excel read file  ********    
    @Test(dataProvider = "getTestAmazonList")
    public void testSearchBoxField(String inputData){
        init();
        homePage.SearchBoxField(inputData);
    }
//********* LAMARAs; compare "Amazon ALL Product" drop down list with my EXCEL sheet *********** 
    @Test (priority = 9)
    public void TestCheckDropDownSearchList() {
        init();
        homePage.CheckDropDownSearchList();
    }
    //**** LAMARAs Check Broken Links  ******************
    @Test
    public void TestCheck_brokenLink() throws IOException, InterruptedException {
        init();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        homePage.Check_brokenLink();
    }
    //******* LAMARAs get page links  ***********
    @Test
    public void getPageLinksList() throws IOException, InterruptedException {
        init();
        PageLinksList(driver);
        driver.getPageSource();
        System.out.println ("**************************************************************************");
        System.out.println("the Page Source" +"   "+driver.getPageSource());
    }
//************ LAMARAs Execution with Robot method Class **********
    @Test
    public void  execution() throws AWTException {
        init();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        //Create object of Robot class
        Robot robot = new Robot();
        driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
        robot.delay(2000);// delay is to make code wait for mentioned milliseconds before executing next step
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.mouseMove(1000, 900); // move mouse point to specific location
        robot.delay(3000);
        robot.keyPress(KeyEvent.VK_F12);
        robot.keyRelease(KeyEvent.VK_F12);
//        robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
//        robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
        //robot.keyRelease(KeyEvent.VK_INSERT);
//        robot.getPixelColor(400,300);
        robot.delay(5000);
}
@Test
    public void Robot () throws InterruptedException, AWTException, IOException {
    init();
        driver.manage().window().maximize();
    Thread.sleep(2000);
    WebElement webElement = driver.findElement(By.id("twotabsearchtextbox"));
    webElement.sendKeys("mobile phone");
        //Create object of Robot class
    Robot robot = new Robot();
    robot.keyPress(KeyEvent.VK_PAGE_DOWN);
    robot.keyPress(KeyEvent.VK_PAGE_UP);
    robot.delay(3000);
    // This will click on Search button
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    System.out.println("Search button clicked");
    robot.delay(2000);
        //Find x and y coordinates to pass to mouseMove method 
        //1. Get the size of the current window. 
        //2. Dimension class is similar to java Point class which represents a location in a two-dimensional (x, y) coordinate space. 
        //But here Point point = element.getLocation() method can't be used to find the position 
        //as this is Windows Popup and its locator is not identifiable using browser developer tool
    Dimension i = driver.manage().window().getSize();
    System.out.println("Dimension x and y :"+i.getWidth()+" "+i.getHeight());
        //3. Get the height and width of the screen 
        int x = (i.getWidth()/4)+20;
        int y = (i.getHeight()/10)+50;
        //4. Now, adjust the x and y coordinates with reference to the Windows popup size on the screen 
        //e.g. On current screen , Windows popup displays on almost 1/4th of the screen . So with reference to the same, file name x and y position is specified. 
        //Note : Please note that coordinates calculated in this sample i.e. x and y may vary as per the screen resolution settings
    robot.mouseMove(x,y);
    robot.getPixelColor(1296,705);
    System.out.println("Pixel color is"+ " "+robot.getPixelColor(1296,705));
         //Clicks Right mouse button
    // robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
    // robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    sleepFor(5);
    robot.delay(5000);
         //Clicks Left mouse button
    //robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    //robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            //Closes the Desktop Windows popup
        //robot.keyPress(KeyEvent.VK_ENTER);
        //System.out.println("Closed the windows popup");
        
    }
}

    
    
    
