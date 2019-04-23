package StepDefinitions;

import Tasks.LoginLogoutPageTask;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginLogoutStepDefinitions extends LoginLogoutPageTask {

	@Given("^we are in the festicket login page$")
	public void we_are_in_the_festicket_login_page() throws Throwable {
		gotoLoginPage();
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		clickLoginButton();

	}

	@When("^enter the user name \"([^\"]*)\"$")
	public void enter_the_user_name(String userId) throws Throwable {
		enterUserName(userId);

	}

	@When("^enter the password \"([^\"]*)\"$")
	public void enter_the_password(String password) throws Throwable {
		enterPassword(password);

	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
		clickFinalLoginButton();

	}

	@Then("^we should reach the homepage successfully$")
	public void we_should_reach_the_homepage_successfully() throws Throwable {
		verifyHomePage();
		System.out.println("Login is successful");
		exitBrowser();
	}

	@Given("^We are Logged in with user name \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void we_are_Logged_in_with_user_name_and_password(String userId, String password)  throws Throwable {
		gotoLoginPage();
		clickLoginButton();
		enterUserName(userId);
		enterPassword(password);
		clickFinalLoginButton();
		verifyHomePage();
	}

	@When("^I click on logout button$")
	public void i_click_on_logout_button() throws Throwable {
		clickLogoutButton();
	}

	@Then("^we should log out successfully$")
	public void we_should_log_out_successfully() throws Throwable {
		verifyLogout();
		System.out.println("Log out is successful");
		exitBrowser();
	}
}
