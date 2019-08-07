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
        user.atCreateReportPage.checkDomSuboptionSelected();
        user.atCreateReportPage.checkListDateSuboptionSelected();
        user.atCreateReportPage.checkSubwayInfoSuboptionSelected();
        user.atCreateReportPage.checkIncludeMapSuboptionSelected();
        user.atCreateReportPage.checkFloorplanSuboptionSelected();
        user.atCreateReportPage.checkIncludeExactAddressOptionIsSelected();
        user.atCreateReportPage.checkOpenHouseSuboptionSelected();
        user.atCreateReportPage.checkNeighborhoodSuboptionSelected();
        user.atCreateReportPage.checkListingAgentInfoOptionIsUnselected();
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
        user.atCreateReportPage.checkAllOptionsAreSelected(9);
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clearSubjectField();
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.SHOW_SHEET_REPORT);
    }
}
