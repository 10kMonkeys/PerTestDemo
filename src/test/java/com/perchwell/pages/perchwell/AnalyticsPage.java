package com.perchwell.pages.perchwell;

import com.perchwell.email.MailTrap;
import com.perchwell.entity.AppProperties;
import com.perchwell.entity.MailTrapAttachment;
import com.perchwell.entity.MailTrapResponse;
import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AnalyticsPage extends BasePage {

	WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
	WebDriver webDriver = webDriverFacade.getProxiedDriver();
	AppiumDriver appiumDriver = (AppiumDriver) webDriver;
	TouchAction action = new TouchAction(appiumDriver);

	//region WebElements

	@iOSXCUITFindBy(accessibility = "REBNY LISTINGS")
	private WebElement rebnyListingsButton;

	@iOSXCUITFindBy(accessibility = "ASKING PRICE")
	private WebElement askingPriceButton;

	@iOSXCUITFindBy(accessibility = "share")
	private WebElement shareButton;

	@iOSXCUITFindBy(accessibility = "BEDROOMS")
	private WebElement bedroomsButton;

	@iOSXCUITFindBy(accessibility = "plus white")
	private WebElement plusWhiteButton;

	@iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS")
	private WebElement acrisClosingsButton;

	@iOSXCUITFindBy(accessibility = "BUILDING HEIGHT (BY DEAL COUNT)")
	private WebElement dealCountByHeightButton;

	@iOSXCUITFindBy(accessibility = "BUILDING HEIGHT")
	private WebElement buildingHeightButton;

	@iOSXCUITFindBy(accessibility = "DEAL COUNT BY HEIGHT")
	private WebElement dealCountByHeightChart;

	@iOSXCUITFindBy(accessibility = "BUILDING TYPE (BY DEAL COUNT)")
	private WebElement buildingTypeButton;

	@iOSXCUITFindBy(accessibility = "DEAL COUNT BY TYPE")
	private WebElement dealCountByTypeChart;

	@iOSXCUITFindBy(accessibility = "NYC TOWNHOUSES")
	private WebElement nycTownhousesButton;

	@iOSXCUITFindBy(accessibility = "DOM BY PRICE")
	private WebElement domByPriceButton;

	@iOSXCUITFindBy(accessibility = "DEAL COUNT BY PRICE")
	private WebElement dealCountByPriceButton;

	@iOSXCUITFindBy(accessibility = "MANAGEMENT")
	private WebElement managementButton;

	@iOSXCUITFindBy(accessibility = "DAYS ON MARKET")
	private WebElement daysOnMarketButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[3]")
	private WebElement deleteChartButton;

	@iOSXCUITFindBy(accessibility = "DONE MOVING CHARTS")
	private WebElement doneMovingChartsButton;

	@iOSXCUITFindBy(accessibility = "MAXIMUM 6 CHARTS ALLOWED")
	private WebElement maximumSixChartMessage;

	@iOSXCUITFindBy(accessibility = "DON'T FORGET... THE SAME SEARCH APPLIES HERE TOO. CHARTS ALWAYS REFLECT YOUR FILTERS")
	private WebElement dontForgetHint;

	@iOSXCUITFindBy(accessibility = "TAP ANY CHART TO ACCESS DETAILED DATA COMPRISING IT")
	private WebElement tapAnyChartHint;

	@iOSXCUITFindBy(accessibility = "PRESS AND HOLD ANY CHART TO REARRANGE OR DELETE")
	private WebElement pressAndHoldHint;

	@iOSXCUITFindBy(accessibility = "OK")
	private WebElement okButton;

	@iOSXCUITFindBy(accessibility = "MKT SHARE")
	private WebElement mktShareButton;

	@iOSXCUITFindBy(accessibility = "THIS IS A PRO-ONLY FEATURE")
	private WebElement thisIsAProOnlyFeatureMessage;

	@iOSXCUITFindBy(accessibility = "MY EMAIL")
	private WebElement myEmailOption;

	@iOSXCUITFindBy(accessibility = "OK")
	private WebElement reportSentOkButton;

	@iOSXCUITFindBy(accessibility = "SAVE")
	private WebElement saveButton;

	@iOSXCUITFindBy(accessibility = "generic_text_input_field")
	private WebElement nameThisReport;

	//endregion

	public AnalyticsPage(WebDriver driver) {
		super(driver);
	}

	public void holdCharts() {
		action.longPress(dealCountByTypeChart).release().perform();
	}

	public void deleteChart() {
		element(deleteChartButton).click();
	}

	public boolean isAddIconDisplayed() {
		return element(plusWhiteButton).isDisplayed();
	}

	public void doneMovingChartsButtonClick() {
		element(doneMovingChartsButton).click();
	}

	public void addChartFromREBNYSection() {
		element(rebnyListingsButton).click();
		element(askingPriceButton).click();
	}

	public void addButtonClick() {
		element(plusWhiteButton).click();
	}

	public void addChartFromACRISSection() {
		element(acrisClosingsButton).click();
		element(dealCountByHeightButton).click();
	}

	public void addChartFromNYCSection() {
		element(nycTownhousesButton).click();
		element(domByPriceButton).click();
	}

	public void addChartFromManagementSection() {
		element(managementButton).click();
		element(daysOnMarketButton).click();
	}

	public void addTwoCharts() {
		element(rebnyListingsButton).click();
		element(bedroomsButton).click();
		element(plusWhiteButton).click();
		element(acrisClosingsButton).click();
		element(buildingTypeButton).click();
	}

	public boolean isMessageMaximumSixChartsDisplayed() {
		element(plusWhiteButton).click();
		return element(maximumSixChartMessage).isDisplayed();
	}

	public void skipHints() {
		element(dontForgetHint).click();
		element(tapAnyChartHint).click();
		element(pressAndHoldHint).click();
	}

	public boolean isAskingPriseChartAdd() {
		return element(askingPriceButton).isEnabled();
	}

	public boolean isBuildingHeightCartAdd() {
		return element(dealCountByHeightChart).isEnabled();
	}

	public boolean isDomByPriceCartAdd() {
		return element(domByPriceButton).isEnabled();
	}

	public boolean isDaysOnMarketAdd() {
		return element(daysOnMarketButton).isEnabled();
	}

	public boolean isDealCountByTypeDisplayed() {
		return Helper.isElementDisplayed(dealCountByTypeChart);
	}

	public void okButtonClick() {
		element(okButton).click();
	}

	public void shareButtonClick() {
		element(shareButton).click();
	}

	public boolean isThisIsAProOnlyFeatureMessageShow() {
		return element(thisIsAProOnlyFeatureMessage).isDisplayed();
	}

	public void addBuildingHeightChartWithMKTShare() {
		element(rebnyListingsButton).click();
		element(mktShareButton).click();
		element(buildingHeightButton).click();
	}

	public void addAskingPriceChartWithMKTShare() {
		element(rebnyListingsButton).click();
		element(mktShareButton).click();
		element(askingPriceButton).click();
	}

	public void clickMyEmailOption() {
		element(myEmailOption).click();
	}

	public void clickReportSentOkButton() {
		reportSentOkButton.click();
	}

	public void addValueInSessionVariable(String name, String value) {
		Serenity.setSessionVariable(name).to(value);
	}

	public String getValueFromSessionVariable(String name) {
		return Serenity.sessionVariableCalled(name);
	}

	public void clickSaveButton() {
		element(saveButton).click();
	}

	public void setReportName(String reportName) {
		element(nameThisReport).sendKeys(reportName);
	}

	public Boolean shouldFindSentEmail(String report_name) {
		//Waiting while report was sent
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//Get last emails with HEADER_SHARE_TAGS
		MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(AppProperties.INSTANCE.getProperty("HEADER_ANALYTICS"));
		Boolean reportWasFound = false;
		report_name = report_name + ".pdf";
		//Get attachments
		MailTrapAttachment[] mailTrapAttachment = MailTrap.getMassageAttachment(mailTrapResponse[0].getId());
		//Find attachments with REPORT_NAME
		for (MailTrapAttachment my_attachment : mailTrapAttachment) {
			if (my_attachment.getFilename().equalsIgnoreCase(report_name)) {
				reportWasFound = true;
				break;
			}
		}
		return reportWasFound;
	}
}

