package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class DynamicLoadingExample2 {
    private WebDriver driver;
    private By button = By.cssSelector("#start button");
    private By loading = By.id("loading");
    private By finalText = By.id("finish");

    public DynamicLoadingExample2(WebDriver driver){
        this.driver = driver;
    }

    public void clickButton(){
        driver.findElement(button).click();
        /*WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(
                driver.findElement(loading)));*/

        FluentWait wait = new FluentWait(driver).
                withTimeout(Duration.ofSeconds(5)).
                pollingEvery(Duration.ofSeconds(1)).
                ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(finalText));
    }

    public String getFinalText(){
        return driver.findElement(finalText).getText();
    }

    public boolean isStartButtonDisplayed() {
        if(driver.findElement(button).isDisplayed())
            return true;
        return false;
    }
}
