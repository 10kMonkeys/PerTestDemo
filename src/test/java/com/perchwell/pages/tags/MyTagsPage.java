package com.perchwell.pages.tags;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.FilteringAndSortingBuildings;
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
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.concurrent.TimeUnit;

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

	@AndroidFindBy(id = "com.perchwell.re.staging:id/text_switcher")
	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Sorted by'")
	private WebElement sclickOnSortedByButton;

	@AndroidFindBy(accessibility = "cell: deselected Least Expensive")
	@iOSXCUITFindBy(accessibility = "cell: deselected Least Expensive")
	private WebElement leastExpensiveSortButton;

	@AndroidFindBy(accessibility = "cell: deselected Most Expensive")
	@iOSXCUITFindBy(accessibility = "cell: deselected Most Expensive")
	private WebElement mostExpensiveSortButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/price")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable[$name=='TagsTableView'$]/XCUIElementTypeCell/XCUIElementTypeStaticText[$name CONTAINS 'PRICE:'$]")
	private List<WebElement> pricesList;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/building_price")
	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'BUILDING PRICE:'")
	private List<WebElement> buildingPricesList;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable[$name=='TagsTableView'$]/XCUIElementTypeCell/XCUIElementTypeStaticText[$name BEGINSWITH 'ADDRESS: '$]")
	private List<WebElement> addressesList;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable[$name=='TagsTableView'$]/XCUIElementTypeCell/XCUIElementTypeButton[$name CONTAINS 'Select button: selected'$]")
	private List<WebElement> selectedListingsList;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Listing Results: ' AND visible == true")
	private WebElement itemsCountValue;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/listing_address")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable[$name=='TagsTableView'$]/XCUIElementTypeCell/XCUIElementTypeStaticText[$name BEGINSWITH 'ADDRESS: '$][1]")
	private WebElement firstBuildingAddress;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/listing_address")
	private List<WebElement> onlyAndroidAddressList;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/listing_image")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable[$name=='TagsTableView'$]/XCUIElementTypeCell[1]")
	private WebElement firstBuilding;

	@iOSXCUITFindBy(accessibility = "TagsViewControllerCancelButton")
	private WebElement tagsPageCloseButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable[$name=='TagsTableView'$]/XCUIElementTypeCell/XCUIElementTypeButton[$name CONTAINS 'Select button: unselected'$][1]")
	private WebElement firstListingRadioButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$name == 'Sorted by'$][2]")
	private WebElement listingsByButton;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name CONTAINS 'DISCUSS BUTTON'")
	private WebElement discussionButton;

	@iOSXCUITFindBy(accessibility = "cell: Contact Listing Agents")
	private WebElement contactListingAgentsOption;

	@iOSXCUITFindBy(accessibility = "button: more multi-select options")
	private WebElement moreOptionsButton;

	@iOSXCUITFindBy(accessibility = "Select all button")
	private WebElement slectAllButton;

	@iOSXCUITFindBy(accessibility = "Deselect all button")
	private WebElement deselectAllListingButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name CONTAINS 'Select button: unselected'`][1]")
	private WebElement firstContactListingCheckbox;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name CONTAINS 'Select button: unselected'`][3]")
	private WebElement secondContactListingCheckbox;

	@iOSXCUITFindBy(accessibility = "cell: Tag Selected Listings")
	private WebElement tagSelectedListingsOption;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name CONTAINS 'Sort Button: ' AND visible == true")
	private WebElement sortType;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[$name CONTAINS 'TAG BUTTON'$][1]")
	private WebElement tagIconOnFirstListing;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND label == 'ti selected rb'")
	private List<WebElement> selectedListingsListByAddress;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name BEGINSWITH 'Remove Button: '")
	private WebElement removingTagPill;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS '11CLIENTNAME' OR name CONTAINS 'TAGNAME'`][1]")
	private WebElement firstTag;

	@iOSXCUITFindBy(accessibility = "SHOW ITEMS IN SELECTED TAGS")
	private WebElement searchButton;

	@iOSXCUITFindBy(accessibility = "TagsViewControllerCancelButton")
	private WebElement crossFromAccountTagsButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[$name CONTAINS 'TAG BUTTON'$][2]")
	private WebElement tagIconOnSecondListing;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable[$name=='TagsTableView'$]/XCUIElementTypeCell[2]")
	private WebElement secondBuilding;

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

	public void clickOnSortedByButton() {
		element(sclickOnSortedByButton).click();
	}

	public void clickOnLeastExpensiveButton() {
		element(leastExpensiveSortButton).click();
	}

	public void clickOnMostExpensiveButton() {
		element(mostExpensiveSortButton).click();
	}

	public void checkListingAmount(int listingAmountToCheck) {
		if(Config.isAndroid()) {
			element(MobileBy.xpath("*//android.widget.RelativeLayout/*/android.widget.TextView[contains(@text, '"
					+ listingAmountToCheck + " Item')]")).shouldBeVisible();
		} else {
			element(MobileBy.AccessibilityId("Listing Results: " + listingAmountToCheck)).shouldBeVisible();
		}
	}

	public void shouldTaggedListingBeSortedByMostExpensive() {
		if(Config.isAndroid()) {
			for(int i = 0; i < 3; i++) {
				FilteringAndSortingBuildings.shouldTaggedListingBeSortedByMostExpensiveOnlyAndroid(pricesList);
				androidSwipeForSorting();
			}
		} else {
			Assert.assertTrue(FilteringAndSortingBuildings.getCounterInSorting("priceMost", pricesList) == 1);
		}
	}

	public void shouldTaggedListingBeSortedByLeastExpensive() {
		if(Config.isAndroid()) {
			for(int i = 0; i < 3; i++) {
				FilteringAndSortingBuildings.shouldTaggedListingBeSortedByLeastOnlyAndroid(pricesList);
				androidSwipeForSorting();
			}
		} else {
			Assert.assertTrue(FilteringAndSortingBuildings.getCounterInSorting("priceLeast", pricesList) == 0);
		}
	}

	public void shouldTaggedBuildingBeSortedByMostExpensive() {
		if(Config.isAndroid()) {
			for(int i = 0; i < 3; i++) {
				FilteringAndSortingBuildings.shouldTaggedListingBeSortedByMostExpensiveOnlyAndroid(buildingPricesList);
				androidSwipeForSorting();
			}
		} else {
			Assert.assertTrue(FilteringAndSortingBuildings.getCounterInSorting("priceMost", buildingPricesList) == 1);
		}
	}

	public void shouldTaggedBuildingBeSortedByLeastExpensive() {
		if(Config.isAndroid()) {
//			androidSingleInitialVerticalSwipeForLists(0.5);
			for(int i = 0; i < 3; i++) {
				FilteringAndSortingBuildings.shouldTaggedListingBeSortedByLeastOnlyAndroid(buildingPricesList);
				androidSwipeForSorting(); //new
//				androidSingleInitialVerticalSwipeForListsOnTaggedItems();
			}
		} else {
			Assert.assertTrue(FilteringAndSortingBuildings.getCounterInSorting("priceLeast", buildingPricesList) == 0);
		}
	}

	public void checkIfFourListingsAndBuildingAreDisplayed() {
		if(Config.isAndroid()) {
			Assert.assertEquals(firstBuildingAddress.getAttribute("text").toUpperCase(),
					SessionVariables.getValueFromSessionVariable("buildingAddress5").toUpperCase());
			androidSwipeForSorting();

			Assert.assertEquals(firstBuildingAddress.getAttribute("text").toUpperCase(),
					SessionVariables.getValueFromSessionVariable("listingAddress3").toUpperCase());
			androidSwipeForSorting();

			Assert.assertEquals(firstBuildingAddress.getAttribute("text").toUpperCase(),
					SessionVariables.getValueFromSessionVariable("listingAddress4").toUpperCase());
			androidSwipeForSorting();

			Assert.assertEquals(firstBuildingAddress.getAttribute("text").toUpperCase(),
					SessionVariables.getValueFromSessionVariable("listingAddress1").toUpperCase());
			androidSwipeForSorting();

			Assert.assertEquals(onlyAndroidAddressList.get(1).getAttribute("text").toUpperCase(),
					SessionVariables.getValueFromSessionVariable("listingAddress2").toUpperCase());
			androidSwipeForSorting();
		} else {
			SoftAssertions softAssertions = new SoftAssertions();
			softAssertions.assertThat(addressesList.get(0).getAttribute("value").toUpperCase().equals(SessionVariables.getValueFromSessionVariable("buildingAddress5").toUpperCase()));
			softAssertions.assertThat(addressesList.get(1).getAttribute("value").toUpperCase().equals(SessionVariables.getValueFromSessionVariable("listingAddress4").toUpperCase()));
			softAssertions.assertThat(addressesList.get(2).getAttribute("value").toUpperCase().equals(SessionVariables.getValueFromSessionVariable("listingAddress3").toUpperCase()));
			softAssertions.assertThat(addressesList.get(3).getAttribute("value").toUpperCase().equals(SessionVariables.getValueFromSessionVariable("listingAddress2").toUpperCase()));
			softAssertions.assertThat(addressesList.get(4).getAttribute("value").toUpperCase().equals(SessionVariables.getValueFromSessionVariable("listingAddress1").toUpperCase()));
			softAssertions.assertAll();
		}
	}

	public void checkIfTwoLastListingsAndBuildingAreDisplayed() {
		if(Config.isAndroid()) {
			Assert.assertEquals(firstBuildingAddress.getAttribute("text").toUpperCase(),
					SessionVariables.getValueFromSessionVariable("buildingAddress5").toUpperCase());
			androidSwipeForSorting();

			Assert.assertEquals(firstBuildingAddress.getAttribute("text").toUpperCase(),
					SessionVariables.getValueFromSessionVariable("listingAddress3").toUpperCase());
			androidSwipeForSorting();

			Assert.assertEquals(onlyAndroidAddressList.get(1).getAttribute("text").toUpperCase(),
					SessionVariables.getValueFromSessionVariable("listingAddress4").toUpperCase());
			androidSwipeForSorting();
		} else {
			SoftAssertions softAssertions = new SoftAssertions();
			softAssertions.assertThat(!element(MobileBy.AccessibilityId(SessionVariables.getValueFromSessionVariable("listingAddress1"))).isPresent());
			softAssertions.assertThat(!element(MobileBy.AccessibilityId(SessionVariables.getValueFromSessionVariable("listingAddress2"))).isPresent());
			softAssertions.assertThat(addressesList.get(0).getAttribute("value").toUpperCase().equals(SessionVariables.getValueFromSessionVariable("buildingAddress5").toUpperCase()));
			softAssertions.assertThat(addressesList.get(1).getAttribute("value").toUpperCase().equals(SessionVariables.getValueFromSessionVariable("listingAddress4").toUpperCase()));
			softAssertions.assertThat(addressesList.get(2).getAttribute("value").toUpperCase().equals(SessionVariables.getValueFromSessionVariable("listingAddress3").toUpperCase()));
			softAssertions.assertAll();
		}
	}

	public void swipeDownSecondTagsPill() {
//		swipeUpElementIOS(element(MobileBy.AccessibilityId("Tag view: " + SessionVariables.getValueFromSessionVariable("Second_tag"))), 240);
		swipeUpElementIOS(element(MobileBy.iOSClassChain("**/XCUIElementTypeOther[$name BEGINSWITH 'tag color: #'$]/XCUIElementTypeOther/XCUIElementTypeStaticText[$name='" + SessionVariables.getValueFromSessionVariable("Second_tag") + "'$]")), 240);
	}

	public void checkTaggedListingsAmount(int listingsAmount) {
		setImplicitTimeout(3, SECONDS);
		if(Config.isAndroid()) {
			element(MobileBy.xpath("*//android.widget.TextView[@text = '" + listingsAmount + " Items Sorted by']")).shouldBeVisible();
		} else {
			element(MobileBy.AccessibilityId("Listing Results: " + listingsAmount)).shouldBeVisible();
		}
		resetImplicitTimeout();
	}

    public void checkNumbersListingsEqualTagItems() {
		int tagItemsAmount = Integer.parseInt(SessionVariables.getValueFromSessionVariable("itemsAmount"));
		Assert.assertEquals(tagItemsAmount, selectedListingsListByAddress.size());
    }

	public void checkFirstListingsIsSelected() {
	    if(Config.isAndroid()) {

        } else {
            element(MobileBy.iOSClassChain("**/XCUIElementTypeTable[$name=='TagsTableView'$]" +
                    "/XCUIElementTypeCell/XCUIElementTypeButton[$name CONTAINS 'Select button: selected "
                    + SessionVariables.getValueFromSessionVariable("listingAddress1") + "'$]")).shouldBePresent();
        }
	}

	public void checkSecondListingsIsSelected() {
		universalSingleSwipe();
		element(MobileBy.iOSClassChain("**/XCUIElementTypeTable[$name=='TagsTableView'$]" +
				"/XCUIElementTypeCell/XCUIElementTypeButton[$name CONTAINS 'Select button: selected "
				+ SessionVariables.getValueFromSessionVariable("listingAddress2") + "'$]")).shouldBePresent();
	}

	public void checkThirdListingsIsSelected() {
		universalSingleSwipe();
		element(MobileBy.iOSClassChain("**/XCUIElementTypeTable[$name=='TagsTableView'$]" +
				"/XCUIElementTypeCell/XCUIElementTypeButton[$name CONTAINS 'Select button: selected "
				+ SessionVariables.getValueFromSessionVariable("listingAddress3") + "'$]")).shouldBePresent();
	}

	public void shouldSeeTaggedBuilding() {
				String valueToCheck = element(MobileBy.iOSNsPredicateString("name BEGINSWITH 'ADDRESS: ' AND visible == 1")).getAttribute("value");
		String checkableValue = SessionVariables.getValueFromSessionVariable("buildingAddress5");
		Assert.assertEquals(valueToCheck.toUpperCase(), checkableValue.toUpperCase());
	}

	public void clickOnSpecificTagsPill(String tagName) {
//		element(MobileBy.AccessibilityId("Tag view: " + tagName)).click();
		if (Config.isAndroid()) {
			element(MobileBy.xpath("//android.widget.TextView[@content-desc='" + tagName + "']")).click();
		} else {
			element(MobileBy.iOSClassChain("**/XCUIElementTypeOther[$name BEGINSWITH 'tag color: #'$]/XCUIElementTypeOther/XCUIElementTypeStaticText[$name='" + tagName + "'$]")).click();
		}
	}
	public void checkListingIsRemovedFromTaggedItemsPage(String address) {
		setImplicitTimeout(3, SECONDS);
		Assert.assertEquals(0, getDriver().findElements(MobileBy.iOSNsPredicateString("name CONTAINS 'ADDRESS: " + address + "' AND visible == true")).size());
		resetImplicitTimeout();
	}

	public void checkItemsCountIsChanged(int value) {
		int itemsAmount;

		String element = itemsCountValue.getAttribute("value");
		itemsAmount = Integer.parseInt(element.substring(0, element.indexOf(" ")));

		Assert.assertEquals(itemsAmount, value);
	}

	public void getFistBuildingAddress() {
		String firstBuildAddress;

		if (Config.isAndroid()){
			firstBuildAddress = firstBuildingAddress.getAttribute("text");
		}
		else {
			firstBuildAddress = firstBuildingAddress.getAttribute("value");
		}
		SessionVariables.addValueInSessionVariable("listingAddress1", firstBuildAddress);
	}

	public void openFirstBuilding() {
		element(firstBuilding).click();
	}

	public void closeTagsPage() {
		element(tagsPageCloseButton).click();
	}

	public void sortingMenuIsHidden() {
		setImplicitTimeout(3, SECONDS);
		element(listingsByButton).shouldNotBeVisible();
		resetImplicitTimeout();
	}

	public void clickOnDiscussionIconOnFirstListing() {
		element(discussionButton).click();
	}

	public void clickOnContactListingAgentsButton() {
		element(contactListingAgentsOption).click();
	}

	public void clickOnMoreOptionsButton() {
		element(moreOptionsButton).click();
	}

	public void multiSelectMenuIsShown() {
		element(moreOptionsButton).shouldBeVisible();
	}

	public void clickOnSelectAll() {
		element(slectAllButton).click();
	}

	public void checkSavedListingNumberIsShown(String amount) {
		element(MobileBy.AccessibilityId("Number of selected listings: " + amount)).shouldBeVisible();
	}

	public void clickOnDeselectAll() {
		element(deselectAllListingButton).click();
	}

	public void selectFirstListings() {
		universalVerticalShortSwipe(firstContactListingCheckbox);
		element(firstContactListingCheckbox).click();
	}

	public void clickOnTagSelectedListingsOption() {
		element(tagSelectedListingsOption).click();
	}

	public void checkNoOneListingIsSelected() {
		setImplicitTimeout(3, SECONDS);
		Assert.assertEquals(0, selectedListingsList.size());
		resetImplicitTimeout();
	}

	public void multiSelectMenuIsHidden() {
		setImplicitTimeout(3, SECONDS);
		element(moreOptionsButton).shouldNotBeVisible();
		resetImplicitTimeout();
	}

	public void checkSortLabel(String sortLabel) {
		waitFor(ExpectedConditions.visibilityOf(sortType));
		Assert.assertTrue(element(sortType).getAttribute("name").contains(sortLabel));
	}

	public void clickOnTagIconOnFirstListing() {
		element(tagIconOnFirstListing).click();
	}

	public void swipeUpListViewToRefresh() {
		singleUpShortSwipeIOS();
	}

	public void removeAllTagPills() {
		setImplicitTimeout(1, TimeUnit.SECONDS);
		while (element(removingTagPill).isVisible()) {
			element(removingTagPill).click();
		}
		resetImplicitTimeout();
	}

	public void fillInTagSearchField(String uniqueTagName) {
		waitFor(1000);
		element(searchTagTextField).sendKeys(uniqueTagName);
	}

	public void clickOnFirstTag() {
		element(firstTag).click();
	}

	public void checkIfTwoListingsAreDisplayed() {
		element(MobileBy.iOSClassChain("**/XCUIElementTypeTable[$name=='TagsTableView'$]/XCUIElementTypeCell/XCUIElementTypeStaticText[$name CONTAINS 'ADDRESS: "
				+ SessionVariables.getValueFromSessionVariable("listingAddress1") + "'$]")).shouldBeVisible();
		element(MobileBy.iOSClassChain("**/XCUIElementTypeTable[$name=='TagsTableView'$]/XCUIElementTypeCell/XCUIElementTypeStaticText[$name CONTAINS 'ADDRESS: "
				+ SessionVariables.getValueFromSessionVariable("listingAddress2") + "'$]")).shouldBeVisible();
	}

	public void clickOnSearchButton() {
		element(searchButton).click();
	}

	public void checkIfTwoListingsAreNotDisplayed() {
		setImplicitTimeout(3, TimeUnit.SECONDS);
		element(MobileBy.iOSClassChain("**/XCUIElementTypeTable[$name=='TagsTableView'$]/XCUIElementTypeCell/XCUIElementTypeStaticText[$name CONTAINS 'ADDRESS: "
					+ SessionVariables.getValueFromSessionVariable("listingAddress1") + "'$]")).shouldNotBeVisible();
		element(MobileBy.iOSClassChain("**/XCUIElementTypeTable[$name=='TagsTableView'$]/XCUIElementTypeCell/XCUIElementTypeStaticText[$name CONTAINS 'ADDRESS: "
					+ SessionVariables.getValueFromSessionVariable("listingAddress2") + "'$]")).shouldNotBeVisible();
		resetImplicitTimeout();
	}

	public void clickOnCrossFromAccountTagsButton() {
		element(crossFromAccountTagsButton).click();
	}

	public void checkTagsIconCountForFirstListing(String value) {
		Assert.assertEquals(value, element(tagIconOnFirstListing).getAttribute("label").replace(" ", ""));
	}

	public void checkTagsIconCountForSecondListing(String value) {
		Assert.assertEquals(value, element(tagIconOnSecondListing).getAttribute("label").replace(" ", ""));
	}

	public void clickOnTagIconOnSecondListing() {
		element(tagIconOnSecondListing).click();
	}

	public void openSecondBuilding() {
		element(secondBuilding).click();
	}
}

