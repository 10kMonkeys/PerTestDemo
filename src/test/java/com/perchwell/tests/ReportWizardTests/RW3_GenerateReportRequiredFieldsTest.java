package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW3_GenerateReportRequiredFieldsTest extends SampleTest {

    @Test
    public void generateReportRequiredFieldsTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("core_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnListingReportButton();
        user.atCreateReportPage.clickDefaultButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.checkEmailReportButtonIsDisabled();
        user.atCreateReportPage.fillEmailField("invalid@x.x");
        user.atCreateReportPage.clickOnReturnButtonOnKeyboard();
        user.atCreateReportPage.checkEmailReportButtonIsDisabled();
        user.atCreateReportPage.clearEmailField();
        user.atCreateReportPage.fillEmailField("report-valid-wizard1@email.com");
        user.atCreateReportPage.clickOnReturnButtonOnKeyboard();
        user.atCreateReportPage.checkEmailReportButtonIsDisabled();
        user.atCreateReportPage.removeValidEmail();
        user.atCreateReportPage.checkEmailReportButtonIsDisabled();
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.checkEmailReportButtonIsDisabled();
        user.atCreateReportPage.fillEmailField("report-valid-wizard1@email.com");
        user.atCreateReportPage.clickOnReturnButtonOnKeyboard();
        user.atCreateReportPage.checkEmailReportButtonIsEnabled();
        user.atCreateReportPage.fillInMessageFiled(DiscussionMessages.MESSAGE);
        user.atCreateReportPage.clickOnShrinkButton();
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailReportPopUpIsShown();
        user.atCreateReportPage.shouldFindSentReportBySubjectAndMessage();
    }
}
