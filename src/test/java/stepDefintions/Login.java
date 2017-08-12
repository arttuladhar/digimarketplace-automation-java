package stepDefintions;

import com.google.gson.JsonObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import env.BaseTest;
import methods.TestCaseFailed;
import pages.TestData;

import javax.xml.bind.util.JAXBSource;

/**
 * Created by batadjanov on 7/29/2017.
 */
public class Login implements BaseTest {
    private TestData testData = new TestData();
    private pages.Login login = new pages.Login();

    @Given("^I'm not a registered user$")
    public void user_config() {
        testData.setInvalidUserCredentials();
    }

    @When("^I attempt to log into Digi Marketplace$")
    public void login() {
        String[] user = testData.getUserCredentials();
        login.navigateToPage();
        login.attemptLogin(user[0], user[1]);
    }

    @Then("^I'm given a notification of failed log in attempt$")
    public void notify_on_login() throws TestCaseFailed {
        boolean isNotificationDisplayed = login.isInvalidLoginNotificationDisplayed();
        assertionObj.isEqual(isNotificationDisplayed, true, "Notification is not displayed");
    }
}