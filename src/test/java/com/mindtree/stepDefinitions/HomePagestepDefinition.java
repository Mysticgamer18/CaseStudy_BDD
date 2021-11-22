package com.mindtree.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.mindtree.pageobjects.HomePage;
import com.mindtree.reusablecomponent.Base;

import io.cucumber.java.en.Then;

public class HomePagestepDefinition extends Base {

	public static Logger log= LogManager.getLogger(Base.class.getName());

	HomePage hp=new HomePage(driver);

	@Then("BigSmall Website logo should be displayed")
	public void big_small_website_logo_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		log.info("Validating Title Image");
		test.info("Verifiying Logo");
		Assert.assertTrue(hp.getTitleImg().isDisplayed());


	}

	@Then("the Navigation Bar should be Displayed")
	public void the_navigation_bar_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		log.info("Validating Navigation Bar");
		test.info("Validating Navigation Bar");
		Assert.assertTrue(hp.getNavBar().isDisplayed());


	}


}
