package org.mytests.uiobjects.example.dataProviders;

import org.testng.annotations.DataProvider;

public final class RangeProvider {
    public RangeProvider() {
    }

    @DataProvider(name = "ranges")
    public static Object[][] ranges() {
        return new Object[][]{
                {0, 0},
                {0, 100},
                {100, 100},
                {30, 70},
        };
    }
}
