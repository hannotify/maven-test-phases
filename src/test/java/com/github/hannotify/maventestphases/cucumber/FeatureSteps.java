package com.github.hannotify.maventestphases.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FeatureSteps {
    @Given("today is Sunday")
    public void today_is_Sunday() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(string);
    }
}
