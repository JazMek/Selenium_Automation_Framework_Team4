package Home;

import common.WebAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utility.DataReader;
import utility.DataReaderTeam4;

import java.io.IOException;
import java.util.List;

import static Home.AmazonPageWebElement.*;

public class HomePage extends WebAPI {
    public static AmazonPageWebElement amazonPageWebElement;
    public static HomePage homePage;
    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        amazonPageWebElement = PageFactory.initElements(driver, AmazonPageWebElement.class);
    setUpWindow();}

    public static void loginToAmazonAccount(){
        signinButton.click();
        userNameField.sendKeys("team4WDNY2020@gmail.com");
        continueButton.click();
        passWordField.sendKeys("Team42020");
        loginButton.click(); }
    public void setFindGift() {
        FindAGift.click();
//        String expectedTitle="Gifts for Everyone | Amazon.com Gift Finder";
//        getTitle(expectedTitle);
    }
    public void amazonFindAGiftText() {
        FindAGift.click();
        String expectedtext="E-GIFTS";
        String text=EGIFTS.getText();
        Assert.assertEquals(text,expectedtext,"does not match"); }
    public void amazonEGIFTSButton() {
        FindAGift.click();
        EGIFTS.click();
        EGiftWrapIcon.click();
        String expectedtittle="Gifts with digital delivery options | Amazon.com Gift Finder";
        getTitle(expectedtittle);
    }
    public void PriceAllPricesScrollDown() {
        FindAGift.click();
        EGIFTS.click();
        AllPricesScrollDown.click();
        String expectedTitle="Gifts with digital delivery options | Amazon.com Gift Finder";
        getTitle(expectedTitle); }
    public void setScrollPageDown() throws InterruptedException {
        FindAGift.click();

        scrollPageDown(driver);
        sleepFor(5);
    }


    public void setamazonWomenPage() throws InterruptedException {
        FindAGift.click();
        amazonWomenPage.click();
        AgeGroup.click();
        Gender.click();
        AllPrices.click();
        GiftWrapCheckBox.click();
        scrollPageDown(driver);
        sleepFor(5);
    }
    public void setamazonFindAGiftPreschooler() throws InterruptedException {
        FindAGift.click();
        Preschooler.click();
        PlayDoh.click();
    }
    public void setamazonFindAGiftPreschoolerPlayDohAddToCard() throws InterruptedException {
        FindAGift.click();
        Preschooler.click();
        PlayDoh.click();
        PlayDohAddToCard.click();
    }
    public void CheckDropDownSearchList(String prodactName) throws IOException, InvalidFormatException {
    Object[] data1 = DataReaderTeam4.fileReader3("Sheet1","/Users/salahmouloudi/Desktop/Salah.xlsx");
    Select select =new Select(searchDropdown);
    List<WebElement> ActuelResult=select.getOptions();
    for(int i =1; i<56; i++){ select.hashCode(); Assert.assertEquals(ActuelResult.get(i).getText(),data1[i]);} }



}


