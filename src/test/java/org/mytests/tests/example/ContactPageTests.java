package org.mytests.tests.example;

import org.mytests.tests.InitTests;
import org.mytests.uiobjects.example.dataProviders.SummaryValuesProvider;
import org.mytests.uiobjects.example.dataProviders.UserProvider;
import org.mytests.uiobjects.example.entities.User;
import org.mytests.uiobjects.example.enums.Even;
import org.mytests.uiobjects.example.enums.Odd;
import org.testng.annotations.*;

import static org.mytests.uiobjects.example.JDIExampleSite.*;

public class ContactPageTests extends InitTests{

    @Test(dataProvider = "users", dataProviderClass = UserProvider.class, groups = "smoke")
    public void testContactFormCorrectFill(User user){
        contactPage.open();
        contactPage.checkOpened();

        contactPage.contactForm.submit(user);
        contactPage.rightSection.checkContactFormLog(user);
        contactPage.rightSection.resultsSection.checkUserDataOnContactForm(user);
    }

    @Test(dataProvider = "summaryValues", dataProviderClass = SummaryValuesProvider.class, groups = "smoke")
    public void testSummaryForm(Odd oddValue, Even evenValue) {
        contactPage.open();
        contactPage.checkOpened();

        contactPage.summaryForm.selectOdd(oddValue);
        contactPage.summaryForm.checkSelected(oddValue);

        contactPage.summaryForm.selectEven(evenValue);
        contactPage.summaryForm.checkSelected(evenValue);

        contactPage.summaryForm.submit.click();
        contactPage.rightSection.resultsSection.checkSummaryFormResult(oddValue, evenValue);
    }
}
