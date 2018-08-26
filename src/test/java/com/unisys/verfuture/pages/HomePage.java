package com.unisys.verfuture.pages;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.unisys.verfuture.base.TestBase;
import com.unisys.verfuture.utilities.TestUtil;

/**
 * Page Object for Manifest Generator page
 * 
 * @author DONTHISR
 *
 */
public class HomePage extends TestBase {
	@FindBy(css = "#home-link")
	WebElement homeLink;
	//@FindBy(xpath = "//*[@id='navbarDropdown']")
	@FindBy(xpath="//a[@href='/tips']")
	WebElement tipsLink;
	@FindBy(xpath = "//a[text()='Users']")
	WebElement usersLink;
	@FindBy(css = "#basic-nav-dropdown")
	WebElement dropdownLink;
//	@FindBy(css = "#nav-formI9")
//	WebElement i9formLink;
	@FindBy(css = "[href='#']")
	WebElement formsLink;

	
	
	// Initializing the Page Objects:
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public FormsPage clickOnFormsDropDwnLink() throws InterruptedException {
		logger.info("User has clicked on FormsLink");
		Thread.sleep(1000);
		TestUtil.waitForVisibilityofElement(formsLink);
		TestUtil.clickElement(formsLink, "Forms link is clicked");
       // TestUtil.clickOnElementJS(formsLink);
		return PageFactory.initElements(driver,FormsPage.class);
	}


//	

}
