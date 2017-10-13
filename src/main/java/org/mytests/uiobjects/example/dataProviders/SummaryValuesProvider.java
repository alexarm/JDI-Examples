package org.mytests.uiobjects.example.dataProviders;

import org.testng.annotations.DataProvider;

import static org.mytests.uiobjects.example.enums.Even.*;
import static org.mytests.uiobjects.example.enums.Odd.*;

public final class SummaryValuesProvider {
    public SummaryValuesProvider() {
    }

    @DataProvider(name = "summaryValues")
    public static Object[][] summary() {
        return new Object[][]{
                {ONE, TWO},
                {ONE, FOUR},
                {ONE, SIX},
                {ONE, EIGHT},
                {THREE, TWO},
                {THREE, FOUR},
                {THREE, SIX},
                {THREE, EIGHT},
                {FIVE, TWO},
                {FIVE, FOUR},
                {FIVE, SIX},
                {FIVE, EIGHT},
                {SEVEN, TWO},
                {SEVEN, FOUR},
                {SEVEN, SIX},
                {SEVEN, EIGHT},
        };
    }
}
