package com.perchwell.pages.perchwell;

import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import sun.jvm.hotspot.memory.HeapBlock;

import static java.util.concurrent.TimeUnit.SECONDS;

public class PerchwellPage extends BasePage {

	public PerchwellPage(WebDriver driver) {
		super(driver);
	}

	@iOSXCUITFindBy(accessibility = "EDIT SEARCH FILTERS OR SEARCH FOR A SPECIFIC ADDRESS")
	private WebElement editSearchFiltersHint;

	@iOSXCUITFindBy(accessibility = "MANAGE YOUR PROFILE, CONTACTS, DISCUSSIONS, AND TAGS")
	private WebElement manageYourProfileHint;

	@iOSXCUITFindBy(accessibility = "TRANSFORM DATA INTO MARKET INSIGHTS")
	private WebElement transformDataHint;

	@iOSXCUITFindBy(accessibility = "EXPLORE SEARCH RESULTS BY LOCATION")
	private WebElement exploreSearchResultHint;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeStaticText[1]")
	private WebElement magniferIcon;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeNavigationBar/XCUIElementTypeButton")
	private WebElement openAccountButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[1]")
	private WebElement firstBuilding;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[2]")
	private WebElement secondBuilding;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[3]")
	private WebElement thirdBuilding;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeButton")
	private WebElement map;

	@iOSXCUITFindBy(accessibility = "market report logo")
	private WebElement analyticsButton;

	public static Integer numberOfItemsInListView;
	// public String buildingAddress;

	public WebElement getThirdBuilding() {
		return thirdBuilding;
	}

	public void clickOpenAccountButton() {
		element(openAccountButton).click();
	}

	public void clickMagnifer() {
		element(magniferIcon).click();
	}

	public void clickEditSearchFiltersHint() {
		element(editSearchFiltersHint).click();
	}

	public Boolean isEditSearchFiltersHintisDisplayed() {
		return Helper.isElementDisplayed(editSearchFiltersHint);
	}

	public void clickManageYourProfileHint() {
		element(manageYourProfileHint).click();
	}

	public void clickTransformDataHint() {
		element(transformDataHint).click();
	}

	public void clickMap() {
		element(map).click();
	}

	public void clickExploreSearchResultHint() {
		element(exploreSearchResultHint).click();
	}

	public void openFirstBuilding() {
		element(firstBuilding).click();
	}

	public void openSecondBuilding() {
		element(secondBuilding).click();
	}

	public void openThirdBuilding() throws Exception {
		element(thirdBuilding).click();
	}

	public boolean isBuildingDisplayedWithSwipe(WebElement element) throws Exception {
		setImplicitTimeout(1, SECONDS);
		Helper.swipeDownUntilElementVisible(element);
		resetImplicitTimeout();
		return element.isDisplayed();

	}

	public boolean editSearchFiltersHintIsDispalyed() {
		return editSearchFiltersHint.isDisplayed();
	}

	public Integer countItemsInListView() {
		return getDriver().findElements(By.className("XCUIElementTypeCell")).size();

	}

	public String getFistBuildingAddress() {
		return firstBuilding.findElements(By.className("XCUIElementTypeStaticText")).get(1).getAttribute("name");
	}

	public void addBuildingAddressInSessionVariable(String buildingName, String buildingAddress) {
		Serenity.setSessionVariable(buildingName).to(buildingAddress);
	}

	public void openAnalytics() {
		element(analyticsButton).click();
	}
}
