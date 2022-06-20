package pages.googlePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import pages.basePage.BasePage;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@role='combobox']")
    private WebDriver inputField;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    

}
