package StepDefinition;

import org.testng.Assert;

import Browser.browser;
import Pages.Page1;
import Pages.Page2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class First {
	@Given("User Opens the Browser")
	public void user_opens_the_browser() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   browser.openBrowser();
	}

	@And("User Navigates to the {string} Webpage")
	public void user_navigates_to_the_webpage(String string) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		browser.navigateToUrl(string);
	}

	@Then("User verifies the title of the Webpage")
	public void user_verifies_the_title_of_the_webpage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(Page1.title(), "OrangeHRM");
	}
	@And("User Closes the Browser")
	public void user_closes_the_browser() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   browser.closeBrowser();
	}

}
