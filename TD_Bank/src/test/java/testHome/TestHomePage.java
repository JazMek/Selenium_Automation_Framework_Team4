package testHome;

import common.WebAPI;
import org.testng.annotations.Test;

import java.io.IOException;

import static Home.TD_BankPageWebElement.*;

public class TestHomePage extends WebAPI {
     @Test
    public void Testtdbankhomepagelink() {
         init();
         homePage.tdbankhomepagelink();
     }

    @Test
         public void Testtdbankhomepagetitle() {
        init();
        homePage.tdbankhomepagetitle();
    }
    @Test
        public void Testtdbankhomepagecompare_Text () {
            init();
            homePage.tdbankhomepagecompare_Text();


        }
    @Test
    public void Check_brokenLink() throws IOException {
        init();
        brokenLink();
    }
    @Test
    public void getPageLinksList() throws IOException, InterruptedException {
        init();
        PageLinksList(driver);
    }
    }
