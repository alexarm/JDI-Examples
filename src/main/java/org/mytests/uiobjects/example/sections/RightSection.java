package org.mytests.uiobjects.example.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.web.matcher.testng.Assert;
import org.mytests.uiobjects.example.entities.User;
import org.mytests.uiobjects.example.enums.Buttons;
import org.mytests.uiobjects.example.enums.CheckBoxes;
import org.mytests.uiobjects.example.enums.Metals;

public class RightSection extends Section{

    public ResultsSection resultsSection;

    @JFindBy(css = ".logs")
    public Label logs;

    public void checkContactFormLog(User user) {
        if (!user.name.equals(""))
            Assert.assertContains(logs.getValue(), "Name: value changed to " + user.name);
        if (!user.lastName.equals(""))
            Assert.assertContains(logs.getValue(), "LastName: value changed to " + user.lastName);
        if (!user.description.equals(""))
            Assert.assertContains(logs.getValue(), "Description: value changed to " + user.description);
        Assert.assertContains(logs.getValue(), "Summary (Even): value changed to " + user.lowerCheckList);
        Assert.assertContains(logs.getValue(), "Summary (Odd): value changed to " + user.upperCheckList);
        Assert.assertContains(logs.getValue(), "submit:button clicked");
    }

    public void checkDatesPageFullFillLog(User user) {
        if (!user.name.equals(""))
            Assert.assertContains(logs.getValue(), "Name: value changed to " + user.name);
        if (!user.lastName.equals(""))
            Assert.assertContains(logs.getValue(), "LastName: value changed to " + user.lastName);
        if (!user.description.equals(""))
            Assert.assertContains(logs.getValue(), "Description: value changed to " + user.description);
        Assert.assertContains(logs.getValue(), "Period: value changed to " + user.period);
        Assert.assertContains(logs.getValue(), "Time: value changed to " + user.time);
        Assert.assertContains(logs.getValue(), "Range 1(From): value changed to " + user.leftValue);
        Assert.assertContains(logs.getValue(), "Range 1(To): value changed to " + user.rightValue);
        Assert.assertContains(logs.getValue(), "Range 2(From):" + user.leftSlider + " link clicked");
        Assert.assertContains(logs.getValue(), "Range 2(To):" + user.rightSlider + " link clicked");
    }

    public void checkDatesPageMandatoryFillLog(User user) {
        if (!user.name.equals(""))
            Assert.assertContains(logs.getValue(), "Name: value changed to " + user.name);
        if (!user.lastName.equals(""))
            Assert.assertContains(logs.getValue(), "LastName: value changed to " + user.lastName);
        if (!user.description.equals(""))
            Assert.assertContains(logs.getValue(), "Description: value changed to " + user.description);
    }

    public void checkLog(CheckBoxes checkBox, Boolean bool) {
        Assert.assertContains(logs.getValue(),
                checkBox.toString() + ": condition changed to " + bool.toString());
    }

    public void checkLog(Metals metal) {
        Assert.assertContains(logs.getValue(),
                "metal: value changed to " + metal.toString());
    }

    public void checkButtonClickIsInLogs(Buttons button) {
        Assert.assertContains(logs.getValue(), button.logText +":button clicked");
    }

}
