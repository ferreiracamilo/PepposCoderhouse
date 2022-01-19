package pages.avisos_legales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.io.IOException;

public class Privacidad extends BasePage {

    //-------------------------- START VARIABLES --------------------------//

    private static final String expectedUrlPagina = "www.peppos.com.uy/privacidad";

    @FindBy(xpath="//h1[@class='tit']")
    private WebElement titlePage;

    @FindBy(xpath="//div[@role='main'] //strong")
    private WebElement subTitlePage;

    //-------------------------- END VARIABLES --------------------------//

    //-------------------------- START CONSTRUCTOR --------------------------//

    /**
     * Region Constructor
     *
     * @param driver
     */
    public Privacidad(WebDriver driver) throws IOException {
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

    public String getSubTitlePage (){
        return subTitlePage.getText();
    }

    //-------------------------- END METHODS --------------------------//
}
