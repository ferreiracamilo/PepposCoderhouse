package pages;

import enums.BannerConstants;
import enums.FooterConstants;
import enums.HeaderConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.producto.BusquedaProducto;
import pages.producto.Producto;

import java.io.IOException;
import java.util.ArrayList;
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

    private static final String xpHeaderMenuItem = "//ul[@class='lst main'] //li[@class='$HeaderMenu'] /a";
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

    //Present if newsletter registration was succesfully
    @FindBy(xpath="//div[@id='ppMsg'] //div[@data-type='ok'] //span[@class='ico']")
    private List<WebElement> newsLetterConfirmIconQty;

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

    // blkInfo section - Todos los elementos, solo el texto
    @FindBy(xpath="//div[@class='blkInfo'] //div[@class='tit']")
    private List<WebElement> blkInfoTexts;

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

    public HomePage(WebDriver driver) throws IOException {
        super(driver);
    }

    //-------------------------- END CONSTRUCTOR --------------------------//

    //-------------------------- START METHODS --------------------------//

    /**
     * Verify if looking for a specific footer section is present by using findElements size greather than zero
     * @param section -> FooterConstants.Section
     */
    public boolean assertFootSection (FooterConstants.Section section){
        return getAllElements(xpFootSection.replace("$SectionTitle",section.label)).size()>0;
    }

    public boolean assertFootSubItem (FooterConstants.Section section, FooterConstants.Subitems subitem){
        String xpOption = xpFootSectionItem.replace("$SectionTitle", section.label);
        xpOption = xpOption.replace("$SubItem",subitem.label);
        return getAllElements(xpOption).size()>0;
    }

    public WebDriver clickFootSubItem (FooterConstants.Section section, FooterConstants.Subitems subitem){
        String xpOption = xpFootSectionItem.replace("$SectionTitle", section.label);
        xpOption = xpOption.replace("$SubItem",subitem.label);
        moveNclick(Find(xpOption));
        return this.driver;
    }

    public boolean assertHeaderMenu (HeaderConstants.HeaderMenu menu){
        return getAllElements(xpHeaderMenuItem.replace("$HeaderMenu",menu.label)).size()>0;
    }

    public BusquedaProducto clickHeaderMenu (HeaderConstants.HeaderMenu menu) throws IOException {
        Find(xpHeaderMenuItem.replace("$HeaderMenu",menu.label)).click();
        return new BusquedaProducto(this.driver);
    }

    public boolean assertHeaderSubItem(HeaderConstants.HeaderMenu menu, HeaderConstants.Subitems subitem){
        WebElement headerMenuX = Find(xpHeaderMenuItem.replace("$HeaderMenu",menu.label));
        Hover(headerMenuX);
        String subItemXP = xpHeaderSubMenuItem.replace("$HeaderMenu",menu.label);
        subItemXP = subItemXP.replace("$SubItem",subitem.label);
        return getAllElements(subItemXP).size()>0;
    }

    public BusquedaProducto clickHeaderSubItem(HeaderConstants.HeaderMenu menu, HeaderConstants.Subitems subitem) throws IOException {
        WebElement headerMenuX = Find(xpHeaderMenuItem.replace("$HeaderMenu",menu.label));
        Hover(headerMenuX);
        String subItemXP = xpHeaderSubMenuItem.replace("$HeaderMenu",menu.label);
        subItemXP = subItemXP.replace("$SubItem",subitem.label);
        Find(subItemXP).click();
        return new BusquedaProducto(this.driver);
    }

    public boolean assertBannerCampania (BannerConstants.Campania banner){
        return getAllElements(xpBannerCampania.replace("$BannerCampania",banner.label)).size() > 0;
    }

    public void clickBannerCampania (BannerConstants.Campania banner){
        WebElement element = Find(xpBannerCampania.replace("$BannerCampania",banner.label));
        moveNclick(element);
    }

    public void verifyHomeLoadedOrRetry (){

        pause(300); //Assure to wait a minimum of time and then verify if elements are loaded in home page

        if(subscribeNote.size()<1){
            navigateTo(getURLDataProp());
        }

        if(isError404Present()){
            navigateTo(getURLDataProp());
        }

    }

    public void writeEmailNewsletter (String email){
        newsLetterEmailTxt.sendKeys(email);
        moveNclick(newsLetterSubmitBtn);
    }

    public void closeNewsletterConfirmation (){
        newsLetterConfirmIcon.click();
    }

    public boolean isNewsLetterAccepted (){
        return newsLetterConfirmIconQty.size() > 0;
    }

    public List<WebElement> getBlkInfoTxtsWebElements(){
        return blkInfoTexts;
    }

    public String getmessageAboveHeader (){
        return messageAboveHeader.getText();
    }

    public void clickPepposLogo (){
        pepposLogo.click();
    }

    public String getTopBannerMarcaPrecioMsg (){
        return topBannerMarcaPrecioMsg.getText();
    }

    public BusquedaProducto searchProductByInput (String input) throws IOException {
        moveNclick(searchProdBtn); //In the case web has scrolled down is needed to click before the button
        searchProdInput.sendKeys(input);
        searchProdInput.submit();
        return new BusquedaProducto(this.driver);
    }

    public void openUserModal (){
        moveNclick(myAccountIcoAnchor);
    }

    public String getUserIcoNombre (){
        return myAccountIcoNombre.getText();
    }

    public String getUserIcoApellido (){
        return myAccountIcoApellido.getText();
    }

    public void logToAccount (){
        moveNclick(myAccountIcoAnchor);
        userEmailInput.sendKeys(getUserNameDataProp());
        userPassInput.sendKeys(getPasswordDataProp());
    }

    public void createAccount (){
        moveNclick(myAccountIcoAnchor);
        createAccountBtn.click();
    }




    //-------------------------- END METHODS --------------------------//
}
