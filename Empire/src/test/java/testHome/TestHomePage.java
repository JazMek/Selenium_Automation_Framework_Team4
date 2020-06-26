package testHome;

import common.WebAPI;
import org.testng.annotations.Test;

import java.io.IOException;

import static Home.EmpirePageWebElement.*;

public class TestHomePage extends WebAPI {

    @Test
    public void Testcheck_LindingPage(){
        init();
        homePage.Testcheck_LindingPage();
    }
    @Test
    public void Check_brokenLink() throws IOException {
        init();
        homePage.brokenLink();
    }
    @Test
    public void TestCheckPagelistLinks(){
        init();
        homePage.CheckPagelistLinks();
    }
}
