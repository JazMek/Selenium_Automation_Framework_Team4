package Home;

import static Home.NetflixPageWebElement.*;
//import static Home.NetflixPageWebElement.signinButton2;

public class HomePage {
    public static void loginToAmazonAccount(){
        signinButton.click();
        userNameField.sendKeys("team4WDNY2020@gmail.com");
        passWordField.sendKeys("Team42020");
        signinButton2.click();
    }



}
