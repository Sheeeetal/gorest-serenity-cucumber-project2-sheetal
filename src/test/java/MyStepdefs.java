import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @When("^User sends a GET request to userID endpoint$")
    public void userSendsAGETRequestToUserIDEndpoint() {
    }

    @Then("^User must get back a valid status code (\\d+)$")
    public void userMustGetBackAValidStatusCode(int arg0) {
    }

    @When("^I create new user by providing the information$")
    public void iCreateNewUserByProvidingTheInformation() {
    }

    @Then("^I must get a valid status code (\\d+)$")
    public void iMustGetAValidStatusCode(int arg0) {
    }

    @When("^I update new user by providing the information$")
    public void iUpdateNewUserByProvidingTheInformation() {
    }

    @Then("^I must get back a valid status code (\\d+)$")
    public void iMustGetBackAValidStatusCode(int arg0) {
    }

    @When("^I delete a DELETE request by providing information$")
    public void iDeleteADELETERequestByProvidingInformation() {
    }

    @Then("^I verify that the status code (\\d+)$")
    public void iVerifyThatTheStatusCode(int arg0) {
    }
}
