package com.unisys.verfuture.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.unisys.verfuture.base.TestBase;
import com.unisys.verfuture.utilities.TestUtil;

/**
 * Page Object for Manifest Generator page
 * 
 * @author DONTHISR
 *
 */
public class FindI9FormPage extends TestBase {
	@FindBy(css = "#id-input")
	WebElement findbyId_Txt;
	@FindBy(css = "form button")
	WebElement sub_Btn;

	// Initializing the Page Objects:
	public FindI9FormPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String verifyFindI9FormPageTitle() {
		return driver.getTitle();
	}

	public void inputFindbyID(String id) {
		TestUtil.waitForVisibilityofElement(findbyId_Txt);
		findbyId_Txt.sendKeys(id);
		logger.info("Find By Id field is filled");

	}

	public void clickOnSubmit() {
		TestUtil.waitForVisibilityofElement(sub_Btn);
		TestUtil.clickElement(sub_Btn, "submit button is clicked");
		logger.info("Clicked on submit button");
		// return PageFactory.initElements(driver, confirmationPage.class);

	}

}
