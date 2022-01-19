package pages.destacados;

import enums.FAQConstants;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

import java.io.IOException;

public class PreguntasFrecuentes extends BasePage {

    //-------------------------- START VARIABLES --------------------------//

    private static final String expectedUrlPagina = "info.peppos.com.uy/hc/es";

    private static final String xpTemaBtn = "//span[@class=\"blocks-item-title\" and contains(text(),'$Option')]";

    //-------------------------- END VARIABLES --------------------------//

    //-------------------------- START CONSTRUCTOR --------------------------//

    /**
     * Region Constructor
     *
     * @param driver
     */
    public PreguntasFrecuentes(WebDriver driver) throws IOException {
        super(driver);
    }

    //-------------------------- END CONSTRUCTOR --------------------------//

    //-------------------------- START METHODS --------------------------//

    public String getExpectedUrlPagina (){
        return expectedUrlPagina;
    }

    /**
     * Check if theme button is available within FAQ
     * @param option -> FAQConstants.Tema
     * @return boolean
     */
    public boolean optionIsPresent (FAQConstants.Tema option){
        return getAllElements(xpTemaBtn.replace("$Option",option.label)).size()>0;
    }

    //-------------------------- END METHODS --------------------------//

}
