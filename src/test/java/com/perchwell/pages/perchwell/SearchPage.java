package com.perchwell.pages.perchwell;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.Helper;
import com.perchwell.helpers.RandomGenerator;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

	@iOSXCUITFindBy(accessibility = "3BathsButton")
	private WebElement filterFor3Baths;

	@iOSXCUITFindBy(accessibility = "2BedsButton")
	private WebElement filterFor2Beds;

	@AndroidFindBy(xpath = "(//*[@text='STUDIO'])[1]")
	@iOSXCUITFindBy(accessibility = "StudioBedsButton")
	private WebElement filterForStudioBeds;

	@iOSXCUITFindBy(accessibility = "BATHS")
	private WebElement baths;

	@iOSXCUITFindBy(accessibility = "FIREPLACE")
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

	@AndroidFindBy(id = "com.perchwell.re.staging:id/min_price")
	@iOSXCUITFindBy(accessibility = "Asking Price Minimum Value Input")
	private WebElement minimumPriceTextBox;

	@iOSXCUITFindBy(accessibility = "Asking Price Maximum Value Input")
	private WebElement maximumPriceTextBox;

	@iOSXCUITFindBy(accessibility = "1BathButton")
	private WebElement filterFor1Bath;

	@iOSXCUITFindBy(accessibility = "IN CONTRACT")
	private WebElement contractButton;

	@iOSXCUITFindBy(accessibility = "OFF MARKET")
	private WebElement offMKTButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"SOLD/RENTED\"`][1]")
	private WebElement soldOrRentedButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"EXPIRED\"`][1]")
	private WebElement expiredButton;

	@iOSXCUITFindBy(accessibility = "ACTIVE")
	private WebElement activeButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[not(contains(@name,'LISTING STATUS'))]")
	private List<WebElement> statusFilterList;

	@iOSXCUITFindBy(accessibility = "deleteTagButtonBROOKLYN")
	private WebElement deleteTagButtonBROOKLYN;

	@iOSXCUITFindBy(accessibility = "deleteTagButtonMANHATTAN")
	private WebElement deleteTagButtonMANHATTAN;

	@iOSXCUITFindBy(accessibility = "deleteTagButtonQUEENS")
	private WebElement deleteTagButtonQUEENS;

	@iOSXCUITFindBy(accessibility = "SearchNeighborhoods")
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

	@iOSXCUITFindBy(accessibility = "SAVE AS...")
	private WebElement save;

	@iOSXCUITFindBy(accessibility = "Rentals")
	private WebElement rentalsButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/create_new_search")
	@iOSXCUITFindBy(accessibility = "CreateNewSearchButton")
	private WebElement createNewSearchButton;

	@iOSXCUITFindBy(accessibility = "RESET FILTERS")
	private WebElement resetFiltersButton;

	@AndroidFindBy(xpath = "(//*[@resource-id='com.perchwell.re.staging:id/one_room'])[1]")
	@iOSXCUITFindBy(accessibility = "1BedButton")
	private WebElement filterFor1Bed;

	@AndroidFindBy(xpath = "(//*[@resource-id='com.perchwell.re.staging:id/one_room'])[1]")
	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '1BedButton'")
	private WebElement filter1BedSelectedOrNot;

	@iOSXCUITFindBy(accessibility = "3BedsButton")
	private WebElement filterFor3Beds;

	@AndroidFindBy(xpath = "(//*[@text='4+'])[1]")
	@iOSXCUITFindBy(accessibility = "4PlusBedsButton")
	private WebElement filterFor4PlusBeds;

	@AndroidFindBy(xpath = "(//*[@resource-id='com.perchwell.re.staging:id/one_room'])[2]")
	@iOSXCUITFindBy(accessibility = "1.5BathsButton")
	private WebElement filterFor1AndHalfBath;

	@iOSXCUITFindBy(accessibility = "2BathsButton")
	private WebElement filterFor2Baths;

	@iOSXCUITFindBy(accessibility = "4PlusBathsButton")
	private WebElement filterFor4PlusBaths;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell/XCUIElementTypeButton[2]")
	private WebElement deleteSearchButton;

	@iOSXCUITFindBy(accessibility = "StudioBedsButton-selected")
	private WebElement selectedFilterForStudioBeds;

	@AndroidFindBy(xpath = "(//*[@resource-id='com.perchwell.re.staging:id/one_room'])[1]")
	@iOSXCUITFindBy(accessibility = "1BedButton-selected")
	private WebElement selectedFilterFor1Bed;

	@iOSXCUITFindBy(accessibility = "2BedsButton-selected")
	private WebElement selectedFilterFor2Beds;

	@iOSXCUITFindBy(accessibility = "3BedsButton-selected")
	private WebElement selectedFilterFor3Beds;

	@iOSXCUITFindBy(accessibility = "4PlusBedsButton-selected")
	private WebElement selectedFilterFor4PlusBeds;

	@iOSXCUITFindBy(accessibility = "1BathButton-selected")
	private WebElement selectedFilterFor1Bath;

	@AndroidFindBy(xpath = "(//*[@resource-id='com.perchwell.re.staging:id/one_room'])[2]")
	@iOSXCUITFindBy(accessibility = "1.5BathsButton-selected")
	private WebElement selectedFilterFor1AndHalfBath;

	@iOSXCUITFindBy(accessibility = "2BathsButton-selected")
	private WebElement selectedFilter2Baths;

	@iOSXCUITFindBy(accessibility = "3BathsButton-selected")
	private WebElement selectedFilterFor3Baths;

    @iOSXCUITFindBy(accessibility = "ACTIVE-Selected")
    private WebElement selectedActiveFilter;

    @iOSXCUITFindBy(accessibility = "IN CONTRACT-Selected")
    private WebElement selectedContractFilter;

    @iOSXCUITFindBy(accessibility = "OFF MARKET-Selected")
    private WebElement selectedOffMktFilter;

    @iOSXCUITFindBy(accessibility = "Sales-selected")
    private WebElement selectedSalesFilter;

	@iOSXCUITFindBy(accessibility = "Fireplace-SELECTED")
	private WebElement selectedFireplaceFilter;

	@iOSXCUITFindBy(accessibility = "deleteTagButtonBROOKLYN")
	private WebElement brooklynRemoveIcon;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeStaticText[1]")
	private WebElement universalNewSearchButton;

	@AndroidFindBy(xpath = "//*[@text='LAUNDRY BLDG']")
	@iOSXCUITFindBy(accessibility = "Laundry Bldg")
	private WebElement laundryBLDGFilterButton;

	@AndroidFindBy(xpath = "//*[@text='LAUNDRY BLDG']")
	@iOSXCUITFindBy(accessibility = "Laundry Bldg-SELECTED")
	private WebElement selectedLaundryBLDGFilter;

	@iOSXCUITFindBy(accessibility = "Sales-selected")
	private WebElement selectedSoldFilter;

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

	@iOSXCUITFindBy(accessibility = "New Dev")
	private WebElement developmentFilter;

	@iOSXCUITFindBy(accessibility = "Pets")
	private WebElement petsFilter;

	@iOSXCUITFindBy(accessibility = "Pool")
	private WebElement poolFilter;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS 'NO MIN'")
	private WebElement squareFeetMinimumValue;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS '10,000+'")
	private WebElement squareFeetMaximumValue;

	@iOSXCUITFindBy(accessibility = "Laundry Unit")
	private WebElement laundryUnitFilter;

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
		applySearchButton.click();
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
	}

	public void selectFilterStudioBeds() {
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
		element(filterFor1Bath).click();
	}

	public void setFilterActive() {
		element(activeButton).click();
	}

	public void selectOffMktFilter() {
		WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
		WebDriver webDriver = webDriverFacade.getProxiedDriver();
		AppiumDriver appiumDriver = (AppiumDriver) webDriver;
		Helper.swipeVertical(appiumDriver, 0.8, 0.2, 0.5, 1);
		element(offMKTButton).click();
	}

	public void selectSoldOrRentFilter() throws Exception {
		Helper.swipeDownUntilElementVisible(soldOrRentedButton);
		element(soldOrRentedButton).click();
	}

	public void selectContractFilter() {
		element(contractButton).click();
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

		System.out.print("Search name" + searchName);
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
		Helper.scrollToElement(rentalsButton);
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
			selected = name.getAttribute("name");
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

	public void checkNoOneBedsFilterSelected() {
		SoftAssertions softAssert = new SoftAssertions();
		softAssert.assertThat(Helper.isElementDisplayed(element(filterForStudioBeds))).isTrue();
		softAssert.assertThat(Helper.isElementDisplayed(element(filterFor1Bed))).isTrue();
		softAssert.assertThat(Helper.isElementDisplayed(element(filterFor2Beds))).isTrue();
		softAssert.assertThat(Helper.isElementDisplayed(element(filterFor3Beds))).isTrue();
		softAssert.assertThat(Helper.isElementDisplayed(element(filterFor4PlusBeds))).isTrue();
		softAssert.assertAll();
	}

	public void deselectFilter1Bath() {
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

	public void checkNoOneBathsFilterSelected() {
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

		if (!maxPriceFilter.contains("NO MAX") || !minPriceFilter.contains("NO MIN")) {
			emptyPricesFilters = false;
		}
		return emptyPricesFilters;
	}

	public void shouldNoOnePriceFilterBeSelected() {
		Assert.assertTrue(isMinAndMaxPricesNotSet());
	}

    public void deselectActiveFilter() {
		WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
		WebDriver webDriver = webDriverFacade.getProxiedDriver();
		AppiumDriver appiumDriver = (AppiumDriver) webDriver;
		Helper.swipeVertical(appiumDriver, 0.8, 0.2, 0.5, 1);
	    element(selectedActiveFilter).click();
    }

    public void deselectContractFilter() {
	    element(selectedContractFilter).click();
    }

    public void deselectOffMktFilter() {
		WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
		WebDriver webDriver = webDriverFacade.getProxiedDriver();
		AppiumDriver appiumDriver = (AppiumDriver) webDriver;
		Helper.swipeVertical(appiumDriver, 0.8, 0.2, 0.5, 1);
	    element(selectedOffMktFilter).click();
    }

    public void checkSalesAndActiveFiltersSelected() throws Exception {
        SoftAssertions softAssert = new SoftAssertions();
        Helper.swipeDownUntilElementVisible(selectedSoldFilter);
        softAssert.assertThat(Helper.isElementDisplayed(element(selectedActiveFilter))).isTrue();
        softAssert.assertThat(Helper.isElementDisplayed(element(selectedSalesFilter))).isTrue();
        softAssert.assertAll();
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

    public void removeBrooklynFromFilter() {
		element(brooklynRemoveIcon).click();
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
			Helper.scrollToElement(laundryBLDGFilterButton);
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


	public void clickOnSoldFilter() throws Exception {
		Helper.swipeDownUntilElementVisible(selectedSoldFilter);
		element(selectedSoldFilter).click();

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
		Helper.swipeDownUntilElementVisible(waitElement);

		WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
		WebDriver webDriver = webDriverFacade.getProxiedDriver();
		AppiumDriver appiumDriver = (AppiumDriver) webDriver;

		int sliderXPositionForSixK = this.getXCoordinateForSixK();
		int minX = squareFeetMinControl.getLocation().getX() + 13;
		int minY = squareFeetMinControl.getLocation().getY() + 13;

		new TouchAction(appiumDriver).press(minX, minY).moveTo(sliderXPositionForSixK, 0).release().perform();
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

	public void AddElevatorFilter() throws Exception {
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
}