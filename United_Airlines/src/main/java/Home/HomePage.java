package Home;


import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import utility.DataReader;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static Home.United_AirlinesPageWebElement .*;


public class HomePage extends WebAPI {

    public  static HomePage homePage;
    public  static United_AirlinesPageWebElement united_AirlinesPageWebElement;
    public  static DataReader  dataReader ;
    public static void init(){
        homePage= PageFactory.initElements(driver, HomePage.class);
        united_AirlinesPageWebElement= PageFactory.initElements(driver, United_AirlinesPageWebElement.class);
        dataReader = PageFactory.initElements(driver, DataReader.class);
    }
    //String from,String to , int numAdul
    public void FlightStatus(String from, String to ,String NumAdult) throws InterruptedException {
        setUpWindow();
       driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
       // sleepFor(2);
        checkBoxOneWay.click();
        clickLink.click();
        clearTextBox.click();
//        sleepFor(2);
        enterDestinationFrom.click();
        enterDestinationFrom.sendKeys(from);
//        sleepFor(2);
        enterDestinationTo.sendKeys(to);
//        sleepFor(2);
        clickOnDateBox.click();
  //      sleepFor(2);
        selectDepartureDate.click();
//        sleepFor(2);
        AdultClickBox.click();
//        sleepFor(2);
      // Integer. parseInt(NumAdults);
        //  int i = Integer.parseInt(s.trim())

        System.out.println("the number of adult is "+NumAdult);
       // int NumAdult1= Integer.parseInt(NumAdult.trim());
       // System.out.println("the converted String to integer is "+NumAdult1);
        for( int  i= 1; i<= 5; i++ ){ NumOfAdults.click();
            //sleepFor(2);
            }
        for( int i= 1; i<= 2; i++ ){ NumOfSeniors.click(); }
        CloseTravelersPanel.click();
        ClickFindFlightButton.click();
        sleepFor(3);
    }
    // method for page broken links
    public void CheckBrokenLink() throws IOException {
        setUpWindow();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        brokenLink();
    }
    public void CheckUnitedSearchBox(String inputData) {
        UnitedSearch.click();
        Search.click();
        Search.sendKeys(inputData);
    }


}
