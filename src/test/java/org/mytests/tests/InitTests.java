package org.mytests.tests;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.settings.WebSettings;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import org.mytests.uiobjects.example.JDIExampleSite;
import org.testng.annotations.*;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;

public class InitTests extends TestNGBase {

    @BeforeSuite(alwaysRun = true)
    public static void setUp() {
        WebSite.init(JDIExampleSite.class);
        logger.info("Run Tests");
    }

    @BeforeClass(alwaysRun = true)
    public void start() {
        JDIExampleSite.indexPage.open();
        JDIExampleSite.header.login();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        WebSettings.getDriverFactory().close();
    }
}
