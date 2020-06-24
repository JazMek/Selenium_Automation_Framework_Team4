package Home;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import static Home.EmpirePageWebElement.*;
public class MedicairePage extends WebAPI {
    public static MedicairePage medicairePage;
    public static void init(){
        medicairePage= PageFactory.initElements(driver,MedicairePage.class); }

    public void medicaidePage() {
    }
    public void benefitsXP() {
        mouseHoverByXpath(benefitsXP); }
    public void enrollementXP() {
        mouseHoverByXpath(enrollementXP); }
    public void careXP() {
        mouseHoverByXpath(careXP); }
    public void loginXp() {
        clickByXpath(loginXp); }
    public void languageXp() {
       clickByXpath(languageXp); }
    public void contactUsXP() {
        clickByXpath(contactUsXP); }
    public void findADocteur() {
        clickByXpath(findADocteurXp); }
    public void makeApayment() {
        clickByXpath(makeApaymentXP); }
    public void Enroll() {
        clickByXpath(EnrollXP); }
    public void renew() {
        clickByXpath(renewXP); }
    public void id() {
        clickByXpath(idXP); }
}
