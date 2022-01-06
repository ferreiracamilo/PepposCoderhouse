package resources;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Peppo_Utilities extends BasePage {

    JavascriptExecutor js = (JavascriptExecutor) driver;

    //-------------------------- START CONSTRUCTOR --------------------------//

    public Peppo_Utilities(WebDriver driver) {
        super(driver);
    }

    //-------------------------- END CONSTRUCTOR --------------------------//

    public void moveNClickToWebElement (WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    protected void jsMoveNclickToWebElement (WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        js.executeScript("arguments[0].click();", element);
    }

    protected void eraseNwrite (String locator, String textToWrite){
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
    }
}
