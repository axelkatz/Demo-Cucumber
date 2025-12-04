package cucumber;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberSteps {
    @Given("there are {int} cucumbers")
    public void thereAreStartCucumbers(int number) {
        System.out.println("There are " + number + " cucumbers.");
    }

    @When("I eat {int} cucumbers")
    public void iEatEatCucumbers(int number) {
        System.out.println("I eat " + number + " cucumbers.");
    }

    @Then("I should have {int} cucumbers")
    public void iShouldHaveLeftCucumbers(int number) {
        System.out.println("I should have " + number + " cucumbers.");
    }

    @Given("I have {int} cucumbers")
    public void iHaveAvailableCucumbers(int number) {
        System.out.println(number);
    }
}
