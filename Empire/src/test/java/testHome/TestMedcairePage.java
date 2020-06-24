package testHome;

import common.WebAPI;
import org.testng.annotations.Test;

import static Home.MedicairePage.init;
import static Home.MedicairePage.medicairePage;

public class TestMedcairePage extends WebAPI {
    @Test
    public void testMedicaidePage() throws InterruptedException {
        init();
        medicairePage.medicaidePage(); }
    @Test
    public void testbenefits(){
        init();
        medicairePage.benefitsXP(); }
    @Test
    public void testenrollement(){
        init();
        medicairePage.enrollementXP(); }
    @Test
    public void testcare(){
        init();
        medicairePage.careXP(); }
    @Test
    public void testlogin(){
        init();
        medicairePage.loginXp(); }
    @Test
    public void testlanguage(){
        init();
        medicairePage.languageXp(); }
    @Test
    public void testcontactUs(){
        init();
        medicairePage.contactUsXP(); }
    @Test
    public void testfindADocteur(){
        init();
        medicairePage.findADocteur();
    }
    @Test
    public void testmakeApayment(){
      init();
        medicairePage.makeApayment();
    }
    @Test
    public void testEnroll(){
       init();
        medicairePage.Enroll();
    }
    @Test
    public void testrenew(){
        init();
        medicairePage.renew();
    }
    @Test
    public void testid(){
        init();
        medicairePage.id();
    }

}
