package testHome;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static Home.HomePage.homePage;
import static Home.HomePage.init;

public class TestHomePage extends WebAPI {
@Test
    public void TestScrollPageDown(){
    init();
    homePage.setIndividualAndFamily();
}
@Test
    public void TestScrollPageToElement() throws InterruptedException {
    init();
        homePage.setSelectLanguage(); }
        @Test
    public void TestsetLogin() throws InterruptedException {
        init();
        homePage.setLogin(); }
@Test
    public void TestHealthInsurance() throws InterruptedException {
    init();
    homePage.setHealthInsurance();
}
@Test
    public void TestVisionInsurance() throws InterruptedException {
        init();
        homePage.setVisionInsurance();
    }











}
