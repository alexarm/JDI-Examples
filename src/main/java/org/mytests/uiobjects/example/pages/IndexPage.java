package org.mytests.uiobjects.example.pages;

import com.epam.jdi.uitests.web.selenium.elements.common.Image;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.web.matcher.testng.Assert;
import org.mytests.uiobjects.example.enums.TextsAbove;
import org.mytests.uiobjects.example.enums.TextsUnderPictures;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.List;

import static org.mytests.uiobjects.example.enums.TextsAbove.*;

public class IndexPage extends WebPage {

    @JFindBy(id = "epam_logo")
    public Image epamLogo;

    @JFindBy(css = ".benefit-txt")
    public List<Text> textsUnderIcons;

    @JFindBy(css = ".icons-benefit")
    public List<Image> icons;

    @JFindBy(css = ".main-title")
    public Text mainTitle;

    @JFindBy(css = ".main-txt")
    public Text mainText;

    @Step
    public void checkPictures(){
        for (Image img: icons){
            Assert.assertTrue(img.isDisplayed());
        }
    }

    @Step
    public void checkTextsAbove(){
        Assert.assertEquals(mainText.getText(), MAIN_TXT.text.toUpperCase());
        Assert.assertEquals(mainTitle.getText(), MAIN_TITLE.text.toUpperCase());
    }

    @Step
    public void checkTextsUnderPictures(){
        for (Text textUnderIcon: textsUnderIcons){
            Assert.assertTrue(TextsUnderPictures.getTexts().contains(textUnderIcon.getText()));
        }
    }

    @Step
    public void checkEpamLogo() {
        Assert.isTrue(epamLogo.isDisplayed());
    }

    public void checkInterface(){
        this.checkPictures();
        this.checkTextsUnderPictures();
        this.checkTextsAbove();
        this.checkEpamLogo();
    }

}
