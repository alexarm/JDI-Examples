package org.mytests.uiobjects.example.dataProviders;

import org.testng.annotations.DataProvider;

import static org.mytests.uiobjects.example.enums.Colors.*;

public final class ColorsProvider {

    public ColorsProvider() {
    }

    @DataProvider(name = "colors")
    public static Object[][] colors() {
        return new Object[][]{
                {YELLOW},
                {GREEN},
                {RED},
                {BLUE},
        };
    }
}
