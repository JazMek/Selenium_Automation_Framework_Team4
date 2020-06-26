package Home;

import common.WebAPI;

import java.io.IOException;

import static Home.EmpirePageWebElement.*;

public class HomePage extends WebAPI {
    public static String expected_EmpireUrl="https://www.empirebluecross-medicareadvantage.com/";
    public static String expected_EmpireTitle="Home | Empire Medicare Advantage Plans";
    public static String expected_EmpirePhon="1-855-780-8334";
    public void Testcheck_LindingPage() {
        getUrl(expected_EmpireUrl);
        getTitle(expected_EmpireTitle);
        compare_Text(expected_EmpirePhon,EmpirePhonNumd);
    }
    public void Check_brokenLink() throws IOException {
        brokenLink();
    }
    public void CheckPagelistLinks() {
        PageLinksList(driver);
    }
}
