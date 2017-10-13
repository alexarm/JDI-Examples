package org.mytests.tests.example;

import org.mytests.tests.InitTests;
import org.mytests.uiobjects.example.dataProviders.RangeProvider;
import org.mytests.uiobjects.example.dataProviders.UserProvider;
import org.mytests.uiobjects.example.entities.User;
import org.testng.annotations.Test;

import static org.mytests.uiobjects.example.JDIExampleSite.datesPage;

public class DatesPageTests extends InitTests {

    @Test(dataProvider = "users", dataProviderClass = UserProvider.class)
    public void testDatesPageOnlyMandatoryFill(User user) {
        datesPage.open();
        datesPage.checkOpened();

        datesPage.form.onlyMandatory().fill(user);
        datesPage.form.submit.click();
        datesPage.checkMandatoryFields(user);

        datesPage.rightSection.checkDatesPageMandatoryFillLog(user);
    }

    @Test(dataProvider = "users", dataProviderClass = UserProvider.class, groups = "smoke")
    public void testDatesPageFullFormFill(User user) {
        datesPage.open();
        datesPage.checkOpened();

        datesPage.form.setSliders(user.leftSlider, user.rightSlider);
        datesPage.form.submit(user);
        datesPage.checkAllFields(user);
        datesPage.rightSection.resultsSection.checkUserDataOnDatesPage(user);

        datesPage.rightSection.checkDatesPageFullFillLog(user);
    }


    @Test(dataProvider = "ranges", dataProviderClass = RangeProvider.class, groups = "smoke")
    public void testCorrectSlidersWork(int leftValue, int rightValue) {
        datesPage.open();
        datesPage.checkOpened();

        datesPage.form.setSliders(leftValue, rightValue);
        datesPage.form.checkRange(leftValue,rightValue);
    }
}
