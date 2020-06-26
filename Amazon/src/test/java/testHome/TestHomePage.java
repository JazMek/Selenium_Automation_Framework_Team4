package testHome;

import Home.HomePage;
import common.WebAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Home.AmazonPageWebElement;
import utility.DataReader;

import java.io.IOException;

import static Home.AmazonPageWebElement.*;
//import static Home.HomePage.homePage;
//import static Home.HomePage.init;


public class TestHomePage extends WebAPI {
    public static AmazonPageWebElement amazonPageWebElement;
    public static HomePage homePage;


//  initialize elements of a Page classes
    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
 //       baseClass = PageFactory.initElements(driver, BaseClass.class);
        amazonPageWebElement = PageFactory.initElements(driver, AmazonPageWebElement.class);
    }
   // brahim : test case 01- user navigate to New releases page by clicking new releases link
    @Test
    public static void testNewReleasePage(){
        init();
        // step 01- click on new releases link
        homePage.getNewReleasePage();
        homePage.checkReleasePageText();
    }
    // brahim:test case 02- user can navigate to New Releases in Baby page by clicking the baby link
    @Test
    public void testNewReleasesInBaybyPage() throws InterruptedException {
        init();
        sleepFor(5);
        // step 01- click on new releases link
        homePage.getNewReleasePage();
        //step 02- click on baby link
      homePage.getNewReleasesInBabyPage();
      homePage.checkNewReleasesInBabyPageText();
    }
    // brahim:test case 03- user can navigate to next page by clicking on next web button
  @Test
    public void testNavigationToNextList(){
   init();
// step 01- click on new releases link
      homePage.getNewReleasePage();
      //step 02- click on baby link
      homePage.getNewReleasesInBabyPage();
      // step 03- click on next page button
     homePage.NavigateToNextList();
     // step 04- verify the text page
     homePage.checknavigaToNextpage();
    }
    // brahim:test case 04- user can see and select item  on menu  under stroller link by hovering the mouse
    @Test
    public void testHoverMouseAndClickt() throws InterruptedException {
        init();
        // step 01- click on new releases link
        homePage.getNewReleasePage();
        //step 02- click on baby link
        homePage.getNewReleasesInBabyPage();
        sleepFor(5);
        // step 03- hover mouse and click on frames web element
     homePage.HoverMouseAndClickt(driver,hoverMouse);
     sleepFor(3);
      homePage.ClickUnderMenuItemX();
    }
    // test case-05 user can check boxes to select options on frames page
    @Test
   public void testCheckButton() throws InterruptedException {
    init();
    // step 01- click on new releases link
    homePage.getNewReleasePage();
    //step 02- click on baby link
    homePage.getNewReleasesInBabyPage();
    Thread.sleep( 3000);
    // step 03- hover mouse and click on frames web element
    homePage.HoverMouseAndClickt(driver,hoverMouse);
    //Thread.sleep( 3000);
        homePage.ClickUnderMenuItemX();
      //step 04- check amazon prime box option
        sleepFor(2);
    homePage.checkBox();
}
//test case 06- check drop down search list Amazon
    @Test
    public void TestCheckDropDownSearchList() {
        init();
        homePage.CheckDropDownSearchList();
    }
// test case 07 to check the page broken links
    @Test
    public void TestCheckBrokenLink() throws IOException {
        init();
        homePage.CheckBrokenLink();
    }
    // test to get all the page links
    @Test
    public void getPageLinks(){
        init();
        PageLinksList(driver);
    }
    // test user can search for items in home page search box
public String path="C:/Users/ssbra/Desktop/Excel_files_Project/AmazonList.xlsx";
    @DataProvider
    public Object[][] getTestAmazonList() throws IOException, InvalidFormatException, InvalidFormatException {
        Object data [][]= DataReader.fileReader3("MySearchList",path);
        return data;
    }
    @Test(dataProvider = "getTestAmazonList")
    public void testSearchBoxField(String inputData){
        init();
        homePage.SearchBoxField(inputData);
    }





}