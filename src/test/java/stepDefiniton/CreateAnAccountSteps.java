package stepDefiniton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CreateAnAccountPage;

public class CreateAnAccountSteps {
    CreateAnAccountPage cp = new CreateAnAccountPage();

    @Then("user should navigate to create an account page")
    public void user_should_navigate_to_create_an_account_page() {
        Assert.assertTrue(cp.onCreateAccountPage());
    }
    @When("user selects title as {string}, enters first name {string}, last name {string} and {string}")
    public void userSelectsTitleAsEntersFirstNameLastNameAnd(String title, String firstName, String lastName, String password) {
        cp.selectTitle(title,firstName,lastName,password);

    }

    @And("user selects DOB, date {string}, month {string} and {string} and select signup for news letter and recive special offers")
    public void userSelectsDOBDateMonthAndAndSelectSignupForNewsLetterAndReciveSpecialOffers(String date, String month, String year) {
    cp.selectDOB(date,month,year);
    }

    @And("user enters address {string}, city {string}, selects {string}, enters post code {string}")
    public void userEntersAddressCitySelectsEntersPostCode(String address, String city, String state, String postCode) {
        cp.enterAddress(address,city,state,postCode);
    }
    @And("user selects country {string}")
    public void userSelectsCountry(String country) {
       cp.selectCountry(country);

    }
    @When("user enter {string}")
    public void user_enter(String number) {
    cp.enterNumber(number);
    }
    @And("user clicks on register")
    public void userClicksOnRegister() {
        cp.clickRegister();
    }


    @Then("user should be able to register sucessfully")
    public void user_should_be_able_to_register_sucessfully() {
        Assert.assertTrue(cp.myAccountMessage());

    }

    @Then("user should see a validation message {string}")
    public void userShouldSeeAValidationMessage(String expectedMessage) {
        Assert.assertEquals(expectedMessage,cp.errorMessage());
    }
}
