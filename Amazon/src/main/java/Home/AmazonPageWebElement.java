package Home;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class AmazonPageWebElement {
    //*********************LAMARAs WebElements***********************
           //----Check Best sellers Page Url-------
    public static final String ClickBestSellersCSS="#nav-xshop > a:nth-child(2)";
    @FindBy(how= How.CSS ,using=ClickBestSellersCSS)
    public static WebElement ClickBestSellers;
    public static String ExpectedUrl="https://www.amazon.com/gp/bestsellers/?ref_=nav_cs_bestsellers";
    //----Check Books Page Url--------
    public static final String ClickBooksCSS ="#zg_browseRoot > ul > li:nth-child(11) > a";
    @FindBy(how= How.CSS, using=ClickBooksCSS)
    public static WebElement ClickBooks;
    public static String ExpectedUrl1="https://www.amazon.com/best-sellers-books-Amazon/zgbs/books/ref=zg_bs_nav_0";
    //----choose the best Book in 'Best Sellers in Books'--------
    public static final String ChooseTheBestBookXP ="//*[@id=\"zg-ordered-list\"]/li[1]/span/div/span/a/span/div/img";
    @FindBy (how= How.XPATH, using=ChooseTheBestBookXP)
    public static WebElement ChooseTheBestBook;
    //----------Select PaperBack Format for the best book--------------
    public static final String SelectPaperBackFormatCSS="#a-autoid-8-announce > span:nth-child(1)";
    @FindBy(how= How.CSS, using=SelectPaperBackFormatCSS)
    public static WebElement SelectPaperBackFormat;
    //--------- test 'Add To Cart' Functionality----
    public static final String AddToCartXP="//*[@id=\"add-to-cart-button\"]";
    @FindBy(how= How.XPATH, using=AddToCartXP)
    public static WebElement AddToCart;
    //------- Test Mouse Hover  ---------
    public static final String HoverMouseCSS="#nav-link-accountList > span.nav-line-2";
    @FindBy(how= How.CSS, using=HoverMouseCSS)
    public static WebElement HoverMouse;
    //--------- click On 'Create List'  --------
    public static final String ClickCreateListXP="//*[@id=\"nav-al-wishlist\"]/a[1]/span";
    @FindBy(how= How.XPATH, using=ClickCreateListXP)
    public static WebElement ClickCreateList;
    
}
