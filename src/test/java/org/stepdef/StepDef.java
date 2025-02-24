package org.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDef {
	@Given("user is on facebook application in chrome")
	public void user_is_on_facebook_application_in_chrome() {
		System.out.println("Facebook in chrome browser");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("user enter username and password");
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		System.out.println("Login button");
	}

	@When("user enrer valid username and invalid password")
	public void user_enrer_valid_username_and_invalid_password() {
		System.out.println("Valid username and invalud password");
	}
}
