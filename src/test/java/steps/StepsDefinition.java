package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepsDefinition {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("Navigating to login page");

    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        System.out.println("Entering username and password");

    }

    @Then("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        System.out.println("Verifying login success");
       //  Assert.assertTrue(driver.getTitle().contains("Dashboard"));
    }
}
