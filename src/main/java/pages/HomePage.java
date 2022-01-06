package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    //-------------------------- START XPATHS --------------------------//

    /**
     * Footer
     */

    private static final String xpFootSection = "//div[@class='ftrContent'] /div[contains (@class,'blk')] //div[@class='tit' and contains(text(),'$SectionTitle')]";
    private static final String xpFootSectionItem = "//div[@class='ftrContent'] /div[contains(@class,'blk')] //div[@class='tit' and contains(text(),'$SectionTitle')] /ancestor::div[2] //*[contains(text(),'$SubItem') or contains(@class,'$SubItem')]"; //It search for any kind of element based on the fact that schedule and whatsapp are under li elements, not anchors







    //-------------------------- END XPATHS --------------------------//

    //-------------------------- START WEBELEMENT/S --------------------------//

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


    //div[@class='blkInfo'] //div[@class='it tag'] //div[contains(text(),'Las mejores marcas')]




    //-------------------------- END WEBELEMENT/S --------------------------//

    //-------------------------- START CONSTRUCTOR --------------------------//

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //-------------------------- END CONSTRUCTOR --------------------------//
}
