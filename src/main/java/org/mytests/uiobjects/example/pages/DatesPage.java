package org.mytests.uiobjects.example.pages;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.web.matcher.testng.Assert;
import org.mytests.uiobjects.example.entities.User;
import org.mytests.uiobjects.example.forms.DatesForm;
import org.mytests.uiobjects.example.sections.RightSection;
import org.mytests.uiobjects.example.util.CalculateMethods;

public class DatesPage extends WebPage{

    public RightSection rightSection;
    public DatesForm form;

    public void checkMandatoryFields(User user) {

        String defaultTime = CalculateMethods.getDefaultTime();

        Assert.assertEquals(form.name.getText(), user.name);
        Assert.assertEquals(form.lastName.getText(), user.lastName);
        Assert.assertEquals(form.description.getText(), user.description);
        Assert.assertEquals(form.period.getText(), "");
        Assert.assertEquals(form.time.getText(), defaultTime);
        Assert.assertEquals(form.leftValue.getText(), "");
        Assert.assertEquals(form.rightValue.getText(), "");
    }

    public void checkAllFields(User user) {
        Assert.assertEquals(form.name.getText(), user.name);
        Assert.assertEquals(form.lastName.getText(), user.lastName);
        Assert.assertEquals(form.description.getText(), user.description);
        Assert.assertEquals(form.period.getText(), user.period);
        Assert.assertEquals(form.time.getText(), user.time);
        Assert.assertEquals(form.leftValue.getText(), user.leftValue);
        Assert.assertEquals(form.rightValue.getText(), user.rightValue);
    }

    public void checkSliders(int leftValue, int rightValue) {
        Assert.assertEquals(form.leftSlider.getText(), leftValue);
        Assert.assertEquals(form.rightSlider.getText(), rightValue);
    }
}
