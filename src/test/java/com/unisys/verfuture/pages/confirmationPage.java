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
public class confirmationPage extends TestBase {
	@FindBy(css = "h2")
	WebElement confirmTxt;
//	//@FindBy(xpath = "//*[@id='navbarDropdown']")
//	@FindBy(css="#navbarDropdown")
//	WebElement formsDrpdwn;
//	@FindBy(xpath = "//*[contains(text(),'EB-5 Fraud Reporting System')]")
//	WebElement eb5Text;
//	@FindBy(xpath = "//a[text()='Login']")
//	WebElement loginLink;

	
	
	// Initializing the Page Objects:
	public confirmationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String verifyConfirmationPageTitle() {
		return driver.getTitle();
	}

	public String getConfirmText() {
		return confirmTxt.getText();
	}

//	public FormsPage clickOnFormsDrpDwn() throws InterruptedException {
//		logger.info("User has clicked on FormsDropdownLink");
//		Thread.sleep(1000);
//		//loginLink.click();
//		WebDriverWait some_element = new WebDriverWait(driver, 100);
//		some_element.until(ExpectedConditions.visibilityOfElementLocated(By.id("navbarDropdown")));
//		//TestUtil.waitForElementToBeStable(formsDrpdwn);
//		// util.waitForVisibilityofElement(formsDrpdwn);
//		//TestUtil.scrollIntoViewJS(formsDrpdwn);
//		//TestUtil.clickOnElementJS(formsDrpdwn);
//		formsDrpdwn.click();
//		return PageFactory.initElements(driver,FormsPage.class);
//	}


//	public String textDisplayed() {
//		return eb5Text.getText();
//	}

//	public LoginPage clickonLoginPageLink() throws InterruptedException {
//		 Thread.sleep(500);
//		// String title1=driver.getTitle();
//		//WebDriverWait some_element = new WebDriverWait(driver, 100);
//   //some_element.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Login']")));
//		 JavascriptExecutor js = (JavascriptExecutor)driver;
//	    	js.executeScript("arguments[0].click();", loginLink);
//		//loginLink.click();
//		return new LoginPage();
//	}

//	public void clickOnHomeLink() {
//		// TODO Auto-generated method stub
//		homeLink.click();
//	}




}
