package org.mytests.uiobjects.example.forms;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.RadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.web.matcher.testng.Assert;
import org.mytests.uiobjects.example.entities.User;
import org.mytests.uiobjects.example.enums.Even;
import org.mytests.uiobjects.example.enums.Odd;

public class SummaryForm extends Form<User> {

    @JFindBy(css = ".horizontal-group:nth-of-type(1)>p")
    public RadioButtons<Odd> oddRadioButtonsLabels;

    @JFindBy(css = ".horizontal-group:nth-of-type(1)>p>input")
    public RadioButtons<Odd> oddRadioButtons;

    @JFindBy(css = ".horizontal-group:nth-of-type(2)>p")
    public RadioButtons<Odd> evenRadioButtonsLabels;

    @JFindBy(css = ".horizontal-group:nth-of-type(2)>p>input")
    public RadioButtons<Odd> evenRadioButtons;

    @JFindBy(xpath = ".//button[text()='Calculate']")
    public Button submit;

    public void selectOdd(Odd value) {
        oddRadioButtonsLabels.select(value.ordinal() + 1);
    }

    public void checkSelected(Odd value) {
        Assert.assertEquals(oddRadioButtons.getSelectedIndex(), value.ordinal() + 1);
    }

    public void selectEven(Even value) {
        evenRadioButtonsLabels.select(value.ordinal() + 1);
    }

    public void checkSelected(Even value) {
        Assert.assertEquals(evenRadioButtons.getSelectedIndex(), value.ordinal() + 1);
    }

}
