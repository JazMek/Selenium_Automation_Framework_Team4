package testHome;
import common.WebAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;
import java.io.IOException;
import static Home.DealPage.dealpage;
import static Home.DealPage.init;
public class TestDealPage extends WebAPI {
 @Test
    public void testDealPage(){
     init();
     dealpage.DealPage(); }
    @Test
    public void testHotDealText(){
     init();
     dealpage.dealText(); }
    @Test
    public void testBuildYourPhonePage(){
     init();
     dealpage.BuildYourPhonePage(); }
    @Test
    public void testBuildYourPhone(){
     init();
     dealpage.BuildYourPhone(); }
     @Test
    public void testSprintPhones(){
     init();
     dealpage.SprintPhones(); }
     @Test
    public void testFeature(){
     init();
     dealpage.Feature(); }
    @Test
    public void testallPhones(){
     init();
     dealpage.allPhones(); }
    @Test
    public void testFilterByCategory(){
     init();
     dealpage.FilterByCategory(); }
     @Test
    public void testList(){
     init();
     dealpage.list(); }
    @Test
    public void testCompareText() throws IOException, InvalidFormatException {
     init();
     dealpage.compareText();
    }
    @Test
    public void testCheckOrder(){
     init();
     dealpage.CheckOrder();
    }




}
