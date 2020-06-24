package testHome;
import common.WebAPI;
import org.testng.annotations.Test;

import static Home.ProductsPage.init;
import static Home.ProductsPage.productsPage;

public class TestProductsPage extends WebAPI {
    @Test
    public void testProducts(){
        init();
        productsPage.products(); }
        @Test
    public void testChecking(){
        init();
            productsPage.Checking(); }
    @Test
    public void testSavings  (){
        init();
        productsPage.Savings();}
    @Test
    public void testCDs  (){
        init();
        productsPage.CDs(); }
    @Test
    public void testCreditCards (){
        init();
        productsPage.CreditCards();}
    @Test
    public void testHomeEquityLoansLines  (){
        init();
        productsPage.HomeEquityLoansLines();}
    @Test
    public void testMortgage  (){
        init();
        productsPage.Mortgage();}
    @Test
    public void testPersonalLoans  (){
        init();
        productsPage.PersonalLoans();}
    @Test
    public void testIRAs (){
        init();
        productsPage.IRAs();}
    @Test
    public void testPrepaidCards  (){
        init();
        productsPage.PrepaidCards();}
    @Test
    public void testSpecialOffers  (){
        init();
        productsPage.SpecialOffers();}









}
