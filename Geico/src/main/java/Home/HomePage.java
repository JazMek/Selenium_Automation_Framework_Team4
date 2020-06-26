package Home;
import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import static Home.GeicoPageWebElement.*;

public class HomePage extends WebAPI {
    public static GeicoPageWebElement geicoPageWebElement;
    public static HomePage homePage;

    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        geicoPageWebElement = PageFactory.initElements(driver, GeicoPageWebElement.class);
        setUpWindow(); }



//    public void setBusinessInsurance() throws InterruptedException {
//        sleepFor(5);
//        clickByXpath(ansaranceXP );
//        HoverMouseAndClickt(driver,businessInsarance);
//        PageScrollToElement(professionnel);
//
//
////        HoverMouseAndClickt(driver,BusinessInsurance);
//
//    }
    public void setBusinessOwner() throws InterruptedException {

        sleepFor(3);
        Insurance.click();

    }
    public void setGeneralLiability(){
        Insurance.click();
        BusinessInsurance.click();
        GeneralLiability.click();
    }
    public void setProfessionalLiability(){

        Insurance.click();
        ProfessionalLiability.click();
    }
    public void setMedicalMalpractice(){

        Insurance.click();
        MedicalMalpractice.click();
    }
    public void setWellnessAndFitness(){

        Insurance.click();
        WellnessAndFitness.click();
    }
    public void setCommercialAuto(){

        Insurance.click();
        CommercialAuto.click();
    }
    public void setRideShare(){

        Insurance.click();
        RideShare.click();
    }


    public void InsaranceButton() throws InterruptedException {
        clickByXpath(ansaranceXP );
        sleepFor(5);
        HoverMouseAndClickt(driver,businessInsarance);
        PageScrollToElement(professionnel);
    }
    public void CheckZipCood(String ZipCood) {
        CheckZIPCood.click();
        CheckZIPCood.sendKeys(ZipCood, Keys.ENTER); }

}
