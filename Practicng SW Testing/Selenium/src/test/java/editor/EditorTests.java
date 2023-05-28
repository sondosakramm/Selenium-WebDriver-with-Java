package editor;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class EditorTests extends BaseTests {
    @Test
    public void writeTextTest(){
        var editorPage = homePage.clickWYSIWYGPage();
        String text = "Hello";
        String text2 = " World";
        editorPage.clearTextArea();
        editorPage.writeInTextArea(text);
        editorPage.increaseIndent();
        editorPage.writeInTextArea(text2);
        assertEquals(editorPage.getTextFromEditor(),
                text+text2, "Incorrect text");
    }
}
