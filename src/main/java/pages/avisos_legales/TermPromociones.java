package pages.avisos_legales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class TermPromociones extends BasePage {

    //-------------------------- START VARIABLES --------------------------//

    private static final String expectedUrlPagina = "www.peppos.com.uy/terminos-promociones";

    @FindBy(xpath="//h1[@class='tit']")
    private WebElement titlePage;

    //-------------------------- END VARIABLES --------------------------//

    //-------------------------- START CONSTRUCTOR --------------------------//

    /**
     * Region Constructor
     *
     * @param driver
     */
    public TermPromociones(WebDriver driver) {
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

    //-------------------------- END METHODS --------------------------//
}
