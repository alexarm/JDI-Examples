package org.mytests.uiobjects.example.enums;

import java.util.ArrayList;

public enum ServiceMenu {
    SUPPORT("Support"),
    DATES("Dates"),
    COMPLEX_TABLE("Complex Table"),
    SIMPLE_TABLE("Simple Table"),
    TABLE_WITH_PAGES("Table with pages"),
    DIFFERENT_ELEMENTS("Different elements");

    public String page;

    ServiceMenu(String page) {
        this.page = page;
    }

    public static ArrayList<String> getMenuNames() {
        ArrayList<String> names = new ArrayList<String>();

        for (int i = 0; i < ServiceMenu.values().length; i++) {
            names.add(ServiceMenu.values()[i].page);
        }

        return names;
    }
}
