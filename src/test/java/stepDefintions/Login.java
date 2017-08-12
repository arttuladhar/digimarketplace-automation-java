package stepDefintions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import env.BaseTest;
import methods.TestCaseFailed;

/**
 * Created by batadjanov on 7/29/2017.
 */
public class Login implements BaseTest {

    @Given("^I'm not a registered user$")
    public void user_config() {

    }

    @When("^I attempt to log into Digi Marketplace$")
    public void login() {
        navigationObj.navigateTo("http://digimarketplace.aayushtuladhar.com");
    }

    @Then("^I'm given a notification of failed log in attempt$")
    public void notify_on_login() throws TestCaseFailed {
        assertionObj.equals("http://digimarketplace.aayushtuladhar.com");
    }
}