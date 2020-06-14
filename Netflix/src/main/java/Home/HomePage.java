package Home;
import common.WebAPI;
import static Home.BaseClass.*;
import static Home.NetflixPageWebElement.*;
public class HomePage extends WebAPI {
    public void addProfileIconToNetflix() {
//      loginToNetflixAccount();
//        addProfileIcon.click();
//        addProfileName.sendKeys("Karim1");
//        CONTINUEButton.click();
}
//import static Home.NetflixPageWebElement.signinButton2;
public class HomePage {
    public static void loginToAmazonAccount(){
        signinButton.click();
        userNameField.sendKeys("team4WDNY2020@gmail.com");
        passWordField.sendKeys("Team42020");
        signinButton2.click();
    }
}
