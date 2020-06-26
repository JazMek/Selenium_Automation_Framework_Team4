package Home;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;

import static Home.TD_BankPageWebElement.*;

public class HomePage extends WebAPI {

    public static TD_BankPageWebElement td_bankPageWebElemen;
    public static HomePage homePage;
    public static void init() throws InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        td_bankPageWebElemen = PageFactory.initElements(driver, TD_BankPageWebElement.class);
        setUpWindow();
    }
    public void setInvestingAndWealth(){
        InvestingAndWealth.click();
        scrollPageDown(driver);
    }
    public void setIndividualsAndFamilies() throws InterruptedException {
        InvestingAndWealth.click();
        HoverMouseAndClickt(driver,IndividualsAndFamilies);
        IndividualsAndFamilies.click();
        IndividualsAndFamiliesSearchBox.sendKeys("one million dollar");
        clearInputBox(IndividualsAndFamiliesSearchBox);
        IndividualsAndFamiliesSearchBox.sendKeys("how to open a saving account");
        SearchButton.click();
        sleepFor(5);
    }
    public void setBusinessOwners(){
        InvestingAndWealth.click();
        HoverMouseAndClickt(driver,BusinessOwners);
        BusinessOwners.click();
        scrollIntoView(TopButton,driver);
        TopButton.click();
    }
    public void setRetirementPlanning(){
        InvestingAndWealth.click();
        HoverMouseAndClickt(driver,RetirementPlanning);
        RetirementPlanning.click();
    }
    public void setRetirementPlanningVideoDisplay() throws InterruptedException {
        InvestingAndWealth.click();
        HoverMouseAndClickt(driver,RetirementPlanning);
        RetirementPlanning.click();
        RetirementPlanningVideo.click();
        sleepFor(5);
        RetirementPlanningVideoClosebutton.click();
    }
    public void setTdAmeritrade(){
        InvestingAndWealth.click();
        HoverMouseAndClickt(driver,TdAmeritrade);
        TdAmeritrade.click();
        scrollIntoView(SpecialOfferDetailsDisplayButton1,driver);
        SpecialOfferDetailsDisplayButton.click();
    }
}
