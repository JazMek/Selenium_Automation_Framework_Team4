package testHome;
import Home.HomePage;
import Home.NetflixPageWebElement;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static Home.HomePage.loginToAmazonAccount;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import utility.DataReaderTeam4;
import java.io.IOException;
import static Home.HomePage.*;
public class TestHomePage extends WebAPI {
public static HomePage homePage;
public static NetflixPageWebElement netflixPageWebElement;
public static void init() {
homePage = PageFactory.initElements(driver, HomePage.class);
netflixPageWebElement = PageFactory.initElements(driver, NetflixPageWebElement.class);
     @Test
     public void searchField() throws InterruptedException {
        init();
      loginToNetflixAccount(); }
     @Test
     public void testSelectProfile() throws InterruptedException {
        init();
        homePage.SelectProfile(); }
        @Test
     public void testMooviesection() throws InterruptedException {
        init();
       homePage.movie(); }
       @Test
    public void testGetGenreMovieList(){
           init();
           homePage.getMovieList(); }
         @Test
    public void testPlayButton(){
         init();
         homePage.playButton(); }
         @Test
    public void testEmail(){
         init();
         homePage.email(); }
    @Test
    public void testsearchFielDs(){
         init();
         homePage.searchFields();
    }
}
