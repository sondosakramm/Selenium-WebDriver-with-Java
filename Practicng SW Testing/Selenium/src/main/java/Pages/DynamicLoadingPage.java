package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {
    private WebDriver driver;
    private String linkXpath = ".//a[contains(text(), '%s')]";
    private By example1 = By.xpath(String.format(linkXpath, "Example 1"));
    private By example2 = By.xpath(String.format(linkXpath, "Example 2"));

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingExample1 clickExample1(){
        driver.findElement(example1).click();
        return new DynamicLoadingExample1(driver);
    }

    public DynamicLoadingExample2 clickExample2(){
        driver.findElement(example2).click();
        return new DynamicLoadingExample2(driver);
    }

    public DynamicLoadingExample2 openExample2InNewTab() {
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.LEFT_CONTROL)
                .click(driver.findElement(example2))
                .keyUp(Keys.LEFT_CONTROL)
                .build()
                .perform();
        return new DynamicLoadingExample2(driver);
    }


}
