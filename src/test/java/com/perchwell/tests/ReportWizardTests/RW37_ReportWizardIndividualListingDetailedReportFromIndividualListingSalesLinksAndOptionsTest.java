package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.data.ReportTypes;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW37_ReportWizardIndividualListingDetailedReportFromIndividualListingSalesLinksAndOptionsTest extends SampleTest {

    @Test
    public void reportWizardIndividualListingDetailedReportFromIndividualListingSalesLinksAndOptionsTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("sothebys_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.clickShareButton();
        user.atOpenedBuildingPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnListingReportButton();
        user.atCreateReportPage.clickOnDetailedButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.deselectIncludeExactAddressOption();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.fillEmailField("valid-report-wizard1@email.com");
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.LONG_REPORT);
        user.atCreateReportPage.clickOnPopUpOkButton();
        user.atCreateReportPage.clickOnBackButton();
        user.atCreateReportPage.selectInternalInformationOption();
        user.atCreateReportPage.selectIncludeExactAddressOption();
        user.atCreateReportPage.selectPerchwellLinkOption();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clearSubjectField();
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.LONG_REPORT);
    }
}
