package com.mindtree.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.mindtree.pageobjects.NewsLetter;
import com.mindtree.reusablecomponent.Base;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewsletterstepDefinition extends Base {

	public static Logger log= LogManager.getLogger(Base.class.getName());

	NewsLetter nl=new NewsLetter();

	@Then("User enters email-id in Newsletter textbox")
	public void user_enters_email_id_in_newsletter_textbox() {
		// Write code here that turns the phrase above into concrete actions
		test.info("Entering email-id in Newsletter text box");
		log.info("Entering email-id in Newsletter text box");
		nl.getNewsLetter().sendKeys("testbymanish@gmail.com");
	}

	@When("User Click on Sign Up Now button")
	public void user_click_on_sign_up_now_button() {
		// Write code here that turns the phrase above into concrete actions
		test.info("Click on Sign Up Now");
		log.info("Click on Sign Up Now");
		nl.getSignup().click();
	}

	@Then("A page with Newsletter signup sucessful should be displayed")
	public void a_page_with_newsletter_signup_sucessful_should_be_displayed() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		String newTab = null;

		String mainTab=driver.getWindowHandle();

		for(String handle : driver.getWindowHandles()) {

			if (!handle.equals(mainTab)) {

				driver.switchTo().window(handle);				

				newTab=driver.getTitle();

				WebDriverWait wait=new WebDriverWait(driver, 5);

				wait.until(ExpectedConditions.titleContains(newTab));

				driver.close();

			}

		}

		Thread.sleep(2000);

		driver.switchTo().window(mainTab);

		Assert.assertEquals(newTab, "Newsletter");

	}
}
