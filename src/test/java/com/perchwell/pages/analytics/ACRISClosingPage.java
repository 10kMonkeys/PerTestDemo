package com.perchwell.pages.analytics;

import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ACRISClosingPage extends BasePage {

    //region WebElements

    @iOSXCUITFindBy(accessibility = "BUILDING HEIGHT (BY DEAL COUNT)")
    private WebElement dealCountByHeightButton;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT BY HEIGHT")
    private  WebElement dealCountByHeightChart;

    @iOSXCUITFindBy(accessibility = "BUILDING TYPE (BY DEAL COUNT)")
    private WebElement buildingTypeByDealCountButton;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT BY TYPE")
    private WebElement dealCountByTypeChart;

    @iOSXCUITFindBy(accessibility = "PRICE (BY DEAL COUNT)")
    private WebElement priceByDealCountButton;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT BY SEGMENT")
    private WebElement dealCountBySegmentChart;

    @iOSXCUITFindBy(accessibility = "$/FT² PERCENTILES")
    private WebElement dollarPerFTPercentilesButton;

    @iOSXCUITFindBy(accessibility = "SALE $/FT²")
    private WebElement dollarPerFTPercentilesChart;

    @iOSXCUITFindBy(accessibility = "$/FT² BY PRICE SEGMENT")
    private WebElement dollarPerFTByPriceSegmentButton;

    @iOSXCUITFindBy(accessibility = "$/FT² BY SEGMENT")
    private WebElement dollarPerFTByPriceSegmentChart;

    @iOSXCUITFindBy(accessibility = "PRICE PERCENTILES")
    private WebElement pricePercentilesButton;

    @iOSXCUITFindBy(accessibility = "SALE PRICE")
    private WebElement salePriceChart;

    @iOSXCUITFindBy(accessibility = "PRICE BY PRICE SEGMENT")
    private WebElement priceByPriceSegmentButton;

    @iOSXCUITFindBy(accessibility = "SALE PRICE BY SEGMENT")
    private WebElement salePriceBySegmentChart;

    @iOSXCUITFindBy(accessibility = "SQUARE FEET PERCENTILES")
    private WebElement squareFeetPercentilesButton;

    @iOSXCUITFindBy(accessibility = "PRICE BY TYPE")
    private WebElement priceByTypeButton;

    @iOSXCUITFindBy(accessibility = "MEDIAN SALE PRICE")
    private WebElement medianSalePriceChart;

    @iOSXCUITFindBy(accessibility = "SQUARE FEET")
    private WebElement squareFeetButton;

    @iOSXCUITFindBy(accessibility = "DEAL VOLUME (ANNUAL)")
    private WebElement dealVolumeAnnualButton;

    @iOSXCUITFindBy(accessibility = "DEAL VOLUME (QUARTERLY)")
    private WebElement dealVolumeQuarterlyButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell/XCUIElementTypeStaticText[`name CONTAINS[cd] \"DEAL COUNT\"`]")
    private WebElement dealCountButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"DEAL COUNT\"`][1]")
    private WebElement dealCountChart;

    @iOSXCUITFindBy(accessibility = "PRICE")
    private WebElement priceChartButton;

    @iOSXCUITFindBy(accessibility = "PRICE PER FT²")
    private WebElement pricePerFT2ChartButton;

    @iOSXCUITFindBy(accessibility = "MEDIAN SALE PRICE")
    private WebElement priceChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN SALE $/FT²")
    private WebElement pricePerFT2Chart;

    //endregion

    public ACRISClosingPage(WebDriver driver) {
        super(driver);
    }

    public void dealVolumeAnnualButtonClick() {
        element(dealVolumeAnnualButton).click();
    }

    public void dealVolumeQuarterlyButtonClick(){
        element(dealVolumeQuarterlyButton).click();
    }

    public void dealCountByHeightButtonClick(){
        element(dealCountByHeightButton).click();
    }

    public void buildingTypeByDealCountButtonClick(){
        element(buildingTypeByDealCountButton).click();
    }

    public void isDealCountByHeightChartAdd(){
        element(dealCountByHeightChart).shouldBeVisible();
    }

    public boolean isDealCountByTypeDisplayed(){
        return Helper.isElementDisplayed(dealCountByTypeChart);
    }

    public void shouldBuildingHeightChartDisplayedWithSwipe() {
        Helper.scrollToElement(dealCountByHeightChart);
        element(dealCountByHeightChart).shouldBeVisible();
    }

    public void shouldBuildingTypeByDealCountDisplayed() {
        element(dealCountByTypeChart).shouldBeVisible();
    }

    public void addAndVerifyPriceByDealCountChart(){
        element(priceByDealCountButton).click();
        element(dealCountBySegmentChart).shouldBeVisible();
    }

    public void addDollarPerFTPercentilesChart(){
        element(dollarPerFTPercentilesButton).click();
    }

    public void shouldSeeDollarPerFTPercentiles(){
        element(dollarPerFTPercentilesChart).shouldBeVisible();
    }

    public void addAndVerifyPricePercentilesChart(){
        element(pricePercentilesButton).click();
        element(salePriceChart).shouldBeVisible();
    }

    public void addAndVerifyPriceByPriceSegmentChart(){
        element(priceByPriceSegmentButton).click();
        element(salePriceBySegmentChart).shouldBeVisible();
    }

    public void addAndVerifySquareFeetPercentiles(){
        element(squareFeetPercentilesButton).click();
        element(squareFeetButton).shouldBeVisible();
    }

    public void addAndVerifyPriceByTypeChart(){
        element(priceByTypeButton).click();
        element(medianSalePriceChart).shouldBeVisible();
    }

    public void addDealCountChart() {
        element(dealCountButton).click();
    }

    public void shouldSeeDealCount() {
        element(dealCountChart).shouldBeVisible();
    }

    public void addAndVerifyPriceChart() {
        element(priceChartButton).click();
        element(priceChart).shouldBeVisible();
    }

    public void addAndVerifyPricePerFT2Chart() {
        element(pricePerFT2ChartButton).click();
        element(pricePerFT2Chart).shouldBeVisible();
    }
}
