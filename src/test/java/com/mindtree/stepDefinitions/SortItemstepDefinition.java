package com.mindtree.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import com.mindtree.pageobjects.SortItem;
import com.mindtree.reusablecomponent.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SortItemstepDefinition extends Base{

	public static Logger log= LogManager.getLogger(Base.class.getName());

	SortItem so=new SortItem(driver);

	@And("Click on Secret Santa Gifts section")
	public void click_on_secret_santa_gifts_section() {
		// Write code here that turns the phrase above into concrete actions
		test.info("Clicking on Secret Santa Gifts section from Navigation Bar");
		log.info("Clicking on  Secret Santa Gifts section from Navigation Bar");
		so.getSecretSantaGifts().click();
	}


	@When("Page is displayed User clicks on sort by")
	public void page_is_displayed_user_clicks_on_sort_by() {

		test.info("Clicking on Sort and choose the Best Selling option from the dropdown");
		log.info("Clicking on Sort and choose the Best Selling option from the dropdown");
		so.getSortItem().click();
	}

	@And("Clicks on Best Selling Option from the drop-down")
	public void clicks_on_best_selling_option_from_the_drop_down() {
		// Write code here that turns the phrase above into concrete actions
		so.getSortItem().sendKeys(Keys.ARROW_DOWN);
		so.getSortItem().sendKeys(Keys.ARROW_DOWN);
		so.getSortItem().sendKeys(Keys.ENTER);
	}

	@Then("The Page showing results sorted with hot sellers should be displayed")
	public void the_page_showing_results_sorted_with_hot_sellers_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(so.getSortCheck().getText(),"Hot Seller");
		log.info("Best Selling Products displayed");



	}

}
