package org.mytests.uiobjects.example.forms;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextArea;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.complex.CheckList;
import com.epam.jdi.uitests.web.selenium.elements.complex.RadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import org.mytests.uiobjects.example.entities.User;

public class ContactForm extends Form<User> {

    @JFindBy(id = "Name")
    public TextField name;

    @JFindBy(id = "LastName")
    public TextField lastName;

    @JFindBy(id = "Description")
    public TextArea description;

    @JFindBy(text = "Submit")
    public Button submit;

    @JFindBy(css = ".horizontal-group:nth-of-type(1)>p")
    public RadioButtons upperCheckList;

    @JFindBy(css = ".horizontal-group:nth-of-type(2)>p")
    public CheckList lowerCheckList;
}
