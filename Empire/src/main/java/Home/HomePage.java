package Home;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static Home.EmpirePageWebElement.*;

public class HomePage extends WebAPI {
    public static HomePage homePage;
    public static EmpirePageWebElement empirePageWebElement;

    public static void init() {
         homePage = PageFactory.initElements(driver, HomePage.class);
        empirePageWebElement = PageFactory.initElements(driver, EmpirePageWebElement.class);
        setUpWindow(); }

     public void setIndividualAndFamily(){
            IndividualAndFamily.click();
    }
    public void setSelectLanguage() throws InterruptedException {
        WebElement SelectLanguage = driver.findElement(By.xpath("//*[@id=\"mbr-page-wrapper\"]/div[2]/div[2]/div[2]/main/div[16]/div/div/div/div/div/div/div[2]/p[2]/a"));
        scrollIntoView(SelectLanguage,driver);
        selectLanguage.click();
        selectChineeseLanguage.click();
        sleepFor(3);
    }
    public void setHealthInsurance() throws InterruptedException {
        IndividualAndFamily.click();
        HealthInsurance.click();
        scrollPageDown(driver);
        sleepFor(3);
    }
    public void setLogin() throws InterruptedException {
        IndividualAndFamily.click();
        Login.click();
        sleepFor(10);
        UserName.sendKeys("msalah89");
        PassWord.sendKeys("JSK Matoub lounes Milles feuilles frittes omlettes");
    }
    public void setVisionInsurance() throws InterruptedException {
        IndividualAndFamily.click();
        VisionInsurance.click();
        driver.navigate().refresh();
        scrollPageDown(driver);
        sleepFor(3);
        driver.close();
    }





















}

