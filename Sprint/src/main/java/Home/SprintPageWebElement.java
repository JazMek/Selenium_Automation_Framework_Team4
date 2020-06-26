package Home;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class SprintPageWebElement {
    public static final String PlansXP="/html/body/div[1]/div/div[1]/div/header/div/div[2]/div/div[1]/nav/div[2]/ul/li[1]/a/span";
    @FindBy(how = How.XPATH,using =PlansXP )
    public static WebElement Plans;
    public static final String UnlimitedPlansXP="/html/body/div[1]/div/div[1]/div/header/div/div[2]/div/div[1]/nav/div[2]/ul/li[1]/div/div/ul/li[1]/ul/li[1]/a";
    @FindBy(how = How.XPATH,using =UnlimitedPlansXP)
    public static WebElement UnlimitedPlans;
    public static final String OtherPlansXP="/html/body/div[1]/div/div[1]/div/header/div/div[2]/div/div[1]/nav/div[2]/ul/li[1]/div/div/ul/li[1]/ul/li[3]/a";
    @FindBy(how = How.XPATH,using =OtherPlansXP)
    public static WebElement OtherPlans;
    public static final String AddOnServicesXP="//li[@class='all']//a[contains(text(),'Add-on services')]";
    @FindBy(how = How.XPATH,using =AddOnServicesXP)
    public static WebElement AddOnServices;
    public static final String OurNetWorkXP="/html/body/div[1]/div/div[1]/div/header/div/div[2]/div/div[1]/nav/div[2]/ul/li[1]/div/div/ul/li[2]/ul/li[1]/a";
    @FindBy(how = How.XPATH,using =OurNetWorkXP)
    public static WebElement OurNetWork;
    public static final String OurUnlimitedPlanXP="//*[@id=\"main\"]/div[6]/nav/ul/li[1]/a";
    @FindBy(how = How.XPATH,using =OurUnlimitedPlanXP)
    public static WebElement OurUnlimitedPlan;
    public static final String UsVsThemPlanXP="//*[@id=\"main\"]/div[6]/nav/ul/li[2]/a";
    @FindBy(how = How.XPATH,using =UsVsThemPlanXP)
    public static WebElement UsVsThemPlan;
    public static final String OtherPlansPlanXP="//*[@id=\"main\"]/div[6]/nav/ul/li[3]/a";
    @FindBy(how = How.XPATH,using =OtherPlansPlanXP)
    public static WebElement OtherPlansPlan;
    public static final String UsVsNextIconXP="//*[@id=\"main\"]/div[6]/div/div/div/div/div/div/div/div/div/div[3]/div/a/figure/img";
    @FindBy(how = How.XPATH,using =UsVsNextIconXP)
    public static WebElement UsVsNextIcon;
    public static final String UsVsPreviousIconXP="//*[@id=\"main\"]/div[6]/div/div/div/div/div/div/div/div/div/div[1]/div/a/figure/img";
    @FindBy(how = How.XPATH,using =UsVsPreviousIconXP)
    public static WebElement UsVsPreviousIcon;
    public static final String OtherPlansLearnMoreXP="//*[@id=\"main\"]/div[6]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[4]/a/span";
    @FindBy(how = How.XPATH,using =OtherPlansLearnMoreXP)
    public static WebElement OtherPlansLearnMore;

    public static final String CheckZIPCoodXP ="//input[@placeholder='Enter ZIP Code']";
    @FindBy(how= How.XPATH,using = CheckZIPCoodXP )
    public static WebElement CheckZIPCood;
}
