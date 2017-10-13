package org.mytests.uiobjects.example.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropdown;
import com.epam.web.matcher.testng.Assert;
import org.mytests.uiobjects.example.entities.User;
import org.mytests.uiobjects.example.enums.MainMenu;
import org.mytests.uiobjects.example.enums.ServiceMenu;
import org.mytests.uiobjects.example.forms.LoginForm;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.ArrayList;
import java.util.List;

public class Header extends Section {

    public LoginForm loginForm;

    @JDropdown(
            root = @FindBy(css = "ul.navbar-nav.m-l8>li.dropdown"),
            value = @FindBy(css = "a"),
            list = @FindBy(css = "ul>li"))
    public Dropdown<ServiceMenu> serviceMenu;

    @FindBy(css = ".profile-photo")
    public Label profilePhoto;

    @Step
    public void login() {
        profilePhoto.click();
        loginForm.loginAs(new User());
    }

    public Menu<MainMenu> headerMenu = new Menu<>(
            By.cssSelector(".navbar-nav.m-l8"));

    @Step
    public void checkLogin() {
        User user = new User();
        Assert.assertEquals(profilePhoto.getText(),
                user.name.toUpperCase() + " " + user.lastName.toUpperCase());
    }

    @Step
    public void open(MainMenu menu) {
        headerMenu.clickOn(menu);
    }

    public void open(ServiceMenu menu) {
        serviceMenu.select(menu);
    }

    @Step
    public void checkServiceMenu() {
        serviceMenu.expand();
        List<String> options = serviceMenu.getOptions();
        List<String> menuNames = new ArrayList<>();
        for (String name : ServiceMenu.getMenuNames()) {
            menuNames.add(name.toUpperCase());
        }
        Assert.listEquals(options, menuNames);
    }
}
