package com.perchwell.pages.perchwell;

import com.perchwell.helpers.Helper;
import com.perchwell.helpers.RandomGenerator;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

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
	private WebElement filterStudioBedsButton;

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

	@iOSXCUITFindBy(accessibility = "1BathButton")
	private WebElement filterFor1Bath;

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

	public void setFilterForStudioBeds() {
		element(filterStudioBedsButton).click();
	}

	public void setFilterFor1Bath() {
		element(filterFor1Bath).click();
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
}
