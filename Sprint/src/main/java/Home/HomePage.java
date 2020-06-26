package Home;
//****** LAMARAs  *************
import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static Home.SprintPageWebElement.enterDataSearchBox;
import static Home.SprintPageWebElement.searchBox;
public class HomePage extends WebAPI {
    public static HomePage homePage;
    public static SprintPageWebElement sprintPageWebElement;
    public static void init(){
        homePage= PageFactory.initElements(driver, HomePage.class);
        sprintPageWebElement= PageFactory.initElements(driver, SprintPageWebElement.class);
    }
    public void enterDataToSearcheBox(String product) throws InterruptedException {
        searchBox.click();
        sleepFor(1);
        enterDataSearchBox.sendKeys(product);
        sleepFor(1);
        enterDataSearchBox.sendKeys(Keys.ENTER);
    }
    //**** Check Broken Links  ******************
    public void Check_brokenLink() throws IOException, InterruptedException {
        brokenLink();
    }

}
