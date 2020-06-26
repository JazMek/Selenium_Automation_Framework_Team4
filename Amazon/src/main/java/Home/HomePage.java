package Home;


import common.WebAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utility.DataReader;
import utility.DataReader1;
import utility.DataReader2;
import utility.DataReaderSami;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static Home.AmazonPageWebElement.*;
import static utility.DataReader.readExcelFile;


public class HomePage extends WebAPI {


    DataReaderSami dataReaderSami = PageFactory.initElements(driver, DataReaderSami.class);


    public void check_LindingPage() {
        String expected_SprintUrl="https://www.amazon.com/";
        String expected_SprintTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        getUrl(expected_SprintUrl);
        getTitle(expected_SprintTitle);
    }
    public void LoginToAmazon() {
        HamburgerMenu.click();
        ImplicitWaitTime(3);
        hmenuCustomerName.click();
        ImplicitWaitTime(3);
        ApEmail.sendKeys("team4WDNY2020@gmail.com", Keys.ENTER);
        ImplicitWaitTime(3);
        ApPassword.sendKeys("Team42020", Keys.ENTER);
        ImplicitWaitTime(10);
    }

    public void searchDropdownDescription() {
        ImplicitWaitTime(3);
        selectOptionByVisibleText(SearchDropdownDescriptionCostom, "Computers");
        ImplicitWaitTime(3);
        SearchtextboxField.sendKeys("i phone11", Keys.ENTER);
        ImplicitWaitTime(3);
    }

    public void Create_a_List() {
        MouseHoverAndClickt(driver, CreateAccountList);
        ImplicitWaitTime(3);
        create_A_List.click();
        ImplicitWaitTime(5);
    }

    public void SearchMensClothing() {
        ImplicitWaitTime(2);
        SearchtextboxFieldCss.sendKeys("mens clothing", Keys.ENTER);
        ImplicitWaitTime(2);
        AmazonPrimecheckbox.click();
        ImplicitWaitTime(2);
        EligibleforFreeShipping.click();
        ImplicitWaitTime(5);
//        adidasLink.click();
        ImplicitWaitTime(10);
    }

    public void Apps_and_Games() {
        ImplicitWaitTime(5);
        hamburger_menu.click();
    }

    public void ChecksearchBox(String ProdactName) {
        SearchTextBoxField.click();
        SearchTextBoxField.sendKeys(ProdactName);
    }

    public void Check_SearchDropdownBox() {
        Select select = new Select(searchDropdownBox);
        System.out.println(searchDropdownBox.getSize());
        System.out.println(select.getOptions().size());
        for (int i = 0; i < select.getOptions().size(); i++) {
            select.selectByIndex(i);
            System.out.println(select.getOptions().get(i).getText());
        }
    }

    //    static DataReaderSami dataReaderSami= new DataReaderSami();
    String ExpectedData[] = {"All Departments", "Audible Books & Originals", "Alexa Skills", "Amazon Devices", "Amazon Fresh", "Amazon Warehouse", "Appliances", "Apps & Games", "Arts, Crafts & Sewings"};



    public static String pathExcel="../Generic/src/DataDocuments/KarimAmazon.xlsx";


    public void CheckDropDownSearchList() {
        List <String> list = readExcelFile( pathExcel);

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
    public void Check_brokenLink() throws IOException {
        brokenLink();
    }
    public void CheckPagelistLinks() {
        PageLinksList(driver);
    }
}