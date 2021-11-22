package com.mindtree.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.mindtree.pageobjects.AllItem;
import com.mindtree.reusablecomponent.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllofItstepDefinition extends Base{

	public static Logger log= LogManager.getLogger(Base.class.getName());

	AllItem ai=new AllItem(driver);

	@And("Clicks on AllOfIt Section from Navigation Bar")
	public void clicks_on_all_of_it_section_from_navigation_bar() {
		// Write code here that turns the phrase above into concrete actions
		test.info("Clicking on All Of It section from Navigation Bar");

		ai.getAllofIt().click();
	}

	@Then("A page with product should be displayed")
	public void a_page_with_product_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		log.info("Clicking on All Of It section from Navigation Bar");
	}

	@When("the Product is displayed Click on Next Page arrow Button")
	public void the_product_is_displayed_click_on_next_page_arrow_button() {
		// Write code here that turns the phrase above into concrete actions
		test.info("Clicking on next page button");
		log.info("Clicking on next page button");
		ai.getNextPage().click();
	}

	@Then("The user should be taken to second page of product results")
	public void the_user_should_be_taken_to_second_page_of_product_results() {
		// Write code here that turns the phrase above into concrete actions
		log.info("Verifying Next Page is displayed");
		Assert.assertTrue(ai.getNewItem().isDisplayed());


	}

}
