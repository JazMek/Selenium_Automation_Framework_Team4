package reporting;

//import com.google.api.client.repackaged.org.apache.commons.codec.binary.StringUtils;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class TestLogger {
    public static void log(final String message){
        Reporter.log(message,true);
        ExtentTestManager.getTest().log(LogStatus.INFO, message + "<br>");
    }
    public static void log(final StringUtils message){
        Reporter.log(message + "<br>",true);
        ExtentTestManager.getTest().log(LogStatus.INFO, message + "<br>");
    }
    public static void log(final String message, WebDriver driver){
        Reporter.log(message,true);
        ExtentTestManager.getTest().log(LogStatus.INFO, message + "<br>");
    }

//    @Test
//    public void testSearchProduct() throws InterruptedException {
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
//        getInitElements();
//        homePage.searchProduct();
//        homePage.validateSearchProduct();
//    } 
    
    // Test logger reporting 
//    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//    }.getClass().getEnclosingMethod().getName()));
    
    
}