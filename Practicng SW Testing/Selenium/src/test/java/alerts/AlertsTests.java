package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTests {

    @Test
    public void acceptAlertTest(){
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerJsAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResultText(), "You successfully clicked an alert", "incorrect");
    }

    @Test
    public void dissmissAlertTest(){
        var alertPage = homePage.clickAlertsPage();
        alertPage.triggerConfirm();
        alertPage.alert_clickToDismiss();
        assertEquals(alertPage.getResultText(), "You clicked: Cancel", "incorrect");
    }

    @Test
    public void getAlertText(){
        var alertPage = homePage.clickAlertsPage();
        alertPage.triggerConfirm();
        String alertText = alertPage.alert_getText();
        alertPage.alert_clickToDismiss();
        assertEquals(alertText, "I am a JS Confirm", "incorrect");
    }

    @Test
    public void enterTextTest(){
        var alertPage = homePage.clickAlertsPage();
        alertPage.triggerJsPrompt();
        String text = "Hello";
        alertPage.alert_setInput(text);
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResultText(), "You entered: "+text, "Incorrect");

    }
}
