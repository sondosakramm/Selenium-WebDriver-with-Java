package forgotPassword;

import base.BaseTests;
import Pages.EmailSentPage;
import Pages.ForgotPasswordPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTests extends BaseTests {
     @Test
    public void validEmailSent(){
         ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPass();
         forgotPasswordPage.setEmail("tau@example.com");
         EmailSentPage emailSentPage = forgotPasswordPage.rerievePassButtonClick();
         assertEquals(emailSentPage.getEmailSentText(),
                 "Your e-mail's been sent!",
                 "Incorrect Message");
     }
}
