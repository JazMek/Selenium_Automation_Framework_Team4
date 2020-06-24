package Home;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import static Home.TD_BankPageWebElement.*;
public class ProductsPage extends WebAPI {
    public static ProductsPage productsPage;
    public static TD_BankPageWebElement tdBankPageWebElement;
    public static void init() {
       productsPage= PageFactory.initElements(driver,ProductsPage.class);
        tdBankPageWebElement= PageFactory.initElements(driver,TD_BankPageWebElement.class);}
    public void products() {
        HoverMouseAndClickt( driver,products ); }
    public void Checking() {
        HoverMouseAndClickt( driver,products );
        clickByXpath(CheckingXp ); }
    public void Savings() {
        HoverMouseAndClickt( driver,products );
        clickByXpath(SavingsXP ); }
    public void CDs() {
        HoverMouseAndClickt( driver,products );
        clickByXpath(CDsXP ); }
    public void CreditCards() {
        HoverMouseAndClickt( driver,products );
        clickByXpath(CreditCardsXP ); }
    public void HomeEquityLoansLines() {
        HoverMouseAndClickt( driver,products );
        clickByXpath(HomeEquityLoansLinesXP); }
    public void Mortgage() {
        HoverMouseAndClickt( driver,products );
        clickByXpath( MortgageXP ); }
    public void PersonalLoans() {
        HoverMouseAndClickt( driver,products );
        clickByXpath(PersonalLoansXP ); }
    public void IRAs() {
        HoverMouseAndClickt( driver,products );
        clickByXpath(IRAsXP ); }
    public void PrepaidCards() {
        HoverMouseAndClickt( driver,products );
        clickByXpath(PrepaidCardsXP ); }
    public void SpecialOffers() {
        HoverMouseAndClickt( driver,products );
        clickByXpath(SpecialOffersXP ); }
}
