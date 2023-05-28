package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFile = By.id("uploaded-files");
    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    /**
     * provides path of file to be uploaded
     * @param absFilePath the complete file path
     */

    public void uploadFile(String absFilePath) {
        driver.findElement(inputField).sendKeys(absFilePath);
        clickUploadButton();
    }

    public String getUploadedFiles(){
        return driver.findElement(uploadedFile).getText();
    }
}
