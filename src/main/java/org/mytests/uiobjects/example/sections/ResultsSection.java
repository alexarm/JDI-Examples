package org.mytests.uiobjects.example.sections;


import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.web.matcher.testng.Assert;
import org.mytests.uiobjects.example.entities.User;
import org.mytests.uiobjects.example.enums.Even;
import org.mytests.uiobjects.example.enums.Odd;


public class ResultsSection extends Section {
    @JFindBy(css = ".summ-res")
    public Label summary;

    @JFindBy(css = "li.name-res")
    public Label name;

    @JFindBy(css = ".lname-res")
    public Label lastName;

    @JFindBy(css = ".descr-res")
    public Label description;

    @JFindBy(css = ".date-res")
    public Label date;

    @JFindBy(css = ".time-res")
    public Label time;

    @JFindBy(css = ".range-res")
    public Label range;

    @JFindBy(css = ".slider-res")
    public Label slider;

    public void checkUserDataOnContactForm(User user) {
        if (!user.name.equals(""))
            Assert.assertEquals(name.getText(), "Name: " + user.name);
        if (!user.lastName.equals(""))
            Assert.assertEquals(lastName.getText(), "Last Name: " + user.lastName);
        if (!user.description.equals(""))
            Assert.assertEquals(description.getText(), "Description: " + user.description);
        Assert.assertEquals(summary.getText(),
                "Summary: " + String.valueOf(user.upperCheckList + user.lowerCheckList));
    }

    public void checkUserDataOnDatesPage(User user) {
        if (!user.name.equals(""))
            Assert.assertEquals(name.getText(), "Name: " + user.name);
        if (!user.lastName.equals(""))
            Assert.assertEquals(lastName.getText(), "Last Name: " + user.lastName);
        if (!user.description.equals(""))
            Assert.assertEquals(description.getText(), "Description: " + user.description);
        Assert.assertEquals(date.getText(), "Period: " + user.period);
        Assert.assertEquals(time.getText(), "Time: " + user.time);
        Assert.assertEquals(range.getText(),
                "Range 1: from " + String.valueOf(user.leftValue) + " to " + String.valueOf(user.rightValue));
        Assert.assertEquals(slider.getText(),
                "Range 2: from " + String.valueOf(user.leftSlider) + " to " + String.valueOf(user.rightSlider));
    }

    public void checkSummaryFormResult(Odd odd, Even even) {
        Assert.assertEquals(summary.getText(),
                "Summary: " + String.valueOf(odd.value + even.value));
    }
}
