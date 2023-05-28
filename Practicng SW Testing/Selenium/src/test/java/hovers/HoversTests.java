package hovers;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoversTests extends BaseTests {

    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);

        assertTrue(caption.isCaptionDisplayed(), "Caption Not Displayed");
        assertEquals(caption.getTitle(), "name: user1", "Wrong Title");
        assertEquals(caption.getLinkText(), "View profile", "Wrong Link Text");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");

    }

}
