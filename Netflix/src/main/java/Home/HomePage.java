package Home;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;


import java.io.IOException;

import static Home.NetflixPageWebElement.*;

public class HomePage extends WebAPI {


    public static NetflixPageWebElement netflixPageWebElement;
    public static HomePage homePage;
           public static void init() {
                homePage= PageFactory.initElements(driver, HomePage.class);
                netflixPageWebElement= PageFactory.initElements(driver, NetflixPageWebElement.class);
     }

    public void Testcheck_LindingPage() {
        String expected_SprintUrl="https://www.netflix.com/";
        String expected_SprintTitle="Netflix - Watch TV Shows Online, Watch Movies Online";
        getUrl(expected_SprintUrl);
        getTitle(expected_SprintTitle);
    }
           public static void loginToNetflixAccount(){
                signinButton.click();
                userNameField.sendKeys("team4WDNY2020@gmail.com");
                passWordField.sendKeys("Team42020");
                signinButton2.click();
    }
           public void addProfileIconToNetflix() {

               addProfileIcon.click();
               addProfileName.sendKeys("Karim1");
               CONTINUEButton.click();
    }
    public void Check_brokenLink() throws IOException {
        brokenLink();
    }
    public void CheckPagelistLinks() {
        PageLinksList(driver);
    }
    public void clickEnterKeyboard1() {

// typeOnInputBox(enterSearchXPATH, "brahim@yahoo.fr");
        clickEnterKeyboard (enterSearch,"lhaja@gmail.com");

    }
}
