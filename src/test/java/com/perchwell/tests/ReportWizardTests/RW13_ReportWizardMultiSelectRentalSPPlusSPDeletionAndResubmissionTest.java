package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.data.ReportTypes;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW13_ReportWizardMultiSelectRentalSPPlusSPDeletionAndResubmissionTest extends SampleTest {

    @Test
    public void rentalSPPlusSPDeletionAndResubmissionTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("core_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectRentalsProperty();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnCmaButton();
        user.atCreateReportPage.clickOnRentalsButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.checkLayoutIsLandscape();
        user.atCreateReportPage.checkCCMaintIsNotPresented();
        user.atCreateReportPage.checkRETaxedIsNotPresented();
        user.atCreateReportPage.checkTotalMonthliesIsNotPresented();
        user.atCreateReportPage.checkExternalPageOptionIsSelected();
        user.atCreateReportPage.selectPerchwellLinkOption();
        user.atCreateReportPage.checkExternalPageOptionUnselected();
        user.atCreateReportPage.checkPerchwellLinkOptionSelected();
        user.atCreateReportPage.swipeToPortrait();
        user.atCreateReportPage.switchToPortrait();// Temp. fix
        user.atCreateReportPage.checkCCMaintIsNotPresented();
        user.atCreateReportPage.checkRETaxedIsNotPresented();
        user.atCreateReportPage.checkTotalMonthliesIsNotPresented();
        user.atCreateReportPage.selectPriceChangeSuboption();//temp select
        user.atCreateReportPage.deselectBedsSuboption();
        user.atCreateReportPage.checkSuboptionCounterIsEquals("6/8");
        user.atCreateReportPage.selectBedsSuboption();
        user.atCreateReportPage.checkSuboptionCounterIsEquals("7/8");
        user.atCreateReportPage.selectContractDateSuboption();
        user.atCreateReportPage.selectRoomsSuboption();
        user.atCreateReportPage.checkUnselectedRoomsSuboptionIsVisible();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.fillEmailField("valid-report-wizard1@email.com");
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.clickOnPopUpExitButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.CMA_REPORT);
    }
}
