package com.perchwell.pages.perchwell;

import com.perchwell.pages.base.BaseScroll;

import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ComparePage extends BaseScroll {


    public ComparePage(WebDriver driver) {
        super(driver);
    }

    @iOSXCUITFindBy(accessibility = "SWIPE UP TO REMOVE A PROPERTY. SWIPE RIGHT TO SEE OTHERS YOU'VE ADDED.")
    private WebElement swipeUpToRemoveHint;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
    private WebElement firstBuildingsAddress;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
    private WebElement secondBuildingsAddress;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
    private WebElement thirdBuildingsAddress;


	@iOSXCUITFindBy(accessibility = "REMOVE PROPERTY?")
	private WebElement removePropertyMsg;

	@iOSXCUITFindBy(accessibility = "CANCEL")
	private WebElement cancelMsgButton;

	@iOSXCUITFindBy(accessibility = "REMOVE")
	private WebElement removeMsgButtom;

	OpenedBuildingPage openedBuildingPage;

	public Boolean removePropertyMsgIsDispayed()  {
	return isElementDisplayed(removePropertyMsg);

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
    public String getFirstBuildingAddress()  {
        return firstBuildingsAddress.getAttribute("name");

    }

    public String getSecondBuildingAddress()  {
        return secondBuildingsAddress.getAttribute("name");

    }

    public String getThirddBuildingAddress()  {
        return thirdBuildingsAddress.getAttribute("name");

    }

    public Boolean firstBuildingIsDispayed()  {
    	return isElementDisplayed(firstBuildingsAddress);

    }

    public Boolean secondBuildingIsDispayed()  {
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
//    @Deprecated
//	public Boolean thirdBuildingIsDispayed() throws Exception {
//		return isBuildingDisplayedWithSwipe(thirdBuildingsAddress);
//
//}

//	public boolean isBuildingDisplayedWithSwipe(WebElement element) throws Exception {
//
//
//			setImplicitTimeout(1, SECONDS);
//			swipeRightUntilElementVisible(element);
//			resetImplicitTimeout();
//
//		return element.isDisplayed();
//
//
//	}

    public boolean isBuildingDisplayedWithSwipe(String building) throws Exception {
		boolean result=false;

		if (getDriver().findElements(MobileBy.AccessibilityId(building)).size() > 0) {
			setImplicitTimeout(1, SECONDS);
			result= swipeRightUntilElementVisible(building);
			resetImplicitTimeout();
		}

		return result;


    }

    }

