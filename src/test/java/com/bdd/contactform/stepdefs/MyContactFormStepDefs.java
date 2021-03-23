package com.bdd.contactform.stepdefs;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import com.bdd.contactform.pages.MyContactFormHome;

import org.junit.Assert;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.After;


public class MyContactFormStepDefs {
	private WebDriver driver;
	private MyContactFormHome home;
	
	@Before
	public void createDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Given ("I am on the mycontact website")
	public void iAmOnTheMycontactWebsite() {
		home = new MyContactFormHome(driver);	
	}
	@When("I fill in the required fields and click submit")
	public void iFillInTheRequiredFieldsAndClickSubmit(List<String> fields) {
		home.getYourName().sendKeys(fields.get(0));
		home.getEmail().sendKeys(fields.get(1));
		home.getMessage().sendKeys(fields.get(2));
		home.getSubmitButton().click();
	}
	@When("I enter {string}, {string}, and {string}")
	public void iEnter(String name, String email, String msg) {
		home.getYourName().sendKeys(name);
		home.getEmail().sendKeys(email);
		home.getMessage().sendKeys(msg);
		home.getSubmitButton().click();
	}
	@Then("I should be redirected to a thank you page")
	public void iShouldBeRedirectedToAThankYouPage() {
		Assert.assertEquals(home.getThankYou().getText(), "Thank You");
	}
	@After
	public void deleteDriver() {
		driver.quit();
	}
}
