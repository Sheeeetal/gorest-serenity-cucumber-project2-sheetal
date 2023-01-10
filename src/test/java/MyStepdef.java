import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdef {
    @Given("^Gorest application is running$")
    public void gorestApplicationIsRunning() {
    }

    @When("^When I create a new user by providing the information name \"([^\"]*)\" email \"([^\"]*)\" gender \"([^\"]*)\" status \"([^\"]*)\"token\"([^\"]*)\"$")
    public void whenICreateANewUserByProvidingTheInformationNameEmailGenderStatusToken(String arg0, String arg1, String arg2, String arg3, String arg4) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I verify that the user with \"([^\"]*)\" is created$")
    public void iVerifyThatTheUserWithIsCreated(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I update the user with information name \"([^\"]*)\" email \"([^\"]*)\" gender \"([^\"]*)\" status \"([^\"]*)\"$")
    public void iUpdateTheUserWithInformationNameEmailGenderStatus(String arg0, String arg1, String arg2, String arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^The user is updated successfully$")
    public void theUserIsUpdatedSuccessfully() {
    }

    @And("^I delete the user with userId$")
    public void iDeleteTheUserWithUserId() {
    }

    @Then("^The user deleted successfully from the application$")
    public void theUserDeletedSuccessfullyFromTheApplication() {
    }
}
