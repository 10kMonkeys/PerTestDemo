package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.data.ReportTypes;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW27_ReportWizardIndividualListingOptionsTest extends SampleTest {

    @Test
    public void reportWizardIndividualListingOptionsTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("core_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.clickOnListShareButton();
        user.atOpenedBuildingPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnShowSheetButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.checkDomSupoptionSelected();
        user.atCreateReportPage.checkListDateSupoptionSelected();
        user.atCreateReportPage.checkSubwayInfoSupoptionSelected();
        user.atCreateReportPage.checkIncludeMapSupoptionSelected();
        user.atCreateReportPage.checkFloorplanSupoptionSelected();
        user.atCreateReportPage.checkIncludeExactAddressSupoptionSelected();
        user.atCreateReportPage.checkOpenHouseSupoptionSelected();
        user.atCreateReportPage.checkNeighborhoodSupoptionSelected();
        user.atCreateReportPage.checkListingAgentInfoSuboptionUnselected();
        user.atCreateReportPage.deselectAllOptions();
        user.atCreateReportPage.checkAllOptionsDeselected();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.fillEmailField("valid-report-wizard1@email.com");
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.SHOW_SHEET_REPORT);
        user.atCreateReportPage.clickOnPopUpOkButton();
        user.atCreateReportPage.clickOnBackButton();
        user.atCreateReportPage.selectAllOptions();
        user.atCreateReportPage.checkAllOptionsAreSelected();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clearSubjectField();
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.SHOW_SHEET_REPORT);
    }
}
