package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.data.ReportTypes;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW41_ReportWizardMultiSelectMediaReportFromMultiSelectTest extends SampleTest {

    @Test
    public void reportWizardMultiSelectMediaReportFromMultiSelectTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("core_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectRentalsProperty();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.selectSecondListingAfterFirst();
        user.atPerchwellPage.selectThirdListingAfterSecond();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.getListingsAddresses(3);
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
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnSearchButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.clickOnSelectAll();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnMediaReportButton();
        user.atCreateReportPage.checkBuildingSectionIsNotShown();
        user.atCreateReportPage.moveFirstListingToThirdListingByDragging();
        user.atCreateReportPage.swipeLeftListingByAddress();
        user.atCreateReportPage.clickOnDeleteButton();
        user.atCreateReportPage.getListingsAndBuildingsOrder();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.deselectAllOptions();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.fillEmailField("valid-report-wizard1@email.com");
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.MEDIA_REPORT);
        user.atCreateReportPage.checkOnlyTwoListingsAreShownInEmailWithoutExactAddresses();
        user.atCreateReportPage.clickOnPopUpOkButton();
        user.atCreateReportPage.clickOnBackButton();
        user.atCreateReportPage.selectPerchwellLinkOption();
        user.atCreateReportPage.selectPhotosSuboption();
        user.atCreateReportPage.selectIncludeExactAddressOption();
        user.atCreateReportPage.selectListingAgentInfoOption();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clearSubjectField();
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.MEDIA_REPORT);
        user.atCreateReportPage.checkListingsOrderIsSavedInEmailAndNotDeletedListings();
        user.atCreateReportPage.clickOnPopUpOkButton();
        user.atCreateReportPage.clickOnBackButton();
        user.atCreateReportPage.deselectAllOptions();
        user.atCreateReportPage.selectListingAgentInfoOption();
        user.atCreateReportPage.selectIncludeExactAddressOption();
        user.atCreateReportPage.switchToFloorplanSuboption();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clearSubjectField();
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.MEDIA_REPORT);
    }
}
