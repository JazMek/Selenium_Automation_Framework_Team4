package Home;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static Home.SprintPageWebElement.*;

public class HomePage extends WebAPI{

    public static String expected_SprintUrl="https://www.sprint.com/";
    public static String expected_SprintTitle="Cell Phones, Mobile Phones & Wireless Calling Plans from Sprint";
    public static String expected_EmpirePhon="1-866-275-1411";

    public void Testcheck_LindingPage() {
        getUrl(expected_SprintUrl);
        getTitle(expected_SprintTitle);
    }

    public void Check_Sprint_PhonNum() {
        compare_Text(expected_EmpirePhon,SprintPhonNum);
    }

    public void scheck_carousel_arrow_next_arrow() throws InterruptedException {
        Page_Scroll_DownToElement(next_arrow);
        for (int i=0;i<5;i++){next_arrow.click();waitForSeconds(2);}
    }

    public void Check_Sprint_brokenLink() throws IOException {
        brokenLink();
    }

    public void CheckPagelistLinks() {
        PageLinksList(driver);
    }
    public void CheckZipCood(String ZipCood) {
        CheckZIPCood.sendKeys(ZipCood, Keys.ENTER);
    }


}
