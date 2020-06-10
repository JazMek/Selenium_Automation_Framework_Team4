package Home;
import common.WebAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
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
}
