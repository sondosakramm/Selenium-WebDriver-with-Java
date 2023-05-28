package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class DynamicLoadingExample1 {
    private WebDriver driver;
    private By button = By.cssSelector("#start button");
    private By loading = By.id("loading");
    private By finalText = By.id("finish");
    public DynamicLoadingExample1(WebDriver driver) {
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
        wait.until(ExpectedConditions.invisibilityOf(
                driver.findElement(loading)));
    }
    public String getFinalText(){
        return driver.findElement(finalText).getText();
    }
}
