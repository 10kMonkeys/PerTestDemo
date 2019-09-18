package com.perchwell.pages.analytics;

import com.perchwell.crossPlatform.Config;
import com.perchwell.email.MailTrap;
import com.perchwell.entity.AppProperties;
import com.perchwell.entity.MailTrapAttachment;
import com.perchwell.entity.MailTrapResponse;
import com.perchwell.helpers.*;
import com.perchwell.pages.perchwell.PerchwellPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

public class AnalyticsPage extends TechHelper {

    private int messageIdOfLastReportDetailEmail;

    //region WebElements

    @AndroidFindBy(id = "com.perchwell.re.staging:id/rebny_listings")
    @iOSXCUITFindBy(accessibility = "LISTINGS")
    private WebElement rebnyListingsButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/add")
    @iOSXCUITFindBy(accessibility = "iconAddNew2")
    private WebElement plusWhiteButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/acris_closings")
    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS")
    private WebElement acrisClosingsButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/title")
    @iOSXCUITFindBy(accessibility = "MY NEW SEARCH")
	private WebElement myNewSearch;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/nyc_townhouses")
    @iOSXCUITFindBy(accessibility = "NYC TOWNHOUSES")
    private WebElement nycTownhousesButton;

    @iOSXCUITFindBy(accessibility = "DOM BY PRICE")
    private WebElement domByPriceButton;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT BY PRICE")
    private WebElement dealCountByPriceButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/management")
    @iOSXCUITFindBy(accessibility = "MANAGEMENT")
    private WebElement managementButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/remove_button")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[$name = 'home x'$][1]")
    private WebElement deleteChartButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/done_moving_charts")
    @iOSXCUITFindBy(accessibility = "DONE MOVING CHARTS")
    private WebElement doneMovingChartsButton;

    @AndroidFindBy(xpath = "//*[@text='MAXIMUM 6 CHARTS ALLOWED']")
    @iOSXCUITFindBy(accessibility = "MAXIMUM 6 CHARTS ALLOWED")
    private WebElement maximumSixChartMessage;

    @iOSXCUITFindBy(accessibility = "DON'T FORGET... THE SAME SEARCH APPLIES HERE TOO. CHARTS ALWAYS REFLECT YOUR FILTERS")
    private WebElement dontForgetHint;

    @iOSXCUITFindBy(accessibility = "TAP ANY CHART TO ACCESS DETAILED DATA COMPRISING IT")
    private WebElement tapAnyChartHint;

    @iOSXCUITFindBy(accessibility = "PRESS AND HOLD ANY CHART TO REARRANGE OR DELETE")
    private WebElement pressAndHoldHint;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/ok")
    @iOSXCUITFindBy(accessibility = "OK")
    private WebElement okButton;

    @AndroidFindBy(accessibility = "MKT SHARE")
    @iOSXCUITFindBy(accessibility = "MKT SHARE")
    private WebElement mktShareButton;

    @AndroidFindBy(xpath = "//*[contains(@text, 'ASK YOUR AGENT IF THEY')]")
    @iOSXCUITFindBy(accessibility = "THIS IS A PRO-ONLY FEATURE")
    private WebElement thisIsAProOnlyFeatureMessage;

    @AndroidFindBy(xpath = "//*[@text='UP TO $1M']")
    @iOSXCUITFindBy(accessibility = "UP TO $1M")
    private WebElement upToOneMillionButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]")
	private WebElement firstBuildingInList;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/rename_group_edit_text")
	@iOSXCUITFindBy(accessibility = "generic_text_input_field")
	private WebElement nameThisReport;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/ok")
	@iOSXCUITFindBy(accessibility = "OK")
	private WebElement reportSentOkButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/positive_button")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[$name CONTAINS 'SAVE'$][2]")
	private WebElement saveButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/first_option")
	@iOSXCUITFindBy(accessibility = "MY EMAIL")
	private WebElement myEmailOption;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/second_option")
	@iOSXCUITFindBy(accessibility = "CLIENT EMAIL")
	private WebElement clientOption;

	@AndroidFindBy(xpath = "*//android.widget.RelativeLayout[2]")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
	private WebElement secondBuildingTable;

	@iOSXCUITFindBy(accessibility = "DOM BY PRICE2")
	private WebElement domByPrice2Chart;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/upload")
	@iOSXCUITFindBy(accessibility = "iconUndo")
	private WebElement shareButton;

	@AndroidFindBy(xpath = "//*[contains(@content-desc, ': VALUE_LABEL:')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView[2]/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
    private List<WebElement> valueChartList;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/positive_button")
	@iOSXCUITFindBy(accessibility = "SEND")
	private WebElement sendButton;

    @AndroidFindBy(xpath = "//*[@text='$12M+']")
	@iOSXCUITFindBy(accessibility = "$12M+")
	private WebElement upTo12MillionButton;

    @AndroidFindBy(accessibility = "LOCATION")
	@iOSXCUITFindBy(accessibility = "LOCATION")
    private WebElement locationButton;

    @AndroidFindBy(accessibility = "MEDIAN")
	@iOSXCUITFindBy(accessibility = "MEDIAN")
    private WebElement medianButton;

    @AndroidFindBy(accessibility = "FEATURES")
	@iOSXCUITFindBy(accessibility = "FEATURES")
    private WebElement featuresButton;

    @AndroidFindBy(accessibility = "DISTRIBUTION")
	@iOSXCUITFindBy(accessibility = "DISTRIBUTION")
    private WebElement distributionButton;

    @AndroidFindBy(accessibility = "TRENDS")
	@iOSXCUITFindBy(accessibility = "TRENDS")
    private WebElement trendsButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/date_range")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton")
    private WebElement yearsRange;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypePickerWheel[1]")
    private WebElement beginningPickerWheel;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypePickerWheel[2]")
    private MobileElement  endingPickerWheel;

//    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'SET RANGE'")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='SET RANGE']")
//	@iOSXCUITFindBy(accessibility = "SET RANGE")
    private WebElement setRangeButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther")
    private List<WebElement> valueColumnYearsList;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/header_container")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther")
    private WebElement headerOfFirstChart;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/chart_with_legend_container")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
    private WebElement chart;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private WebElement iPadChart;

    @AndroidFindBy(xpath = "//*[@text='NOTHING TO SEE HERE']")
    @iOSXCUITFindBy(accessibility = "NOTHING TO SEE HERE")
    private WebElement nothingToSeeHere;

//    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'RESET'")
//    @iOSXCUITFindBy(accessibility = "RESET")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='RESET']")
    private WebElement resetButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypePickerWheel[1]")
    private WebElement actualBeginningYear;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypePickerWheel[2]")
    private WebElement actualEndingYear;

    @iOSXCUITFindBy(accessibility = "$12M+")
    private WebElement chartTwelvePlusMillionButton;

    @AndroidFindBy(xpath = "//*[@text='$12M+']")
    @iOSXCUITFindBy(accessibility = "$12M+")
    private WebElement legendTwelvePlusMillionButton;


    @AndroidFindBy(accessibility = "com.perchwell.re.staging:id/upload")
    @iOSXCUITFindBy(accessibility = "share")
    private WebElement shareButtonInChart;

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'PRICE_PRICETRANCHES_LISTING_PRICE_LISTINGS_PROPERTIES: VALUE_LABEL:'")
    private WebElement priceChartValue;

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

    public void domByPriceButtonClick(){
        element(domByPriceButton).click();
    }

    public void nycTownhousesButtonClick(){
        element(nycTownhousesButton).click();
    }

    public void managementButtonClick(){
        element(managementButton).click();
    }

    public void acrisClosingsButtonClick(){
        element(acrisClosingsButton).click();
    }

    public boolean isMessageMaximumSixChartsDisplayed(){
        element(plusWhiteButton).click();
        return element(maximumSixChartMessage).isDisplayed();
    }

    public void skipHints() {
	    if(!Config.isAndroid()) {
            element(dontForgetHint).click();
            element(tapAnyChartHint).click();
            element(pressAndHoldHint).click();
        }
    }

    public boolean isDomByPriceCartAdd(){
        return element(domByPrice2Chart).isDisplayed();
    }

    public void okButtonClick(){
        element(okButton).click();
    }

    public void isThisIsAProOnlyFeatureMessageShow() {
        element(thisIsAProOnlyFeatureMessage).shouldBeVisible();
    }

    public void mktShareButtonClick(){
        element(mktShareButton).click();
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

	public void clickSaveButton() {
	    if(Config.isAndroid()) {
            waitABit(3000);
//            setImplicitTimeout(3, SECONDS);
//	        if(!element(MobileBy.xpath("com.perchwell.re.staging:id/positive_button")).isVisible()) {
//                hideKeyboard();
//            }
//            resetImplicitTimeout();
        }
		element(saveButton).click();
	}

	public void setAndSaveReportName(String reportName) {
        SessionVariables.addValueInSessionVariable("Report_name", RandomGenerator.getRandomString(reportName));
		element(nameThisReport).sendKeys(SessionVariables.getValueFromSessionVariable("Report_name"));
	}

	public Boolean shouldFindSentEmail(String report_name) {
		//Waiting while report was sent
		try {
			Thread.sleep(10000);
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
        element(secondBuildingTable).click();

	}
	public void shareButtonClick(){
		element(shareButton).click();

	}
	public void clickClientEmailOption() {
		element(clientOption).click();
	}

	public boolean isDomByPrice2DisplayedWithSwipe() {
		Helper.scrollToElement(domByPrice2Chart);
		return element(domByPrice2Chart).isDisplayed();
	}

	public String getValueBedroomsChart(){
//	    Helper.scrollToElement(valueChartList.get(0));
	  return element(valueChartList.get(0)).getText();
    }

    public String getValueAskingPriceChart(){
//        Helper.scrollToElement(valueChartList.get(1));
	    return element(valueChartList.get(1)).getText();
    }

	public void clickSendButton() {
			element(sendButton).click();
	}

	public boolean shouldFindPDFSummaryEmail() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Boolean reportWasFound = false;

        //Get last emails with HEADER_REPORT_DETAILS_ANALYTICS
        MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(AppProperties.INSTANCE.getProperty("HEADER_REPORT_DETAILS_ANALYTICS"));

        if(mailTrapResponse.length != 0) {

            //Get attachments
            MailTrapAttachment[] mailTrapAttachment = MailTrap.getMassageAttachment(mailTrapResponse[0].getId());

            //Find attachments with DETAILS_REPORT_NAME and compare the number of emails before and after email was sent
            for (MailTrapAttachment my_attachment : mailTrapAttachment) {
                if (my_attachment.getFilename().equalsIgnoreCase(AppProperties.INSTANCE.getProperty("DETAILS_REPORT_NAME"))
                        && (mailTrapResponse[0].getId() != messageIdOfLastReportDetailEmail)) {
                    reportWasFound = true;
                    break;
                }
            }
        }
        return reportWasFound;
	}

	public void upTo12MillionButtonClick() {
		element(upToOneMillionButton).click();
	}



    public void medianButtonClick(){
	    element(medianButton).click();
    }

    public void locationButtonClick(){
	    element(locationButton).click();
    }

    public void featuresButtonClick(){
	    element(featuresButton).click();
    }

    public void distributionButtonClick(){
	    element(distributionButton).click();
    }

    public void trendsButtonClick(){
	    element(trendsButton).click();
    }



    public void yearsRangeButtonClick(){
	    element(yearsRange).click();
    }

    public String getDefaultMinValueYear(){
        return element(beginningPickerWheel).getText();
    }

    public void getDefaultMaxValueYear() {
        SessionVariables.addValueInSessionVariable("MaxDefaultRangeYear",String.valueOf(endingPickerWheel.getAttribute("value")));
        SessionVariables.addValueInSessionVariable("MaxRangeYear",String.valueOf(Integer.parseInt(SessionVariables.getValueFromSessionVariable("MaxDefaultRangeYear")) - 1));
    }

    public void setMinValueYear(String value){
	    beginningPickerWheel.sendKeys(value);
    }

    public void setMaxValueYears(String value){
        endingPickerWheel.setValue(value);
    }

    public void setRangeButtonClick(){
	    element(setRangeButton).click();
    }

    public void isColumnForPreviousMinDefaultYearAdd(String minYear) {
	    boolean isCorrectRange = true;
        int counterYear = Integer.parseInt(minYear);

        for(WebElement year : valueColumnYearsList) {
            if(!((Integer.parseInt(year.getAttribute("name")) == counterYear) && (valueColumnYearsList.size() == 6))) {
                isCorrectRange = false;
                break;
            }
            counterYear += 1;
        }
	    Assert.assertTrue(isCorrectRange);
    }

    public void isColumnForNextMaxDefaultYearRemove() {
        boolean isCorrectRange = true;
        int counterYear = Integer.parseInt(SessionVariables.getValueFromSessionVariable("MinRangeYear"));

        for(WebElement year : valueColumnYearsList) {
            if(!((Integer.parseInt(year.getAttribute("name")) == counterYear) && (valueColumnYearsList.size() == 5))) {
                isCorrectRange = false;
                break;
            }
            counterYear += 1;
        }
        Assert.assertTrue(isCorrectRange);
	}

	public boolean isOnlyThreeYearsDisplayed(){
        return valueColumnYearsList.size() == 3;
    }

    public String yearsRangeButtonValue() {
	    if (Config.isAndroid()) {
	    return yearsRange.getAttribute("text");
        } else {
	        return yearsRange.getAttribute("name");
        }
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
            String year = e.getAttribute("name");
            year = year.substring(0,year.length() - 1);
            yearsList.add(Integer.parseInt(year));
        }
        previousYearsList = yearsList;
    }

    public void getPresentYearsInFromTopList() {
        List<Integer> yearsList = new ArrayList<>();
        for (WebElement e : valueColumnYearsList) {
            String year = e.getAttribute("name");
            year = year.substring(0,year.length() - 1);
            yearsList.add(Integer.parseInt(year));
        }
        presentYearsList = yearsList;
    }

    public boolean isOnChartUpdateYearsFromTop(){
        boolean isChartUpdateYearsFromTop = false;
        for (int i = 0;i < presentYearsList.size() ;i++){
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
        if(Config.isAndroid()) {
            hideKeyboard();
        }
    }

    public void isChartDisplayed() {
        if (Config.isIPad()) {
            element(iPadChart).shouldBeVisible();
        } else {
            element(chart).shouldBeVisible();
       }
        setImplicitTimeout(3, SECONDS);
        Assert.assertEquals(0, getDriver().findElements(MobileBy.AccessibilityId("NOTHING TO SEE HERE")).size());
        resetImplicitTimeout();
    }

    public void clickOnMagnifierIconWithPreviouslySavedSearch() {
        String search = SessionVariables.getValueFromSessionVariable("Search");
//        if (Config.isAndroid()) {
            getDriver().findElement(By.xpath("//*[@text='" + search + "']")).click();
//        }
//        else {
//            getDriver().findElement(MobileBy.AccessibilityId(search)).click();
//        }
    }

    public void REBNYListingsButtonClick() {
        element(rebnyListingsButton).click();
    }

    public void isChartWithApplyingFiltersDisplayed() {
        waitFor(ExpectedConditions.visibilityOf(chart));
        element(chart).shouldBeVisible();
    }

    public void checkDefaultChartYearsRange() {
        Assert.assertEquals(this.getExpectedYearsRange(), this.yearsRangeButtonValue());
    }

    private String getExpectedYearsRange() {
        int maxYear = CurrentYear.getCurrentYear() - 2000;
        int minYear = maxYear - 4;
        return "'" + minYear + "  — '" + maxYear; //add space
    }

    public void clickOnResetButton() {
        element(resetButton).click();
    }

    public void checkResetBeginningYear() {
        String beginningYear = String.valueOf(CurrentYear.getCurrentYear() - 4);
        Assert.assertEquals(beginningYear, actualBeginningYear.getAttribute("value"));
    }

    public void checkResetEndingYear() {
        Assert.assertEquals(String.valueOf(CurrentYear.getCurrentYear()), actualEndingYear.getAttribute("value"));
    }

    public void clickOnLegend12PlusMillionButton() {
        element(legendTwelvePlusMillionButton).click();
    }

    public void getMessageIdOfLastReportDetailEmail() {
        MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(AppProperties.INSTANCE.getProperty("HEADER_REPORT_DETAILS_ANALYTICS"));
        if(mailTrapResponse.length == 0) {
            messageIdOfLastReportDetailEmail = 0;
        } else {
            messageIdOfLastReportDetailEmail = mailTrapResponse[0].getId();
        }
    }

    public void shareButtonInChartClick() {
        element(shareButtonInChart).click();
    }

    public void checkPriceChartIsSameListView() {
        Assert.assertEquals(SessionVariables.getValueFromSessionVariable("Listings_Amount"), element(priceChartValue).getAttribute("label"));
    }
}
