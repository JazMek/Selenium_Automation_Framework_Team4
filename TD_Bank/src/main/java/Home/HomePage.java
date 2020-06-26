package Home;

import common.WebAPI;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

import static Home.TD_BankPageWebElement.*;


public class HomePage extends WebAPI {
    //**** Check Broken Links  ******************
    public void Check_brokenLink() throws IOException, InterruptedException {
        brokenLink();
    }
    //**** LAMARAs Test case using Hover Mouse method and switching Windows *********
    public void ServicesForeignExchange() throws InterruptedException {
        sleepFor(2);
        DeletPoP.click();
        HoverMouseAndClick(driver,ServicesTB);
        sleepFor(1);
        Foreign_Exchange.click();
        OrderOnline.click();
        switchWindowTOChildWindow (driver);
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





}
