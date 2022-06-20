package scenario;

import Browser.BrowserControl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario extends BrowserControl {

    private static final String GOOGLE_PAGE = "https://www.google.com/";
    private static final String INPUT = "cats";

    @Test
    public void WebDriverHometask(){
        getDriver().get(GOOGLE_PAGE);
        getGooglePage()
                .inputSearchPicture(INPUT)
                .pictureChapterClick();
        Assert.assertTrue(getGooglePage().getImg().isDisplayed());
    }

}
