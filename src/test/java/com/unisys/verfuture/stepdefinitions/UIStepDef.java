package com.unisys.verfuture.stepdefinitions;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.unisys.verfuture.base.TestBase;
import com.unisys.verfuture.pages.I9FormPage;
import com.unisys.verfuture.pages.FindI9FormPage;
import com.unisys.verfuture.pages.FormsPage;
//import com.unisys.verfuture.pages.ConfirmTipSubmissionPage;
//import com.unisys.verfuture.pages.FindTipPage;
//import com.unisys.verfuture.pages.FormsPage;
import com.unisys.verfuture.pages.HomePage;
import com.unisys.verfuture.pages.confirmationPage;
import com.unisys.verfuture.utilities.TestUtil;

import cucumber.api.java.After;
//import com.unisys.verfuture.pages.LoginPage;
//import com.unisys.myuscis.pages.LoginPage;
//import com.unisys.verfuture.pages.SubmitEB5TipPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Step Definitions for Project
 * 
 * @author DONTHISR
 *
 */
public class UIStepDef extends TestBase {
	WebDriver driver;
	String TipIdNew;

	public UIStepDef() {
		TestBase.initialization();
		driver = TestBase.driver;
	}

	HomePage HP;
	FormsPage FP;
	I9FormPage IFP;
	FindI9FormPage FIFP;
	confirmationPage CP;
	


	@Given("^User  is on home page$")
	public void user_is_on_home_page() throws Throwable {
		HP = new HomePage(driver);
		String Homepagetitle = HP.verifyHomePageTitle();
		System.out.println("user is on homepage  " + Homepagetitle);

	}

	@When("^click on FormsPage$")
	public void click_on_FormsPage() throws Throwable {
		FP = new FormsPage(driver);
		FP = HP.clickOnFormsDropDwnLink();
	}

	@Then("^FormsPage gets opened$")
	public void formspage_gets_opened() throws Throwable {
		String fptitle = FP.verifyFormsPageTitle();
		System.out.println("forms page title is:" + fptitle);
	}

	@Then("^User clicks I(\\d+)FormLink$")
	public void user_clicks_I_FormLink(int arg1) throws Throwable {
		IFP = new I9FormPage(driver);
		IFP = FP.clickOni9FormLink();
	}

	@Then("^user can fill the form with name \"([^\"]*)\",alias_Name \"([^\"]*)\",date_of_birth \"([^\"]*)\" ,current_addr \"([^\"]*)\"and status \"([^\"]*)\"$")
	public void user_can_fill_the_form_with_name_alias_Name_date_of_birth_current_addr_and_status(String arg1,
			String arg2, String arg3, String arg4, String arg5) throws Throwable {

		IFP.fillformWithDetails(arg1, arg2, arg3, arg4, arg5);
	}

	@Then("^user should be able to enter alienno \"([^\"]*)\"$")
	public void user_should_be_able_to_enter_alienno(String alienno) throws Throwable {
		// IFP.inputAlienno(alienno);
	}

	@Then("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
		CP = new confirmationPage(driver);
		CP = IFP.clickOnSubmit();
		Thread.sleep(1800);
		String confirmText = CP.getConfirmText();
		System.out.println("Confirmaton Page Title is:" + confirmText);
		assertTrue(confirmText.contains("Your Form Has Been Submitted"));
	}

	@Then("^User clicks FindI(\\d+)FormPageLink$")
	public void user_clicks_FindI_FormPageLink(int arg1) throws Throwable {
		FIFP = new FindI9FormPage(driver);
		FIFP = FP.clickOnFindI9FormLink();
	}

	@Then("^User enters formid \"([^\"]*)\"$")
	public void user_enters_formid(String arg1) throws Throwable {
		FIFP.inputFindbyID(arg1);
		Thread.sleep(500);
	}

	@Then("^clicks on submit button$")
	public void clicks_on_submit_button() throws Throwable {
		//FIFP.clickOnSubmit();
	}

	@Then("^form details get displayed$")
	public void form_details_get_displayed() throws Throwable {
       System.out.println("form details got displayed for editing");
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();
	}

}
