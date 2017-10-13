package org.mytests.uiobjects.example.enums;

public enum Odd {
    ONE(1),
    THREE(3),
    FIVE(5),
    SEVEN(7);

    public int value;

    Odd(int value) {
        this.value = value;
    }
}
