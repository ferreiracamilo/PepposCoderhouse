package pages.avisos_legales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class TermCondiciones extends BasePage{

    //-------------------------- START VARIABLES --------------------------//

    private static final String expectedUrlPagina = "www.peppos.com.uy/terminos-condiciones";

    @FindBy(xpath="//h1[@class='tit']")
    private WebElement titlePage;

    @FindBy(xpath="//p //a[contains(text(),'Términos de promociones')]")
    private WebElement linkTermPromo;

    @FindBy(xpath="//p //a[contains(text(),'CiberPeppos noviembre 2021')]")
    private WebElement linkTermCiberPeppos;

    //-------------------------- END VARIABLES --------------------------//

    //-------------------------- START CONSTRUCTOR --------------------------//

    /**
     * Region Constructor
     *
     * @param driver
     */
    public TermCondiciones(WebDriver driver) {
        super(driver);
    }

    //-------------------------- END CONSTRUCTOR --------------------------//


    //-------------------------- START METHODS --------------------------//

    public String getExpectedUrlPagina (){
        return expectedUrlPagina;
    }

    public String getTitlePage (){
        return titlePage.getText();
    }

    public TermPromociones clickLinkTermPromo(){
        linkTermPromo.click();
        return new TermPromociones(this.driver);
    }

    public void clickLinkTermCiberPeppos(){
        linkTermCiberPeppos.click();
    }

    //-------------------------- END METHODS --------------------------//

}
