package com.perchwell.pages.perchwell;

import com.perchwell.pages.base.BasePage;
import com.perchwell.pages.base.BaseSwipe;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.apache.xpath.operations.Bool;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ComparePage extends BaseSwipe {
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


    public void clickSwipeUpToRemoveHint() {
    	element(swipeUpToRemoveHint).click();
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
        return firstBuildingsAddress.isDisplayed();

    }

    public Boolean secondBuildingIsDispayed()  {
        return secondBuildingsAddress.isDisplayed();

    }
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
			result=swipeRightUntilElementVisible(building);
			resetImplicitTimeout();
		}

		return result;


    }



    }

