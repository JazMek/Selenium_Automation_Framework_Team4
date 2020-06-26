package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

import static Home.BookingPageWebElement.*;

public class HomePage extends WebAPI {
    public void check_LindingPage() {
        String expected_SprintUrl="https://www.booking.com/";
        String expected_SprintTitle="Booking.com | Official site | The best hotels & accommodations";
        getUrl(expected_SprintUrl);
        getTitle(expected_SprintTitle);
    }

    public void checkTitle() {
        String ActualTitle= driver.getTitle();
        Assert.assertEquals(ActualTitle,ExpectTitle,"The expected Title does mot mutch");
    }
    public void checkTexte() {
        Assert.assertEquals(gettexte.getText(),expectTexte,"The texte is not fond");
    }
    public void check_Punta_Cana() throws InterruptedException {
        expendWindow();
        Page_Scroll_DownToElement(Punta_Cana);
        waitForSeconds(5);
        Punta_Cana.click();
        waitForSeconds(5);
    }
    public void Check_brokenLink() throws IOException {
        brokenLink();
    }
    public void CheckPagelistLinks() {
        PageLinksList(driver);
    }
}
