package com.nttdata.steps;

import com.nttdata.screens.HomeScreen;
import com.nttdata.screens.LoginScreen;
import net.thucydides.core.annotations.Step;
public class SwagLabsSteps {
        LoginScreen loginScreen;
        HomeScreen homeScreen;

        @Step("Click name")
        public void clickButton() {
            loginScreen.clickName();
        }

        @Step("Pass name")
        public void sendName(String name) {
            loginScreen.sendName(name);
        }

        @Step("Pass Password")
        public void clickPassword() {
            loginScreen.clickPass();
        }

        @Step("Send Password")
        public void sendPassword(String password) {
            loginScreen.sendPassword(password);
        }

        @Step("Login to System")
        public void loginButton() {
            loginScreen.clickLogon();
        }

        @Step("Get Name Title")
        public String titleName() {
           return homeScreen.getText();
        }
}
