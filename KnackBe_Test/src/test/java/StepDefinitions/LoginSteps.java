package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {

	@Given("^User should lunch the URL$")
	public void user_should_lunch_the_url() {
		System.out.println("Hi");
	}

	@Then("^User verifies the Title of the Explorer page$")
	public void user_verifies_the_title_of_the_explorer_page() {
		System.out.println("Hi");
	}

	@And("^User should click on Like Button$")
	public void user_should_click_on_like_button() {
		System.out.println("Hi");
		
	}

	@Then("^User should open Login Page$")
	public void user_should_open_login_page() {
		System.out.println("Hi");
	
	}
/*
	@Then("^User should provide  & ^")
	public void user_should_provide() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	*/

	@Then("^User click on login button$")
	public void user_click_on_login_button() {
		System.out.println("Hi");
	
	}

	@Then("^User navigates to login page$")
	public void user_navigates_to_login_page() {
		System.out.println("Hi");
		
	}

	@Then("^User verfies post Details is updated$")
	public void user_verfies_post_details_is_updated() {
		System.out.println("Hi");
	}


}
