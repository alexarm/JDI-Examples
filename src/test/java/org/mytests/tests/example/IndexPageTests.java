package org.mytests.tests.example;

import org.mytests.tests.InitTests;
import org.testng.annotations.Test;

import static org.mytests.uiobjects.example.JDIExampleSite.*;

public class IndexPageTests extends InitTests {

    @Test(groups = "smoke")
    public void testLogin() {
        indexPage.open();
        indexPage.checkOpened();
        header.checkLogin();
    }

    @Test(groups = "smoke")
    public void testUserInterfaceOnHomePage() {
        indexPage.checkInterface();
        header.checkServiceMenu();
        sidebar.checkServiceMenu();
    }

}
