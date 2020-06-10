package Home;


import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static Home.AmazonPageWebElement.*;



public class HomePage extends WebAPI {


    public void LoginToAmazon() {
        HamburgerMenu.click();
        hmenuCustomerName.click();
        ApEmail.sendKeys("team4WDNY2020@gmail.com",Keys.ENTER);
        ApPassword.sendKeys("Team42020", Keys.ENTER);


    }
}
