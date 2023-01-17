package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class HomeScreen extends PageObject {

    @AndroidFindBy(className = "android.widget.TextView")
    private WebElement title;

    public String getText() {
        return title.getText();
    }

}
