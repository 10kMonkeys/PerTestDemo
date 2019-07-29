package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW16_ReportWizardMultiSelectSalesRentalsBreakdownTagsTest extends SampleTest {

    @Test
    public void reportWizardMultiSelectSalesRentalsBreakdownTagsTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("core_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atMyTagsPage.fillInTagSearchField("TAGNAME201900000000019");
        user.atMyTagsPage.clickOnFirstTag();
        user.atMyTagsPage.clickOnSearchButton();
        user.atMyTagsPage.getListingsAddresses(9);
        user.atMyTagsPage.closeTagsPage();
        user.atAccountPage.closeAccountMenu();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.inSearchMenu.openAddressSearch();
        user.atSearchPage.fillInAddressSearchField(Addresses.DAKOTA);
        user.atSearchPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atMyTagsPage.fillInTagSearchField("TAGNAME201900000000019");
        user.atMyTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atSearchPage.clickOnCrossBackButtonFromAddressSearch();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atMyTagsPage.fillInTagSearchField("TAGNAME201900000000019");
        user.atMyTagsPage.clickOnFirstTag();
        user.atMyTagsPage.clickOnSearchButton();
        user.atMyTagsPage.getFirstBuildingAddressForReport();
        user.atMyTagsPage.openActiveCondoSaleListing();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.openOnMoreInfoSection();
        user.atOpenedBuildingPage.getMonthlyCommonCharges();
        user.atOpenedBuildingPage.getPropertyTax();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atMyTagsPage.clickOnCrossFromAccountTagsButton();
        user.atAccountPage.closeAccountMenu();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnExtendedCMAButton();
        user.atCreateReportPage.clickOnSalesButton();
        user.atCreateReportPage.clickOnTagsField();
        user.atTagsPage.fillInTagSearchField("TAGNAMEREPORTWIZARD");
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.closeTagsPage();
        user.atCreateReportPage.checkFirstAddressInActiveSectionAfterFirstListing();
        user.atCreateReportPage.checkSecondListingInContractSection();
        user.atCreateReportPage.checkThirdAndFourthListingsInOffMarketSection();
        user.atCreateReportPage.checkFifthListingInSoldSection();
        user.atCreateReportPage.checkSixPerEightListingIsNotShown();
        user.atCreateReportPage.checkBuildingIsNotShown();
        user.atCreateReportPage.clickOnBackButton();
        user.atCreateReportPage.clickOnRentalsButton();
        user.atCreateReportPage.checkEightAndNineListingsIsShown();
        user.atCreateReportPage.checkRentalSectionIsShown();
        user.atCreateReportPage.clickOnBackButton();
        user.atCreateReportPage.clickOnSalesButton();
        user.atCreateReportPage.deleteReportWizardTag();
        user.atCreateReportPage.clickOnTagsField();
        user.atMyTagsPage.fillInTagSearchField("TAGNAMEREPORTWIZARD");
        user.atMyTagsPage.clickOnFirstTag();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.closeTagsPage();
        user.atCreateReportPage.checkFirstListingIsShownOnce();
        user.atCreateReportPage.deleteReportWizardTag();
        user.atCreateReportPage.checkFirstListingIsShownOnce();
        user.atCreateReportPage.checkRentalListingIsShownOnce();
        user.atCreateReportPage.checkListingsAmount(2); //TODO DOM ISSUE
        user.atCreateReportPage.openSecondListing();
        user.atOpenedBuildingPage.openOnMoreInfoSection();
        user.atOpenedBuildingPage.checkMonthlyCommonChargesNotChanged();
        user.atOpenedBuildingPage.checkMonthlyPropertyTaxNotChanged();
    }
}
