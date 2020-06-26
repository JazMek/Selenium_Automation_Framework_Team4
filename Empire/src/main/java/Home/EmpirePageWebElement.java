package Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmpirePageWebElement {



    public static final String enterTextToBoxCSS="#txtUsername";
    @FindBy(how= How.CSS,using=enterTextToBoxCSS)
    public static WebElement enterTextToBox;

    public static final String loginClickCSS ="#topmenu-1527400527931 > span";
    @FindBy(how= How.CSS,using=loginClickCSS )
    public static WebElement loginClick;
    public static final String loginClick2CSS  ="#memberRegBtn";
    @FindBy(how= How.CSS,using=loginClick2CSS )
    public static WebElement loginClick2;






}
