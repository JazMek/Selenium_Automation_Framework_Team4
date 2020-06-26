package Home;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import java.io.IOException;

import static Home.GeicoPageWebElement.*;

public class HomePage extends WebAPI {



    public void Testcheck_LindingPage() {
        String expected_SprintUrl="https://www.geico.com/";
        String expected_SprintTitle="An Insurance Company For Your Car And More | GEICO";
        getUrl(expected_SprintUrl);
        getTitle(expected_SprintTitle);
    }
    public void Check_brokenLink() throws IOException {
        brokenLink();
    }
    public void checkTitle() {
        String ExpectTitle="An Insurance Company For Your Car And More | GEICO";
        String ActualTitle= driver.getTitle();
        Assert.assertEquals(ActualTitle,ExpectTitle,"The expected Title does mot mutch");
    }
    public void CheckPagelistLinks() {
        PageLinksList(driver);
    }
    public void Chek_Link_isDisplayed() {
        Logo.isDisplayed();
        System.out.println("The element is displayed : " + Logo.isDisplayed());
    }
    public void ChekDisplayed() {
        clickEnterKeyboard(Enter_your_Zip_code,"11228");
    }

    public void CheckZipCood(String ZipCood) {
        Enter_your_Zip_code.sendKeys(ZipCood, Keys.ENTER);
    }
}
