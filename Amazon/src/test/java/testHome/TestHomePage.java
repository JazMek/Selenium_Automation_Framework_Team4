package testHome;
import common.WebAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReaderTeam4;

import java.io.IOException;
import static Home.HomePage.homePage;
import static Home.HomePage.init;
public class TestHomePage extends WebAPI {
//30182NY_Achour Test cases************************************************************************************
/*test case#01:-As customer i should navigate to amazon home page*/
    @Test
    public void testAmazonPage() throws InterruptedException { init();
    homePage.AmazonPage();
}
   @Test
    public void testTodaysDealsPage() throws InterruptedException { init();homePage.todaysDealsPage(); }
  @Test
    public void testWareHouseDealsPage() throws InterruptedException {init();homePage.WareHouseDealsPage(); }
    @Test
    public void testcheckbox() throws InterruptedException { init();homePage.checkbox(); }
    @Test
    public void testspoortOutdoors() throws InterruptedException { init();homePage.spoortOutdoors(); }
    @Test
    public void testArowsOnTodaysDeals() throws InterruptedException {
        init();
        homePage.arowLeftRight(); }
    @Test
    public void testSortByFilter() throws InterruptedException {
        init();
        homePage.sorBy(); }
@Test
    public void testDealOfTheDay(){
    init();
    homePage.DealofTheDay(); }
    @Test
    public void testTodayDealsCategories() throws InterruptedException {
    init();
    homePage.todaysDealsCategories(); }
       @Test
   public void testNextPageAndGoToTop() throws InterruptedException {
       init();
       homePage.NextPageAndGoToTop(); }
       @Test
       public void testGetList(){
           init();
         homePage.GetList(); }
@DataProvider
 public Object[] getTestData()throws IOException, InvalidFormatException {
 Object[] data = DataReaderTeam4.fileReader3("sheet1","/Users/ashorouali/Desktop/Ashor.xlsx");
 return data;}

 @Test (dataProvider="getTestData")
 public void TestChecksearchBox(String ProdactName) throws IOException, InvalidFormatException {
 init();
 homePage.CheckDropDownSearchList(ProdactName);
 }}