package stepDefiniton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;

public class HomeSteps {
    HomePage hp = new HomePage();
    @When("user provides valid email {string}")
    public void userProvidesValidEmail(String email) {
        hp.enterEmailForNewsletter(email);
    }

    @And("user clicks on next arrow")
    public void userClicksOnNextArrow() {
        hp.clickOnNext();
    }

    @Then("user should see a sucessful message {string}")
    public void userShouldSeeASucessfulMessage(String expectedMessage) {
        Assert.assertEquals(expectedMessage,hp.newsLetterSucessMessage());
    }

    @Then("user should see a message {string}")
    public void userShouldSeeAMessage(String expectedMessage) {
        Assert.assertEquals(expectedMessage,hp.newsLetterErrorMessage());
    }
}
