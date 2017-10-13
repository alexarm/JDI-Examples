package org.mytests.tests.example;

import org.mytests.tests.InitTests;
import org.mytests.uiobjects.example.dataProviders.CheckBoxesProvider;
import org.mytests.uiobjects.example.dataProviders.ColorsProvider;
import org.mytests.uiobjects.example.dataProviders.MetalsProvider;
import org.mytests.uiobjects.example.enums.CheckBoxes;
import org.mytests.uiobjects.example.enums.Colors;
import org.mytests.uiobjects.example.enums.Metals;
import org.testng.annotations.Test;

import static org.mytests.uiobjects.example.JDIExampleSite.differentElementsPage;
import static org.mytests.uiobjects.example.enums.Buttons.BUTTON;
import static org.mytests.uiobjects.example.enums.Buttons.DEFAULT_BUTTON;

public class DifferentElementsPageTests extends InitTests {

    @Test(dataProvider = "colors", dataProviderClass = ColorsProvider.class, groups = "smoke")
    public void testColorDropdownCorrectWork(Colors color) {
        differentElementsPage.open();
        differentElementsPage.checkOpened();

        differentElementsPage.colorsDropdown.select(color);
        differentElementsPage.checkDropdownSelection(color, true);
    }

    @Test(dataProvider = "checkBoxes", dataProviderClass = CheckBoxesProvider.class)
    public void testCheckBoxesCorrectWork(CheckBoxes checkBox) {
        differentElementsPage.open();
        differentElementsPage.checkOpened();

        differentElementsPage.selectCheckBox(checkBox);
        differentElementsPage.checkSelected(checkBox, true);

        differentElementsPage.rightSection.checkLog(checkBox, true);

        differentElementsPage.selectCheckBox(checkBox);
        differentElementsPage.checkSelected(checkBox, false);

        differentElementsPage.rightSection.checkLog(checkBox, false);
    }

    @Test(groups = "smoke")
    public void testAllCheckBoxesCanBeSelected() {
        differentElementsPage.open();
        differentElementsPage.checkOpened();

        differentElementsPage.selectAllCheckBoxes();
        differentElementsPage.checkAllCheckBoxesSelectedOrNotSelected(true);

        differentElementsPage.selectAllCheckBoxes();
        differentElementsPage.checkAllCheckBoxesSelectedOrNotSelected(false);

    }

    @Test(dataProvider = "metals", dataProviderClass = MetalsProvider.class, groups = "smoke")
    public void testRadioButtonsCorrectWork(Metals metal) {
        differentElementsPage.open();
        differentElementsPage.checkOpened();

        differentElementsPage.selectRadio(metal);
        differentElementsPage.checkSelected(metal, true);

        differentElementsPage.rightSection.checkLog(metal);
    }

    @Test
    public void testCorrectButtonsWork() {
        differentElementsPage.open();
        differentElementsPage.checkOpened();

        differentElementsPage.button.checkTitle("Button");
        differentElementsPage.button.click();

        differentElementsPage.rightSection.checkButtonClickIsInLogs(BUTTON);

        differentElementsPage.defaultButton.checkTitle("DEFAULT BUTTON");
        differentElementsPage.defaultButton.click();

        differentElementsPage.rightSection.checkButtonClickIsInLogs(DEFAULT_BUTTON);

    }
}
