package Home;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static Home.SprintPageWebElement.*;

public class HomePage extends WebAPI {
    public static SprintPageWebElement sprintPageWebElement;
    public static HomePage homePage;
    public static void init() throws InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        sprintPageWebElement = PageFactory.initElements(driver, SprintPageWebElement.class);
        setUpWindow();
        sleepFor(3);
    }
        public void setPlans(){
        HoverMouseAndClickt(driver,Plans);
        }
        public void setUnlimitedPlans(){
        HoverMouseAndClickt(driver,Plans);
           UnlimitedPlans.click();
        }
        public void setUnlimitedPlansPage(){
        HoverMouseAndClickt(driver,Plans);
        UnlimitedPlans.click();
        HoverMouseAndClickt(driver,OurUnlimitedPlan);
        scrollPageDown(driver);
        }
        public void setUsVsThemPlan(){
            HoverMouseAndClickt(driver,Plans);
            UnlimitedPlans.click();
            HoverMouseAndClickt(driver,UsVsThemPlan);
            UsVsThemPlan.click();
            for(int i=0;i<4;i++){
            UsVsNextIcon.click();}
            for(int i=4;i>0;i--){
            UsVsPreviousIcon.click();}
            scrollPageDown(driver);
        }
    public void setOtherPlansPlan() throws InterruptedException {
        HoverMouseAndClickt(driver,Plans);
        UnlimitedPlans.click();
        HoverMouseAndClickt(driver,OtherPlansPlan);
        OtherPlansPlan.click();
        scrollIntoView(OtherPlansLearnMore,driver);
        OtherPlansLearnMore.click();
        sleepFor(3);
    }
    public void setOtherPlans(){
        HoverMouseAndClickt(driver,Plans);
        OtherPlans.click();
        String title = driver.getTitle();
        String  expectedTitle="Other Plans From Sprint";
        Assert.assertEquals(title, expectedTitle, "title doesn't match");
    }
    public void CheckZipCood(String ZipCood) {
        CheckZIPCood.sendKeys(ZipCood, Keys.ENTER);
    }



















}
