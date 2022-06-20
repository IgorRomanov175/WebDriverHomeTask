package pages.googlePages;

import lombok.Getter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.basePage.BasePage;

@Getter
public class GooglePage extends BasePage {

    @FindBy(xpath = "//input[@role='combobox']")
    private WebElement inputField;

    @FindBy(xpath = "//a[text()='Картинки']")
    private WebElement pictureChapter;

    @FindBy(xpath = "//img[@class='rg_i Q4LuWd']")
    private WebElement img;

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public GooglePage inputSearchPicture(String input){
        inputField.sendKeys(input, Keys.ENTER);
        waitForPageLoadComplete(WAIT_TIME);
        return this;
    }

    public GooglePage pictureChapterClick(){
        pictureChapter.click();
        waitForVisibilityOfElement(WAIT_TIME, img);
        return this;
    }
}
