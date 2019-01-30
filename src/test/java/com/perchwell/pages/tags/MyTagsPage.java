package com.perchwell.pages.tags;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.Helper;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

public class MyTagsPage extends TechHelper {

	//region WebElements

	@AndroidFindBy(id = "com.perchwell.re.staging:id/search_by_tags")
	@iOSXCUITFindBy(accessibility = "TagSearchButton")
	private WebElement tagSearchButton;

	@iOSXCUITFindBy(accessibility = "TagsTableView")
	private WebElement tagTable;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/search_src_text")
	@iOSXCUITFindBy(accessibility = "Tag Cell: Search Text Field")
	private WebElement searchTagTextField;

	@iOSXCUITFindBy(accessibility = "Clear text")
	private WebElement clearIcon;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable[$name=='TagsTableView'$]/XCUIElementTypeCell/XCUIElementTypeStaticText[$name BEGINSWITH 'ADDRESS: '$]")
	private List<WebElement> addressesList;

	//endregion

	public MyTagsPage(WebDriver driver) {
		super(driver);
	}

	public WebElement findExistingTagLabel() {
		WebElement parentCell = null;
		WebElement parentLabelElement = null;
		List<WebElement> listCells = tagTable.findElements(By.className("XCUIElementTypeCell"));
		if (listCells.size() > 0) {
			for (WebElement desiredElement : listCells) {
				if (desiredElement.findElements(By.className("XCUIElementTypeButton")).size() == 0) {
					parentCell = desiredElement;
					break;
				}
			}
			if (parentCell != null) {
				parentLabelElement = parentCell.findElements(By.className("XCUIElementTypeStaticText")).get(0);
			}

		}
		return parentLabelElement;
	}

	public void clickOnTagSearchButton() {
		element(tagSearchButton).click();
	}

    public void checkJustCreatedTag(String tag) {
		if (Config.isAndroid()) {
			setImplicitTimeout(1, SECONDS);
			Helper.androidSwipeDownUntilElementVisible(tag);
			resetImplicitTimeout();
			element(MobileBy.xpath("//*[contains(@text, '" + tag + "')]")).click();
		} else {
			element(searchTagTextField).sendKeys(tag);
			element(MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[$name CONTAINS '" + tag + "'$]")).click();
//			WebElement justCreatedTag = getDriver().findElement(MobileBy.AccessibilityId(tag));
//			setImplicitTimeout(1, SECONDS);
//			Helper.swipeDownUntilElementVisible(justCreatedTag);
//			element(justCreatedTag).click();
//			resetImplicitTimeout();
		}
    }

	public void clearSearchField() {
		element(clearIcon).click();
	}

	public void checkIfFourListingsAndBuildingAreDisplayed() {
		SoftAssertions softAssertions = new SoftAssertions();
		softAssertions.assertThat(addressesList.get(0).getAttribute("value").toUpperCase().equals(SessionVariables.getValueFromSessionVariable("listingAddress5").toUpperCase()));
		softAssertions.assertThat(addressesList.get(1).getAttribute("value").toUpperCase().equals(SessionVariables.getValueFromSessionVariable("listingAddress4").toUpperCase()));
		softAssertions.assertThat(addressesList.get(2).getAttribute("value").toUpperCase().equals(SessionVariables.getValueFromSessionVariable("listingAddress3").toUpperCase()));
		softAssertions.assertThat(addressesList.get(3).getAttribute("value").toUpperCase().equals(SessionVariables.getValueFromSessionVariable("listingAddress2").toUpperCase()));
		softAssertions.assertThat(addressesList.get(4).getAttribute("value").toUpperCase().equals(SessionVariables.getValueFromSessionVariable("listingAddress1").toUpperCase()));
		softAssertions.assertAll();
	}

	public void clickOnFirstTagsPill() {
		element(MobileBy.AccessibilityId(SessionVariables.getValueFromSessionVariable("First_tag"))).click();
	}

	public void checkIfTwoLastListingsAndBuildingAreDisplayed() {
		SoftAssertions softAssertions = new SoftAssertions();
		softAssertions.assertThat(!element(MobileBy.AccessibilityId(SessionVariables.getValueFromSessionVariable("listingAddress1"))).isPresent());
		softAssertions.assertThat(!element(MobileBy.AccessibilityId(SessionVariables.getValueFromSessionVariable("listingAddress2"))).isPresent());
		softAssertions.assertThat(addressesList.get(0).getAttribute("value").toUpperCase().equals(SessionVariables.getValueFromSessionVariable("listingAddress5").toUpperCase()));
		softAssertions.assertThat(addressesList.get(1).getAttribute("value").toUpperCase().equals(SessionVariables.getValueFromSessionVariable("listingAddress4").toUpperCase()));
		softAssertions.assertThat(addressesList.get(2).getAttribute("value").toUpperCase().equals(SessionVariables.getValueFromSessionVariable("listingAddress3").toUpperCase()));
		softAssertions.assertAll();
	}

	public void swipeDownSecondTagsPill() {
		swipeUpElementIOS(element(MobileBy.AccessibilityId(SessionVariables.getValueFromSessionVariable("Second_tag"))), 240);
	}

	public void checkTaggedListingsAmount(int listingsAmount) {
		setImplicitTimeout(3, SECONDS);
		element(MobileBy.AccessibilityId("Listing Results: " + listingsAmount)).shouldBeVisible();
		resetImplicitTimeout();
	}
}

