package com.perchwell.pages.perchwell;

import com.perchwell.helpers.Helper;
import com.perchwell.helpers.RandomGenerator;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

	@iOSXCUITFindBy(xpath = "*//XCUIElementTypeCell[XCUIElementTypeStaticText[@name=\"BATHS\"]]/XCUIElementTypeButton[@name=\"3\"]")
	private WebElement filterFor3Baths;

	@iOSXCUITFindBy(xpath = "*//XCUIElementTypeCell[XCUIElementTypeStaticText[@name=\"BEDS\"]]/XCUIElementTypeButton[@name=\"2\"]")
	private WebElement filterFor2Bads;

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

	private String getFirstLocationName() {
		return firstLocation.getAttribute("name");
	}

	public void clickDeleteFirstLocation() {
		deleteFirstLocationButton.click();
	}

	public void clickApplyButton() {
		applySearchButton.click();
	}

	public void clickDeleteSecondLocation() {
		deleteSecondLocationButton.click();
	}

	public void selectFilterFor3Baths() {
		element(filterFor3Baths).click();
	}

	public void selectFilterFor2Bads() {
		element(filterFor2Bads).click();

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
		WebElement previouslyCreatedSearch =element(By.name(search.toUpperCase()));
		//Helper.scrollToElement(previouslyCreatedSearch);
		return previouslyCreatedSearch.isDisplayed();
	}
}
