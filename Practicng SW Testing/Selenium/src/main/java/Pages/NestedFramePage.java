package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramePage {
    private WebDriver driver;
    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private By body = By.tagName("body");

    public NestedFramePage(WebDriver driver){
        this.driver = driver;
    }

    private void switchToMainFrame(){
        driver.switchTo().parentFrame();
    }

    public String getLeftFrameText(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
        String text = getFrameText();
        switchToMainFrame();
        switchToMainFrame();
        return text;
    }

    public String getBottomFrameText(){
        driver.switchTo().frame(bottomFrame);
        String text = getFrameText();
        switchToMainFrame();
        return text;
    }

    private String getFrameText(){
        return driver.findElement(body).getText();
    }
}
