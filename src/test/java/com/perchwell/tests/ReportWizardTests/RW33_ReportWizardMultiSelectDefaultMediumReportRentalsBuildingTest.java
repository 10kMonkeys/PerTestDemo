package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.data.ReportTypes;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW33_ReportWizardMultiSelectDefaultMediumReportRentalsBuildingTest extends SampleTest {

    @Test
    public void reportWizardMultiSelectDefaultMediumReportRentalsBuildingTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectRentalsProperty();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.deselectActiveFilter();
        user.atSearchPage.selectSoldOrRentFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.inSearchMenu.openAddressSearch();
        user.atSearchPage.fillInAddressSearchField(Addresses.EAST_35TH);
        user.atSearchPage.openFirstBuilding();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atSearchPage.closeAddressSearch();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atMyTagsPage.searchJustCreatedTag();
        user.atMyTagsPage.clickOnFirstTag();
        user.atMyTagsPage.clickOnSearchButton();
        user.atMyTagsPage.getListingsAddresses(3);
        user.atMyTagsPage.selectFirstListing();
        user.atMyTagsPage.clickOnSelectAll();
        user.atMyTagsPage.clickOnMoreOptionsButton();
        user.atMyTagsPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnListingReportButton();
        user.atCreateReportPage.clickDefaultIncludesBuildingsButton();
        user.atCreateReportPage.checkFirstAndSecondListingsInListingsSection();
        user.atCreateReportPage.checkBuildingInBuildingsSection();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.fillEmailField("valid-report-wizard1@email.com");
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.MEDIUM_DEFAULT_REPORT);
        user.atCreateReportPage.clickOnPopUpOkButton();
        user.atCreateReportPage.clickOnBackButton();
        user.atCreateReportPage.selectPerchwellLinkOption();
        user.atCreateReportPage.selectListingAgentInfoOption();
        user.atCreateReportPage.deselectIncludeExactAddressOption();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clearSubjectField();
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.MEDIUM_DEFAULT_REPORT);
    }
}
