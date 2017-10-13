package org.mytests.uiobjects.example.pages;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.CheckList;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.complex.RadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.web.matcher.testng.Assert;
import org.mytests.uiobjects.example.enums.CheckBoxes;
import org.mytests.uiobjects.example.enums.Colors;
import org.mytests.uiobjects.example.enums.Metals;
import org.mytests.uiobjects.example.sections.RightSection;
import org.openqa.selenium.By;

@JPage(url = "/page8.htm", title = "Different Element")
public class DifferentElementsPage extends WebPage{

    public RightSection rightSection;

    public Dropdown<Colors> colorsDropdown = new Dropdown(By.cssSelector(".colors>select"));

    @JFindBy(css = ".label-checkbox>input")
    public CheckList<CheckBoxes> checkBoxes;

    @JFindBy(css = ".label-radio>input")
    public RadioButtons<Metals> metals;

    @JFindBy(xpath = "//input[@type='button']")
    public Button button;

    @JFindBy(name = "Default Button")
    public Button defaultButton;

    public void selectCheckBox(CheckBoxes checkBox) {
        checkBoxes.select(checkBox.ordinal()+1);
    }

    public void selectRadio(Metals metal) {
        metals.select(metal.ordinal()+1);
    }

    public void selectAllCheckBoxes() {
        for (CheckBoxes checkBox : CheckBoxes.values()) {
            checkBoxes.select(checkBox.ordinal()+1);
        }
    }

    public void checkAllCheckBoxesSelectedOrNotSelected(Boolean status) {
        for (CheckBoxes checkBox : CheckBoxes.values()) {
            this.checkSelected(checkBox, status);
        }
    }

    public void checkDropdownSelection(Colors color, Boolean bool){
        Assert.assertEquals(colorsDropdown.isSelected(color), bool);
    }

    public void checkSelected(CheckBoxes checkBox, Boolean bool) {
        Assert.assertEquals(checkBoxes.getElementsFromTag().get(checkBox.ordinal()).isSelected(), bool);
    }

    public void checkSelected(Metals metal, Boolean bool) {
        Assert.assertEquals(metals.getElementsFromTag().get(metal.ordinal()).isSelected(), bool);
    }



}
