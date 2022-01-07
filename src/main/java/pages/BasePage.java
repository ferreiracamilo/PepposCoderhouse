package pages;

import enums.FooterConstants;
import enums.HeaderConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage {
    //-------------------------- START VARIABLES --------------------------//

    protected WebDriver driver;
    protected WebDriverWait wait;

    //-------------------------- END VARIABLES --------------------------//

    //-------------------------- START CONSTRUCTOR --------------------------//

    /**
     * Region Constructor
     */

    public BasePage(WebDriver driver){
        wait = new WebDriverWait(driver,30); //Will be used for explicit and/or fluent wait within inherited classes
        PageFactory.initElements(driver, this); //Will be use to create webelement applying page factory within inherited classes
    }

    //-------------------------- END CONSTRUCTOR --------------------------//

    //--------------------------------------------------------------------//
    //-------------------------- START METHODS ---------------------------//
    //-------------------------------------------------------------------//

    /**
     * Initialize driver
     * @param browserName // values -> chrome,firefox,opera
     */
    public WebDriver initializeDriver(String browserName) throws IOException {
        // String browserName
        switch (browserName){
            case "chrome":
                initializeChrome();
                break;
            case "firefox":
                initializeMozilla();
                break;
            case "opera":
                initializeOpera();
                break;
        }

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    //-------------------------- METHODS TO INITIALIZE SPECIFIC DRIVER TYPE  --------------------------//

    protected void initializeChrome (){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources-files\\chromedriver.exe"); //drivertype and driver exe location
        //Set option to take out notification
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options); //create chromedriver using as argument options created
    }

    protected void initializeMozilla (){
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\resources-files\\geckodriver.exe"); //drivertype and driver exe location

        //Set option to take out notification
        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(new FirefoxProfile());
        options.addPreference("dom.webnotifications.enabled", false);

        driver = new FirefoxDriver(options); //create firefox driver using as argument options created
    }

    protected void initializeOpera(){
        System.setProperty("webdriver.opera.driver", System.getProperty("user.dir")+"\\resources-files\\operadriver.exe"); //drivertype and driver exe location

        //Set option to take out notification
        OperaOptions options = new OperaOptions();
        options.addArguments("--disable-notifications");

        driver = new OperaDriver(options); //create opera driver using as argument options created
    }

    //-------------------------- METHODS TO INITIALIZE SPECIFIC DRIVER TYPE  --------------------------//

    public void navigateTo (String url){
        driver.get(url);
    }

    public String getBrowserURL(){
        return driver.getCurrentUrl();
    }

    public void closeBrowser (){
        driver.quit();
    }

    protected WebElement Find (String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated( By.xpath (locator) ));
    }

    public List<WebElement> getAllElements (String locator){
        return driver.findElements(By.xpath(locator));
    }


    //-----------------------------------------------------------------//
    //-------------------------- END METHODS --------------------------//
    //-----------------------------------------------------------------//

}
