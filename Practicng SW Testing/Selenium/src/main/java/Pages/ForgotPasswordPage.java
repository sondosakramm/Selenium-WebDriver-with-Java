package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By emailTxt = By.id("email");
    private By rerievePassButton = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String email) {
        driver.findElement(emailTxt).sendKeys(email);
    }

    public EmailSentPage rerievePassButtonClick(){
        driver.findElement(rerievePassButton).click();
        return new EmailSentPage(driver);
    }
}
