package com.mindtree.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import com.mindtree.pageobjects.SearchItem;
import com.mindtree.reusablecomponent.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SearchBarstepDefinition extends Base {

	public static Logger log= LogManager.getLogger(Base.class.getName());

	SearchItem si=new SearchItem(driver);

	@And("^User pass the input into search box and press Enter$")
	public void user_pass_the_input_into_search_box_and_press_enter() throws Throwable {

		log.info("Entering text into the search bar");
		test.info("Entering text into the search bar");

		si.getSearchBar().click();
		Thread.sleep(5000);
		si.getSearchBar().sendKeys("Iron Man",Keys.ENTER);
		Thread.sleep(5000);

	}

	@Then("^The relevant products should be displayed onto the screen$")
	public void the_relevant_products_should_be_displayed_onto_the_screen() throws Throwable {

		log.info("Product displayed");

		Assert.assertTrue(si.getSearchItem().isDisplayed());

	}


}
