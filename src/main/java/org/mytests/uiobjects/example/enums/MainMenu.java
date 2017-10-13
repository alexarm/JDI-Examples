package org.mytests.uiobjects.example.enums;

public enum MainMenu {
    HOME("Home"),
    CONTACT_FORM("Contact form"),
    SERVICE("Service"),
    METALS_AND_COLORS("Metals & Colors");

    public String page;

    MainMenu(String page) {
        this.page = page;
    }
}
