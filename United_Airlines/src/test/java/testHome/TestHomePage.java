package testHome;

import common.WebAPI;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;
import static Home.HomePage.homePage;
import static Home.HomePage.init;

public class TestHomePage extends WebAPI{
    @Test
    public void Test_Book_a_RoundtripDB() throws SQLException, IOException, ClassNotFoundException, InterruptedException {
        init();
        homePage.SetBook_a_RoundtripDB();
    }

    @Test
    public void TestSetBookPage() throws InterruptedException {
        init();
        homePage.SetBookPage();
    }
    @Test
    public void TestSetMapSearchBox() throws InterruptedException {
        init();
        homePage.SetRouteSearchBox();
    }


}
