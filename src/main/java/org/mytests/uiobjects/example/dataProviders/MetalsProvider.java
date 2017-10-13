package org.mytests.uiobjects.example.dataProviders;

import org.testng.annotations.DataProvider;

import static org.mytests.uiobjects.example.enums.Metals.*;

public final class MetalsProvider {
    public MetalsProvider() {
    }

    @DataProvider(name = "metals")
    public static Object[][] metals() {
        return new Object[][]{
                {GOLD},
                {SILVER},
                {BRONZE},
                {SELEN},
        };
    }
}
