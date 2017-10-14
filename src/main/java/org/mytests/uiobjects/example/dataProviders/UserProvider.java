package org.mytests.uiobjects.example.dataProviders;

import org.mytests.uiobjects.example.entities.User;
import org.testng.annotations.DataProvider;

public final class UserProvider {
    public UserProvider() {
    }

    @DataProvider(name = "users")
    public static Object[][] users() {
        return new Object[][]{
                {new User()},
                {new User("Harry", "Potter", "Vingardium leviossa")},
                {new User("", "", "")},
        };
    }
}
