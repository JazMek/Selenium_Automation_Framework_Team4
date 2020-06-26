package Home;

import common.WebAPI;
import org.openqa.selenium.Keys;

import java.io.IOException;

import static Home.SprintPageWebElement.*;

public class HomePage extends WebAPI {
    public void homepagelink() {
        String expectedUrl="https://www.sprint.com/";
        getUrl(expectedUrl);

    }

    public void homepageTitle() {
        String expectedTitle="Cell Phones, Mobile Phones & Wireless Calling Plans from Sprint";
        getTitle(expectedTitle);



    }
    public void Sprintcompare() {
        String expectedcompare_Text = "We stand in solidarity & support.";
        compare_Text(expectedcompare_Text,actualcompare);
    }
    public void Check_brokenLink() throws IOException {
        brokenLink();
    }
    public void CheckZipCood(String ZipCood) {
        CheckZIPCood.sendKeys(ZipCood, Keys.ENTER);
    }
}
