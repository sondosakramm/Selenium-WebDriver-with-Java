package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {
    @Test
    public void testExample1(){
        var dynamicLoadingPages = homePage.clickDynamicLoadingPage();
        var hiddenPage = dynamicLoadingPages.clickExample1();
        hiddenPage.clickButton();
        assertEquals(hiddenPage.getFinalText(), "Hello World!");

    }

    @Test
    public void testExample2(){
        var dynamicLoadingPages = homePage.clickDynamicLoadingPage();
        var example2Page = dynamicLoadingPages.clickExample2();
        example2Page.clickButton();
        assertEquals(example2Page.getFinalText(), "Hello World!");

    }
}
