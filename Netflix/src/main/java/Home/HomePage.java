package Home;
import common.WebAPI;
import java.io.IOException;
import static Home.NetflixPageWebElement.*;

public class HomePage extends WebAPI {
    public static void SignInToNetflixAccount(String username,String password){
        signinButton.click();
        userNameField.sendKeys("team4WDNY2020@gmail.com");
        passWordField.sendKeys("Team42020");
        signinButton2.click();
    }
    //**** Check Broken Links  ******************
    public void Check_brokenLink() throws IOException, InterruptedException {
        brokenLink();
    }
    public void clickEnterKeyboard1() {
        clickEnterKeyboard(enterSearch, "team4WDNY2020@gmail.com");
    }
    
}


