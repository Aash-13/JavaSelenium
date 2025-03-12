package StepDefinition;

import org.testng.Assert;

import Browser.browser;
import Pages.Page1;
import Pages.Page2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario2 {
	@When("User Enters {string} UserName")
	public void user_enters_user_name(String string) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Page1.userNameEnter(string);
	}

	@And("User Enters {string} Password")
	public void user_enters_password(String string) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   Page1.userPasswordEnter(string);
	}

	@Then("User Clicks on Login Button")
	public void user_clicks_on_login_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   Page1.clickLogin();
	}
	@Then("User verifies ProfileAccount")
	public void user_verifies_profile_account() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(Page2.UserCheck(), "Ankit Singh");
	}
	
	@And("User Clicks on One of the Menu Displayed")
	public void user_clicks_on_one_of_the_menu_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    Page2.clickOnMenu();
	}
}
