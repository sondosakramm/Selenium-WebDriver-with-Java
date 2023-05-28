package fileupload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void fileUploadTest() {
        var fileUploadPage = homePage.clickFileUploadPage();
        fileUploadPage.uploadFile("C:\\Users\\Sondos\\Desktop\\Practicng SW Testing\\Selenium\\resources\\chromedriver.exe");
        assertEquals(fileUploadPage.getUploadedFiles(),"chromedriver.exe", "incorrect");
    }
}
