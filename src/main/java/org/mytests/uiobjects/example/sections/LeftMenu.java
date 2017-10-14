package org.mytests.uiobjects.example.sections;

import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropdown;
import com.epam.web.matcher.testng.Assert;
import org.mytests.uiobjects.example.enums.ServiceMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.List;

public class LeftMenu extends Section {
    @JDropdown(
            root = @FindBy(css = ".sub-menu"),
            value = @FindBy(css = ".arrow"),
            list = @FindBy(css = "li"))
    public Dropdown<ServiceMenu> serviceMenu;

    public Menu leftMenu = new Menu(By.cssSelector(".sidebar-menu"));

    @Step
    public void checkServiceMenu() {
        serviceMenu.expand();
        List<String> options = serviceMenu.getOptions();
        List<String> menuNames = ServiceMenu.getMenuNames();
        Assert.listEquals(options, menuNames);
    }
}

