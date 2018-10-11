package com.perchwell.pages.perchwell;

import com.perchwell.helpers.Helper;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.Serenity;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ComparePage extends BasePage {

	//region WebElements

	@iOSXCUITFindBy(accessibility = "SWIPE UP TO REMOVE A PROPERTY. SWIPE RIGHT TO SEE OTHERS YOU'VE ADDED.")
	private WebElement swipeUpToRemoveHint;

	//@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
	@FindBy(xpath= "//XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
	private WebElement firstBuildingsAddress;

	@FindBy(xpath = "//XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
	//@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
	private WebElement secondBuildingsAddress;

	@iOSXCUITFindBy(accessibility = "REMOVE PROPERTY?")
	private WebElement removePropertyMsg;

	@iOSXCUITFindBy(accessibility = "CANCEL")
	private WebElement cancelMsgButton;

	@iOSXCUITFindBy(accessibility = "REMOVE")
	private WebElement removeMsgButtom;

	//endregion

	public ComparePage(WebDriver driver) {
		super(driver);
	}

	public void removePropertyMsgIsDisplayed() {
		Assert.assertTrue(Helper.isElementDisplayed(removePropertyMsg));
	}

	public void clickOnSwipeUpToRemoveHint() {
		element(swipeUpToRemoveHint).click();
	}

	public void clickOnCancelMsgButton() {
		element(cancelMsgButton).click();
	}

	public void clickOnRemoveMsgButton() {
		element(removeMsgButtom).click();
	}

	public String getFirstBuildingAddress() {
		return element(firstBuildingsAddress).getAttribute("name");
	}

	public String getSecondBuildingAddress() {
		return element(secondBuildingsAddress).getAttribute("name");
	}

	public void firstBuildingIsDisplayed() {
		Assert.assertTrue(Helper.isElementDisplayed(firstBuildingsAddress));
	}

	public void secondBuildingIsDisplayed() {
		element(secondBuildingsAddress).shouldBeVisible();
	}

	public void scrollUpFirstBuilding() {
		setImplicitTimeout(1, SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) getDriver();

		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		js.executeScript("mobile: scroll", scrollObject);
		resetImplicitTimeout();
	}

	public boolean isBuildingDisplayedWithSwipe(String building) throws Exception {
		boolean result = false;

		if (getDriver().findElements(MobileBy.AccessibilityId(building)).size() > 0) {
			setImplicitTimeout(1, SECONDS);
			result = Helper.swipeRightUntilElementVisible(building);
			resetImplicitTimeout();
		}
		return result;
	}

	public void shouldSeeSecondBuildingInCompare(String building) {
		Assert.assertTrue(getSecondBuildingAddress()
				.equalsIgnoreCase(SessionVariables.getValueFromSessionVariable(building)));
	}

	public void thirdBuildingIsDisplayed(String building) throws Exception {
		Assert.assertTrue(isBuildingDisplayedWithSwipe(SessionVariables.getValueFromSessionVariable(building)));
	}

	public void notSeeFirstBuildingInCompare(String building) {
		Assert.assertFalse(getFirstBuildingAddress()
				.equalsIgnoreCase(SessionVariables.getValueFromSessionVariable(building)));
	}

	public void shouldSeeFirstBuildingInCompare(String building) {
		Assert.assertTrue(getFirstBuildingAddress()
				.equalsIgnoreCase(SessionVariables.getValueFromSessionVariable(building)));
	}
}

