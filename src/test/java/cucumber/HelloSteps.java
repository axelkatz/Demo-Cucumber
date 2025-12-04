package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HelloSteps {

    @Given("I say hello")
    public void iSayHello() {
        System.out.println("Hello !");
    }

    @When("you say goodbye")
    public void youSayGoodbye() {
        System.out.println("Goodbye !");
    }

    @Then("I say why")
    public void iSayWhy() {
        System.out.println("Why ?");
    }
}
