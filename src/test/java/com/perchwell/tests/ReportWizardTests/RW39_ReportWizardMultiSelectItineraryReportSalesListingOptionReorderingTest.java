package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.data.ReportTypes;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW39_ReportWizardMultiSelectItineraryReportSalesListingOptionReorderingTest extends SampleTest {

    @Test
    public void reportWizardMultiSelectItineraryReportSalesListingOptionReorderingTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("core_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.getListingsAddresses(4);
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.selectSecondListingAfterFirst();
        user.atPerchwellPage.selectThirdAndFourthListingsByAddress();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnItineraryButton();
        user.atCreateReportPage.swipeLeftListingByAddress();
//        user.atCreateReportPage.clickOnDeleteButton(); #TODO delete fix later
        user.atCreateReportPage.checkFirstListingIsDeleted(); // will be fixed by jianghong
        user.atCreateReportPage.swipeLeftSecondListing();
        user.atCreateReportPage.clickOnEditButton();
        user.atEditListingPage.checkEditListingPageIsOpened();
        user.atEditListingPage.checkIncludeMapIsSelected();
        user.atEditListingPage.checkNotesMaxSymbolsLabelIsFortyHundred();
        user.atEditListingPage.clickOnAppointmentTimeField();
        user.atEditListingPage.checkDefaultTimeIsSetOnTenAm();
        user.atEditListingPage.changeTime();
        user.atEditListingPage.checkTimeIsChange();
        user.atEditListingPage.clickOnRevertIcon();
        user.atEditListingPage.checkDefaultTimeIsSetOnTenAm();
        user.atEditListingPage.clickOnCloseButton();
        user.atEditListingPage.checkAppointmentTimeFieldIsEmpty();
        user.atEditListingPage.clickOnAppointmentTimeField();
        user.atEditListingPage.changeTime();
        user.atEditListingPage.clickOnSaveButton();
        user.atEditListingPage.checkSelectedTimeIsShown();
        user.atEditListingPage.clickOnDoneButton();
        user.atCreateReportPage.checkAppointmentTimeIsShownForListing();
        user.atCreateReportPage.swipeLeftThirdListing();
        user.atCreateReportPage.clickOnEditButton();
        user.atEditListingPage.selectNoMapOption();
        user.atEditListingPage.checkNoMapOptionIsSelected();
        user.atEditListingPage.checkNotesMaxSymbolsLabelIsChangedOnEightyHundred();
        user.atEditListingPage.clickOnNotesField();
        user.atEditListingPage.fillInExpendedNotesField(801);
        user.atEditListingPage.checkCharactersLabelIsRed(); // TODO: no color diff attributes
        user.atEditListingPage.clickOnDoneButtonOnNotesField();
        user.atEditListingPage.checkDoneButtonIsDisabled();
        user.atEditListingPage.checkNotesLabelIsRed(); // TODO: no color diff attributes
        user.atEditListingPage.clickOnNotesField();
        user.atEditListingPage.removeOneSymbol();
        user.atEditListingPage.checkCharactersLabelIsGreen(); // TODO: no color diff attributes
        user.atEditListingPage.clickOnDoneButtonOnNotesField();
        user.atEditListingPage.checkDoneButtonIsEnabled();
        user.atEditListingPage.checkNotesLabelIsGreen(); // TODO: no color diff attributes
        user.atEditListingPage.selectIncludeMapOption();
        user.atEditListingPage.checkDoneButtonIsDisabled();
        user.atEditListingPage.checkNotesLabelIsRed(); // TODO: no color diff attributes
        user.atEditListingPage.clickOnNotesField();
        user.atEditListingPage.checkCharactersLabelIsRed(); // TODO: no color diff attributes
        user.atEditListingPage.clearNotesField();
        user.atEditListingPage.fillInExpendedNotesField(400);
        user.atEditListingPage.checkCharactersLabelIsGreen(); // TODO: no color diff attributes
        user.atEditListingPage.clickOnDoneButtonOnNotesField();
        user.atEditListingPage.checkDoneButtonIsEnabled();
        user.atEditListingPage.checkNotesLabelIsGreen(); // TODO: no color diff attributes
        user.atEditListingPage.clickOnDoneButton();
        user.atCreateReportPage.swipeLeftFourthListing();
        user.atCreateReportPage.clickOnEditButton();
        user.atEditListingPage.selectNoMapOption();
        user.atEditListingPage.clickOnNotesField();
        user.atEditListingPage.fillInExpendedNotesField(800);
        user.atEditListingPage.clickOnDoneButtonOnNotesField();
        user.atEditListingPage.clickOnDoneButton();
        user.atCreateReportPage.moveFirstListingToThirdListingByDragging();
        user.atCreateReportPage.getListingsAndBuildingsOrder();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clickOnAppointmentDate();
        user.atCreateReportPage.setDateForNextMonth("21");
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.fillEmailField("valid-report-wizard1@email.com");
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.ITINERARY_REPORT);
        user.atCreateReportPage.checkListingsOrderIsSavedInEmailAndOnlyThreeListingsAreShown();
    }
}
