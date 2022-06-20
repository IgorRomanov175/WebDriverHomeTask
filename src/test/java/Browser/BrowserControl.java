package Browser;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BrowserControl {

    public final static long WAIT_TIME = 20;

    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = DriverSingleton.getDriver();
        driver = new ChromeDriver();
    }

    @AfterTest
    public void tearDown() {
        DriverSingleton.closeDriver();
        ;
    }

}
