package testHome;
import common.WebAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReaderTeam4;

import java.io.IOException;

import static Home.HomePage.*;
public class TestHomePage extends WebAPI {
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