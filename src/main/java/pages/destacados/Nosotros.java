package pages.destacados;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Nosotros extends BasePage {

    //-------------------------- START VARIABLES --------------------------//

    private static final String expectedUrlPagina = "www.peppos.com.uy/nosotros";

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
    public Nosotros(WebDriver driver) {
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
