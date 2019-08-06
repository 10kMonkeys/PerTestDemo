package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.data.ReportTypes;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW40_ReportWizardMultiSelectItineraryReportRentalBuildingGeneralOptionsTest extends SampleTest {

    @Test
    public void reportWizardMultiSelectItineraryReportRentalBuildingGeneralOptionsTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("core_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectRentalsProperty();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.selectSecondListingAfterFirst();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.removeAllTagPills();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.closeTagsPage();
        user.inSearchMenu.openAddressSearch();
        user.atSearchPage.fillInAddressSearchField(Addresses.EAST_35TH);
        user.atSearchPage.openFirstBuilding();
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
        user.atCreateReportPage.clickOnItineraryButton();
        user.atCreateReportPage.checkThirdListingIsNotShown();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.checkAppointmentDateFieldIsRed(); // TODO: no color diff attributes
        user.atCreateReportPage.checkNextButtonIsDisabled();
        user.atCreateReportPage.clickOnAppointmentDate();
        user.atCreateReportPage.clickOnNextYear();
        user.atCreateReportPage.checkYearIsSwitched();
        user.atCreateReportPage.clickOnPreviousMonth();
        user.atCreateReportPage.checkPreviousMonthIsShown();
        user.atCreateReportPage.clickOnNextMonth();
        user.atCreateReportPage.clickOnNextMonth();
        user.atCreateReportPage.checkNextMonthIsShown();
        user.atCreateReportPage.clickOnCloseButton();
        user.atCreateReportPage.checkAppointmentDateFieldIsEmpty();
        user.atCreateReportPage.clickOnAppointmentDate();
        user.atCreateReportPage.setDateForNextMonth("15");
        user.atCreateReportPage.checkSelectedDateIsShown();
        user.atCreateReportPage.checkNextButtonIsEnabled();
        user.atCreateReportPage.clickOnStartTimeField();
        user.atCreateReportPage.changeTime();
        user.atCreateReportPage.clickOnRevertIcon();
        user.atCreateReportPage.clickOnCloseButton();
        user.atCreateReportPage.clickOnStartTimeField();
        user.atCreateReportPage.changeTime();
        user.atCreateReportPage.clickOnSaveButton();
        user.atCreateReportPage.checkStartTimeFieldIsFilled();
        user.atCreateReportPage.clickOnEndTimeField();
        user.atCreateReportPage.changeTime();
        user.atCreateReportPage.changeTime();
        user.atCreateReportPage.clickOnSaveButton();
        user.atCreateReportPage.checkEndTimeFieldIsFilled();
        user.atCreateReportPage.fillInMeetingLocationField(DiscussionMessages.MEETING_LOCATION);
        user.atCreateReportPage.fillInPreparedForField(DiscussionMessages.DESCRIPTION);
        user.atCreateReportPage.deselectAllOptions();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.fillEmailField("valid-report-wizard1@email.com");
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.ITINERARY_REPORT);

        user.atCreateReportPage.clickOnPopUpOkButton();
        user.atCreateReportPage.clickOnBackButton();
        user.atCreateReportPage.selectAllOptions();
        user.atCreateReportPage.selectPerchwellLinkOption();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clearSubjectField();
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.ITINERARY_REPORT);
    }
}
