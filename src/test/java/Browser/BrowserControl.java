package Browser;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.googlePages.GooglePage;

public class BrowserControl {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriverSingleton.getDriver();
        }

    @AfterMethod
    public void tearDown() {
        DriverSingleton.closeDriver();
    }

    public WebDriver getDriver(){
        return driver;
    }

    public GooglePage getGooglePage(){
        return new GooglePage(driver);
    }
}
