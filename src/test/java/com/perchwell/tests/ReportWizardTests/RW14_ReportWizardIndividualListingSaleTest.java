package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.data.ReportTypes;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW14_ReportWizardIndividualListingSaleTest extends SampleTest {

    @Test
    public void reportWizardIndividualListingSaleTest() {
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
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectBathroomsRangeOption();
        user.atSearchPage.selectFilter1AndHalfBath();
        user.atSearchPage.selectCoopFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.getFirstListingAddressForReport();
        user.atPerchwellPage.getFirstListingUnitForReport();
        user.atPerchwellPage.getFirstListingPriceForReport();
        user.atPerchwellPage.getFirstListingPropertyTypeForReport();
        user.atPerchwellPage.getFirstListingBedroomsForReport();
        user.atPerchwellPage.getFirstListingBathroomsForReport();
        user.atPerchwellPage.getFirstListingSquareFeetForReport();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.clickShareButton();
        user.atOpenedBuildingPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnCmaButton();
        user.atCreateReportPage.clickOnSalesButton();
        user.atCreateReportPage.checkAddressPlaceholderWithValue(); //TODO: need to implement locator
        user.atCreateReportPage.checkUnitForListing(); //TODO: need to implement locator
        user.atCreateReportPage.checkPricePlaceholderWithValue(); //TODO: need to implement locator
        user.atCreateReportPage.checkPropertyTypePlaceholderWithValue(); //TODO: need to implement locator
        user.atCreateReportPage.checkBedroomsPlaceholderWithValue(); //TODO: need to implement locator
        user.atCreateReportPage.checkBathroomsPlaceholderWithValue(); //TODO: need to implement locator
        user.atCreateReportPage.checkSqrFootagePlaceholderWithValue(); //TODO: need to implement locator
        user.atCreateReportPage.checkOnlySquareFeetWithApproxLabel(); //TODO: need to implement locator
        user.atCreateReportPage.swipeLeftSubjectPropertyCell();
        user.atCreateReportPage.checkDeleteButtonIsNotDisplayed();
        user.atCreateReportPage.clickOnTagsField();
        user.atTagsPage.fillInTagSearchField("TAGNAMEREPORTWIZARD");
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnCrossBackFromTagsButton();
        user.atCreateReportPage.checkFirstListingInActiveSection();
        user.atCreateReportPage.checkSecondListingInContractSection();
        user.atCreateReportPage.checkThirdAndFourthListingsInOffMarketSection();
        user.atCreateReportPage.checkFifthListingInSoldSection();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.checkLayoutIsLandscape();
        user.atCreateReportPage.checkSelectedFieldsAmount(11);
        user.atCreateReportPage.checkUnselectedCCMaintenanceSubpoptionIsVisible();
        user.atCreateReportPage.checkUnselectedRETaxedSuboptionIsVisible();
        user.atCreateReportPage.checkTotalMonthliesIsVisible();
        user.atCreateReportPage.checkExternalPageOptionIsSelected();
        user.atCreateReportPage.swipeToPortrait();
        user.atCreateReportPage.fillInReportLabelField(70);
        user.atCreateReportPage.fillInReportLabelField(71);
        user.atCreateReportPage.checkOnlySeventySymbolsAllowed();
        user.atCreateReportPage.switchToPortrait();
        user.atCreateReportPage.checkSelectedFieldsAmount(8);
        user.atCreateReportPage.checkCCMaintIsPresented();
        user.atCreateReportPage.checkRETaxedIsPresented();
        user.atCreateReportPage.checkTotalMonthliesIsVisible();
        user.atCreateReportPage.switchToLandscape();
        user.atCreateReportPage.deselectOriginalPriceSuboption();
        user.atCreateReportPage.checkSuboptionCounterIsEquals("10/11");
        user.atCreateReportPage.selectRoomsSuboption();
        user.atCreateReportPage.checkSuboptionCounterIsEquals("11/11");
        user.atCreateReportPage.selectContractDateSuboption();
        user.atCreateReportPage.checkUnselectedContractDateSuboptionIsVisible();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.fillEmailField("valid-report-wizard1@email.com");
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.clickOnPopUpExitButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.CMA_REPORT);
    }
}
