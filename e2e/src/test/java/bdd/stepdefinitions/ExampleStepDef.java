package bdd.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Step definitions for an example scenario.
 */
public class ExampleStepDef {

  /**
   * Specifies the precondition for the scenario.
   */
  @Given("a precondition")
  public void aPrecondition() {
    System.out.println("Precondition happened!");
  }

  /**
   * Specifies the action that occurs during the scenario.
   */
  @When("an action occurs")
  public void anActionOccurs() {
    System.out.println("An action happened!");
  }

  /**
   * Specifies the expected outcome for the scenario.
   */
  @Then("an outcome is expected")
  public void anOutcomeIsExpected() {
    System.out.println("An outcome happened!");
  }
}
