package Home;
import common.WebAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utility.DataReader;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static Home.AmazonPageWebElement.*;

public class HomePage extends WebAPI {
    // method to click on new releases page link
    public void getNewReleasePage() {
        // step 1- click on the new releases linck
        clickNewReleasePage.click();
    }
    // method to verify the New releases page
    public void checkReleasePageText() {
         String actuelResult = checkReleasesPageTextX.getText();
     Assert.assertEquals(actuelResult,expectedResult,"the text doesn't match");
    }
    //    // method to click on baby link
    public void getNewReleasesInBabyPage() {
        clickBabylinck.click();
    }
    // method to verify the text
    public void checkNewReleasesInBabyPageText() {
    String actuelResult = checkNewReleasesInBabyPage.getText();

       Assert.assertEquals(actuelResult,Expected,"the test doesn't match");
    }
    //method to navigate to next list products
    public void NavigateToNextList() {
        clickNextPage.click();
    }
    // method to verify the next page text
    public void checknavigaToNextpage() {
        String actuelNextpageResult= checkPagelink.getText();
        Assert.assertEquals(actuelNextpageResult,expectedNextpageResult,"the link text doesn't match");
    }
//// method to hover mouse and click
    public static void HoverMouseAndClickt(WebDriver driver, WebElement hoverMouse) {
        Actions action= new Actions(driver);
        action.moveToElement(hoverMouse).perform();
    }
    //method to check box
    public void checkBox() {
        CheckBox1.click();
    }
    public void ClickUnderMenuItemX() {
        clickUnderMenuItemX.click();
    }


public static String pathExcel="C:\\Users\\ssbra\\Desktop\\KarimAmazon.xlsx";

    public void CheckDropDownSearchList() {
     List <String> list =DataReader.readExcelFile( pathExcel);

        Select select = new Select(searchDropdownBox);

        List<WebElement> ActualResult = select.getOptions();

        for (int i = 0; i < ActualResult.size(); i++) {
            select.selectByIndex(i);
          //  Assert.assertEquals(ActualResult.get(i).getText(),list.get(i),"the test failed ");

            if (list.get(i).equalsIgnoreCase(ActualResult.get(i).getText())  ){

                System.out.println("The test is passed");
            } else {
                System.out.println("The test is failed");
            }
            System.out.println("*************************************************************************");
            System.out.println("this is the actual result    "+ActualResult.get(i).getText());

            System.out.println("this is the expected result  "+list.get(i));
        }

// Assert.assertEquals(ActuelResult.get(i).getText(),data[i]); }


    }
    // method for page broken links
    public void CheckBrokenLink() throws IOException {
        setUpWindow();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        brokenLink();
    }


    public void SearchBoxField(String inputData) {
        SearchBox.click();
        SearchBox.sendKeys(inputData);


    }

}
