package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropdownTests extends BaseTests {
    @Test
    public void testSelectedOption() {
        var dropdownPage = homePage.clickDropdown();
        String option = "Option 1";
        dropdownPage.select(option);
        var selectedOptios = dropdownPage.getSelectedOptions();

        assertEquals(selectedOptios.size(),
                1,
                "Incorrect Number Of Selections");

        assertTrue(selectedOptios.contains(option),
                "Option Not Selected");
    }
}
