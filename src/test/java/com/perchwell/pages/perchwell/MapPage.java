package com.perchwell.pages.perchwell;

import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;

import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebElement;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.concurrent.TimeUnit.SECONDS;

public class MapPage extends BasePage {

	public MapPage(WebDriver driver) {
		super(driver);
	}

	public static Integer numberOfItemsInMapView;

	@iOSXCUITFindBy(accessibility = "WANT TO SEE NEARBY HOMES?")
	private WebElement seeNearbyHint;

	@iOSXCUITFindBy(accessibility = "NOT NOW")
	private WebElement notNowButton;

	@iOSXCUITFindBy(className = "cluster")
	private WebElement cluster;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeMap")
	private WebElement map;

	@iOSXCUITFindBy(accessibility= "MY NEW SEARCH")
	private WebElement myNewSearch;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther")
	private List<WebElement> clusterList;

	public void clickNotNowButton() {
		element(notNowButton).click();
	}

	public Integer countItemsInMapView() {
		return getDriver().findElements(By.name("cluster")).size();

	}

	public void zoom(String scale, String velocity) {

		AppiumDriver driver = getAppiumDriver();

		Map<String, Object> params = new HashMap<>();

		params.put("scale", scale);
		params.put("velocity", velocity);
		params.put("element", ((RemoteWebElement) map).getId());
		driver.executeScript("mobile: pinch", params);

	}

	private AppiumDriver getAppiumDriver() {
		WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
		WebDriver webDriver = webDriverFacade.getProxiedDriver();
		return (AppiumDriver) webDriver;
	}

	public void swipeRight() throws Exception {
		AppiumDriver appiumDriver = getAppiumDriver();

		Helper.swipeHorizontal(appiumDriver, 0.8, 0.7, 0.7, 1);
	}

	public void clickMyNewSearch() {
		element(myNewSearch).click();
	}

	public void checkForChangesAfterApplyingTheFilter(){
		WebElement cluster;
		for(int i=0;(i<10 || );i++)
	}
}
