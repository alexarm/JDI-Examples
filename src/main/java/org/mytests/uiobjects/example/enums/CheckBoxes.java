package org.mytests.uiobjects.example.enums;

import java.util.ArrayList;

public enum CheckBoxes {
    WATER("Water"),
    EARTH("Earth"),
    WIND("Wind"),
    FIRE("Fire");

    public String label;

    CheckBoxes(String label) {
        this.label = label;
    }

    public static ArrayList<String> getCheckBoxesLabels() {
        ArrayList<String> labels = new ArrayList<String>();

        for (int i = 0; i < CheckBoxes.values().length; i++) {
            labels.add(CheckBoxes.values()[i].label);
        }

        return labels;
    }

    @Override
    public String toString() {
        return label;
    }
}
