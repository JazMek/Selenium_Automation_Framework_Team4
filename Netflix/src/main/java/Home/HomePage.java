package Home;

import common.WebAPI;

import java.io.IOException;

import static Home.NetflixPageWebElement.*;

public class HomePage extends WebAPI {

    public static void loginToAmazonAccount(){
        signinButton.click();
        userNameField.sendKeys("team4WDNY2020@gmail.com");
        passWordField.sendKeys("Team42020");
        signinButton2.click();
    }

    public void Netflixhomepagelimk() {
       String expectedUrl="https://www.netflix.com/";
        getUrl(expectedUrl);
    }


    public void NetflixhomepageTitle() {
        String expectedTitle="Netflix - Watch TV Shows Online, Watch Movies Online";
        getTitle(expectedTitle);
    }
    public void Netflixcompare() {
        String expectedcompare_Text = "Watch anywhere. Cancel anytime.";
        compare_Text(expectedcompare_Text,actualtext);
    }
    public void Check_brokenLink() throws IOException {
        brokenLink();
    }
    public void clickEnterKeyboard1() {

// typeOnInputBox(enterSearchXPATH, "brahim@yahoo.fr");
        clickEnterKeyboard (enterSearch,"lhaja@gmail.com");

    }
}








