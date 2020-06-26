package Home;

import common.WebAPI;
import org.openqa.selenium.Keys;

import java.io.IOException;

import static Home.GeicoPageWebElement.*;


public class HomePage extends WebAPI {
    public void geicohomepagelink () {
        String expectedUrl="https://www.geico.com/";
        getUrl(expectedUrl);




    }

    public void geicohomepageTitle() {
        String expectedTitle="An Insurance Company For Your Car And More | GEICO";
        getTitle(expectedTitle);
    }
    public void Geicocompare() {
        String expectedcompare_Text = "The Insurance Savings You Expect";
        compare_Text(expectedcompare_Text,actualtext);
    }
    public void Check_brokenLink() throws IOException {
        brokenLink();
    }
    public void CheckZipCood(String ZipCood) {
        Enter_your_Zip_code.sendKeys(ZipCood, Keys.ENTER);
    }
}
