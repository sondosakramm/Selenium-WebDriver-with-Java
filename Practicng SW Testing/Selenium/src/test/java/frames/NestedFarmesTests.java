package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFarmesTests extends BaseTests {
    @Test
    public void checkFrames(){
        var framePage = homePage.clickFramesPage();
        var nestedFramesPage = framePage.clickNestedFrames();
        String leftText = nestedFramesPage.getLeftFrameText();
        String buttomText = nestedFramesPage.getBottomFrameText();

        assertEquals(leftText, "LEFT");
        assertEquals(buttomText, "BOTTOM");
    }
}
