package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{

    //-------------------------- START XPATHS --------------------------//

    /**
     * Footer
     */

    private static final String xpFootSection = "//div[@class='ftrContent'] /div[contains (@class,'blk')] //div[@class='tit' and contains(text(),'$SectionTitle')]";
    private static final String xpFootSectionItem = "//div[@class='ftrContent'] /div[contains(@class,'blk')] //div[@class='tit' and contains(text(),'$SectionTitle')] /ancestor::div[2] //*[contains(text(),'$SubItem') or contains(@class,'$SubItem')]"; //It search for any kind of element based on the fact that schedule and whatsapp are under li elements, not anchors

    /**
     * Header Menu
     */

    private static final String xpHeaderMenuItem = "//ul[@class='lst main'] //li[@class='$HeaderMenu']";
    private static final String xpHeaderSubMenuItem = "//ul[@class='lst main'] //li[@class='$HeaderMenu'] //li[not(contains(@class,'hdr '))] //a[contains(@href,'$SubItem')]";

    /**
     * Home Page - Banners
     */

    private static final String xpBannerCampania = "//div[@class='banner'] //div[@class='tit' and contains(text(),'$BannerCampania')] //ancestor::div[@class='banner']";

    //-------------------------- END XPATHS --------------------------//

    //-------------------------- START WEBELEMENT/S APPLYING PAGE FACTORY --------------------------//

    /**
     * Notificacion descuentos en HomePage
     */

    //When home page is load it may be triggered a notification asking to subscribe to newsletter
    @FindBy(xpath="//div[id='onesignal-slidedown-container']")
    private List<WebElement> subscribeNote;

    //Close subscribe to newsletter pop up notification
    @FindBy(xpath="//div //button[contains(@class,'secondary')]")
    private WebElement subscribeNoteBtnNo;

    /**
     * Newsletter
     */

    @FindBy(xpath="//div[@class='blk blkNewsletter'] //input[@type='email']")
    private WebElement newsLetterEmailTxt;

    @FindBy(xpath="//div[@class='blk blkNewsletter'] //button[@type='submit']")
    private WebElement newsLetterSubmitBtn;

    //Present if newsletter registration was succesfully
    @FindBy(xpath="//div[@id='ppMsg'] //div[@data-type='ok'] //span[@class='ico']")
    private WebElement newsLetterConfirmIcon;

    /**
     * blkInfo section
     */

    // blkInfo section - Tag icon - "Las mejores marcas" legend
    @FindBy(xpath="//div[@class='blkInfo'] //div[@class='it tag'] //div[contains(text(),'Las mejores marcas')]")
    private WebElement blkInfoTagLegend;

    // blkInfo section - Truck icon - "En tu casa en 24hs" legend
    @FindBy(xpath="//div[@class='blkInfo'] //div[@class='it truck'] //div[contains(text(),'En tu casa en 24hs')]")
    private WebElement blkInfoTruckLegend;

    // blkInfo section - Gift icon - "Cambios sin costo" legend
    @FindBy(xpath="//div[@class='blkInfo'] //div[@class='it gift'] //div[contains(text(),'Cambios sin costo')]")
    private WebElement blkInfoExchangeLegend;

    /**
     * Header & Surroundings
     */

    @FindBy(xpath="//div[@id='infoTop'] //p")
    private WebElement messageAboveHeader;

    //PepposLogo button
    @FindBy(xpath="//div[@id='logo'] //a")
    private WebElement pepposLogo;

    //Top banner below header
    @FindBy(xpath="//div[@data-area='Top' and @class='banner'] /p")
    private WebElement topBannerMarcaPrecioMsg;

    //Search product input
    @FindBy(xpath="//input[@type='search' and @name='q']")
    private WebElement searchProdInput;

    //Search product button
    @FindBy(xpath="//button[@class='btnBuscar' and @type='submit']")
    private WebElement searchProdBtn;

    //My account button icon user
    @FindBy(xpath="//div[@id='wrapper'] //a[@href='/mi-cuenta']")
    private WebElement myAccountIcoAnchor;

    //My account button icon user
    @FindBy(xpath="//div[@id='wrapper'] //a[@href='/mi-cuenta'] //span[@class='nombre']")
    private WebElement myAccountIcoNombre;

    //My account button icon user
    @FindBy(xpath="//div[@id='wrapper'] //a[@href='/mi-cuenta'] //span[@class='apellido']")
    private WebElement myAccountIcoApellido;

    /**
     * User Menu Login Modal
     */

    @FindBy(xpath="//form[@id='frmLogin'] //input[@type='email']")
    private WebElement userEmailInput;

    @FindBy(xpath="//form[@id='frmLogin'] //input[@type='password']")
    private WebElement userPassInput;

    @FindBy(xpath="//form[@id='frmLogin'] //a[@class='btnCrearCuenta']")
    private WebElement createAccountBtn;

    /**
     * User Creation Form
     */

    @FindBy(xpath="//form[@id='frmCrearCuenta'] //input[@name='txtNombre']")
    private WebElement createNombreTxt;

    @FindBy(xpath="//form[@id='frmCrearCuenta'] //input[@name='txtApellido']")
    private WebElement createApellidoTxt;

    @FindBy(xpath="//form[@id='frmCrearCuenta'] //input[@name='txtEmail']")
    private WebElement createEmailTxt;

    @FindBy(xpath="//form[@id='frmCrearCuenta'] //input[@name='txtPassword']")
    private WebElement createPasswordTxt;

    /**
     * Button Icon Shopping Cart
     */

    @FindBy(xpath="//button[contains(@class,'btnMiCompra')]")
    private WebElement cartBtn;

    @FindBy(xpath="//button[contains(@class,'btnMiCompra')] //span[@class='importe'] //span[@class='mon']")
    private WebElement cartItemQTY;

    @FindBy(xpath="//button[contains(@class,'btnMiCompra')] //span[@class='tot']")
    private WebElement cartPriceTotal;

    /**
     * Banners de campaña
     */

    @FindBy(xpath="//div[contains(@id,'box') and @style='display: block;'] //span[contains(text(),'X')]")
    private WebElement boxCloseBtn;

    @FindBy(xpath="//div[contains(@id,'box') and @style='display: block;'] //h2")
    private WebElement boxh2Generico;

    @FindBy(xpath="//div[contains(@id,'box') and @style='display: block;'] //h2")
    private List<WebElement> bannerOfertas;

























    //-------------------------- END WEBELEMENT/S --------------------------//

    //-------------------------- START CONSTRUCTOR --------------------------//

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //-------------------------- END CONSTRUCTOR --------------------------//
}
