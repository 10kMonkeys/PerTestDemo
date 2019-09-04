package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.data.ReportTypes;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW30_ReportWizardMultiSelectMediumReportSalesTest extends SampleTest {

    @Test
    public void reportWizardMultiSelectMediumReportSalesTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.selectSecondListingAfterFirst();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnListingReportButton();
        user.atCreateReportPage.clickDefaultButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.checkExternalPageOptionIsSelected();
        user.atCreateReportPage.checkIncludeExactAddressOptionIsSelected();
        user.atCreateReportPage.checkListingAgentInfoOptionIsUnselected();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.fillEmailField("valid-report-wizard1@email.com");
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.MEDIUM_DEFAULT_REPORT);
        user.atCreateReportPage.clickOnPopUpOkButton();
        user.atCreateReportPage.clickOnBackButton();
        user.atCreateReportPage.selectListingAgentInfoOption();
        user.atCreateReportPage.selectPerchwellLinkOption();
        user.atCreateReportPage.deselectIncludeExactAddressOption();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clearSubjectField();
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.MEDIUM_DEFAULT_REPORT);
    }

}
