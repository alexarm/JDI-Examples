package org.mytests.uiobjects.example.forms;

import com.epam.jdi.uitests.core.annotations.Mandatory;
import com.epam.jdi.uitests.web.selenium.elements.base.Element;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.common.TextArea;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.web.matcher.testng.Assert;
import org.mytests.uiobjects.example.entities.User;
import org.mytests.uiobjects.example.util.CalculateMethods;

public class DatesForm extends Form<User> {

    @Mandatory
    @JFindBy(id = "Name")
    public TextField name;

    @Mandatory
    @JFindBy(id = "LastName")
    public TextField lastName;

    @Mandatory
    @JFindBy(id = "Description")
    public TextArea description;

    @JFindBy(text = "Submit")
    public Button submit;

    @JFindBy(css = ".ui-slider-handle:nth-of-type(1)")
    public Label leftSlider;

    @JFindBy(css = ".ui-slider-handle:nth-of-type(2)")
    public Label rightSlider;

    @JFindBy(css = ".ui-slider")
    public Element sliderTrack;

    @JFindBy(css = "div.range-from>input:nth-of-type(1)")
    public TextField leftValue;

    @JFindBy(css = "div.range-from>input:nth-of-type(2)")
    public TextField rightValue;

    @JFindBy(css = "#datepicker>input")
    public TextField period;

    @JFindBy(css = "#timepicker")
    public TextField time;

    public void setSliders(int leftValue, int rightValue) {
        leftSlider.dragAndDropBy(CalculateMethods.getOffset(leftValue, sliderTrack, leftSlider), 0);
        rightSlider.dragAndDropBy(CalculateMethods.getOffset(rightValue, sliderTrack, rightSlider), 0);
    }

    public void checkRange(int leftValue, int rightValue) {
        Assert.assertEquals(leftSlider.getText(), String.valueOf(leftValue));
        Assert.assertEquals(rightSlider.getText(), String.valueOf(rightValue));
    }
}
