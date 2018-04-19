package com.perchwell.pages.perchwell;

import com.perchwell.email.MailTrap;
import com.perchwell.entity.AppProperties;
import com.perchwell.entity.MailTrapAttachment;
import com.perchwell.entity.MailTrapResponse;
import com.perchwell.helpers.Helper;
import com.perchwell.helpers.RandomGenerator;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AnalyticsPage extends BasePage {

    //region WebElements

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS")
    private WebElement rebnyListingsButton;

    @iOSXCUITFindBy(accessibility = "ASKING PRICE")
    private WebElement askingPriceButton;

    @iOSXCUITFindBy(accessibility = "BEDROOMS")
    private WebElement bedroomsButton;

    @iOSXCUITFindBy(accessibility = "plus white")
    private WebElement plusWhiteButton;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS")
    private WebElement acrisClosingsButton;

    @iOSXCUITFindBy(accessibility = "MY NEW SEARCH")
	private WebElement myNewSearch;

	@iOSXCUITFindBy(accessibility = "BUILDING HEIGHT (BY DEAL COUNT)")
    private WebElement dealCountByHeightButton;

    @iOSXCUITFindBy(accessibility = "BUILDING HEIGHT")
    private WebElement buildingHeightButton;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT BY HEIGHT")
    private  WebElement dealCountByHeightChart;

    @iOSXCUITFindBy(accessibility = "BUILDING TYPE (BY DEAL COUNT)")
    private WebElement buildingTypeByDealCountButton;

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

    @iOSXCUITFindBy(accessibility = "UP TO $1M")
    private WebElement upToOneMillionButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]")
	private WebElement firstBuildingInList;

	@iOSXCUITFindBy(accessibility = "generic_text_input_field")
	private WebElement nameThisReport;

	@iOSXCUITFindBy(accessibility = "OK")
	private WebElement reportSentOkButton;

	@iOSXCUITFindBy(accessibility = "SAVE")
	private WebElement saveButton;

	@iOSXCUITFindBy(accessibility = "MY EMAIL")
	private WebElement myEmailOption;

	@iOSXCUITFindBy(accessibility = "CLIENT EMAIL")
	private WebElement clientOption;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable[1]")
	private WebElement buildingTable;

	@iOSXCUITFindBy(accessibility = "BEDROOM COUNT")
	private WebElement bedroomChart;

	@iOSXCUITFindBy(accessibility = "BUILDING TYPE")
	private WebElement buildingTypeChart;

	@iOSXCUITFindBy(accessibility = "DOM BY PRICE2")
	private WebElement domByPrice2Chart;

	@iOSXCUITFindBy(accessibility = "share")
	private WebElement shareButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
    private List<WebElement> valueChartList;

	@iOSXCUITFindBy(accessibility = "SEND")
	private WebElement sendButton;

	@iOSXCUITFindBy(accessibility = "$12M+")
	private WebElement upTo12MillionButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"HAS GARDEN\"][1]")
    private WebElement hasGardenButton;

	@iOSXCUITFindBy(accessibility = "GARDEN")
    private WebElement gardenChart;

	@iOSXCUITFindBy(accessibility = "LOCATION")
    private WebElement locationButton;

	@iOSXCUITFindBy(accessibility = "MEDIAN")
    private WebElement medianButton;

	@iOSXCUITFindBy(accessibility = "MEDIAN ASKING PRICE")
    private WebElement medianAskingPriceChart;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"IN HISTORIC DIST.\"])[1]\n")
    private WebElement inHistoryDistButton;

	@iOSXCUITFindBy(accessibility = "FEATURES")
    private WebElement featuresButton;

	@iOSXCUITFindBy(accessibility = "HISTORIC DIST.")
    private WebElement historyDistChart;

	@iOSXCUITFindBy(accessibility = "GARDEN PREMIUM")
    private WebElement gardenPremiumChart;

	@iOSXCUITFindBy(accessibility = "DISTRIBUTION")
    private WebElement distributionButton;

	@iOSXCUITFindBy(accessibility = "FIRM LISTING COUNT")
    private WebElement firmListingCountButton;

	@iOSXCUITFindBy(accessibility = "TRENDS")
    private WebElement trendsButton;

	@iOSXCUITFindBy(accessibility = "DEAL VOLUME (ANNUAL)")
    private WebElement dealVolumeAnnualButton;

	@iOSXCUITFindBy(accessibility = "DEAL VOLUME (QUARTERLY)")
    private WebElement dealVolumeQuarterlyButton;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeButton[1])[1]")
    private WebElement yearsRange;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypePickerWheel[1]")
    private WebElement beginningPickerWheel;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypePickerWheel[2]")
    private MobileElement  endingPickerWheel;

    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'SET RANGE'")
	//@iOSXCUITFindBy(accessibility = "SET RANGE")
    private WebElement setRangeButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeStaticText")
    private List<WebElement> valueColumnYearsList;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther")
    private WebElement headerOfFirstChart;

	@iOSXCUITFindBy(accessibility = "ASKING PRICE PER BED")
    private WebElement askingPricePerBedButton;

	@iOSXCUITFindBy(accessibility = "ASKING PRICE PER FT²")
    private WebElement askingPricePerFTButton;

	@iOSXCUITFindBy(accessibility = "LISTING COUNT")
    private WebElement listingCountButton;

	@iOSXCUITFindBy(accessibility = "MONTHLIES")
    private WebElement monthliesButton;

	@iOSXCUITFindBy(accessibility = "PROPERTY TAXES")
    private WebElement propertyTaxesButton;

	@iOSXCUITFindBy(accessibility = "MEDIAN ASKING $/BED")
    private WebElement askingPricePerBedChart;

	@iOSXCUITFindBy(accessibility = "MEDIAN ASKING $/FT²")
    private WebElement medianAskingPerFTChart;

	@iOSXCUITFindBy(accessibility = "ASKING PRICE $/FT²")
    private WebElement askingPricePerFTChart;

	@iOSXCUITFindBy(accessibility = "MEDIAN MONTHLIES")
    private WebElement medianMonthliesChart;

	@iOSXCUITFindBy(accessibility = "MEDIAN PROPERTY TAXES")
    private WebElement propertyTaxesChart;

    @iOSXCUITFindBy(accessibility = "DOORMAN")
    private WebElement doormanButton;

    @iOSXCUITFindBy(accessibility = "ELEVATOR")
    private WebElement elevatorButton;

    @iOSXCUITFindBy(accessibility = "WORKING FIREPLACE")
    private WebElement fireplaceButton;

    @iOSXCUITFindBy(accessibility = "GARAGE")
    private WebElement garageButton;

    @iOSXCUITFindBy(accessibility = "GYM")
    private WebElement gymButton;

    @iOSXCUITFindBy(accessibility = "LAUNDRY - BUILDING")
    private WebElement laundryBuildingsButton;

    @iOSXCUITFindBy(accessibility = "OUTDOOR SPACE")
    private WebElement outdoorSpaceButton;

    @iOSXCUITFindBy(accessibility = "PETS")
    private WebElement petsButton;

    @iOSXCUITFindBy(accessibility = "POOL")
    private WebElement poolButton;

    @iOSXCUITFindBy(accessibility = "PREWAR")
    private WebElement prewarButton;

    @iOSXCUITFindBy(accessibility = "WASHER/DRYER")
    private WebElement washerDryerButton;

    @iOSXCUITFindBy(accessibility = "$/FT² BY PRICE SEGMENT")
    private WebElement dollarPerFTByPriceSegmentButton;

    @iOSXCUITFindBy(accessibility = "ASKING PRICE BY # BEDS")
    private WebElement askingPriceByBedsButton;

    @iOSXCUITFindBy(accessibility = "ASKING PRICE BY PRICE SEGMENT")
    private WebElement askingPriceByPriceSegmentButton;

    @iOSXCUITFindBy(accessibility = "ASKING PRICE BY TYPE")
    private WebElement askingPriceByTypeButton;

    @iOSXCUITFindBy(accessibility = "$/FT² BY SEGMENT")
    private WebElement dollarPerFTByPriceSegmentChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN ASKING PRICE BY SEGMENT")
    private WebElement askingPriceByPriceSegmentChart;

    @iOSXCUITFindBy(accessibility = "DOM BY # BEDS")
    private WebElement domByNumberBedsButton;

    @iOSXCUITFindBy(accessibility = "DOM BY PRICE SEGMENT")
    private WebElement domByPriceSegmentButton;

    @iOSXCUITFindBy(accessibility = "SQUARE FEET")
    private WebElement squareFeetButton;

    @iOSXCUITFindBy(accessibility = "DOM BY NUMBER BEDROOMS")
    private WebElement domByNumberBedroomsChart;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private WebElement chart;
    //endregion

	public AnalyticsPage(WebDriver driver){
        super(driver);
    }

    public void holdCharts(){
		WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
		WebDriver webDriver = webDriverFacade.getProxiedDriver();
		AppiumDriver appiumDriver = (AppiumDriver) webDriver;
		TouchAction action = new TouchAction(appiumDriver);
        action.longPress(headerOfFirstChart).release().perform();
    }

    public void deleteChart(){
        element(deleteChartButton).click();
    }

    public boolean isAddIconDisplayed(){
       return element(plusWhiteButton).isDisplayed();
    }

    public void doneMovingChartsButtonClick(){
        element(doneMovingChartsButton).click();
    }

    public void rebnyListingsButtonClick(){
        element(rebnyListingsButton).click();
    }

    public void addButtonClick(){
        element(plusWhiteButton).click();
    }

    public void dealCountByHeightButtonClick(){
        element(dealCountByHeightButton).click();
    }

    public void domByPriceButtonClick(){
        element(domByPriceButton).click();
    }

    public void nycTownHousesButtonClick(){
        element(nycTownhousesButton).click();
    }

    public void managementButtonClick(){
        element(managementButton).click();
    }

    public void daysOnMarketButtonClick(){
        element(daysOnMarketButton).click();
    }

    public void bedroomsButtonClick(){
        element(bedroomsButton).click();
    }

    public void acrisClosingsButtonClick(){
        element(acrisClosingsButton).click();
    }

    public void buildingTypeByDealCountButtonClick(){
        element(buildingTypeByDealCountButton).click();
    }

    public boolean isMessageMaximumSixChartsDisplayed(){
        element(plusWhiteButton).click();
        return element(maximumSixChartMessage).isDisplayed();
    }

    public void skipHints(){
        element(dontForgetHint).click();
        element(tapAnyChartHint).click();
        element(pressAndHoldHint).click();
    }

    public boolean isAskingPriseChartAdd(){
        return element(askingPriceButton).isDisplayed();
    }

    public boolean isDealCountByHeightChartAdd(){
        return element(dealCountByHeightChart).isDisplayed();
    }

    public boolean isDomByPriceCartAdd(){
        return element(domByPrice2Chart).isDisplayed();
    }

    public boolean isDaysOnMarketAdd(){
        return element(daysOnMarketButton).isDisplayed();
    }

    public boolean isDealCountByTypeDisplayed(){
        return Helper.isElementDisplayed(dealCountByTypeChart);
    }

    public void okButtonClick(){
        element(okButton).click();
    }

    public boolean isThisIsAProOnlyFeatureMessageShow(){
        return element(thisIsAProOnlyFeatureMessage).isDisplayed();
    }

    public void buildingHeightButton(){
        element(buildingHeightButton).click();
    }

    public boolean isBuildingHeightChartAdd(){
        return element(buildingHeightButton).isDisplayed();
    }

    public void mktShareButtonClick(){
        element(mktShareButton).click();
    }

    public void askingPriceChartClick(){
        element(askingPriceButton).click();
    }

    public void upToOneMillionButtonClick(){
        element(upToOneMillionButton).click();
    }

    public void selectFirstBuildingInList(){
        element(firstBuildingInList).click();
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

	public void setValueSessionVariable(String name,String value){
	    Serenity.setSessionVariable(name).to(value);
    }

	public void clickSaveButton() {
		element(saveButton).click();
	}

	public void setAndSaveReportName(String reportName) {
		addValueInSessionVariable("Report name", RandomGenerator.getRandomString(reportName));
		element(nameThisReport).sendKeys(getValueFromSessionVariable("Report name"));
	}

	public Boolean shouldFindSentEmail(String report_name) {
		//Waiting while report was sent
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//Get last emails with HEADER_ANALYTICS
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
	public void clickMyNewSearch() {
		element(myNewSearch).click();
	}

	public void clickMyEmailOption() {
		element(myEmailOption).click();
	}

	public void selectSecondBuildingInList(){
		element(buildingTable).findElement(By.className("XCUIElementTypeCell")).click();

	}
	public void shareButtonClick(){
		element(shareButton).click();

	}
	public void clickClientEmailOption() {
		element(clientOption).click();
	}

	public void shouldBuildingHeightChartDisplayedWithSwipe() {
		Helper.scrollToElement(dealCountByHeightChart);
		element(dealCountByHeightChart).shouldBeVisible();
	}

	public void shouldBedroomCountChartDisplayed() {
		Helper.scrollToElement(bedroomChart);
		element(bedroomChart).shouldBeVisible();
	}

	public boolean isMedianAskingPriceChartDisplayed(){
	    Helper.scrollToElement(medianAskingPriceChart);
	    return element(medianAskingPriceChart).isDisplayed();
    }

	public void shouldDaysOnMarketDisplayedWithSwipe() throws Exception {
		Helper.swipeDownUntilElementVisible(daysOnMarketButton);
		//Helper.scrollToElement(daysOnMarketButton);
		element(daysOnMarketButton).shouldBeVisible();
	}

	public void shouldBuildingTypeDisplayed() {
		element(dealCountByTypeChart).shouldBeVisible();
	}

	public void shouldSeeAskingPriceChartWithSwipe() throws Exception {
		Helper.swipeDownUntilElementVisible(askingPriceButton);
		//	Helper.scrollToElement(askingPriceButton);
		element(askingPriceButton).shouldBeVisible();
	}
	public boolean isDomByPrice2DisplayedWithSwipe() {
		Helper.scrollToElement(domByPrice2Chart);
		return element(domByPrice2Chart).isDisplayed();
	}

	public boolean isAskingPriseChartDisplayed() {
		Helper.scrollToElement(askingPriceButton);
		return element(askingPriceButton).isDisplayed();
	}

	public String getValueBedroomsChart(){
	    Helper.scrollToElement(valueChartList.get(0));
	  return element(valueChartList.get(0)).getText();
    }

    public String getValueAskingPriceChart(){
        Helper.scrollToElement(valueChartList.get(1));
	    return element(valueChartList.get(1)).getText();
    }

	public void clickSendButton() {
			element(sendButton).click();
	}

	public boolean shouldFindPDFSummaryEmail() {
		//Waiting while report was sent
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//Get last emails with HEADER_ANALYTICS
		MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(AppProperties.INSTANCE.getProperty("HEADER_ANALYTICS"));
		Boolean reportWasFound = false;

		//Don't check report name - the report may not be
		//String report_name = AppProperties.INSTANCE.getProperty("PDF_analitics_report") + ".pdf";

		for (MailTrapResponse my_responce : mailTrapResponse) {
			if (my_responce.getTo_email().equalsIgnoreCase(AppProperties.INSTANCE.getProperty("email"))) {
				reportWasFound = true;
				break;
			}
		}
		return reportWasFound;
	}

	public void upTo12MillionButtonClick() {
		element(upToOneMillionButton).click();
	}

	public void hasGardenButtonClick(){
	    element(hasGardenButton).click();
    }

    public void shouldGardenChartDisplayed() {
        Helper.scrollToElement(gardenChart);
        element(gardenChart).shouldBeVisible();
    }

    public void medianButtonClick(){
	    element(medianButton).click();
    }

    public void locationButtonClick(){
	    element(locationButton).click();
    }

    public void inDHistoryDistButtonClick(){
	    element(inHistoryDistButton).click();
    }

    public void featuresButtonClick(){
	    element(featuresButton).click();
    }

    public void selectGardenChart(){
	    element(gardenChart).click();
    }

    public boolean isHistoryDistChartAdd(){
	    return element(historyDistChart).isDisplayed();
    }

    public boolean isGardenPremiumChartDisplayed(){
	    return element(gardenPremiumChart).isDisplayed();
    }

    public void firmListingCountButtonClick(){
	    element(firmListingCountButton).click();
    }

    public boolean isFirmListingCountChartDisplayed(){
	    return element(firmListingCountButton).isDisplayed();
    }

    public void distributionButtonClick(){
	    element(distributionButton).click();
    }

    public void trendsButtonClick(){
	    element(trendsButton).click();
    }

    public void dealVolumeAnnualButtonClick(){
	    element(dealVolumeAnnualButton).click();
    }

    public void dealVolumeQuarterlyButtonClick(){
	    element(dealVolumeQuarterlyButton).click();
    }

    public void yearsRangeButtonClick(){
	    element(yearsRange).click();
    }

    public String getDefaultMinValueYear(){
        return element(beginningPickerWheel).getText();
    }

    public void getDefaultMaxValueYear(){
        addValueInSessionVariable("MaxDefaultRangeYear",String.valueOf(endingPickerWheel.getAttribute("value")));
        addValueInSessionVariable("MaxRangeYear",String.valueOf(Integer.parseInt(getValueFromSessionVariable("MaxDefaultRangeYear")) - 1));
    }

    public void setMinValueYear(String value){
	    beginningPickerWheel.sendKeys(value);
    }

    public void setMaxValueYears(String value){
        endingPickerWheel.setValue(value);
    }

    public void setRangeButtonClick(){
	    setRangeButton.click();
    }

    public boolean isColumnForPreviousMinDefaultYearAdd(String year){
	    boolean isFound = false;
	    String shortenedYear = year.substring(2);
        for(WebElement e : valueColumnYearsList) {
            if((e.getText().equals(year))||(e.getText().equals(shortenedYear))) {
                isFound = true;
                break;
            }
        }
	    return isFound;
    }

    public boolean isColumnForNextMaxDefaultYearRemove(String year){
        boolean isRemove = true;
        String shortenedYear = year.substring(2);
        for(WebElement e : valueColumnYearsList) {
            if((e.getText().equals(year))||(e.getText().equals(shortenedYear))) {
                isRemove = false;
                break;
            }
        }
        return isRemove;
	}

	public boolean isOnlyThreeYearsDisplayed(){
        return valueColumnYearsList.size() == 3;
    }

    public String yearsRangeButtonValue(){
	    return yearsRange.getText();
    }

    public boolean isYearsRangeChange(String previous,String present){
	    present = present.substring(2);
        return previous.contains(present);
    }

    private List<Integer> previousYearsList ;

	private List<Integer> presentYearsList;

    public void  getPreviousYearsInFromTopList() {
        List<Integer> yearsList = new ArrayList<>();
        for (WebElement e : valueColumnYearsList) {
            String year = e.getText();
            year = year.substring(0,year.length() - 1);
            yearsList.add(Integer.parseInt(year));
        }
        previousYearsList = yearsList;
    }
    public void getPresentYearsInFromTopList(){
        List<Integer> yearsList = new ArrayList<>();
        for (WebElement e : valueColumnYearsList) {
            String year = e.getText();
            year = year.substring(0,year.length() - 1);
            yearsList.add(Integer.parseInt(year));
        }
        presentYearsList = yearsList;
    }

    public boolean isOnChartUpdateYearsFromTop(){
        boolean isChartUpdateYearsFromTop = false;
        for (int i = 0;i<presentYearsList.size();i++){
            if(presentYearsList.get(i) == previousYearsList.get(i) - 1) isChartUpdateYearsFromTop = true;
            else{
                isChartUpdateYearsFromTop = false;
                break;
            }
        }
        return isChartUpdateYearsFromTop;
    }

    public void setClientAddress(String client_email) {
        element(nameThisReport).sendKeys(client_email);
    }

    public void askingPricePerBedButtonClick(){
        element(askingPricePerBedButton).click();

    }

    public void medianAskingPerFTButtonClick(){
        element(askingPricePerFTButton).click();
        element(medianAskingPerFTChart).shouldBeVisible();
    }

    public void addAndVerifyAskingPricePerFTChart(){
        element(askingPricePerFTButton).click();
        element(askingPricePerFTChart).shouldBeVisible();
    }

    public void listingCountButtonClick(){
        element(listingCountButton).click();
        element(listingCountButton).shouldBeVisible();
    }

    public void medianMonthliesButtonClick(){
        element(monthliesButton).click();
        element(medianMonthliesChart).shouldBeVisible();
    }

    public void addAndVerifyMonthliesChart(){
        element(monthliesButton).click();
        element(monthliesButton).shouldBeVisible();
    }

    public void propertyTaxesButtonClick(){
        element(propertyTaxesButton).click();
        element(propertyTaxesChart).shouldBeVisible();
    }

    public void shouldSeeAskingPricePerBedChart(){
        element(askingPricePerBedChart).shouldBeVisible();
    }

    public void shouldSeeBedroomsChart(){
        element(bedroomChart).shouldBeVisible();
    }

    public void addAndVerifyDoormanChart(){
        element(doormanButton).click();
        element(doormanButton).shouldBeVisible();
    }

    public void addAndVerifyElevatorChart(){
        element(elevatorButton).click();
        element(elevatorButton).shouldBeVisible();
    }

    public void addAndVerifyFireplaceChart(){
        Helper.scrollToElement(fireplaceButton);
        element(fireplaceButton).click();
        element(fireplaceButton).shouldBeVisible();
    }

    public void addAndVerifyGarageChart(){
        element(garageButton).click();
        element(garageButton).shouldBeVisible();
    }

    public void addAndVerifyGymChart(){
        element(gymButton).click();
        element(gymButton).shouldBeVisible();
    }

    public void addAndVerifyLaundryBuildingChart(){
        element(laundryBuildingsButton).click();
        element(laundryBuildingsButton).shouldBeVisible();
    }

    public void addAndVerifyOutdoorSpaceChart(){
        element(outdoorSpaceButton).click();
        element(outdoorSpaceButton).shouldBeVisible();
    }

    public void addAndVerifyPetsChart(){
        Helper.scrollToElement(petsButton);
        element(petsButton).click();
        element(petsButton).shouldBeVisible();
    }

    public void addAndVerifyPoolChart(){
        Helper.scrollToElement(poolButton);
        element(poolButton).click();
        element(poolButton).shouldBeVisible();
    }

    public void addAndVerifyPrewarChart(){
        Helper.scrollToElement(prewarButton);
        element(prewarButton).click();
        element(prewarButton).shouldBeVisible();
    }

    public void addAndVerifyWasherDryerChart(){
        Helper.scrollToElement(washerDryerButton);
        element(washerDryerButton).click();
        element(washerDryerButton).shouldBeVisible();
    }

    public void addAndVerifyBuildingTypeChart(){
        element(buildingTypeChart).click();
        element(buildingTypeChart).shouldBeVisible();
    }

    public void dollarPerFTByPriceSegmentButtonClick(){
        element(dollarPerFTByPriceSegmentButton).click();
    }

    public void isDollarPerFTByPriceSegmentChartAdd(){
        element(dollarPerFTByPriceSegmentChart).shouldBeVisible();
    }

    public void addAndVerifyAskingPriceByBedsChart(){
        element(askingPriceByBedsButton).click();
        element(medianAskingPriceChart).shouldBeVisible();
    }

    public void addAndVerifyAskingPriceByPriceSegmentChart(){
        element(askingPriceByPriceSegmentButton).click();
        element(askingPriceByPriceSegmentChart).shouldBeVisible();
    }

    public void addAndVerifyAskingPriceByTypeChart(){
        element(askingPriceByTypeButton).click();
        element(medianAskingPriceChart).shouldBeVisible();
    }

    public void addAndVerifyAskingPricePerBedChart(){
        element(askingPricePerBedButton).click();
        element(askingPricePerBedButton).shouldBeVisible();
    }

    public void addAndVerifyDOMByNumberBedsChart(){
        element(domByNumberBedsButton).click();
        element(domByNumberBedroomsChart).shouldBeVisible();
    }

    public void addAndVerifyDOMByPriceSegmentChart(){
        element(domByPriceSegmentButton).click();
        element(domByPriceSegmentButton).shouldBeVisible();
    }

    public void addAndVerifySquareFeetChart(){
        element(squareFeetButton).click();
        element(squareFeetButton).shouldBeVisible();
    }

    public void isChartDisplayed() {
        element(chart).shouldBeVisible();
    }

    public void clickOnMagnifierIconWithPreviouslySavedSearch() {
        String search = SessionVariables.getValueFromSessionVariable("Search");
        getDriver().findElement(MobileBy.AccessibilityId(search)).click();
    }
}
