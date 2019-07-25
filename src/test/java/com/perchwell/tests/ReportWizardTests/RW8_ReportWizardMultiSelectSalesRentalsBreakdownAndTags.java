package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW8_ReportWizardMultiSelectSalesRentalsBreakdownAndTags extends SampleTest {

    @Test
    public void reportWizardIndividualListingRentalTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("core_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atMyTagsPage.fillInTagSearchField("TAGNAMEREPORTWIZARD");
        user.atMyTagsPage.clickOnFirstTag();
        user.atMyTagsPage.clickOnSearchButton();
        user.atMyTagsPage.getListingsAddresses(10);
        user.atMyTagsPage.closeTagsPage();
        user.atAccountPage.closeAccountMenu();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.inSearchMenu.openAddressSearch();
        user.atSearchPage.fillInAddressSearchField(Addresses.DAKOTA);
        user.atSearchPage.openFirstBuilding();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atMyTagsPage.fillInTagSearchField("TAGNAMEREPORTWIZARD");
        user.atMyTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atSearchPage.clickOnCrossBackButtonFromAddressSearch();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atMyTagsPage.fillInTagSearchField("TAGNAMEREPORTWIZARD");
        user.atMyTagsPage.clickOnFirstTag();
        user.atMyTagsPage.clickOnSearchButton();
        user.atMyTagsPage.openActiveCondoSaleListing();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.openOnMoreInfoSection(); //TODO unable to click after swupe 
        user.atOpenedBuildingPage.getMonthlyCommonCharges();//TODO fix the DOM
        user.atOpenedBuildingPage.getPropertyTax();//TODO fix the DOM
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atMyTagsPage.clickOnCrossFromAccountTagsButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atAccountPage.closeAccountMenu();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnCmaButton();
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
        user.atCreateReportPage.checkFirstListingIsShown();
        user.atCreateReportPage.deleteReportWizardTag();
        user.atCreateReportPage.checkFirstListingIsShown();
        user.atCreateReportPage.checkListingsAmount(1); //TODO DOM ISSUE
    }
}
