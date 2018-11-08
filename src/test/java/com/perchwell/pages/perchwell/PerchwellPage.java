package com.perchwell.pages.perchwell;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.FilteringAndSortingBuildings;
import com.perchwell.helpers.Helper;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.yecht.Data;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.concurrent.TimeUnit.SECONDS;

public class PerchwellPage extends BasePage {

	private int listningsAmount;
	private int fourDistrictListingsAmount;
	public static Integer numberOfItemsInListView;

	//region WebElements

	@iOSXCUITFindBy(accessibility = "EDIT SEARCH FILTERS OR SEARCH FOR A SPECIFIC ADDRESS")
	private WebElement editSearchFiltersHint;

	@iOSXCUITFindBy(accessibility = "MANAGE YOUR PROFILE, CONTACTS, DISCUSSIONS, AND TAGS")
	private WebElement manageYourProfileHint;

	@iOSXCUITFindBy(accessibility = "TRANSFORM DATA INTO MARKET INSIGHTS")
	private WebElement transformDataHint;

	@iOSXCUITFindBy(accessibility = "EXPLORE SEARCH RESULTS BY LOCATION")
	private WebElement exploreSearchResultHint;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/subtitle")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeStaticText[1]")
	private WebElement magnifierIcon;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/profile_image")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeNavigationBar/XCUIElementTypeButton")
	private WebElement openAccountButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/listing_image")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[1]")
	private WebElement firstBuilding;

	@AndroidFindBy(xpath = "(//*[@resource-id='com.perchwell.re.staging:id/listing_image'])[2]")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[2]")
	private WebElement secondBuilding;

    @AndroidFindBy(xpath = "(//*[@resource-id='com.perchwell.re.staging:id/listing_image'])[3]")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[3]")
	private WebElement thirdBuilding;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/action_map")
	@iOSXCUITFindBy(accessibility = "map_view_button")
	private WebElement map;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/action_analytics")
	@iOSXCUITFindBy(accessibility = "analytics")
	private WebElement analyticsButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/action_listings")
	@iOSXCUITFindBy(accessibility = "list_view_button")
	private WebElement listButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/title")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeNavigationBar[1]/XCUIElementTypeStaticText[1]")
	private WebElement currentSearchInTitle;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/sort")
	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS 'LISTINGS BY'")
	private WebElement listingsByButton;

	@iOSXCUITFindBy(accessibility = "BEDROOMS")
	private WebElement bedroomsSortButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/listing_beds")
	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS 'INFO'")
	private List<WebElement> roomsInfoList;

    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name CONTAINS 'PRICE'")
    private List<WebElement> pricesList;

    @iOSXCUITFindBy(accessibility = "LEAST EXPENSIVE")
    private WebElement leastExpensiveButton;

    @iOSXCUITFindBy(accessibility = "MOST EXPENSIVE")
    private WebElement mostExpensiveButton;

	@iOSXCUITFindBy(accessibility = "BATHROOMS")
	private WebElement bathroomsSortButton;

	@iOSXCUITFindBy(accessibility = "TOTAL ROOMS")
    private WebElement totalRoomsSortButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`visible==1`][-1]")
	private WebElement lastVisibleBuilding;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/listing_address")
	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS 'ADDRESS'")
	private WebElement firstBuildingAddress;

	@iOSXCUITFindBy(xpath = "com.perchwell.re.staging:id/listing_address")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$name CONTAINS 'ADDRESS'$][2]")
	private WebElement secondBuildingAddress;

	@iOSXCUITFindBy(accessibility = "AccountDetailsHeader")
	private WebElement initials;

	@iOSXCUITFindBy(accessibility = "RESET PASSWORD")
	private WebElement resetPassword;

	@iOSXCUITFindBy(accessibility = "TBI")
	private List<WebElement> buildingsLabels;

	@iOSXCUITFindBy(accessibility = "ADDRESS")
	private WebElement addressSortButton;

	@iOSXCUITFindBy(accessibility = "Listing Preview Search TextField")
	private WebElement listingsSearchField;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$name BEGINSWITH 'INFO'$]")
	private List<WebElement> currentBedsAndBathsAmountList;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$name BEGINSWITH 'INFO'$]")
	private WebElement bedsAndBathsAmount;

	@iOSXCUITFindBy(accessibility = "Clear text")
	private WebElement clearFieldButton;

	@iOSXCUITFindBy(accessibility = "DISCUSS THIS WITH YOUR CLIENT OR AGENT. WE'LL ORGANIZE YOUR MESSAGES BY PERSON & LISTING.")
	private WebElement discussWithClientHint;

//	@iOSXCUITFindBy(accessibility = "240 EAST 35TH ST. #TEST")
//	@iOSXCUITFindBy(accessibility = "ADDRESS-61 WEST 62ND ST. #TEST")
	@iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS 'ADDRESS-61 WEST 62ND ST'")
	private WebElement testListing;

	@iOSXCUITFindBy(accessibility = "ADDRESS: 15 West 81st St. #11A")
	private WebElement twoAgentListing;

	//endregion

	public PerchwellPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getThirdBuilding() {
		return thirdBuilding;
	}

	public void clickOnOpenAccountButton() {
		element(openAccountButton).click();
	}

	public void clickOnMagnifier() {
		element(magnifierIcon).click();
	}

    public void clickOnMagnifierWithWait() {
	    waitABit(3000);
        element(magnifierIcon).click();
    }

	public void clickOnEditSearchFiltersHint() {
		setImplicitTimeout(1, SECONDS);
		element(editSearchFiltersHint).click();
		resetImplicitTimeout();
	}

	public Boolean isEditSearchFiltersHintIsDisplayed() {
		return Helper.isElementDisplayed(editSearchFiltersHint);
	}

	public void clickOnManageYourProfileHint() {
		setImplicitTimeout(1, SECONDS);
		element(manageYourProfileHint).click();
		resetImplicitTimeout();
	}

	public void clickOnTransformDataHint() {
		setImplicitTimeout(1, SECONDS);
		element(transformDataHint).click();
		resetImplicitTimeout();
	}

	public void clickOnMap() {
		element(map).click();
	}

	public void clickExploreSearchResultHint() {
		setImplicitTimeout(1, SECONDS);
		element(exploreSearchResultHint).click();
		resetImplicitTimeout();
	}

	public void openFirstBuilding() {
		element(firstBuilding).click();
	}

	public void openSecondBuilding() {
		element(secondBuilding).click();
	}

	public void openThirdBuilding() {
		element(thirdBuilding).click();
	}

	public boolean isBuildingDisplayedWithSwipe(WebElement element) throws Exception {
		setImplicitTimeout(1, SECONDS);
		Helper.swipeDownUntilElementVisible(element);
		resetImplicitTimeout();
		return element.isDisplayed();
	}

	public void shouldSeeEditSearchFiltersHint() {
		if (!Config.isAndroid()){
			waitFor(editSearchFiltersHint);
//		element(editSearchFiltersHint).shouldBeVisible();
			Assert.assertTrue(editSearchFiltersHint.isDisplayed());
		}
	}

	public Integer countItemsInListView() {
        String newString = "0";
		String s;
        if(Config.isAndroid()) {
			s = listingsByButton.getAttribute("text");
		} else {
			s = listingsByButton.getAttribute("value");
		}
        s = Helper.removeChar(s, ',');
        Pattern p = Pattern.compile("^\\d+\\s+");
        Matcher m = p.matcher(s);
        while (m.find()) {
            newString = m.group();
        }
        return Integer.parseInt(newString.trim());
	}

	public String getFistBuildingAddress() {
	    String firstBuildAddress;
		if (Config.isAndroid()){
            firstBuildAddress = firstBuildingAddress.getAttribute("text");
		}
		else {
            firstBuildAddress = firstBuildingAddress.getAttribute("value");
		}
		return firstBuildAddress;
	}

	public void addBuildingAddressInSessionVariable(String buildingName, String buildingAddress) {
		SessionVariables.addValueInSessionVariable(buildingName,buildingAddress);
	}

	public void openAnalytics() {
		element(analyticsButton).click();
	}

	public void clickOnList() {
		element(listButton).click();
	}

	public void isElementExistsInEachCell(String element) {
		boolean isAllCellsContain = true;
		if(Config.isAndroid()) {
			List<WebElement> listingList;
			for(int i = 0; i < 2; i++) {
				listingList = getDriver().findElements(By.id("listing_canonical_nh_name"));

				for(WebElement district: listingList) {
					if(!district.getAttribute("text").contains(element)) {
						isAllCellsContain = false;
						break;
					}
				}
				Helper.universalSingleSwipe();
			}
		} else {
			WebElement table = getDriver().findElements(By.className("XCUIElementTypeTable")).get(0);
			List<WebElement> listCells = table.findElements(By.className("XCUIElementTypeCell"));
			if (listCells.size() > 0) {
				for (int i = 0; (i < 10 || i < listCells.size()); i++) {
					if (listCells.get(i).findElements(By.name(element)).size() == 0) {
						isAllCellsContain = false;
						break;
					}
				}
			}
		}
		Assert.assertTrue(isAllCellsContain);
	}

	public void shouldSeeTheSameSearchName(String searchName,String secondSearchName){
		Assert.assertEquals(searchName,secondSearchName);
	}

	public void shouldSeePreviouslyCreatedNameOfSearch(String searchName,String secondSearchName){
		Assert.assertTrue(searchName.equalsIgnoreCase(secondSearchName));
	}

	public String getCurrentSearchName() {
		String title;
        waitFor(ExpectedConditions.visibilityOf(openAccountButton));
		if(Config.isAndroid()) {
			title = currentSearchInTitle.getAttribute("text");
		} else {
			title = currentSearchInTitle.getAttribute("name");
		}
		return title;
	}

	public void isContainParticularRooms(String rooms) {
		Assert.assertTrue(FilteringAndSortingBuildings.isContainParticularRoomsOrLabels(roomsInfoList, rooms));
	}

	public void isContainsStudios() {
		Assert.assertTrue(FilteringAndSortingBuildings.isContainsStudios(roomsInfoList));
	}

	public void isContains4PlusParticularRooms(String roomType) {
		Assert.assertTrue(FilteringAndSortingBuildings.isContains4PlusParticularRooms(roomsInfoList, roomType));
	}

    public void clickOnListingsByButton() {
		element(listingsByButton).click();
    }

	public void clickOnBedroomsSortButton() {
		element(bedroomsSortButton).click();
	}

	public void checkSortLabel(String sortType) {
		waitFor(listingsByButton);
		Assert.assertTrue(element(listingsByButton).getAttribute("value").contains(sortType));
	}

	public void clickOnBathroomsSortButton() {
		element(bathroomsSortButton).click();
	}

	public void swipeDownUntilNextBuildingVisible () throws Exception {
		setImplicitTimeout(1, SECONDS);
		Helper.swipeDownUntilElementVisible(getDriver().findElement(By.xpath("//XCUIElementTypeCell[@visible=\"true\"][last()]/following::XCUIElementTypeCell[1]")));
		resetImplicitTimeout();
	}

	public void clickOnLastVisibleBuilding () {
		element(lastVisibleBuilding).click();
	}

	public void clickOnLeastExpensiveButton() {
	    element(leastExpensiveButton).click();
    }

    public void clickOnMostExpensiveButton() {
	    element(mostExpensiveButton).click();
    }

    public void clickOnTotalRoomsButton() {
	    element(totalRoomsSortButton).click();
    }

    public void isListingSortedByLeastExpensive() {
		Assert.assertTrue(FilteringAndSortingBuildings.getCounterInSorting("priceLeast", pricesList) == 0);
    }

    public void isListingSortedByMostExpensive() {
		Assert.assertTrue(FilteringAndSortingBuildings.getCounterInSorting("priceMost", pricesList) == 1);
    }

    public void isListingSortedByBedrooms() {
	    Assert.assertTrue(FilteringAndSortingBuildings.getCounterInSorting("bedrooms", roomsInfoList) == 1);
    }


	public void ListingBeSortedByBedroomsInBuilding() {
		Assert.assertTrue(FilteringAndSortingBuildings.getCounterInSorting("bedroomsInBuilding", roomsInfoList) == 1);
	}

    public void isListingSortedByBathrooms() {
		Assert.assertTrue(FilteringAndSortingBuildings.getCounterInSorting("bathrooms", roomsInfoList) == 1);
    }

	public void isInitialIconDispalyed(){
		element(openAccountButton).shouldBeVisible();
	}

	public void shouldFilter1Bed1AndHalfBathApplied(String search) {
		boolean roomInfo = FilteringAndSortingBuildings.isSomeInfoPresentInBuildings(search, roomsInfoList);
		Assert.assertTrue(roomInfo);
	}

	public void clickOnInitials() {
		element(initials).click();
	}

	public void clickOnResetPassword() {
		element(resetPassword).click();
	}

	public void isListingsQuantity() {
		listningsAmount = getNumberOfListings(listingsByButton);
	}

	public boolean checkListingsQuantity() {
		int listingsAmountToCheck = getNumberOfListings(listingsByButton);
		return ((listingsAmountToCheck > (listningsAmount - 50)) && ((listningsAmount + 50) > listingsAmountToCheck));
	}
	
	private int getNumberOfListings(WebElement listingsByButton) {
//		String listingsByText = element(listingsByButton).getAttribute("value");
		String listingsByText;
		if (Config.isAndroid()){
			listingsByText = element(listingsByButton).getAttribute("text");
		}
		else {
			listingsByText = element(listingsByButton).getAttribute("value");
		}
		StringBuilder listingsQty = new StringBuilder();

		for (int i = 0; i < listingsByText.length(); i++) {
			if (Character.isDigit(listingsByText.charAt(i))) {
				listingsQty.append(String.valueOf(listingsByText.charAt(i)));
			}
		}
		return Integer.parseInt(String.valueOf(listingsQty));
	}

	public boolean isPriceFilterAppliedOnListings(String typePriceFilter) {
		String min = "0";
		String max = "1000000";

		if (Serenity.hasASessionVariableCalled("min_price")) {
			min = SessionVariables.getValueFromSessionVariable("min_price");
		}

		if (Serenity.hasASessionVariableCalled("max_price")) {
			max = SessionVariables.getValueFromSessionVariable("max_price");
		}
		return FilteringAndSortingBuildings.isPriceFilterAppliedOnListings(typePriceFilter, pricesList, min, max);
	}

	public void isContainLabel(String label){
		waitFor(ExpectedConditions.visibilityOf(openAccountButton));
		List<WebElement> labelsList = getDriver().findElements(MobileBy.iOSNsPredicateString("type=='XCUIElementTypeImage' AND name CONTAINS 'BANNER: " + label + "'"));
		Assert.assertEquals(20, labelsList.size());
	}

	public void isContainLabels(String label1, String label2){
		waitFor(ExpectedConditions.visibilityOf(openAccountButton));
		List<WebElement> labelsList1 = getDriver().findElements(MobileBy.iOSNsPredicateString("type=='XCUIElementTypeImage' AND name CONTAINS 'BANNER: " + label1 + "'"));
		List<WebElement> labelsList2 = getDriver().findElements(MobileBy.iOSNsPredicateString("type=='XCUIElementTypeImage' AND name CONTAINS 'BANNER: " + label2 + "'"));
		Assert.assertEquals(20, labelsList1.size() + labelsList2.size());
	}

	public void clickOnAddressSortButton() {
		element(addressSortButton).click();
	}

	public void closeAccountMenu() {
		WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
		WebDriver webDriver = webDriverFacade.getProxiedDriver();
		AppiumDriver appiumDriver = (AppiumDriver) webDriver;
		TouchAction action = new TouchAction(appiumDriver);
		Point magnifierLocation = element(magnifierIcon).getLocation();
		action.tap(magnifierLocation.x, magnifierLocation.y).release().perform();
	}

	public void openSpecificBuilding() throws Exception {
//		WebElement specificAddress = getDriver().findElement(
//				MobileBy.AccessibilityId(SessionVariables.getValueFromSessionVariable("First_building_address")));
//
//		Helper.swipeDownUntilElementVisible(specificAddress);
//		element(specificAddress).click();
		WebElement specificAddress;

		if(Config.isAndroid()) {
			specificAddress = getDriver().findElement(By.xpath("//*[@text = '" + SessionVariables.getValueFromSessionVariable("First_building_address") + "']"));
		} else {
			specificAddress = getDriver().findElement(MobileBy.AccessibilityId(SessionVariables.getValueFromSessionVariable("First_building_address")));
		}

		Helper.universalVerticalSwipe(specificAddress);
		element(specificAddress).click();
	}

	public void waitForClickOnMagnifier() {
		waitFor(ExpectedConditions.visibilityOf(openAccountButton));
		magnifierIcon.click();
	}

    public void checkFilterIsApplied() {
		int listingsAmountToCheck = getNumberOfListings(listingsByButton);
		Assert.assertTrue((listningsAmount - 3000) > listingsAmountToCheck);
    }

	public void shouldSeeListingsFromAllUpperEastSideDistricts(String carnegieHill, String lenoxHill, String upperEastSide, String yorkville) {
		List<WebElement> districtList1 = getDriver().findElements(MobileBy.iOSNsPredicateString(
				"type == 'XCUIElementTypeStaticText' AND name CONTAINS 'NEIGHBORHOOD: " + carnegieHill + "'"));
		List<WebElement> districtList2 = getDriver().findElements(MobileBy.iOSNsPredicateString(
				"type == 'XCUIElementTypeStaticText' AND name CONTAINS 'NEIGHBORHOOD: " + lenoxHill + "'"));
		List<WebElement> districtList3 = getDriver().findElements(MobileBy.iOSNsPredicateString(
				"type == 'XCUIElementTypeStaticText' AND name CONTAINS 'NEIGHBORHOOD: " + upperEastSide + "'"));
		List<WebElement> districtList4 = getDriver().findElements(MobileBy.iOSNsPredicateString(
				"type == 'XCUIElementTypeStaticText' AND name CONTAINS 'NEIGHBORHOOD: " + yorkville + "'"));
		Assert.assertEquals(20, districtList1.size() + districtList2.size() + districtList3.size() + districtList4.size());
		fourDistrictListingsAmount = getNumberOfListings(listingsByButton);
	}

	public void shouldSeeListingsTwoDistricts(String firstDist, String secondDist) {
		List<WebElement> districtList1 = getDriver().findElements(MobileBy.iOSNsPredicateString(
				"type == 'XCUIElementTypeStaticText' AND name CONTAINS 'NEIGHBORHOOD: " + firstDist + "'"));
		List<WebElement> districtList2 = getDriver().findElements(MobileBy.iOSNsPredicateString(
				"type == 'XCUIElementTypeStaticText' AND name CONTAINS 'NEIGHBORHOOD: " + secondDist + "'"));
		Assert.assertEquals(20, districtList1.size() + districtList2.size());
	}

	public void checkFourDistrictsListings() {
		int listingsAmountToCheck = getNumberOfListings(listingsByButton);
		Assert.assertTrue((listingsAmountToCheck > (fourDistrictListingsAmount - 50)) && ((fourDistrictListingsAmount + 50) > listingsAmountToCheck));
	}

	public void openTwoAgentListing() {
		Helper.swipeDownUntilElementVisible(twoAgentListing);
		element(twoAgentListing).click();
	}

	public void waitUntilAccountIconAppears() {
		waitFor(ExpectedConditions.visibilityOf(openAccountButton));
	}

	public void checkIfListingsAreFilteredByMinBeds(int value) {
		boolean result = true;

		waitFor(ExpectedConditions.visibilityOf(openAccountButton));

		for (WebElement element : currentBedsAndBathsAmountList) {
			String stringValue = element.getAttribute("value");
			int processedValue = Integer.parseInt(stringValue.substring(0, stringValue.indexOf(" ")));
			if (processedValue<value) {
				result = false;
				break;
			}
		}
		Assert.assertTrue(result);
	}

	public void checkIfListingsAreFilteredByMinBaths(double expectedValue) {
		boolean result = true;

		waitFor(ExpectedConditions.visibilityOf(openAccountButton));

		for (WebElement element : currentBedsAndBathsAmountList) {
			String actualValue = element.getAttribute("value");
			double processedActualValue = Double.parseDouble(
					actualValue.substring(actualValue.indexOf("|")+2, actualValue.indexOf(" BA"))
							.replace("½", ".5"));
			if (processedActualValue<expectedValue) {
				result = false;
				break;
			}
		}
		Assert.assertTrue(result);
	}

	public void checkIfListingsAreFilteredByMultipleBedroomsFilters() {
		boolean result = true;

		waitFor(ExpectedConditions.visibilityOf(openAccountButton));

		for (WebElement element : currentBedsAndBathsAmountList) {
			String stringValue = element.getAttribute("value");
			int processedValue = Integer.parseInt(stringValue.substring(0, stringValue.indexOf(" ")));
			if (processedValue!=1 & processedValue!=2 & processedValue!=3) {
				result = false;
				break;
			}
		}
		Assert.assertTrue(result);
	}

	public void checkIfListingsWereChanged() {
		int listingsAmountToCheck = getNumberOfListings(listingsByButton);
		Assert.assertTrue(listningsAmount!=listingsAmountToCheck);
	}

	public void checkIfThereIsNoListingsWithoutBeds() {
		boolean result = true;

		waitFor(ExpectedConditions.visibilityOf(openAccountButton));

		for (WebElement element : currentBedsAndBathsAmountList) {
			String value = element.getAttribute("value");
			if (!value.contains("BD") & !value.contains("STUDIO")) {
				result = false;
				break;
			}
		}
		Assert.assertTrue(result);
	}

	public void checkIfThereIsNoListingsWithoutBaths() {
		boolean result = true;

		waitFor(ExpectedConditions.visibilityOf(openAccountButton));

		for (WebElement element : currentBedsAndBathsAmountList) {
			if (!element.getAttribute("value").contains("BA")) {
				result = false;
				break;
			}
		}
		Assert.assertTrue(result);
	}

	public void listingsFilteredByMultiBathroomsFilters() {
		boolean result = true;

		waitFor(ExpectedConditions.visibilityOf(openAccountButton));

		for (WebElement element : currentBedsAndBathsAmountList) {
			String actualValue = element.getAttribute("value");
			double value = Double.parseDouble(
					actualValue.substring(actualValue.indexOf("|")+2, actualValue.indexOf(" BA"))
							.replace("½", ".5"));
			if (value !=1 & value !=1.5 & value !=2 & value != 3) {
				result = false;
				break;
			}
		}
		Assert.assertTrue(result);
	}
}
