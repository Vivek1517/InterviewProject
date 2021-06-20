package stepDefiniton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AuthenticationPage;
import pages.HomePage;

public class AuthenticationSteps {
    AuthenticationPage ap = new AuthenticationPage();
    HomePage hp = new HomePage();
    @Given("user is on the automation practice app")
    public void user_is_on_the_automation_practice_app() {
        Assert.assertTrue(hp.isOnHomePage());

    }
    @When("user clicks on sign in")
    public void user_clicks_on_sign_in() {
        hp.navigateToAuthenticationPage();
    }
    @Then("user should navigate to authentication page")
    public void user_should_navigate_to_authentication_page() {
    Assert.assertTrue(ap.isUSerOnAuthenticationPage());
    }

    @When("user enters a valid email address {string} and clicks on create account page")
    public void userEntersAValidEmailAddressAndClicksOnCreateAccountPage(String email) {
        ap.enterEmailID(email);

    }

    @When("user enters emails address {string}, password {string} and clicks on sign in")
    public void userEntersEmailsAddressPasswordAndClicksOnSignIn(String userName, String pwd) {
        ap.enterUserNamePWD(userName,pwd);
    }

    @Then("user should navigate to my account page")
    public void userShouldNavigateToMyAccountPage() {
        Assert.assertTrue(ap.isOnAccountPage());
    }

    @Then("user should see an error message {string}")
    public void userShouldSeeAnErrorMessage(String expectedMessage) {
        Assert.assertEquals(expectedMessage,ap.validationMessage());
    }
}
