package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.data.ReportTypes;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW23_ReportWizardIndividualListingRentalTest extends SampleTest {

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
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectBedroomsRangeOption();
        user.atSearchPage.selectFilterStudioBeds();
        user.atSearchPage.selectRentalsProperty();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.getFirstListingAddressForReport();
        user.atPerchwellPage.getFirstListingUnitForReport();
        user.atPerchwellPage.getFirstListingPriceForReport();
        user.atPerchwellPage.getFirstListingPropertyTypeForReport();
        user.atPerchwellPage.getFirstListingBedroomsForReport();
        user.atPerchwellPage.getFirstListingSquareFeetForReport();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.clickShareButton();
        user.atOpenedBuildingPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnExtendedCMAButton();
        user.atCreateReportPage.clickOnRentalsButton();
        user.atCreateReportPage.checkAddressPlaceholderWithValue(); //TODO: need to implement locator
        user.atCreateReportPage.checkUnitForListing(); //TODO: need to implement locator
        user.atCreateReportPage.checkPricePlaceholderWithValue(); //TODO: need to implement locator
        user.atCreateReportPage.checkPropertyTypePlaceholderWithValue(); //TODO: need to implement locator
        user.atCreateReportPage.checkBedroomsPlaceholderWithValue(); //TODO: need to implement locator
        user.atCreateReportPage.checkSqrFootagePlaceholderWithValue(); //TODO: need to implement locator
        user.atCreateReportPage.checkSquareFeetValueWithoutApproxLabel(); //TODO: need to implement locator
        user.atCreateReportPage.checkStudioIsDisplayed(); //TODO: need to implement locator
        user.atCreateReportPage.checkBathroomsIsHidden(); //TODO: need to implement locator
        user.atCreateReportPage.clickOnTagsField();
        user.atTagsPage.fillInTagSearchField("TAGNAMEREPORTWIZARD");
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnCrossBackFromTagsButton();
        user.atCreateReportPage.checkEighthListingInActiveSection();
        user.atCreateReportPage.checkNinthListingInRentedSection();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.checkLayoutIsLandscape();
        user.atCreateReportPage.checkExternalPageOptionIsSelected();
        user.atCreateReportPage.checkCCMaintIsNotPresented();
        user.atCreateReportPage.checkRETaxedIsNotPresented();
        user.atCreateReportPage.checkTotalMonthliesIsNotPresented();
        user.atCreateReportPage.selectPerchwellLinkOption();
        user.atCreateReportPage.checkExternalPageOptionUnselected();
        user.atCreateReportPage.checkPerchwellLinkOptionSelected();
        user.atCreateReportPage.swipeToPortrait();
        user.atCreateReportPage.switchToPortrait();
        user.atCreateReportPage.checkCCMaintIsNotPresented();
        user.atCreateReportPage.checkRETaxedIsNotPresented();
        user.atCreateReportPage.checkTotalMonthliesIsNotPresented();
        user.atCreateReportPage.selectPriceChangeSuboption(); //temp fix
        user.atCreateReportPage.deselectBedsSuboption();
        user.atCreateReportPage.checkEightFieldsCounterIsVisible();
        user.atCreateReportPage.selectBedsSuboption();
        user.atCreateReportPage.checkNineFieldsCounterIsVisible();
        user.atCreateReportPage.selectRoomsSuboption();
        user.atCreateReportPage.checkUnselectedRoomsSuboptionIsVisible();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.fillEmailField("valid-report-wizard1@email.com");
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.EXTENDED_CMA_REPORT);
    }

}
