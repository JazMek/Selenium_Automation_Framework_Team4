package Home;

import common.WebAPI;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static Home.BaseClass.*;

public class HomePage extends WebAPI {


    public void clickOnFindaGift() {
        String expectedtittle="amazon gift ";
        amazonFindAGiftbutton.click();
        String tittle=driver.getTitle();
        Assert.assertEquals(tittle,expectedtittle,"doesn't match");

    }

    public void amazonFindAGiftText() {
        amazonFindAGiftbutton.click();
        String expectedtext="E-GIFTS";
        String text=amazonEGIFTSButton.getText();
        Assert.assertEquals(text,expectedtext,"does not match");

    }

    public void amazonEGIFTSButton() {

        String expectedtittle="Gifts for Everyone";
        amazonFindAGiftbutton.click();
        amazonGiftWrapIcon.click();
        String tittle=driver.getTitle();
        Assert.assertEquals(tittle,expectedtittle,"doesn't match");


    }

    public void PriceAllPricesScrollDown() {
        String expectedtittle="amazon gift ";
        amazonFindAGiftbutton.click();
        PriceAllPricesScrollDown.click();
        String tittle=driver.getTitle();
        Assert.assertEquals(tittle,expectedtittle,"doesn't match");
    }


    public void amazonFindGiftHarryPotterandtheSorcerersStoneXP() {
        amazonFindAGiftbutton.click();
        amazonFindGiftHarryPotterandtheSorcerersStone.click();
        amazonFindGiftHarryPotterReadForFree.click();


    }
}
