package context;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {
    @Test
    public void contextTest(){
        var contextPage = homePage.clickContextMenuPage();
        contextPage.rightClickOnContext();
        String alertText = contextPage.getPopUpText();
        contextPage.acceptPopUp();
        assertEquals(alertText,"You selected a context menu", "incorrect");
    }
}
