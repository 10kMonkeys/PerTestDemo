package com.perchwell.pages.perchwell;

import com.perchwell.helpers.Helper;
import com.perchwell.helpers.RandomGenerator;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends BasePage {

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
	private WebElement firstLocation;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton")
	private WebElement deleteFirstLocationButton;

	//@iOSXCUITFindBy(accessibility = "APPLY")
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

	@iOSXCUITFindBy(accessibility = "StudioBedsButton")
	private WebElement filterForStudioBeds;

	@iOSXCUITFindBy(accessibility = "BATHS")
	private WebElement baths;

	@iOSXCUITFindBy(accessibility = "FIREPLACE")
	private WebElement fireplace;

	@iOSXCUITFindBy(accessibility = "LoadSavedSearchButton")
	private WebElement loadSavedSearchButton;

	@iOSXCUITFindBy(accessibility = "TAP TO SAVE CHANGES")
	private WebElement tapToSaveChanges;

	@iOSXCUITFindBy(accessibility = "generic_text_input_field")
	private WebElement searchName;

	@iOSXCUITFindBy(accessibility = "SAVE")
	private WebElement saveButton;

	@iOSXCUITFindBy(accessibility = "MinimumPriceField")
	private WebElement minimumPriceTextBox;

	@iOSXCUITFindBy(accessibility = "MaximumPriceField")
	private WebElement maximumPriceTextBox;

	@iOSXCUITFindBy(accessibility = "1BathButton")
	private WebElement filterFor1Bath;

	@iOSXCUITFindBy(accessibility = "CONTRACT")
	private WebElement contractButton;

	@iOSXCUITFindBy(accessibility = "OFF MKT")
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

	@iOSXCUITFindBy(xpath = "*//XCUIElementTypeTable/XCUIElementTypeCell[3]")
	private WebElement thirdSearchInList;

	@iOSXCUITFindBy(xpath = "*//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	private WebElement firstSearchInList;

	@iOSXCUITFindBy(accessibility = "SavedSearchCancelButton")
	private WebElement savedSearchCancelButton;

	@iOSXCUITFindBy(accessibility = "OVERWRITE")
	private WebElement overwrite;

	@iOSXCUITFindBy(accessibility = "SAVE AS...")
	private WebElement save;

	@iOSXCUITFindBy(accessibility = "RENTALS")
	private WebElement rentalsButton;

	@iOSXCUITFindBy(accessibility = "CreateNewSearchButton")
	private WebElement createNewSearchButton;

	@iOSXCUITFindBy(accessibility = "RESET FILTERS")
	private WebElement resetFiltersButton;

	@iOSXCUITFindBy(accessibility = "1BedButton")
	private WebElement filterFor1Bed;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '1BedButton'")
	private WebElement filter1BedSelectedOrNot;

	@iOSXCUITFindBy(accessibility = "3BedsButton")
	private WebElement filterFor3Beds;

	@iOSXCUITFindBy(accessibility = "4PlusBedsButton")
	private WebElement filterFor4PlusBeds;

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

	@iOSXCUITFindBy(accessibility = "1.5BathsButton-selected")
	private WebElement selectedFilterFor1AndHalfBath;

	@iOSXCUITFindBy(accessibility = "2BathsButton-selected")
	private WebElement selectedFilter2Baths;

	@iOSXCUITFindBy(accessibility = "3BathsButton-selected")
	private WebElement selectedFilterFor3Baths;

	private String getFirstLocationName() {
		return firstLocation.getAttribute("name");
	}

	public void clickDeleteFirstLocation() {
		deleteFirstLocationButton.click();
	}

	public void clickApplyButton() {
		WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
		WebDriver webDriver = webDriverFacade.getProxiedDriver();
		AppiumDriver appiumDriver = (AppiumDriver) webDriver;
		appiumDriver.hideKeyboard();
		applySearchButton.click();
	}

	public void clickDeleteSecondLocation() {
		deleteSecondLocationButton.click();
	}

	public void selectFilterFor3Baths() {
		element(filterFor3Baths).click();
	}

	public void selectFilterFor2Beds() {
		element(filterFor2Beds).click();
	}

	public void selectFilterFireplace() {
		element(fireplace).click();
	}

	public void scrollToFireplace() {
		Helper.scrollToElement(fireplace);
	}

	public void clickLoadSavedSearchButton() {
		element(loadSavedSearchButton).click();
	}

	public void clickTapToSaveChanges() {
		element(tapToSaveChanges).click();
	}

	public void clickSaveButton() {
		element(saveButton).click();
	}

	public void setSearchName(String search) {

		element(searchName).sendKeys(search);
	}

	public String generateRandomString(String str) {

		return RandomGenerator.getRandomString(str);
	}

	public void addValueInSessionVariable(String name, String value) {
		Serenity.setSessionVariable(name).to(value);
	}

	public String getValueFromSessionVariable(String name) {
		return Serenity.sessionVariableCalled(name);
	}

	public void clickPreviouslyCreatedSearch(String search) {
		getDriver().findElement(By.name(search.toUpperCase())).click();
	}

	public boolean shouldSeePreviouslyCreatedSearch(String search) {

		WebElement previouslyCreatedSearch = element(By.name(search.toUpperCase()));
		//Helper.scrollToElement(previouslyCreatedSearch);
		return previouslyCreatedSearch.isDisplayed();
	}

	public void setMinimumPriceFilter(String price) {
		element(minimumPriceTextBox).typeAndEnter(price);
	}

	public void selectFilterStudioBeds() {
		element(filterForStudioBeds).click();
	}

	public void selectFilter1Bath() {
		element(filterFor1Bath).click();
	}

	public void setFilterActive() {
		element(activeButton).click();
	}

	public void setFilterForOffMkt() {
		element(offMKTButton).click();
	}

	public void setFilterForSoldOrRented() {
		element(soldOrRentedButton).click();
	}

	public void setFilterForContract() {
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

	public void addLocationFilterAlphabetCity() {
	}

	public void clickOnLocationFilter() {
		element(searchNeihborhoods).click();
	}

	public void clickThirdSearchInList() {
		element(thirdSearchInList).click();
	}

	public boolean isAnySearchExist() {
		return Helper.isElementDisplayed(firstSearchInList);
	}

	public void selectFirstSearchAndSaveName() {
		String searchName = firstSearchInList.getAttribute("name");
		System.out.print("Search name" + searchName);
		addValueInSessionVariable("SearchName", searchName);
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

	public void setFilterForRentals() {
		Helper.scrollToElement(rentalsButton);
		element(rentalsButton).click();
	}

	public void createNewSearchButtonClick() {
		element(createNewSearchButton).click();
	}

	public void selectFilter1Bed() {
		element(filterFor1Bed).click();
	}

	public void clickFilter1Bed() {
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

	public boolean isDeletedSearch(String name) {
		return Helper.isElementDisplayed(element(MobileBy.AccessibilityId(name)));
	}

	public void setUpSessionVariableForStatusFilter(WebElement name) {
		String selected = name.getAttribute("name");

		if (!selected.contains("selected")) {
			addValueInSessionVariable("status filter", "not selected");
			return;
		}
		addValueInSessionVariable("status filter", "selected");
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

	public boolean isMinPriceSaved() {
		boolean minPriceSaved = false;
		String minPriceEnteredPreviously = getValueFromSessionVariable("min price");
		String minPriceInFilter = getValueFromMinPriceFilter();

		if (minPriceEnteredPreviously.equalsIgnoreCase(minPriceInFilter)) {
			minPriceSaved = true;
		}
		return minPriceSaved;
	}

	public boolean isFilterFor1BedSaved() {
		boolean filterFor1BedSaved = false;
		String statusFilterPreviously = getValueFromSessionVariable("status filter");
		String statusFilter = filter1BedSelectedOrNot.getAttribute("name");

		if ((statusFilterPreviously.equals("selected") && statusFilter.contains("selected"))
				|| (statusFilterPreviously.equals("not selected") && !statusFilter.contains("selected"))) {
			filterFor1BedSaved = true;
		}

		return filterFor1BedSaved;
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

	public boolean isMinAndMaxPricesNotSet() {
		boolean emptyPricesFilters = true;
		String maxPriceFilter = element(maximumPriceTextBox).getAttribute("value");
		String minPriceFilter = element(minimumPriceTextBox).getAttribute("value");

		if (!maxPriceFilter.contains("NO MAX") || !minPriceFilter.contains("NO MIN")) {
			emptyPricesFilters = false;
		}
		return emptyPricesFilters;
	}
}