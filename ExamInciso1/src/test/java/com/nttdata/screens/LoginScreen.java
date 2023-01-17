package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;
public class LoginScreen extends PageObject {
        @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
        private WebElement userTextBox;

        @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
        private WebElement passTextBox;

        @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
        private WebElement loginButton;

        public void clickName() {
            getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
            System.out.println("Paso los 8 Segundos");
            userTextBox.click();
        }

        public void sendName(String name) {
            getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
            System.out.println("Entro");
            userTextBox.sendKeys(name);
        }

        public void clickPass() {
            getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
            passTextBox.click();
        }

        public void sendPassword(String password) {
            getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
            passTextBox.sendKeys(password);
        }

        public void clickLogon() {
            getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
            loginButton.click();
        }









}
