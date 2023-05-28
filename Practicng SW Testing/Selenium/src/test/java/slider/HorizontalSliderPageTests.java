package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderPageTests extends BaseTests {

    @Test
    public void testSetSliderValue(){
        String value = "3.5";
        var sliderPage = homePage.clickSliderPage();
        sliderPage.setSliderValue(value);

        assertEquals(sliderPage.getSliderValue(), value, "Incorrect Value");
    }
}
