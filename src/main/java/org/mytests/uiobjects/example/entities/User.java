package org.mytests.uiobjects.example.entities;

import com.epam.commons.DataClass;

public class User extends DataClass {
    public String login = "epam";
    public String password = "1234";

    public String name = "Piter";
    public String lastName = "Chailovskii";
    public String description = "Per aspera ad astra";

    public String period = "07/11/2013";
    public String time = "7:32 AM";

    public String leftValue = "24";
    public String rightValue = "43";

    public int upperCheckList = 1;
    public int lowerCheckList = 6;

    public int leftSlider = 25;
    public int rightSlider = 57;

    public User(String name, String lastName, String description) {
        this.name = name;
        this.lastName = lastName;
        this.description = description;
    }

    public User() {
    }
}
