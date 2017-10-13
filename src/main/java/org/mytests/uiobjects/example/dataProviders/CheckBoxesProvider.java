package org.mytests.uiobjects.example.dataProviders;

import org.testng.annotations.DataProvider;

import static org.mytests.uiobjects.example.enums.CheckBoxes.*;

public final class CheckBoxesProvider {
    public CheckBoxesProvider() {
    }

    @DataProvider(name = "checkBoxes")
    public static Object[][] checkBoxes() {
        return new Object[][]{
                {WATER},
                {WIND},
                {EARTH},
                {FIRE},
        };
    }
}
