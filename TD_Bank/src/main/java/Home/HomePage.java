package Home;

import common.WebAPI;

import java.io.IOException;

public class HomePage extends WebAPI {
    public void tdbankhomepagelink() {
        String expectedUrl = "https://www.td.com/us/en/personal-banking/";
        getUrl(expectedUrl);
    }

    public void tdbankhomepagetitle() {
        String expectedTitle = "TD Personal Banking, Loans, Cards & More | TD Bank";
        getTitle(expectedTitle);

    }

    public void tdbankhomepagecompare_Text() {
        String expectedcompare_Text = "TD Personal Banking, Loans, Cards & More | TD Bank";
        getTitle(expectedcompare_Text);

    }
    public void Check_brokenLink() throws IOException {
        brokenLink();
    }
}