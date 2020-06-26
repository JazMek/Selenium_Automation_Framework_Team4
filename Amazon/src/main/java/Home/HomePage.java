package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utility.DataReader;

import java.io.IOException;
import java.util.List;

import static Home.AmazonPageWebElement.*;


public class HomePage extends WebAPI {

    public void wholefoodsPage() {
        amazonWholefoodsbutton.click();


    }

    public static String expecttext = "";

    public void verifywholefoodslogo() {
        amazonWholefoodstext.isDisplayed();

    }

   public void searchField(){
       searchBox.sendKeys("t shirt");
       searchButton.click();
   }

    public void verifydealspage() {
        amazonDealstext.isDisplayed();
    }

    public void BestSellersPage() {
        ClickBestSellers.click();

    }

    public static String ExpectedUrl = "https://www.amazon.com/gp/bestsellers/?ref_=nav_cs_bestsellers";

    public void VerifyBestSellersUrl() {

        Assert.assertEquals(driver.getCurrentUrl(), ExpectedUrl, "the url used didn't navigate to the Best Sellers Page");

    }

    public static String pathExcel="/Users/hakimbouaraba/Desktop/hakimAmazon.xlsx";

    public void CheckDropDownSearchList() {
        List<String> list = DataReader.readExcelFile( pathExcel);

        Select select = new Select(searchDropdownBox);

        List<WebElement> ActualResult = select.getOptions();

        for (int i = 0; i < ActualResult.size(); i++) {
            select.selectByIndex(i);
// Assert.assertEquals(ActualResult.get(i).getText(),list.get(i),"the test failed ");

            if (list.get(i).equalsIgnoreCase(ActualResult.get(i).getText()) ){

                System.out.println("The test is passed");
            } else {
                System.out.println("The test is failed");
            }
            System.out.println("*************************************************************************");
            System.out.println("this is the actual result "+ActualResult.get(i).getText());

            System.out.println("this is the expected result "+list.get(i));
        }

// Assert.assertEquals(ActuelResult.get(i).getText(),data[i]); }


    }

    public void amazoncompare() {
        String expectedcompare_Text = "Sign in for the best experience";
        compare_Text(expectedcompare_Text,actualtest);
    }

    public void Check_brokenLink() throws IOException {
        brokenLink();
    }


    public void ChecksearchBox(String ProdactName) {
        SearchTextBoxField.click();
        SearchTextBoxField.sendKeys(ProdactName);
    }




}












