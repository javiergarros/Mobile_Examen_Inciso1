package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SwagLabsSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class SwaglabsStepsDefs {

    @Steps
    SwagLabsSteps swagLabsSteps;

    @Given("Get in the login page")
        public void getInApp() {
    }

    @When("Sign in with the user credentials, user:{string} & password:{string}")
    public void userParamters(String name, String password) {
        swagLabsSteps.clickButton();
        swagLabsSteps.sendName(name);
        swagLabsSteps.clickPassword();
        swagLabsSteps.sendPassword(password);
        swagLabsSteps.loginButton();
    }

    @Then("Validate the title of home page should be {string}")
    public void nameTitle(String title) {
        System.out.println("Entro 3");
        Assert.assertEquals(swagLabsSteps.titleName(), title);
    }

    @And("Check if exist items in  the store")
        public void itemsStore() {

        }

}
