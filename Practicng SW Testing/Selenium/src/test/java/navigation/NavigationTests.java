package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigator(){
        homePage.clickDynamicLoadingPage().clickExample1();
        getWindowManager().goBack();
        System.out.println(getWindowManager().getCurrURL());
        getWindowManager().refreshPage();
        System.out.println(getWindowManager().getCurrURL());
        getWindowManager().goForward();
        System.out.println(getWindowManager().getCurrURL());
        getWindowManager().goTo("https://google.com/");
        System.out.println(getWindowManager().getCurrURL());

    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }

}
