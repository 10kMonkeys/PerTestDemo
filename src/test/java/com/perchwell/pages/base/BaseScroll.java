package com.perchwell.pages.base;

import com.perchwell.helpers.Helper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseScroll extends  BaseSwipe{

public BaseScroll(WebDriver driver) {
	super(driver);
}

@Deprecated
public void swipeRightUntilElementVisible(WebElement element) throws Exception {

	WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
	WebDriver webDriver = webDriverFacade.getProxiedDriver();
	AppiumDriver appiumDriver = (AppiumDriver) webDriver;
	while (!element.isDisplayed()) {

		Helper.swipeHorizontal(appiumDriver, 0.9, 0.5, 0.7, 1);

	}
}

public boolean swipeRightUntilElementVisible(String elementName) throws Exception {

	By byElement = MobileBy.iOSNsPredicateString("name == '" + elementName + "' AND visible==1");

	boolean isFoundTheElement = getDriver().findElements(byElement).size() > 0;

	WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
	WebDriver webDriver = webDriverFacade.getProxiedDriver();
	AppiumDriver appiumDriver = (AppiumDriver) webDriver;

	while (!isFoundTheElement) {

		Helper.swipeHorizontal(appiumDriver, 0.9, 0.5, 0.7, 1);
		isFoundTheElement = getDriver().findElements(byElement).size() > 0;

	}
	return isFoundTheElement;
}

public boolean isElementDisplayed(WebElement element) {
	try {
		return element.isDisplayed();
	} catch (NoSuchElementException e) {
		return false;
	}
}

}