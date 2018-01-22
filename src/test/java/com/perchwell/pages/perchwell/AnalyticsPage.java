package com.perchwell.pages.perchwell;

import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
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

    @iOSXCUITFindBy(accessibility = "BEDROOMS")
    private WebElement bedroomsButton;

    @iOSXCUITFindBy(accessibility = "plus white")
    private WebElement plusWhiteButton;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS")
    private WebElement acrisClosingsButton;

    @iOSXCUITFindBy(accessibility = "BUILDING HEIGHT (BY DEAL COUNT)")
    private  WebElement dealCountByHeightButton;

    @iOSXCUITFindBy(accessibility = "BUILDING HEIGHT")
    private  WebElement buildingHeightButton;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT BY HEIGHT")
    private  WebElement dealCountByHeightChart;

    @iOSXCUITFindBy(accessibility = "BUILDING TYPE (BY DEAL COUNT)")
    private  WebElement buildingTypeButton;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT BY TYPE")
    private  WebElement dealCountByTypeChart;

    @iOSXCUITFindBy(accessibility = "NYC TOWNHOUSES")
    private  WebElement nycTownhousesButton;

    @iOSXCUITFindBy(accessibility = "DOM BY PRICE")
    private  WebElement domByPriceButton;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT BY PRICE")
    private  WebElement dealCountByPriceButton;

    @iOSXCUITFindBy(accessibility = "MANAGEMENT")
    private  WebElement managementButton;

    @iOSXCUITFindBy(accessibility = "DAYS ON MARKET")
    private  WebElement daysOnMarketButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[3]")
    private  WebElement deleteChartButton;

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

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
    private WebElement firstBuildingInList;

    //endregion

    public AnalyticsPage(WebDriver driver){
        super(driver);
    }

    public void holdCharts(){
        action.longPress(dealCountByTypeChart).release().perform();
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

    public void addChartFromREBNYSection(){
        element(rebnyListingsButton).click();
        element(askingPriceButton).click();
    }

    public void addButtonClick(){
        element(plusWhiteButton).click();
    }

    public void addChartFromACRISSection(){
        element(acrisClosingsButton).click();
        element(dealCountByHeightButton).click();
    }

    public void addChartFromNYCSection(){
        element(nycTownhousesButton).click();
        element(domByPriceButton).click();
    }

    public void addChartFromManagementSection(){
        element(managementButton).click();
        element(daysOnMarketButton).click();
    }

    public void addTwoCharts(){
        element(rebnyListingsButton).click();
        element(bedroomsButton).click();
        element(plusWhiteButton).click();
        element(acrisClosingsButton).click();
        element(buildingTypeButton).click();
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
        return element(askingPriceButton).isEnabled();
    }

    public boolean isBuildingHeightCartAdd(){
        return element(dealCountByHeightChart).isEnabled();
    }

    public boolean isDomByPriceCartAdd(){
        return element(domByPriceButton).isEnabled();
    }

    public boolean isDaysOnMarketAdd(){
        return element(daysOnMarketButton).isEnabled();
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

    public void addBuildingHeightChartWithMKTShare(){
        element(rebnyListingsButton).click();
        element(mktShareButton).click();
        element(buildingHeightButton).click();
    }

    public void addAskingPriceChartWithMKTShare(){
        element(rebnyListingsButton).click();
        element(mktShareButton).click();
        element(askingPriceButton).click();
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
}
