package Home;

import common.WebAPI;

import java.io.IOException;

import static Home.EmpirePageWebElement.actualtest;

public class HomePage extends WebAPI {


    public void Empirehomepagelink() {
        String expectedUrl="https://www.empirebluecross-medicareadvantage.com/";
        getUrl(expectedUrl);

    }

    public void EmpirehomepageTitle() {
        String expectedTitle="Home | Empire Medicare Advantage Plans";
        getTitle(expectedTitle);

    }
    public void empirecompare() {
        String expectedcompare_Text = "The Anthem family of companies provides health coverage to nearly 40 million people nationwide.1";
        compare_Text(expectedcompare_Text,actualtest);
    }
    public void Check_brokenLink() throws IOException {
        brokenLink();
    }
}
