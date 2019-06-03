package com.perchwell.pages.perchwell;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.FilteringAndSortingBuildings;
import com.perchwell.helpers.Helper;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.concurrent.TimeUnit.SECONDS;

public class PerchwellPage extends TechHelper {

	private int listingsAmount;
	private int fourDistrictListingsAmount;
	public static Integer numberOfItemsInListView;
	public static final int ANDROID_LOOP_COUNTER = 3;
	private List<String> listOfAddresses = new ArrayList<>();

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

	@AndroidFindBy(id = "com.perchwell.re.staging:id/background_image")
	@iOSXCUITFindBy(accessibility = "Account Bar Button")
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

	@AndroidFindBy(id = "com.perchwell.re.staging:id/map_view_button")
	@iOSXCUITFindBy(accessibility = "map_view_button")
	private WebElement map;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/analytics_button")
	@iOSXCUITFindBy(accessibility = "analytics")
	private WebElement analyticsButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/action_listings")
	@iOSXCUITFindBy(accessibility = "list_view_button")
	private WebElement listButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/title")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeNavigationBar[1]/XCUIElementTypeStaticText[1]")
	private WebElement currentSearchInTitle;

	@AndroidFindBy(xpath = "*//android.widget.TextView[contains(@text, 'Listings Sorted by')]")
	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS 'Listing Results:'")
	private WebElement listingsByButton;

	@iOSXCUITFindBy(accessibility = "Bedrooms")
	private WebElement bedroomsSortButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/baths")
	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS 'Bath:'")
	private List<WebElement> bathsInfoList;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/listing_beds")
	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS 'Info:'")
	private List<WebElement> bedAndBathListInBuilding;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/beds")
	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS 'Bed:'")
	private List<WebElement> bedInfoList;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS 'Bed: STUDIO'")
	private List<WebElement> studioList;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/price")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name CONTAINS 'PRICE'")
    private List<WebElement> pricesList;

    @iOSXCUITFindBy(accessibility = "Least Expensive")
    private WebElement leastExpensiveButton;

    @iOSXCUITFindBy(accessibility = "Most Expensive")
    private WebElement mostExpensiveButton;

	@iOSXCUITFindBy(accessibility = "Bathrooms")
	private WebElement bathroomsSortButton;

	@AndroidFindBy(xpath = "//*[@text = 'Total Rooms']")
	@iOSXCUITFindBy(accessibility = "Total Rooms")
    private WebElement totalRoomsSortButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`visible==1`][-1]")
	private WebElement lastVisibleBuilding;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/listing_address")
	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS 'ADDRESS:'")
	private WebElement firstBuildingAddress;

	@iOSXCUITFindBy(xpath = "com.perchwell.re.staging:id/listing_address")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$name CONTAINS 'ADDRESS:'$][2]")
	private WebElement secondBuildingAddress;

	@iOSXCUITFindBy(accessibility = "AccountDetailsHeader")
	private WebElement initials;

	@iOSXCUITFindBy(accessibility = "RESET PASSWORD")
	private WebElement resetPassword;

	@iOSXCUITFindBy(accessibility = "TBI")
	private List<WebElement> buildingsLabels;

	@iOSXCUITFindBy(accessibility = "Address")
	private WebElement addressSortButton;

	@iOSXCUITFindBy(accessibility = "Listing Preview Search TextField")
	private WebElement listingsSearchField;

	@AndroidFindBy(xpath = "*//android.widget.TextView[contains(@text, ' BD')]")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$name BEGINSWITH 'Bed:'$]")
	private List<WebElement> currentBedsAmountList;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/baths")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$name BEGINSWITH 'Bath:'$]")
	private List<WebElement> currentBathsAmountList;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$name BEGINSWITH 'Info:'$]")
	private WebElement bedsAndBathsAmount;

	@iOSXCUITFindBy(accessibility = "Clear text")
	private WebElement clearFieldButton;

	@iOSXCUITFindBy(accessibility = "DISCUSS THIS WITH YOUR CLIENT OR AGENT. WE'LL ORGANIZE YOUR MESSAGES BY PERSON & LISTING.")
	private WebElement discussWithClientHint;

	@iOSXCUITFindBy(accessibility = "Newest")
	private WebElement newestSortButton;

//	@iOSXCUITFindBy(accessibility = "240 EAST 35TH ST. #TEST")
//	@iOSXCUITFindBy(accessibility = "ADDRESS-61 WEST 62ND ST. #TEST")
	@iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS 'ADDRESS-61 WEST 62ND ST'")
	private WebElement testListing;

	@AndroidFindBy(accessibility = "ADDRESS: 240 East 35th St. #11A")
	@iOSXCUITFindBy(accessibility = "ADDRESS: 240 East 35th St. #11A 474823")
	private WebElement twoAgentListing;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/sqft")
	@iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS 'sqft: '")
	private List<WebElement> sqFeetList;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name CONTAINS 'Sort Button: '")
	private WebElement sortType;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	private WebElement searchMenuIcon;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/save")
	@iOSXCUITFindBy(accessibility = "SAVE")
	private WebElement saveButton;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH 'ADDRESS:'")
	private List<WebElement> addressesList;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/menu_button")
	@iOSXCUITFindBy(accessibility = "button: more multi-select options")
	private WebElement moreOptionsButton;

	@AndroidFindBy(accessibility = "cell: Contact Listing Agents")
	@iOSXCUITFindBy(accessibility = "cell: Contact Listing Agents")
	private WebElement contactListingAgentsOption;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH 'ADDRESS:' AND visible == 1")
	private List<WebElement> visibleAddressesList;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH 'ADDRESS:'")
	private List<WebElement> addresseslist;

	@iOSXCUITFindBy(iOSNsPredicate = "name BEGINSWITH 'Select button: unselected 1 West 72nd St. #95'")
	private WebElement testListingWithOneAgentCheckbox;

	@iOSXCUITFindBy(iOSNsPredicate = "name BEGINSWITH 'Select button: unselected 240 East 35th St. #11A'")
	private WebElement testListingWithTwoAgentsCheckbox;

	@AndroidFindBy(xpath = "*//android.widget.ImageView[contains(@content-desc, 'Select button: unselected')]")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name CONTAINS 'Select button: unselected'`][1]")
	private WebElement firstContactListingCheckbox;

	@AndroidFindBy(xpath = "*//android.widget.RelativeLayout[2]/android.widget.ImageView[@resource-id = 'com.perchwell.re.staging:id/multi_select_checkbox'][1]")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name CONTAINS 'Select button: unselected'`][2]")
	private WebElement secondContactListingCheckbox;

	@AndroidFindBy(xpath = "*//android.widget.RelativeLayout[3]/android.widget.ImageView[@resource-id = 'com.perchwell.re.staging:id/multi_select_checkbox'][1]")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name CONTAINS 'Select button: unselected'`][3]")
	private WebElement thirdContactListingCheckbox;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$name CONTAINS 'ADDRESS:'$][3]")
	private WebElement thirdBuildingAddress;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/second_label")
	@iOSXCUITFindBy(accessibility = "Select all button")
	private WebElement slectAllButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/third_label")
	@iOSXCUITFindBy(accessibility = "Deselect all button")
	private WebElement deselectAllButton;

	@iOSXCUITFindBy(accessibility = "Number of selected listings: 3")
	private WebElement counterWithValueThree;

	@iOSXCUITFindBy(accessibility = "Selected")
	private WebElement selectedWord;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name CONTAINS 'Select button: selected'")
	private List<WebElement> selectedListingsList;

	@AndroidFindBy(accessibility = "cell: Tag Selected Listings")
	@iOSXCUITFindBy(accessibility = "cell: Tag Selected Listings")
	private WebElement tagSelectedListingsOption;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[$name CONTAINS 'TAG BUTTON'$][1]")
	private WebElement tagIconOnFirstListing;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name CONTAINS 'DISCUSS BUTTON'")
	private WebElement discussionButton;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Number of selected listings: '")
	private WebElement numberOfSelectedListings;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND label == 'lv selected rb'")
	private List<WebElement> selectedListingsListByAddress;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[$name CONTAINS 'TAG BUTTON'$][2]")
	private WebElement tagIconOnSecondListing;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'ADDRESS: 1 West 72nd St. #95'")
	private WebElement testListingWithOneAgent;

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

	public boolean isBuildingDisplayedWithSwipe(WebElement element) {
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
				listingList = getDriver().findElements(By.id("com.perchwell.re.staging:id/listing_neighborhood"));

				for(WebElement district: listingList) {
					if(!district.getAttribute("text").contains(element)) {
						isAllCellsContain = false;
						break;
					}
				}
				universalSingleSwipe();
			}
		} else {
//			WebElement table = getDriver().findElements(By.className("XCUIElementTypeTable")).get(0);
//			List<WebElement> listCells = table.findElements(By.className("XCUIElementTypeCell"));
			List<WebElement> listCells = getDriver().findElements(MobileBy.iOSNsPredicateString("type == ('XCUIElementTypeButton' AND name CONTAINS 'ALPHABET CITY'"));

			if (listCells.size() > 0) {
				for (int i = 0; (i < 10 || i < listCells.size()); i++) {

					if (!listCells.get(i).getAttribute("value").equals(element)) {
					isAllCellsContain = false;
					break;
				}
//					if (listCells.get(i).findElements(By.name(element)).size() == 0) {
//						isAllCellsContain = false;
//						break;
//					}
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

	public void isContainParticularBeds(String rooms) {
			Assert.assertTrue(FilteringAndSortingBuildings.isContainParticularRoomsOrLabels(bedInfoList, rooms));
	}

	public void isContainParticularBaths(String rooms) {
			Assert.assertTrue(FilteringAndSortingBuildings.isContainParticularRoomsOrLabels(bathsInfoList, rooms));
	}

	public void isContainsStudios() {
		Assert.assertTrue(FilteringAndSortingBuildings.isContainsStudios(bedInfoList));
	}

	public void isContains4PlusParticularBeds(String roomType) {
		Assert.assertTrue(FilteringAndSortingBuildings.isContains4PlusParticularRooms(bedInfoList, roomType));
	}

	public void isContains4PlusParticularBaths(String roomType) {
		Assert.assertTrue(FilteringAndSortingBuildings.isContains4PlusParticularRooms(bathsInfoList, roomType));
	}

    public void clickOnListingsByButton() {
		element(listingsByButton).click();
    }

	public void clickOnBedroomsSortButton() {
		element(bedroomsSortButton).click();
	}

	public void checkSortLabel(String stringSortType) {
//		waitFor(sortType);
		Assert.assertTrue(element(sortType).getAttribute("name").contains(stringSortType));
	}

	public void clickOnBathroomsSortButton() {
		element(bathroomsSortButton).click();
	}

	public void swipeDownUntilNextBuildingVisible () {
		setImplicitTimeout(1, SECONDS);
		if (Config.isAndroid()) {
			Helper.universalVerticalSwipe(element(MobileBy.xpath("//android.view.ViewGroup[last()]/android.widget.RelativeLayout[@resource-id = 'com.perchwell.re.staging:id/foreground_container']/following::android.widget.RelativeLayout[1]")));
		} else  {
			Helper.swipeDownUntilElementVisible(getDriver().findElement(By.xpath("//XCUIElementTypeCell[@visible=\"true\"][last()]/following::XCUIElementTypeCell[1]")));
		}
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
	    Assert.assertTrue(FilteringAndSortingBuildings.getCounterInSorting("bedrooms", bedInfoList) == 1);
    }


	public void ListingBeSortedByBedroomsInBuilding() {
		Assert.assertTrue(FilteringAndSortingBuildings.getCounterInSorting("bedroomsInBuilding", bedAndBathListInBuilding) == 1);
	}

    public void isListingSortedByBathrooms() {
		Assert.assertTrue(FilteringAndSortingBuildings.getCounterInSorting("bathrooms", bathsInfoList) == 1);
    }

	public void isInitialIconDispalyed(){
		element(openAccountButton).shouldBeVisible();
	}

	public void shouldFilter1Bed1AndHalfBathApplied(String search) {
		boolean roomInfo = FilteringAndSortingBuildings.isSomeInfoPresentInBuildings(search, bathsInfoList);
		Assert.assertTrue(roomInfo);
	}

	public void clickOnInitials() {
		element(initials).click();
	}

	public void clickOnResetPassword() {
		element(resetPassword).click();
	}

	public void isListingsQuantity() {
		listingsAmount = getNumberOfListings(listingsByButton);
	}

	public boolean checkListingsQuantity() {
		waitABit(3000);
		int listingsAmountToCheck = getNumberOfListings(listingsByButton);
		return ((listingsAmountToCheck > (listingsAmount - 50)) && ((listingsAmount + 50) > listingsAmountToCheck));
	}

	private int getNumberOfListings(WebElement listingsByButton) {
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

	public boolean  isPriceFilterAppliedOnListings(String typePriceFilter) {
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
		List<WebElement> labelsList;
		waitFor(ExpectedConditions.visibilityOf(openAccountButton));
		if (Config.isAndroid()) {
			labelsList = getDriver().findElements(By.xpath("//*[contains(@content-desc, '" + label + "')]"));
			Assert.assertEquals(2, labelsList.size());
		} else {
			labelsList = getDriver().findElements(MobileBy.iOSNsPredicateString("name CONTAINS 'Listing Status:' AND name CONTAINS '" + label + "'"));
			Assert.assertEquals(20, labelsList.size());
		}
	}

	public void isContainLabels(String label1, String label2){
		List<WebElement> labelsList1;
		List<WebElement> labelsList2;
		waitFor(ExpectedConditions.visibilityOf(openAccountButton));
		if (Config.isAndroid()) {
			labelsList1 = getDriver().findElements(By.xpath("//*[contains(@content-desc, '" + label1 + "')]"));
			labelsList2 = getDriver().findElements(By.xpath("//*[contains(@content-desc, '" + label2 + "')]"));
			Assert.assertEquals(2, labelsList1.size() + labelsList2.size());
		} else {
			labelsList1 = getDriver().findElements(MobileBy.iOSNsPredicateString("name CONTAINS 'Listing Status:' AND name CONTAINS '" + label1 + "'"));
			labelsList2 = getDriver().findElements(MobileBy.iOSNsPredicateString("name CONTAINS 'Listing Status:' AND name CONTAINS '" + label2 + "'"));
			Assert.assertEquals(20, labelsList1.size() + labelsList2.size());
		}
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

	public void openSpecificBuilding() {
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

		universalVerticalSwipe(specificAddress);
		element(specificAddress).click();
	}

	public void waitForClickOnMagnifier() {
		waitFor(ExpectedConditions.visibilityOf(openAccountButton));
		magnifierIcon.click();
	}

    public void checkFilterIsApplied() {
		int listingsAmountToCheck = getNumberOfListings(listingsByButton);
		Assert.assertTrue((listingsAmount - 3000) > listingsAmountToCheck);
    }

	public void shouldSeeListingsFromAllUpperEastSideDistricts(String carnegieHill, String lenoxHill, String upperEastSide, String yorkville) {
	    if(Config.isAndroid()) {
            boolean isAllCellsContain = true;
                List<WebElement> listingList;
                for (int i = 0; i < 3; i++) {
                    listingList = getDriver().findElements(By.id("com.perchwell.re.staging:id/listing_neighborhood"));

                    for (WebElement district : listingList) {
                        if (!(district.getAttribute("text").contains(carnegieHill)
                                || district.getAttribute("text").contains(lenoxHill)
                                || district.getAttribute("text").contains(upperEastSide)
                                || district.getAttribute("text").contains(yorkville))) {
                            isAllCellsContain = false;
                            break;
                        }

                    }
                    universalSingleSwipe();
                }
                Assert.assertTrue(isAllCellsContain);
        } else {
            List<WebElement> districtList1 = getDriver().findElements(MobileBy.iOSNsPredicateString(
                    "value == '" + carnegieHill + "'"));
            List<WebElement> districtList2 = getDriver().findElements(MobileBy.iOSNsPredicateString(
                    "value == '" + lenoxHill + "'"));
            List<WebElement> districtList3 = getDriver().findElements(MobileBy.iOSNsPredicateString(
                    "value == '" + upperEastSide + "'"));
            List<WebElement> districtList4 = getDriver().findElements(MobileBy.iOSNsPredicateString(
                    "value == '" + yorkville + "'"));
            Assert.assertEquals(20, districtList1.size() + districtList2.size() + districtList3.size() + districtList4.size());
        }
        fourDistrictListingsAmount = getNumberOfListings(listingsByButton);
    }

	public void shouldSeeListingsTwoDistricts(String firstDist, String secondDist) {
        if(Config.isAndroid()) {
            boolean isAllCellsContain = true;
            List<WebElement> listingList;
            for (int i = 0; i < 3; i++) {
                listingList = getDriver().findElements(By.id("com.perchwell.re.staging:id/listing_neighborhood"));

                for (WebElement district : listingList) {
                    if (!(district.getAttribute("text").contains(firstDist) || district.getAttribute("text").contains(secondDist))) {
                        isAllCellsContain = false;
                        break;
                    }

                }
                universalSingleSwipe();
            }
            Assert.assertTrue(isAllCellsContain);
        } else {
            List<WebElement> districtList1 = getDriver().findElements(MobileBy.iOSNsPredicateString(
                    "value == '" + firstDist + "'"));
            List<WebElement> districtList2 = getDriver().findElements(MobileBy.iOSNsPredicateString(
                    "value == '" + secondDist + "'"));
            Assert.assertEquals(20, districtList1.size() + districtList2.size());
        }
	}

	public void checkFourDistrictsListings() {
		int listingsAmountToCheck = getNumberOfListings(listingsByButton);
		Assert.assertTrue((listingsAmountToCheck > (fourDistrictListingsAmount - 50)) && ((fourDistrictListingsAmount + 50) > listingsAmountToCheck));
	}

	public void openTwoAgentListing() {
		universalVerticalSwipe(twoAgentListing);
		element(twoAgentListing).click();
	}

	public void waitUntilAccountIconAppears() {
		waitFor(ExpectedConditions.visibilityOf(openAccountButton));
	}

	public void checkIfListingsAreFilteredByMinBeds(int value) {
		boolean result = false;

		waitFor(ExpectedConditions.visibilityOf(openAccountButton));

		if(!currentBedsAmountList.isEmpty() && studioList.isEmpty()) {
			for (WebElement element : currentBedsAmountList) {
				String stringValue;
				result = true;
				if(Config.isAndroid()) {
					stringValue = element.getAttribute("text");
				}
				else {
					stringValue = element.getAttribute("value");
				}
				int processedValue = Integer.parseInt(stringValue.substring(0, stringValue.indexOf(" ")));
				if (processedValue<value) {
					result = false;
					break;
				}
			}
		}
		Assert.assertTrue(result);
	}

	public void checkIfListingsAreFilteredByMinBaths(double expectedValue) {
		boolean result = true;
		String actualValue;

		waitFor(ExpectedConditions.visibilityOf(openAccountButton));
		for (WebElement element : currentBathsAmountList) {
			if (Config.isAndroid()) {
				actualValue = element.getAttribute("text");
			} else {
				actualValue = element.getAttribute("value");
			}
			double processedActualValue = Double.parseDouble(
					actualValue.replaceAll(" BA", "")
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

		for (WebElement element : currentBedsAmountList) {
			String stringValue;
			if(Config.isAndroid()) {
				stringValue = element.getAttribute("text");
			}
			else {
				stringValue = element.getAttribute("value");
			}
			int processedValue = Integer.parseInt(stringValue.substring(0, stringValue.indexOf(" ")));
			if (processedValue!=1 & processedValue!=2 & processedValue!=3) {
				result = false;
				break;
			}
		}
		Assert.assertTrue(result);
	}

	public void checkIfListingsWereNotChanged() {
		int listingsAmountToCheck = getNumberOfListings(listingsByButton);
		Assert.assertEquals(listingsAmount, listingsAmountToCheck);
	}

	public void checkIfThereIsNoListingsWithoutBeds() {
		boolean result = true;

		waitFor(ExpectedConditions.visibilityOf(openAccountButton));

		for (WebElement element : currentBedsAmountList) {
			String value = element.getAttribute("value");
			if (!value.contains("BD") & !value.contains("STUDIO")) {
				result = false;
				break;
			}
		}
		Assert.assertTrue(result);
	}

	public void checkIfThereIsNoListingsWithoutBaths() {
//		boolean result = true;
//
//		waitFor(ExpectedConditions.visibilityOf(openAccountButton));
//
//		for (WebElement element : currentBedsAmountList) {
//			if (!element.getAttribute("value").contains("BA")) {
//				result = false;
//				break;
//			}
//		}
//		Assert.assertTrue(result);
		if (Config.isAndroid()) {
			for (int i = 0; i < ANDROID_LOOP_COUNTER; i++) {
				Assert.assertEquals(bathsInfoList.size(), pricesList.size());
				Helper.universalSingleSwipe();
			}
		} else {
			Assert.assertEquals(20, bathsInfoList.size());
		}
	}

	public void listingsFilteredByMultiBathroomsFilters() {
		boolean result = true;

		waitFor(ExpectedConditions.visibilityOf(openAccountButton));

		for (WebElement element : currentBathsAmountList) {
			String actualValue = element.getAttribute("value");
			double value = Double.parseDouble(
					actualValue.replaceAll(" BA", "")
							.replace("½", ".5"));
			if (value < 1 && value > 3) {
				result = false;
				break;
			}
		}
		Assert.assertTrue(result);
	}

	public void shouldSeeListingWithSqFeetEqualAndMore(String minValue) {
		boolean correctValue = true;
		int min = Integer.parseInt(minValue);
		String sqFeet;

		for(WebElement element: sqFeetList) {
			if (Config.isAndroid()) {
				sqFeet = element.getAttribute("text");
			} else {
				sqFeet = element.getAttribute("value");
			}
			sqFeet = sqFeet.replace(" FT2", "");
			int sqFeetValue = Integer.parseInt(sqFeet.replaceAll("\\D+",""));

			if(sqFeetValue < min) {
				correctValue = false;
				break;
			}
		}
		Assert.assertTrue(correctValue);
	}

	public void shouldSeeListingWithSqFeetEqualAndLess(String maxValue) {
		boolean correctValue = true;
		int max = Integer.parseInt(maxValue);
		String sqFeet;

		for (WebElement element : sqFeetList) {
			if (Config.isAndroid()) {
				sqFeet = element.getAttribute("text");
			} else {
				sqFeet = element.getAttribute("value");
			}
			sqFeet = sqFeet.replace(" FT2", "");
			int sqFeetValue = Integer.parseInt(sqFeet.replaceAll("\\D+", ""));

			if (sqFeetValue > max) {
				correctValue = false;
				break;
			}
		}
		Assert.assertTrue(correctValue);
	}

	public void checkListingsType(String property) {
		if(Config.isAndroid()) {
			for (int i = 0; i < ANDROID_LOOP_COUNTER; i++) {
				Assert.assertTrue(FilteringAndSortingBuildings
						.isContainsPropertyType(getDriver().findElements(MobileBy.xpath("//*[@text = '" + property + "']")), property));
				universalSingleSwipe();
			}
		}
		else {
			List<WebElement> propertyList = getDriver().findElements(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value = '" + property + "'"));
			Assert.assertEquals(propertyList.size(), 20);
		}

	}

	public void clickOnSaveButton() {
		element(saveButton).click();
	}

	public void checkListingsQuantityIsEqual() {
		int listingsAmountToCheck = getNumberOfListings(listingsByButton);
		Assert.assertEquals(listingsAmountToCheck, listingsAmount);
	}

	public void checkIfListingsAmountIsLessThenInitial() {
		int realListingsAmount = getNumberOfListings(listingsByButton);
		Assert.assertTrue(realListingsAmount < listingsAmount);
	}

	public void clickOnSelectionButtonByAddress(String address) {
		int selectionButtonIndex = 0;

		Helper.universalVerticalSwipe(element(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value ==  '" + address + "'")));
		for (int i = 0; i<visibleAddressesList.size(); i++) {
			if (visibleAddressesList.get(i).getAttribute("value").equals(address)) {
				selectionButtonIndex = i + 1;
			}
		}
				element(MobileBy.iOSClassChain(
				"**/XCUIElementTypeButton[$label = 'unselectedCheckboxCircle'$][" + selectionButtonIndex + "]")).click();
	}

	public void clickOnMoreOptionsButton() {
		element(moreOptionsButton).click();
	}

	public void selectContactListingAgentsOption() {
		element(contactListingAgentsOption).click();
	}

	public void selectFirstTestListingWithOneAgent() {
		universalVerticalSwipe(testListingWithOneAgentCheckbox);
		element(testListingWithOneAgentCheckbox).click();
	}

	public void selectTestListingWithTwoAgents() {
		universalVerticalSwipe(testListingWithTwoAgentsCheckbox);
		element(testListingWithTwoAgentsCheckbox).click();
	}

	public void clickOnContactListingAgentsButton() {
		element(contactListingAgentsOption).click();
	}

	public void checkMoreButtonIsShown() {
		element(moreOptionsButton).shouldBeVisible();
	}

	public void checkThatThreeListingsAreSelected() {
		Assert.assertEquals(3, selectedListingsList.size());
	}

	public void selectFirstListings() {
		universalVerticalShortSwipe(firstContactListingCheckbox);
		element(firstContactListingCheckbox).click();
	}

	public void selectSecondListings() {
		element(secondContactListingCheckbox).click();
	}

	public void selectThirdListings() {
		element(thirdContactListingCheckbox).click();
	}

	public void getListingsAddresses(int amount) {
		if(Config.isAndroid()) {
			for(int i = 0; i < amount; i++) {
				SessionVariables.addValueInSessionVariable("listingAddress" + (i + 1),
						element(MobileBy.xpath("*//android.widget.TextView[contains(@content-desc, 'ADDRESS:')]")).getAttribute("text"));
				universalSingleSwipe();
			}
		} else {
			for (int i = 0; i < amount; i++) {
				SessionVariables.addValueInSessionVariable("listingAddress" + (i + 1), addressesList.get(i).getAttribute("value"));
			}
		}
	}

	public void checkSelectAllButtonIsShown() {
		element(slectAllButton).shouldBeVisible();
	}

	public void checkDeselectAllButtonIsShown() {
		element(deselectAllButton).shouldBeVisible();
	}

	public void checkCounterWithValueThreeIsShown() {
		element(counterWithValueThree).shouldBeVisible();
	}

	public void checkSelectedWordIsShown() {
		element(selectedWord).shouldBeVisible();
	}

	public void clickOnTagSelectedListingsOption() {
		element(tagSelectedListingsOption).click();
	}

	public void clickOnSelectAll() {
        element(slectAllButton).click();
    }

	public void clickOnDeselectAllListingsButton() {
		element(deselectAllButton).click();
	}

	public void selectThirdAndFourthListingsByAddress() {
		WebElement thirdListingsCheckBox;
		WebElement fourthListingsCheckBox;
		if (Config.isAndroid()) {
			thirdListingsCheckBox = element(MobileBy.xpath("*//android.widget.ImageView[contains(@content-desc, 'Select button: unselected "
					+ SessionVariables.getValueFromSessionVariable("listingAddress3") + "')]"));
			fourthListingsCheckBox = element(MobileBy.xpath("*//android.widget.ImageView[contains(@content-desc, 'Select button: unselected "
					+ SessionVariables.getValueFromSessionVariable("listingAddress4") + "')]"));
		} else {
			thirdListingsCheckBox = element(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name CONTAINS 'Select button: unselected "
					+ SessionVariables.getValueFromSessionVariable("listingAddress3") + "'"));
			fourthListingsCheckBox = element(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name CONTAINS 'Select button: unselected "
					+ SessionVariables.getValueFromSessionVariable("listingAddress4") + "'"));
		}
		universalVerticalSwipe(thirdListingsCheckBox);
		element(thirdListingsCheckBox).click();
		universalVerticalSwipe(fourthListingsCheckBox);
		element(fourthListingsCheckBox).click();
	}

	public void clickOnTagIconOnFirstListing() {
		element(tagIconOnFirstListing).click();
	}

	public void checkOneListingIsSelected() {
		Assert.assertEquals(1, selectedListingsList.size());

	}

	public void clickOnDiscussionIconOnFirstListing() {
		element(discussionButton).click();
	}

	public void checkSelectedLabelEquals(int value) {
		Assert.assertEquals(value, Integer.parseInt(numberOfSelectedListings.getAttribute("value")));
	}

	public void checkListingsAreSelected(int value) {
		Assert.assertEquals(value, selectedListingsListByAddress.size());
	}

	public void tabBarIsHidden() {
		setImplicitTimeout(5, SECONDS);
		element(analyticsButton).shouldNotBeVisible();
		element(map).shouldNotBeVisible();
		element(listButton).shouldNotBeVisible();
		resetImplicitTimeout();
	}

	public void tabBarIsShown() {
		element(analyticsButton).shouldBeVisible();
		element(map).shouldBeVisible();
		element(listButton).shouldBeVisible();
	}

	public void sortingMenuIsHidden() {
		setImplicitTimeout(3, SECONDS);
		element(listingsByButton).shouldNotBeVisible();
		resetImplicitTimeout();
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

	public void swipeUpListViewToRefresh() {
		singleUpShortSwipeIOS();
	}

	public void clickOnTagIconOnSecondListing() {
		element(tagIconOnSecondListing).click();
	}

    public void checkTagsIconCountForFirstListing(String value) {
		Assert.assertEquals(value, element(tagIconOnFirstListing).getAttribute("label").replace(" ", ""));
    }

	public void checkTagsIconCountForSecondListing(String value) {
		Assert.assertEquals(value, element(tagIconOnSecondListing).getAttribute("label").replace(" ", ""));
	}

	public void getListingsAmount() {
		SessionVariables.addValueInSessionVariable("listingsAmount", String.valueOf(getNumberOfListings(listingsByButton)));
	}

	public void checkIfCurrentListingsAddressesIsReturned() {
		for (int i = 0; i < addressesList.size(); i++) {
			Assert.assertEquals(SessionVariables.getValueFromSessionVariable("currentListingsAddress" + (i + 1)), addressesList.get(i).getAttribute("value").toUpperCase());
		}
	}

	public void openListingWithOneAgent() {
		universalVerticalSwipe(testListingWithOneAgent);
		element(testListingWithOneAgent).click();
	}
}
