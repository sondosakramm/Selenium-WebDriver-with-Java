package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
    private By textBlocks = By.className("jscroll-added");
    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }
    /**
     * @param index
     */
    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0,document.body.scrollHeight)";
        var jsExecuter = (JavascriptExecutor)driver;
        while (getNumberOfParagraphs() < index) {
            jsExecuter.executeScript(script);
        }
    }

    private int getNumberOfParagraphs(){
        return driver.findElements(textBlocks).size();
    }


}
