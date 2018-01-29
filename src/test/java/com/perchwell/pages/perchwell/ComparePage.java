package com.perchwell.pages.perchwell;

import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ComparePage extends BasePage {

	public ComparePage(WebDriver driver) {
		super(driver);
	}

	@iOSXCUITFindBy(accessibility = "SWIPE UP TO REMOVE A PROPERTY. SWIPE RIGHT TO SEE OTHERS YOU'VE ADDED.")
	private WebElement swipeUpToRemoveHint;


	//@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
	@FindBy(xpath= "//XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
	private WebElement firstBuildingsAddress;

	@FindBy(xpath = "//XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
	//@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	private WebElement secondBuildingsAddress;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
	//@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	private WebElement thirdBuildingsAddress;

	@iOSXCUITFindBy(accessibility = "REMOVE PROPERTY?")
	private WebElement removePropertyMsg;

	@iOSXCUITFindBy(accessibility = "CANCEL")
	private WebElement cancelMsgButton;

	@iOSXCUITFindBy(accessibility = "REMOVE")
	private WebElement removeMsgButtom;

	OpenedBuildingPage openedBuildingPage;

	public Boolean removePropertyMsgIsDispayed() {
		return Helper.isElementDisplayed(removePropertyMsg);
	}

	public void clickSwipeUpToRemoveHint() {
		element(swipeUpToRemoveHint).click();
	}

	public void clickCancelMsgButton() {
		element(cancelMsgButton).click();
	}

	public void clickRemoveMsgButtom() {
		element(removeMsgButtom).click();
	}

	public String getFirstBuildingAddress() {
		return firstBuildingsAddress.getAttribute("name");
	}

	public String getSecondBuildingAddress() {
		return secondBuildingsAddress.getAttribute("name");
	}

	public String getThirddBuildingAddress() {
		return thirdBuildingsAddress.getAttribute("name");
	}

	public Boolean firstBuildingIsDispayed() {
		return Helper.isElementDisplayed(firstBuildingsAddress);
	}

	public Boolean secondBuildingIsDispayed() {
		return secondBuildingsAddress.isDisplayed();
	}

	public void scrollUpFirstBulding() throws Exception {
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

	public String getBuildingAddressFromSessionVariable(String buildingName) {
		return Serenity.sessionVariableCalled(buildingName);
	}


}

