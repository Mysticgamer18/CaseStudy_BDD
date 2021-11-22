package com.mindtree.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.mindtree.pageobjects.ContactUs;
import com.mindtree.reusablecomponent.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactstepDefinition extends Base{

	ContactUs cu=new ContactUs(driver);

	public static Logger log= LogManager.getLogger(Base.class.getName());

	@Then("User clicks on Contact Us link")
	public void user_clicks_on_contact_us_link() {

		test.info("Click on contact us");
		log.info("Click on contact us");

	}

	@When("the User lands on Contact Us form")
	public void the_user_lands_on_contact_us_form() {
		// Write code here that turns the phrase above into concrete actions
		cu.getContact().click();

	}

	@Then("User should enter {string} , {string} and {string}")
	public void user_should_enter_and(String name, String emailid, String message) throws InterruptedException {

		test.info("Name: "+name+ " entered" );
		log.info("Name entered");
		cu.getContName().sendKeys(name);
		Thread.sleep(2000);
		test.info("Email: "+emailid+ "entered" );
		log.info("Email-id entered");
		cu.getContEmail().sendKeys(emailid);
		Thread.sleep(2000);
		test.info("Message entered");
		log.info("Message entered");
		cu.getContMessage().sendKeys(message);

		Thread.sleep(2000);
	}

	@And("User Clicks on submit")
	public void user_clicks_on_submit() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		test.info("Click on submit");
		log.info("Click on submit");
		cu.getContSubmit().click();


		Thread.sleep(3000);
	}

	@Then("A Thankyou Message should be displayed")
	public void a_thankyou_message_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(cu.getThanksMessage().isDisplayed());
		log.warn("Random Captcha Warning");
		test.warning("Random Captcha Warning");

	}
}
