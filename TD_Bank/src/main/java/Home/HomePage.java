package Home;

import common.WebAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

import static Home.TD_BankPageWebElement.*;


public class HomePage extends WebAPI {


    public static String TD_BankexpectedUrl="https://www.td.com/us/en/personal-banking/";
    public static String TD_BankexpectedTitle="TD Personal Banking, Loans, Cards & More | TD Bank";
    public void CheckTD_BankLinkToHomePage() {
        getUrl(TD_BankexpectedUrl);
    }
    public void CheckTD_BankHomePageTitle() {
        getTitle(TD_BankexpectedTitle);
    }

    public void Testcheck_LindingPage() {
        String expected_SprintUrl="https://www.td.com/us/en/personal-banking/";
        String expected_SprintTitle="TD Personal Banking, Loans, Cards & More | TD Bank";
        getUrl(expected_SprintUrl);
        getTitle(expected_SprintTitle);
    }

    public void Check_brokenLink() throws IOException {
        brokenLink();
    }

    public void Check_International_Travel_Tips() throws InterruptedException {

        sleepFor(2);
        DeletPoP.click();
        MouseHoverAndClickt(driver,ServicesTB);
        sleepFor(1);
        Foreign_Exchange.click();
        OrderOnline.click();
        switchWindowTOChildWindow (driver);
//        clearPOP2.click();
        sleepFor(1);
        Order_CurrencyButton.click();
        selectdestinationCurrency.click();
        Select select = new Select(selectdestinationCurrency);
        System.out.println(selectdestinationCurrency.getSize());
        System.out.println(select.getOptions().size());
        for (int i = 0; i < select.getOptions().size(); i++) {
            select.selectByIndex(i);
            System.out.println(select.getOptions().get(i).getText());
        }
    }
    public void CheckPagelistLinks() {
        PageLinksList(driver);
    }

    public void SwitchWindows() throws InterruptedException {
        Page_Scroll_Down(driver);
        sleepFor(2);
//        PopUpWindowClose2( driver,closePopupWindowXPATH);
        switchWindows.click();
        switchWindowTOChildWindow ( driver);
        useChildWindow.click();
        sleepFor(4);
        switchChildWindowTOParentWindow ( driver);
        sleepFor(5);
        clickFacbookLink.click();
        sleepFor(5);
    }

    public void Chek_Link_isDisplayed() {
        openNow.isDisplayed();
        System.out.println("The element is displayed : " + openNow.isDisplayed());
    }
}
