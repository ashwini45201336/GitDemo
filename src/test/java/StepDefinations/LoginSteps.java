package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("user is on login page");
		
		
		
		
	}

	@When("user enters user name and passwored")
	public void user_enters_user_name_and_passwored() {
		System.out.println("user enters user name and passwored");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("clicks on login button");
	}
	
	@And("clicks on login button")
<<<<<<< HEAD
	public void clicks_on_login_button__Ashu1() {
		System.out.println("clicks on login button");
	}
	
	@And("clicks on login button")
	public void clicks_on_login_button__ASHU2() {
=======
	public void clicks_on_logout_button() {
>>>>>>> 01b8eb6de1457993a267389a14d2cc13f2b75a82
		System.out.println("clicks on login button");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("user is navigated to home page");
	}

}
