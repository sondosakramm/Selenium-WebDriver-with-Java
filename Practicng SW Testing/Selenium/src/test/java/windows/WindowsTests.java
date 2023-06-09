package windows;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WindowsTests extends BaseTests {

    @Test
    public void testWindowTabs(){
        var buttonPage = homePage.clickDynamicLoadingPage().openExample2InNewTab();
        getWindowManager().switchToNewTab();
        assertTrue(buttonPage.isStartButtonDisplayed(), "Start button is not displayed");
    }

}
