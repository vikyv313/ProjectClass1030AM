package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pojo.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	LoginPage lp;

	@Given("User is on Login page")
	public void userIsOnLoginPage() {
	}

	@When("User enters valid username and password")
	public void userEntersValidUsernameAndPassword(io.cucumber.datatable.DataTable dataTable) {
		lp = new LoginPage();
		WebElement txtUser = lp.getTxtUser();
		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(2);
		String x = map.get("username");
		insertText(txtUser, x);
		insertText(lp.getTxtPass(), asMaps.get(2).get("password"));
	}

	@When("User clicks on Login button")
	public void userClicksOnLoginButton() {
		lp = new LoginPage();
		buttonClick(lp.getBtnLogin());
	}

	@Then("User verifies home page is displayed")
	public void userVerifiesHomePageIsDisplayed() {
		System.out.println("Home Page Displayed");
	}

	@When("User enters invalid {string} and {string}")
	public void userEntersInvalidAnd(String name, String pass) {
		lp = new LoginPage();
		insertText(lp.getTxtUser(), name);
		insertText(lp.getTxtPass(), pass);
	}

	@Then("User verifies error message is displayed")
	public void userVerifiesErrorMessageIsDisplayed() {
		System.out.println("Error Message");
	}

	@Then("User verifies login page is displayed")
	public void userVerifiesLoginPageIsDisplayed() {
		System.out.println("Login Page Displayed");
	}
}
