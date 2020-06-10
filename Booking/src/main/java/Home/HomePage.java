package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static Home.BaseClass.homePage;

import static Home.BookingPageWebElement.*;

public class HomePage extends WebAPI {


    @FindBy(how= How.XPATH,using=gettexteXP)
    public static WebElement gettexte;

    public static String ExpectTitle="Booking.com | Official site | The best hotels & accommodations";
    public static String expectTexte ="Find deals for any season";
    public void checkTitle() {

        String ActualTitle= driver.getTitle();
        Assert.assertEquals(ActualTitle,ExpectTitle,"The expected Title does mot mutch");

    }

    public void checkTexte() {


        Assert.assertEquals(gettexte.getText(),expectTexte,"The texte is not fond");

    }

//    public void checkBox() {
//
//
//    }
}
