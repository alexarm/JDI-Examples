package org.mytests.uiobjects.example.enums;

public enum Buttons {
    DEFAULT_BUTTON("Default Button"),
    SUBMIT_BUTTON("submit"),
    CALCULATE_BUTTON("submit"),
    METALS_AND_COLORS_SUBMIT_BUTTON("submit-button"),
    METALS_AND_COLORS_CALCULATE_BUTTON("calculate-button"),
    BUTTON("button");

    public String logText;

    Buttons(String logText) {
        this.logText = logText;
    }
}
