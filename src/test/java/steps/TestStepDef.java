package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStepDef {
    @Given("^I am in test given$")
    public void step1() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am in test given\n");
//        throw new PendingException(); 
    }

    @When("^I do test when$")
    public void step2() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I do test when\n");
//        throw new PendingException();
    }

    @Then("^I get test then$")
    public void step3() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I get test then\n");
//        throw new PendingException();
    }

}
