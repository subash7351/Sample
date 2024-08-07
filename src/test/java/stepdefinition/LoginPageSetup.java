package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSetup {
	@Given("Login to the application")
	public void login_to_the_application() {
		System.out.println("LoginPage");
	   	}
	@When("Enter the username {string}")
	public void enter_the_username(String user) {
		System.out.println(user);
	    	}
	@When("Enter the password {string}")
	public void enter_the_password(String pass) {
	    System.out.println(pass);
	}
	@When("Click the login button")
	public void click_the_login_button() {
		System.out.println("LoginButton");
	    
	}
	@Then("Validate the homepage")
	public void validate_the_homepage() {
	    System.out.println("HomePage");
	}



}
