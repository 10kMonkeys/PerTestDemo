package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Properties;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW6_ListingCellTest extends SampleTest {

    @Test
    public void listingCellTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectBedroomsRangeOption();
        user.atSearchPage.selectFilterStudioBeds();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.setSquareFeetMinFilter("1000");
        user.atSearchPage.setSquareFeetMaxFilter("3000");
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.getFirstListingSquareFeetForReport();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnListingReportButton();
        user.atCreateReportPage.clickOnShortButton();
        user.atCreateReportPage.checkListingType(Properties.CONDO);
        user.atCreateReportPage.checkStudioIsDisplayed();
        user.atCreateReportPage.checkSquareFeetValueWithoutApproxLabel();
        user.atCreateReportPage.checkPriceWithoutMO();
        user.atCreateReportPage.clickOnBackButton();
        user.atCreateReportPage.clickOnBackButton();
        user.atCreateReportPage.clickOnBackButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.deselectFilterStudioBeds();
        user.atSearchPage.selectBathroomsRangeOption();
        user.atSearchPage.selectFilter1AndHalfBath();
        user.atSearchPage.selectRentalsProperty();
        user.atSearchPage.selectCoopFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnListingReportButton();
        user.atCreateReportPage.clickOnShortButton();
        user.atCreateReportPage.checkListingType(Properties.COOP_RENTAL);
        user.atCreateReportPage.checkOneAndHalfBathroomIsShown();
        user.atCreateReportPage.checkOnlySquareFeetWithApproxLabel();
        user.atCreateReportPage.checkPriceWithMO();
        user.atCreateReportPage.clickOnBackButton();
        user.atCreateReportPage.clickOnBackButton();
        user.atCreateReportPage.clickOnBackButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectSalesProperty();
        user.atSearchPage.selectTownhouseFilter();
        user.atSearchPage.clickOnOpenHouseMinValueField();
        user.atSearchPage.setDateRangeForNextMonth("1", "28");
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.getOpenHouseDateForFirstListing();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnListingReportButton();
        user.atCreateReportPage.clickOnShortButton();
        user.atCreateReportPage.checkListingType(Properties.TOWNHOUSE);
        user.atCreateReportPage.checkOpenHouseInfoIsShown();
        user.atCreateReportPage.clickOnBackButton();
        user.atCreateReportPage.clickOnBackButton();
        user.atCreateReportPage.clickOnBackButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.selectCondopFilter();
        user.atSearchPage.setSquareFeetMinFilter("1000");
        user.atSearchPage.setSquareFeetMaxFilter("3000");
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnListingReportButton();
        user.atCreateReportPage.clickOnShortButton();
        user.atCreateReportPage.checkListingType(Properties.CONDOP);
        user.atCreateReportPage.checkOnlySquareFeetWithApproxLabel();
    }
}
