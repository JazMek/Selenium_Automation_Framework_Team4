package Home;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static Home.TD_BankPageWebElement.clickAsqNowButton;
import static Home.TD_BankPageWebElement.*;

public class HomePage  extends WebAPI {

    public static HomePage homePage;
    public static TD_BankPageWebElement  tD_BankPageWebElement;

    public static void init(){
        homePage= PageFactory.initElements(driver, HomePage.class);
        tD_BankPageWebElement= PageFactory.initElements(driver, TD_BankPageWebElement.class);
    }

    public void typeInSearchBox() throws InterruptedException {
        setUpWindow();
        scrollDown.sendKeys("types of loans do you offer?");
        sleepFor(4);
        clickAsqNowButton.click();



    }

    // method for page broken links
    public void CheckBrokenLink() throws IOException {
        setUpWindow();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        brokenLink();
    }
    // method for switch window
    public void switchWindow() throws InterruptedException {
        scrollPageDown(driver);
        setUpWindow();
        sleepFor(2);
        PopUpWindowClose2( driver, closePopupWindowXPATH);
        switchWindows.click();
        switchWindowTOChildWindow ( driver);
        useChildWindow.click();
        sleepFor(4);
        switchChildWindowTOParentWindow ( driver);
        sleepFor(5);
        clickFacbookLink.click();
        sleepFor(5);
    }
// method to get the  travelers Foreign Exchange Calculator by country
    public void Check_International_Travel_Tips() throws InterruptedException {

        sleepFor(2);
        DeletPoP.click();
        HoverMouseAndClickt(driver,ServicesTB);
        sleepFor(1);
        Foreign_Exchange.click();
        OrderOnline.click();
        switchWindowTOChildWindow (driver);
        sleepFor(1);
        Order_CurrencyButton.click();
        sleepFor(4);
        selectdestinationCurrency.click();
        Select select = new Select(selectdestinationCurrency);
        System.out.println(selectdestinationCurrency.getSize());
        System.out.println(select.getOptions().size());
        for (int i = 0; i < select.getOptions().size(); i++) {
            select.selectByIndex(i);
            System.out.println(select.getOptions().get(i).getText());
        }
    }



}
