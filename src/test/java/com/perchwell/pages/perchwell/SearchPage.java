package com.perchwell.pages.perchwell;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.Helper;
import com.perchwell.helpers.RandomGenerator;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

public class SearchPage extends BasePage {

	//region WebElements

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
	private WebElement firstLocation;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton")
	private WebElement deleteFirstLocationButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/apply")
	@iOSXCUITFindBy(accessibility = "ApplySearchButton")
	private WebElement applySearchButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")
	private WebElement deleteSecondLocationButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
	private WebElement itemListView;

	@iOSXCUITFindBy(accessibility = "BATHROOMS Suboption: 3")
	private WebElement filterFor3Baths;

	@iOSXCUITFindBy(accessibility = "BEDROOMS Suboption: 2")
	private WebElement filterFor2Beds;

	@AndroidFindBy(xpath = "//*[@text='Studio']")
	@iOSXCUITFindBy(accessibility = "BEDROOMS Suboption: Studio")
	private WebElement filterForStudioBeds;

	@iOSXCUITFindBy(accessibility = "BATHS")
	private WebElement baths;

	@iOSXCUITFindBy(accessibility = "Working Fireplace")
	private WebElement fireplaceFilter;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/load")
	@iOSXCUITFindBy(accessibility = "LoadSavedSearchButton")
	private WebElement loadSavedSearchButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/subtitle")
	@iOSXCUITFindBy(accessibility = "TAP TO SAVE CHANGES")
	private WebElement tapToSaveChanges;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/rename_group_edit_text")
	@iOSXCUITFindBy(accessibility = "generic_text_input_field")
	private WebElement searchName;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/positive_button")
	@iOSXCUITFindBy(accessibility = "SAVE")
	private WebElement saveButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/search_src_text")
	@iOSXCUITFindBy(accessibility = "Asking Price Minimum Value Input")
	private WebElement minimumPriceTextBox;

	@iOSXCUITFindBy(accessibility = "Asking Price Maximum Value Input")
	private WebElement maximumPriceTextBox;

	@iOSXCUITFindBy(accessibility = "BATHROOMS Suboption: 1")
	private WebElement filterFor1Bath;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/in_contract")
	@iOSXCUITFindBy(accessibility = "Listing Status Suboption: In Contract")
	private WebElement inContractFilter;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/off_market")
	@iOSXCUITFindBy(accessibility = "Listing Status Suboption: Off Market")
	private WebElement offMKTButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/sold_rented")
	@iOSXCUITFindBy(accessibility = "Listing Status Suboption: Sold/Rented")
	private WebElement soldOrRentedButton;

	@iOSXCUITFindBy(accessibility = "Listing Status Suboption: Expired")
	private WebElement expiredButton;

	@iOSXCUITFindBy(accessibility = "Listing Status Suboption: Active")
	private WebElement activeButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[not(contains(@name,'LISTING STATUS'))]")
	private List<WebElement> statusFilterList;

	@iOSXCUITFindBy(accessibility = "Remove Button: BROOKLYN")
	private WebElement deleteTagButtonBROOKLYN;

	@iOSXCUITFindBy(accessibility = "deleteTagButtonMANHATTAN")
	private WebElement deleteTagButtonMANHATTAN;

	@iOSXCUITFindBy(accessibility = "Remove Button: QUEENS")
	private WebElement deleteTagButtonQUEENS;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name=='Add Button: Bar'`][1]")
	private WebElement searchNeihborhoods;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[3]")
	@iOSXCUITFindBy(xpath = "*//XCUIElementTypeTable/XCUIElementTypeCell[3]")
	private WebElement thirdSearchInList;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]")
	@iOSXCUITFindBy(xpath = "*//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	private WebElement firstSearchInList;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/up_button")
	@iOSXCUITFindBy(accessibility = "SavedSearchCancelButton")
	private WebElement savedSearchCancelButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/first_option")
	@iOSXCUITFindBy(accessibility = "OVERWRITE")
	private WebElement overwrite;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/second_option")
	@iOSXCUITFindBy(accessibility = "SAVE AS...")
	private WebElement save;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/rentals")
	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name CONTAINS 'Rentals'")
	private WebElement rentalsButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/create_new_search")
	@iOSXCUITFindBy(accessibility = "CreateNewSearchButton")
	private WebElement createNewSearchButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/reset_filters")
	@iOSXCUITFindBy(accessibility = "RESET FILTERS")
	private WebElement resetFiltersButton;

	@AndroidFindBy(xpath = "//*[@content-desc='1BedButton']")
	@iOSXCUITFindBy(accessibility = "BEDROOMS Suboption: 1")
	private WebElement filterFor1Bed;

	@AndroidFindBy(xpath = "//*[contains(@content-desc,'1BedButton')]")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$name BEGINSWITH 'BEDROOMS Suboption' AND name ENDSWITH ': 1'$]")
	private WebElement filter1BedSelectedOrNot;

	@iOSXCUITFindBy(accessibility = "BEDROOMS Suboption: 3")
	private WebElement filterFor3Beds;

	@AndroidFindBy(xpath = "//*[@content-desc='4PlusBedsButton']")
	@iOSXCUITFindBy(accessibility = "BEDROOMS Suboption: 4+")
	private WebElement filterFor4PlusBeds;

	@AndroidFindBy(xpath = "(//*[@resource-id='com.perchwell.re.staging:id/one_room'])[2]")
	@iOSXCUITFindBy(accessibility = "BATHROOMS Suboption: 1½")
	private WebElement filterFor1AndHalfBath;

	@iOSXCUITFindBy(accessibility = "BATHROOMS Suboption: 2")
	private WebElement filterFor2Baths;

	@iOSXCUITFindBy(accessibility = "BATHROOMS Suboption: 4+")
	private WebElement filterFor4PlusBaths;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell/XCUIElementTypeButton[2]")
	private WebElement deleteSearchButton;

	@AndroidFindBy(xpath = "//*[@content-desc='StudioBedsButton-selected']")
	@iOSXCUITFindBy(accessibility = "BEDROOMS Suboption Selected: Studio")
	private WebElement selectedFilterForStudioBeds;

	@AndroidFindBy(xpath = "(//*[@resource-id='com.perchwell.re.staging:id/one_room'])[1]")
	@iOSXCUITFindBy(accessibility = "BEDROOMS Suboption Selected: 1")
	private WebElement selectedFilterFor1Bed;

	@iOSXCUITFindBy(accessibility = "BEDROOMS Suboption Selected: 2")
	private WebElement selectedFilterFor2Beds;

	@iOSXCUITFindBy(accessibility = "BEDROOMS Suboption Selected: 3")
	private WebElement selectedFilterFor3Beds;

	@iOSXCUITFindBy(accessibility = "BEDROOMS Suboption Selected: 4+")
	private WebElement selectedFilterFor4PlusBeds;

	@iOSXCUITFindBy(accessibility = "BATHROOMS Suboption Selected: 1")
	private WebElement selectedFilterFor1Bath;

	@AndroidFindBy(xpath = "(//*[@resource-id='com.perchwell.re.staging:id/one_room'])[2]")
	@iOSXCUITFindBy(accessibility = "BATHROOMS Suboption Selected: 1½")
	private WebElement selectedFilterFor1AndHalfBath;

	@iOSXCUITFindBy(accessibility = "BATHROOMS Suboption Selected: 2")
	private WebElement selectedFilter2Baths;

	@iOSXCUITFindBy(accessibility = "BATHROOMS Suboption Selected: 3")
	private WebElement selectedFilterFor3Baths;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/active")
    @iOSXCUITFindBy(accessibility = "Listing Status Suboption Selected: Active")
    private WebElement selectedActiveFilter;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/in_contract")
    @iOSXCUITFindBy(accessibility = "Listing Status Suboption Selected: In Contract")
    private WebElement selectedContractFilter;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/off_market")
    @iOSXCUITFindBy(accessibility = "Listing Status Suboption Selected: Off Market")
    private WebElement selectedOffMktFilter;

    @iOSXCUITFindBy(accessibility = "Option Selected: Sales")
    private WebElement selectedSalesFilter;

	@iOSXCUITFindBy(accessibility = "Fireplace-SELECTED")
	private WebElement selectedFireplaceFilter;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeStaticText[1]")
	private WebElement universalNewSearchButton;

	@AndroidFindBy(xpath = "//*[@text='LAUNDRY BLDG']")
	@iOSXCUITFindBy(accessibility = "Building Laundry")
	private WebElement laundryBLDGFilterButton;

	@AndroidFindBy(xpath = "//*[@text='LAUNDRY BLDG']")
	@iOSXCUITFindBy(accessibility = "Laundry Bldg-SELECTED")
	private WebElement selectedLaundryBLDGFilter;

	@iOSXCUITFindBy(accessibility = "Condo")
	private WebElement condoFilter;

	@iOSXCUITFindBy(accessibility = "Outdoor Space")
	private WebElement outdoorSpaceFilter;

	@iOSXCUITFindBy(accessibility = "Prewar")
	private WebElement prewarFilter;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeImage[`name CONTAINS[cd] \"knob_upd\"`][3]")
	private WebElement squareFeetMinControl;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeImage[`name CONTAINS[cd] \"knob_upd\"`][4]")
	private WebElement squareFeetMaxControl;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeImage[`name CONTAINS[cd] \"knob_upd\"`][4]")
	private WebElement waitElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[10]/XCUIElementTypeOther[2]")
	private WebElement squareFeetSlider;

	@iOSXCUITFindBy(accessibility = "Doorman")
	private WebElement doormanFilter;

	@iOSXCUITFindBy(accessibility = "Elevator")
	private WebElement elevatorFilter;

	@iOSXCUITFindBy(accessibility = "New Development")
	private WebElement developmentFilter;

	@iOSXCUITFindBy(accessibility = "Pets")
	private WebElement petsFilter;

	@iOSXCUITFindBy(accessibility = "Pool")
	private WebElement poolFilter;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS 'NO MIN'")
	private WebElement squareFeetMinimumValue;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS '10,000+'")
	private WebElement squareFeetMaximumValue;

	@iOSXCUITFindBy(accessibility = "Washer Dryer")
	private WebElement laundryUnitFilter;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ImageView")
	@iOSXCUITFindBy(accessibility = "Tag Cell: Add Button")
	private WebElement neighborhoodsPlusButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/up_button")
	@iOSXCUITFindBy(accessibility = "MY NEW SEARCH")
	private WebElement backButtonFromNeighborhoods;

	@iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeCell' AND name CONTAINS 'City-MANHATTAN'")
	private WebElement manhattanCheckedCheckbox;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"BROOKLYN\"]/android.widget.ImageView")
	@iOSXCUITFindBy(accessibility = "Remove Button: Brooklyn")
	private WebElement brooklynRemoveIcon;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"QUEENS\"]/android.widget.ImageView")
	@iOSXCUITFindBy(accessibility = "Remove Button: Queens")
	private WebElement queensRemoveIcon;

	@AndroidFindBy(accessibility = "Alphabet City")
	@iOSXCUITFindBy(accessibility = "Neighborhood-Alphabet City")
	private WebElement alphabetCityCheckbox;

	@iOSXCUITFindBy(accessibility = "Tag Cell: Search Text Field")
	private WebElement searchNeihborhoodsSearchField;

	@iOSXCUITFindBy(accessibility = "Remove Button: MIDWOOD")
	private WebElement midwoodRemoveIcon;

	@iOSXCUITFindBy(accessibility = "Remove Button: ALL UPPER EAST SIDE")
	private WebElement allUpperEastSideRemoveIcon;

	@iOSXCUITFindBy(accessibility = "Remove Button: CARNEGIE HILL")
	private WebElement carnegieHillsRemoveIcon;

	@iOSXCUITFindBy(accessibility = "Remove Button: UPPER EAST SIDE")
	private WebElement upperEastSideRemoveIcon;

	@iOSXCUITFindBy(accessibility = "Remove Button: YORKVILLE")
	private WebElement yorkvilleRemoveIcon;

	@iOSXCUITFindBy(accessibility = "ADDRESS")
	private WebElement searchByAddressButton;

	@iOSXCUITFindBy(accessibility = "AddressSearchBar")
	private WebElement addressSearchField;

	@iOSXCUITFindBy(accessibility = "THE MURRAY HILL, 240 EAST 35TH STREET")
	private WebElement testBuilding;

	@iOSXCUITFindBy(accessibility = "AddressSearchCancelButton")
	private WebElement addressSearchCancelButton;

	@iOSXCUITFindBy(accessibility = "Show more features & amenities")
	private WebElement showMoreFeaturesAndAmenitiesButton;

	@iOSXCUITFindBy(accessibility = "CURRENT STATUS")
	private WebElement currentStatusSection;

	@iOSXCUITFindBy(accessibility = "PROPERTY TYPE")
	private WebElement propertyTypeSection;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/range")
	@iOSXCUITFindBy(accessibility = "BEDROOMS Option: Range")
	private WebElement bedroomsRangeOption;

	@iOSXCUITFindBy(accessibility = "BATHROOMS Option: Range")
	private WebElement bathroomsRangeOption;

	@iOSXCUITFindBy(accessibility = "SQUARE FEET Minimum Value Input")
	private WebElement squareFeetMinValueField;

	@iOSXCUITFindBy(accessibility = "SQUARE FEET Maximum Value Input")
	private WebElement squareFeetMaxValueField;

	@iOSXCUITFindBy(accessibility = "MOTHLIES")
	private WebElement monthliesSection;

	@iOSXCUITFindBy(accessibility = "BEDROOMS Suboption: Studio +")
	private WebElement studioBedsMinimumFilter;

	@iOSXCUITFindBy(accessibility = "BEDROOMS Suboption: 1+")
	private WebElement oneBedMinimumFilter;

	@iOSXCUITFindBy(accessibility = "BEDROOMS Suboption: 2+")
	private WebElement twoBedsMinimumFilter;

	@iOSXCUITFindBy(accessibility = "BEDROOMS Suboption Selected: 2+")
	private WebElement selectedTwoBedsMinimumFilter;

	@iOSXCUITFindBy(accessibility = "BEDROOMS Suboption: 3+")
	private WebElement threeBedsMinimumFilter;

	@iOSXCUITFindBy(accessibility = "BEDROOMS Suboption: 4+")
	private WebElement fourBedsMinimumFilter;

	@iOSXCUITFindBy(accessibility = "BATHROOMS Suboption: 1+")
	private WebElement oneBathMinimumFilter;

	@iOSXCUITFindBy(accessibility = "BATHROOMS Suboption: 1½+")
	private WebElement oneAndHalfBathsMinimumFilter;

	@iOSXCUITFindBy(accessibility = "BATHROOMS Suboption: 2+")
	private WebElement twoBathsMinimumFilter;

	@iOSXCUITFindBy(accessibility = "BATHROOMS Suboption Selected: 2+")
	private WebElement selectedTwoBathsMinFilter;

	@iOSXCUITFindBy(accessibility = "BATHROOMS Suboption: 3+")
	private WebElement threeBathsMinimumFilter;

	@iOSXCUITFindBy(accessibility = "BATHROOMS Suboption: 4+")
	private WebElement fourBathsMinimumFilter;

	@iOSXCUITFindBy(accessibility = "TOTAL ROOMS")
	private WebElement totalRoomsSection;

	@iOSXCUITFindBy(accessibility = "BATHROOMS Suboption Selected: 4+")
	private WebElement selectedFilterFor4PlusBaths;

	@iOSXCUITFindBy(accessibility = "BEDROOMS Option: Minimum")
	private WebElement bedroomsMinimumOption;

	@iOSXCUITFindBy(accessibility = "BATHROOMS Option: Minimum")
	private WebElement bathroomsMinimumOption;

	@iOSXCUITFindBy(accessibility = "Cell Collapsible Button: BEDROOMS")
	private WebElement bedroomsCollapseButton;

	@iOSXCUITFindBy(accessibility = "Cell Collapsible Button: BATHROOMS")
	private WebElement bathroomsCollapseButton;

	@iOSXCUITFindBy(accessibility = "BEDROOMS Option Selected: Range")
	private WebElement selectedBedroomsRangeOption;

	@iOSXCUITFindBy(accessibility = "BATHROOMS Option Selected: Range")
	private WebElement selectedBathroomsRangeOption;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Manhattan\"]/android.widget.RelativeLayout/android.widget.ImageView")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[$name CONTAINS 'City-Manhattan'$]/XCUIElementTypeButton")
	private WebElement manhattanSection;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"All Downtown\"]/android.widget.RelativeLayout/android.widget.ImageView")
	private WebElement allDownTownSection;

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnUniversalNewSearchButton() {
		element(universalNewSearchButton).click();
	}

	public void clickOnApplyButton() {
		WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
		WebDriver webDriver = webDriverFacade.getProxiedDriver();
		AppiumDriver appiumDriver = (AppiumDriver) webDriver;
		if(!Config.isAndroid()) {
			appiumDriver.hideKeyboard();
		}
		element(applySearchButton).click();
	}

	public void clickOnDeleteSecondLocation() {
		deleteSecondLocationButton.click();
	}

	public void selectFilterFor3Baths() {
		element(filterFor3Baths).click();
	}

	public void selectFilterFor2Beds() {
		element(filterFor2Beds).click();
	}

	public void clickLoadSavedSearchButton() {
		element(loadSavedSearchButton).click();
	}

	public void clickOnTapToSaveChanges() {
		element(tapToSaveChanges).click();
	}

	public void clickOnSaveButton() {
		element(saveButton).click();
	}

	public void setSearchName(String search) {
		element(searchName).sendKeys(search);
	}

	public String generateRandomString(String str) {
		return RandomGenerator.getRandomString(str);
	}

	public void clickOnPreviouslyCreatedSearch(String search) {
		if(Config.isAndroid()) {
			getDriver().findElement(By.xpath("//*[@text='" + search.toUpperCase() + "']")).click();
		} else {
			getDriver().findElement(By.name(search.toUpperCase())).click();
		}
	}

	public void shouldSeePreviouslyCreatedSearch(String search) {
		WebElement previouslyCreatedSearch;

		if(Config.isAndroid()) {
			previouslyCreatedSearch = element(By.xpath("//*[@text='" + search.toUpperCase() + "']"));
		} else {
			previouslyCreatedSearch = element(By.name(search.toUpperCase()));
		}
		element(previouslyCreatedSearch).shouldBeVisible();
	}

	public void setMinimumPriceFilter(String price) {
		element(minimumPriceTextBox).sendKeys(price);
		if(!Config.isAndroid()) {
			getDriver().findElement(By.name("Done")).click();
		}

	}

	public void selectFilterStudioBeds() {
		Helper.universalVerticalSwipe(filterForStudioBeds);
		element(filterForStudioBeds).click();
	}

	public void clickOnFilterStudioBeds() {
		if (element(selectedFilterForStudioBeds).isPresent()) {
			element(selectedFilterForStudioBeds).click();
		} else {
			element(filterForStudioBeds).click();
		}
	}

	public void selectFilter1Bath() {
		Helper.universalVerticalSwipe(totalRoomsSection);
		element(filterFor1Bath).click();
	}

	public void setFilterActive() {
		element(activeButton).click();
	}

	public void selectOffMktFilter() {
		Helper.universalVerticalSwipe(offMKTButton);
		element(offMKTButton).click();
	}

	public void selectSoldOrRentFilter() throws Exception {
		Helper.universalVerticalSwipe(soldOrRentedButton);
		element(soldOrRentedButton).click();
	}

	public void selectContractFilter() {
		Helper.universalVerticalSwipe(inContractFilter);
		element(inContractFilter).click();
	}

	public void clickDeleteTagButtonQUEENS() {
		element(deleteTagButtonQUEENS).click();
	}

	public void clickDeleteTagButtonBROOKLYN() {
		element(deleteTagButtonBROOKLYN).click();
	}

	public void clickDeleteTagButtonMANHATTAN() {
		element(deleteTagButtonMANHATTAN).click();
	}

	public void clickOnLocationFilter() {
		element(searchNeihborhoods).click();
	}

	public void clickOnThirdSearchInList() {
		element(thirdSearchInList).click();
	}

	public boolean isAnySearchExist() {
		return Helper.isElementDisplayed(firstSearchInList);
	}

	public void selectFirstSearchAndSaveName() {
		String searchName;
		if(Config.isAndroid()) {
			searchName = firstSearchInList.getAttribute("text");
		} else {
			searchName = firstSearchInList.getAttribute("name");
		}

		SessionVariables.addValueInSessionVariable("SearchName", searchName);
		firstSearchInList.click();
	}

	public void savedSearchCancelButtonClick() {
		element(savedSearchCancelButton).click();
	}

	public void overwriteOptionSelect() {
		element(overwrite).click();
	}

	public void saveAsOptionSelect() {
		element(save).click();
	}

	public boolean isElementExistsInEachCell(String filterName) {
		boolean isAllCellsContain = true;
		WebElement table = getDriver().findElements(By.className("XCUIElementTypeTable")).get(0);
		List<WebElement> listCells = table.findElements(By.className("XCUIElementTypeCell"));
		if (listCells.size() > 0) {
			for (int i = 0; (i < 10 || i < listCells.size()); i++) {
				if (listCells.get(i).findElements(By.name(filterName)).size() == 0) {
					isAllCellsContain = false;
					break;
				}
			}
		}
		return isAllCellsContain;
	}

	public void selectRentedFilter() {
		Helper.universalVerticalSwipe(rentalsButton);
		element(rentalsButton).click();
	}

	public void createNewSearchButtonClick() {
		element(createNewSearchButton).click();
	}

	public void selectFilter1Bed() {
		element(filterFor1Bed).click();
	}

	public void clickOnFilter1Bed() {
		element(filter1BedSelectedOrNot).click();
	}

	public void selectFilter3Beds() {
		element(filterFor3Beds).click();
	}

	public void selectFilter4PlusBeds() {
		element(filterFor4PlusBeds).click();
	}

	public void clickOnResetFilters() {
		element(resetFiltersButton).click();
	}

	public void selectFilter1AndHalfBath() {
		element(filterFor1AndHalfBath).click();
	}

	public void selectFilter2Baths() {
		element(filterFor2Baths).click();
	}

	public void selectFilter3Baths() {
		element(filterFor3Baths).click();
	}

	public void selectFilter4PlusBaths() {
		element(filterFor4PlusBaths).click();
	}

	public void swipeCreatedSearch(String name) throws Exception {
		WebElement search = getDriver().findElement(MobileBy.AccessibilityId(name));
		int y = search.getLocation().getY();
		Helper.swipeRightElementWithSetY(search, y+1);
	}

	public void clickOnDeleteSearchButton() {
		element(deleteSearchButton).click();
	}

	public void shouldDeleteSearch() {
		String search = SessionVariables.getValueFromSessionVariable("Search");
		element(MobileBy.AccessibilityId(search)).shouldNotBeVisible();
	}

	public void setUpSessionVariableForStatusFilter(WebElement name) {
		String selected;

		if(Config.isAndroid())  {
			selected = name.getAttribute("text");
		} else {
			selected = name.getAttribute("value");
		}

		if (!selected.contains("selected")) {
			SessionVariables.addValueInSessionVariable("status filter", "not selected");
			return;
		}
		SessionVariables.addValueInSessionVariable("status filter", "selected");
	}

	public WebElement getFilterFor1Bed() {
		return filter1BedSelectedOrNot;
	}

	private String getValueFromMinPriceFilter() {
		String minPrice = minimumPriceTextBox.getAttribute("value");
		minPrice = Helper.removeChar(minPrice, '$');
		minPrice = Helper.removeChar(minPrice, ',');
		return minPrice;
	}

	private boolean isMinPriceSaved() {
		boolean minPriceSaved = false;
		String minPriceEnteredPreviously = SessionVariables.getValueFromSessionVariable("min_price");
		String minPriceInFilter = getValueFromMinPriceFilter();

		if (minPriceEnteredPreviously.equalsIgnoreCase(minPriceInFilter)) {
			minPriceSaved = true;
		}
		return minPriceSaved;
	}

	public void shouldMinPriceHaveTheSameValue() {
		Assert.assertTrue(isMinPriceSaved());
	}

	private boolean isFilterFor1BedSaved() {
		boolean filterFor1BedSaved = false;
		String statusFilterPreviously = SessionVariables.getValueFromSessionVariable("status filter");
		String statusFilter;

		if(Config.isAndroid()) {
			statusFilter = filter1BedSelectedOrNot.getAttribute("text");
		} else {
			statusFilter = filter1BedSelectedOrNot.getAttribute("name");
		}

		if ((statusFilterPreviously.equals("selected") && statusFilter.contains("selected"))
				|| (statusFilterPreviously.equals("not selected") && !statusFilter.contains("selected"))) {
			filterFor1BedSaved = true;
		}

		return filterFor1BedSaved;
	}

	public void shouldFilter1BedBeOfTheSameStatus() {
		Assert.assertTrue(isFilterFor1BedSaved());
	}

	public void deselectFilterStudioBeds() {
		element(selectedFilterForStudioBeds).click();
	}

	public void deselectFilter1Bed() {
		element(selectedFilterFor1Bed).click();
	}

	public void deselectFilter2Beds() {
		element(selectedFilterFor2Beds).click();
	}

	public void deselectFilter3Beds() {
		element(selectedFilterFor3Beds).click();
	}

	public void checkNoOneBedsRangeFilterSelected() {
		SoftAssertions softAssert = new SoftAssertions();
		softAssert.assertThat(Helper.isElementDisplayed(element(filterForStudioBeds))).isTrue();
		softAssert.assertThat(Helper.isElementDisplayed(element(filterFor1Bed))).isTrue();
		softAssert.assertThat(Helper.isElementDisplayed(element(filterFor2Beds))).isTrue();
		softAssert.assertThat(Helper.isElementDisplayed(element(filterFor3Beds))).isTrue();
		softAssert.assertThat(Helper.isElementDisplayed(element(filterFor4PlusBeds))).isTrue();
		softAssert.assertAll();
	}

	public void deselectFilter1Bath() {
		Helper.universalVerticalSwipe(totalRoomsSection);
		element(selectedFilterFor1Bath).click();
	}

	public void deselectFilter1AndHalfBath() {
		element(selectedFilterFor1AndHalfBath).click();
	}

	public void deselectFilter2Baths() {
		element(selectedFilter2Baths).click();
	}

	public void deselectFilter3Baths() {
		element(selectedFilterFor3Baths).click();
	}

	public void checkNoOneBathsRangeFilterSelected() {
		Helper.universalVerticalShortSwipe(totalRoomsSection);
		SoftAssertions softAssert = new SoftAssertions();
		softAssert.assertThat(Helper.isElementDisplayed(element(filterFor1Bath))).isTrue();
		softAssert.assertThat(Helper.isElementDisplayed(element(filterFor1AndHalfBath))).isTrue();
		softAssert.assertThat(Helper.isElementDisplayed(element(filterFor2Baths))).isTrue();
		softAssert.assertThat(Helper.isElementDisplayed(element(filterFor3Baths))).isTrue();
		softAssert.assertThat(Helper.isElementDisplayed(element(filterFor4PlusBaths))).isTrue();
		softAssert.assertAll();
	}

	public void setMaximumPriceFilter(String price) {
		element(maximumPriceTextBox).typeAndEnter(price);
	}

	public void clearPriceFilterValue(String typePrice) {
		switch (typePrice) {
			case "minPrice" :
				element(minimumPriceTextBox).clear();
				break;

			case "maxPrice" :
				element(maximumPriceTextBox).clear();
				break;
		}
	}

	private boolean isMinAndMaxPricesNotSet() {
		boolean emptyPricesFilters = true;
		String maxPriceFilter = element(maximumPriceTextBox).getAttribute("value");
		String minPriceFilter = element(minimumPriceTextBox).getAttribute("value");

		if (!maxPriceFilter.contains("Max") || !minPriceFilter.contains("Min")) {
			emptyPricesFilters = false;
		}
		return emptyPricesFilters;
	}

	public void shouldNoOnePriceFilterBeSelected() {
		Assert.assertTrue(isMinAndMaxPricesNotSet());
	}

    public void deselectActiveFilter() {
		if (Config.isAndroid()) {
			setImplicitTimeout(1, SECONDS);
			Helper.universalVerticalSwipe(selectedActiveFilter);
			resetImplicitTimeout();
		} else {
			Helper.universalVerticalSwipe(selectedActiveFilter);
		}
		element(selectedActiveFilter).click();
    }

    public void deselectContractFilter() {
		Helper.universalVerticalSwipe(selectedContractFilter);
	    element(selectedContractFilter).click();
    }

    public void deselectOffMktFilter() {
		Helper.universalVerticalSwipe(selectedOffMktFilter);
	    element(selectedOffMktFilter).click();
    }

    public void checkSalesAndActiveFiltersSelected(){
		SoftAssertions softAssertions = new SoftAssertions();
		Helper.universalVerticalSwipe(propertyTypeSection);
		softAssertions.assertThat(element(selectedSalesFilter).isDisplayed());
        Helper.universalVerticalSwipe(currentStatusSection);
		softAssertions.assertThat(element(selectedActiveFilter).isDisplayed());
		softAssertions.assertAll();
    }

	public void shouldFireplaceFilterBeSelected() {
		element(selectedFireplaceFilter).shouldBePresent();
	}

	public void should1BedFilterBeApplied() {
		element(selectedFilterFor1Bed).shouldBeVisible();
	}

	public void should1AndHalfBathFilterBeApplied() {
		element(selectedFilterFor1AndHalfBath).shouldBeVisible();
	}

	public void setUpFilterLaundryBLDG() {
		element(laundryBLDGFilterButton).click();
	}

	public void scrollToLaundryBLDG() {
		if (Config.isAndroid()) {
			setImplicitTimeout(1, SECONDS);
			Helper.androidSwipeDownUntilElementVisible("LAUNDRY BLDG");
			resetImplicitTimeout();
		} else {
			Helper.universalVerticalSwipe(laundryBLDGFilterButton);
		}
	}

	public void shouldLaundryBLDGFilterBeApplied() {
		if (Config.isAndroid()) {
			setImplicitTimeout(1, SECONDS);
			Helper.androidSwipeDownUntilElementVisible("LAUNDRY BLDG");
			resetImplicitTimeout();
			element(selectedLaundryBLDGFilter).shouldBeVisible();
		} else {
			element(selectedLaundryBLDGFilter).shouldBePresent();
		}
	}

    public void selectCondoFilter() throws Exception {
		Helper.swipeDownUntilElementVisible(condoFilter);
		element(condoFilter).click();
    }

	public void selectOutdoorSpaceFilter() throws Exception {
		Helper.swipeDownUntilElementVisible(outdoorSpaceFilter);
		element(outdoorSpaceFilter).click();
	}

	public void selectPrewarFilter() throws Exception {
		Helper.swipeDownUntilElementVisible(prewarFilter);
		element(prewarFilter).click();
	}

	public void setSquareFeetMinFilterToSixK() throws Exception {
		Helper.universalVerticalSwipe(monthliesSection);
		element(squareFeetMinValueField).sendKeys("6000");
	}

	private int getXCoordinateForSixK() {
		Dimension size = getDriver().manage().window().getSize();
		int deviceWidth = size.width;
		int sliderStartPositionX = squareFeetSlider.getLocation().getX();
		int sliderWidth = deviceWidth - (sliderStartPositionX * 2);

		return (sliderStartPositionX + ((sliderWidth / 20) * 11));
	}

	public void clickOnDoormanFilter() throws Exception {
		Helper.swipeDownUntilElementVisible(doormanFilter);
		element(doormanFilter).click();
	}

	public void addElevatorFilter() throws Exception {
		Helper.swipeDownUntilElementVisible(elevatorFilter);
		element(elevatorFilter).click();
	}

	public void clickOnLaundryBuildingFilter() throws Exception {
		Helper.swipeDownUntilElementVisible(laundryBLDGFilterButton);
		element(laundryBLDGFilterButton);
	}

	public void clickOnPetsFilter() throws Exception {
		Helper.swipeDownUntilElementVisible(petsFilter);
		element(petsFilter).click();
	}

	public void clickOnDevelopmentFilter() throws Exception {
		Helper.swipeDownUntilElementVisible(developmentFilter);
		element(developmentFilter).click();
	}

	public void clickOnPoolFilter() throws Exception {
		Helper.swipeDownUntilElementVisible(poolFilter);
		element(poolFilter).click();
	}

	public void clickOnFireplaceFilter() throws Exception {
		Helper.swipeDownUntilElementVisible(fireplaceFilter);
		element(fireplaceFilter).click();
	}

	public void setMinimumSquareFeet(String value) throws Exception {
		Helper.swipeDownUntilElementVisible(squareFeetMinimumValue);
		withAction().dragAndDrop(squareFeetMinimumValue, squareFeetMaximumValue).perform();

	}

    public void clickOnLaundryUnitFilter() throws Exception {
		Helper.swipeDownUntilElementVisible(laundryUnitFilter);
		element(laundryUnitFilter).click();
    }

	public void clickOnNeighborhoodsPlusButton() {
		element(neighborhoodsPlusButton).click();
	}

	public void uncheckManhattan() {
		element(manhattanCheckedCheckbox).click();
	}

	public void clickOnBackFromNeighborhoodsPage() {
		element(backButtonFromNeighborhoods).click();
	}

	public void clickOnApplyButtonWithoutKeyboard() {
		element(applySearchButton).click();
	}

	public void uncheckBrooklyn() {
		element(brooklynRemoveIcon).click();
	}

	public void uncheckQueens() {
		element(queensRemoveIcon).click();
	}

	public void clickOnAlphabetCityCheckbox() {
		element(alphabetCityCheckbox).click();
	}

	public void searchDistrict(String district) {
		element(searchNeihborhoodsSearchField).sendKeys(district);
	}

	public void selectDistrict(String districtID) {
		element(MobileBy.AccessibilityId(districtID)).click();
	}

	public void uncheckMidwoodFromFilter() {
		element(midwoodRemoveIcon).click();
	}

	public void uncheckAllUpperEastSideFromFilter() {
		element(allUpperEastSideRemoveIcon).click();
	}

	public void uncheckCarnegieHillsFromFilter() {
		element(carnegieHillsRemoveIcon).click();
	}

	public void uncheckUpperEastSideFromFilter() {
		element(upperEastSideRemoveIcon).click();
	}

	public void uncheckYorkvilleFromFilter() {
		element(yorkvilleRemoveIcon).click();
	}

	public void clickOnSearchByAddressButton() {
		element(searchByAddressButton).click();
	}

	public void fillInSearchField(String value) {
		element(addressSearchField).sendKeys(value);
	}

	public void clickOnTestBuilding() {
		element(testBuilding).click();
	}

	public void clickOnShowMoreFeaturesAndAmenitiesButton() {
		Helper.swipeDownUntilElementVisible(showMoreFeaturesAndAmenitiesButton);
		element(showMoreFeaturesAndAmenitiesButton).click();
	}

	public void selectBathroomsRangeOption() {
		element(bathroomsRangeOption).click();
	}

	public void selectBedroomsRangeOption() {
		waitFor(ExpectedConditions.visibilityOf(bedroomsRangeOption));
		element(bedroomsRangeOption).click();
	}

	public void selectBedroomsRangeOptionIfNotSelected() {
		if (element(bedroomsRangeOption).isVisible()) {
			element(bedroomsRangeOption).click();
		}
	}

	public void selectStudioBedsMinimumFilter() {
		element(studioBedsMinimumFilter).click();
	}

	public void checkIfStudioBedsFilterIsDeselected() {
		element(studioBedsMinimumFilter).shouldBeVisible();
	}

	public void selectOneBedMinimumFilter() {
		element(oneBedMinimumFilter).click();
	}

	public void selectTwoBedsMinimumFilter() {
		element(twoBedsMinimumFilter).click();
	}

	public void selectThreeBedsMinimumFilter() {
		element(threeBedsMinimumFilter).click();
	}

	public void selectFourBedsMinimumFilter() {
		element(fourBedsMinimumFilter).click();
	}

	public void selectOneBathMinimumFilter() {
		Helper.universalVerticalSwipe(totalRoomsSection);
		element(oneBathMinimumFilter).click();
	}

	public void selectOneAndHalfBathroomsFilter() {
		element(oneAndHalfBathsMinimumFilter).click();
	}

	public void selectTwoBathsMinimumFilter() {
		element(twoBathsMinimumFilter).click();
	}

	public void selectThreeBathsMinimumFilter() {
		element(threeBathsMinimumFilter).click();
	}

	public void selectFourBathsMinimumFilter() {
		element(fourBathsMinimumFilter).click();
	}

	public void checkIfOneBathMinimumFilterIsDeselected() {
		Helper.universalVerticalSwipe(totalRoomsSection);
		element(oneBathMinimumFilter).shouldBeVisible();
	}

	public void deselectFilter4Beds() {
		element(selectedFilterFor4PlusBeds).click();
	}

	public void deselectFilter4Baths() {
		element(selectedFilterFor4PlusBaths).click();
	}

	public void selectBedroomsMinimumOption() {
		element(bedroomsMinimumOption).click();
	}

	public void checkNoOneBedsMinimumFilterSelected() {
		SoftAssertions softAssert = new SoftAssertions();
		softAssert.assertThat(Helper.isElementDisplayed(element(studioBedsMinimumFilter))).isTrue();
		softAssert.assertThat(Helper.isElementDisplayed(element(oneBedMinimumFilter))).isTrue();
		softAssert.assertThat(Helper.isElementDisplayed(element(twoBedsMinimumFilter))).isTrue();
		softAssert.assertThat(Helper.isElementDisplayed(element(threeBedsMinimumFilter))).isTrue();
		softAssert.assertThat(Helper.isElementDisplayed(element(fourBedsMinimumFilter))).isTrue();
		softAssert.assertAll();
	}

	public void checkNoOneBathsMinimumFilterSelected() {
		Helper.universalVerticalShortSwipe(totalRoomsSection);
		SoftAssertions softAssert = new SoftAssertions();
		softAssert.assertThat(element(oneBathMinimumFilter).isPresent());
		softAssert.assertThat(Helper.isElementDisplayed(element(oneAndHalfBathsMinimumFilter))).isTrue();
		softAssert.assertThat(Helper.isElementDisplayed(element(twoBathsMinimumFilter))).isTrue();
		softAssert.assertThat(Helper.isElementDisplayed(element(threeBathsMinimumFilter))).isTrue();
		softAssert.assertThat(Helper.isElementDisplayed(element(fourBathsMinimumFilter))).isTrue();
		softAssert.assertAll();
	}

	public void selectBathroomsMinimumOption() {
		element(bathroomsMinimumOption).click();
	}

	public void check2BedsMinFilterSelected() {
		element(selectedTwoBedsMinimumFilter).shouldBeVisible();
	}

	public void check2BedsRangeFilterSelected() {
		element(selectedFilterFor2Beds).shouldBeVisible();
	}

	public void checkMultiBedroomsFiltersSelected() {
		SoftAssertions softAssertions = new SoftAssertions();
		softAssertions.assertThat(element(selectedFilterFor2Beds).isDisplayed());
		softAssertions.assertThat(element(selectedFilterFor3Beds).isDisplayed());
		softAssertions.assertThat(element(selectedFilterFor4PlusBeds).isDisplayed());
		softAssertions.assertAll();
	}

	public void check2BathsMinFilterSelected() {
		element(selectedTwoBathsMinFilter).shouldBeVisible();
	}

	public void check2BathsRangeFilterSelected() {
		element(selectedFilter2Baths).shouldBeVisible();
	}

	public void checkMultiBathroomsFiltersSelected() {
		SoftAssertions softAssertions = new SoftAssertions();
		softAssertions.assertThat(element(selectedFilter2Baths).isDisplayed());
		softAssertions.assertThat(element(selectedFilterFor3Baths).isDisplayed());
		softAssertions.assertThat(element(selectedFilterFor4PlusBaths).isDisplayed());
		softAssertions.assertAll();
	}

	public void checkBedroomsRangeButtonIsNotSelected() {
		element(bedroomsRangeOption).shouldBeVisible();
	}

	public void checkBathroomsRangeButtonIsNotSelected() {
		element(bathroomsRangeOption).shouldBeVisible();
	}

	public void collapseBedroomsFilters() {
		element(bedroomsCollapseButton).click();
	}

	public void collapseBathroomsFilters() {
		element(bathroomsCollapseButton).click();
	}

	public void checkBedroomsRangeButtonSelected() {
		element(selectedBedroomsRangeOption).shouldBeVisible();
	}

	public void checkBathroomsRangeButtonSelected() {
		element(selectedBathroomsRangeOption).shouldBeVisible();
	}

	public void expandManhattanSection() {
		element(manhattanSection).click();
	}

	public void expandAllDownTownSection() {
		element(allDownTownSection).click();
	}
}