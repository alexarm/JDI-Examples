package org.mytests.uiobjects.example.enums;

public enum Metals {
    GOLD("Gold"),
    SILVER("Silver"),
    BRONZE("Bronze"),
    SELEN("Selen");

    public String metal;

    Metals(String metal) {
        this.metal = metal;
    }

    @Override
    public String toString() {
        return metal;
    }
}
