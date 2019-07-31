package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.data.ReportTypes;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW26_ReportWizardIndividualListingMaxInfoPhotosReorderTest extends SampleTest {

    @Test
    public void reportWizardIndividualListingMaxInfoPhotosReorderTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("core_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openAddressSearch();
        user.atSearchPage.fillInAddressSearchField(Addresses.AVENUE_5800);
        user.atSearchPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnReportListing();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.clickShareButton();
        user.atOpenedBuildingPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnShowSheetsButton();
        user.atCreateReportPage.clearDescriptionField();
        user.atCreateReportPage.fillInDescriptionField(DiscussionMessages.DESCRIPTION);
        user.atCreateReportPage.clickOnShrinkButton();
        user.atCreateReportPage.clickOnAppointmentDate();
        user.atCreateReportPage.checkTodayMonthAndYearCalendarAreShown();
        user.atCreateReportPage.checkTodayDateIsSelected(); //TODO: need to implement, cause selected date doesn't differ from non-selected date
        user.atCreateReportPage.setDateForNextMonth("21");
        user.atCreateReportPage.checkCalendarIsClosed();
        user.atCreateReportPage.clickOnBackButton(); //temp fix
        user.atCreateReportPage.clickOnShowSheetsButton(); //temp fix
        user.atCreateReportPage.checkSelectedDateIsShown();
        user.atCreateReportPage.clickOnAppointmentTime();
        user.atCreateReportPage.checkTimeSelectorIsShown();
        user.atCreateReportPage.changeTime();
        user.atCreateReportPage.clickOnRevertIcon();
        user.atCreateReportPage.checkTimeIsReset();
        user.atCreateReportPage.changeTime();
        user.atCreateReportPage.clickOnSaveButton();
        user.atCreateReportPage.clickOnBackButton(); //temp fix
        user.atCreateReportPage.clickOnShowSheetsButton(); //temp fix
        user.atCreateReportPage.checkSelectedTimeIsShown();
        user.atCreateReportPage.clickOnFloorplanEditIcon();
        //TODO: need to implement selecting and deselecting floorplan
        user.atCreateReportPage.clickOnShrinkButton();
        user.atCreateReportPage.clickOnPhotosEditIcon();
        //TODO: need to implement reordering photos
        user.atCreateReportPage.clickOnShrinkButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.fillEmailField("valid-report-wizard1@email.com");
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.clickOnPopUpOkButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.SHOW_SHEET_REPORT);
    }
}
