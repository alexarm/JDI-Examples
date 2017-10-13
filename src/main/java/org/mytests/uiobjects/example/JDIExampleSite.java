package org.mytests.uiobjects.example;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import org.mytests.uiobjects.example.pages.*;
import org.mytests.uiobjects.example.sections.Header;
import org.mytests.uiobjects.example.sections.LeftMenu;

@JSite(domain = "https://epam.github.io/JDI/")
public class JDIExampleSite extends WebSite {

    @JPage(url = "/index.htm", title = "Index Page")
    public static IndexPage indexPage;

    @JPage(url = "/page1.htm", title = "Contact Form")
    public static ContactPage contactPage;

    @JPage(url = "/page3.htm", title = "Support")
    public static SupportPage supportPage;

    @JPage(url = "/page4.htm", title = "Dates")
    public static DatesPage datesPage;

    @JPage(url = "/page5.htm", title = "Complex Table")
    public static ComplexTablePage complexTablePage;

    @JPage(url = "/page6.htm", title = "Simple Table")
    public static SimpleTablePage simpleTablePage;

    @JPage(url = "/page7.htm", title = "Table with pages")
    public static TableWithPagesPage tableWithPagesPage;

    @JPage(url = "/page8.htm", title = "Different Element")
    public static DifferentElementsPage differentElementsPage;

    @JPage(url = "/page2.htm", title = "Metal and Colors")
    public static MetalsAndColorsPage metalsAndColorsPage;

    public static Header header;

    public static LeftMenu sidebar;

}
