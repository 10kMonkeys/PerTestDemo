package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW2_EmailValidationTest extends SampleTest {

    @Test
    public void emailValidationTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnListingReportButton();
        user.atCreateReportPage.clickOnShortButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.fillEmailField("invalid@");
        user.atCreateReportPage.clickOnReturnButtonOnKeyboard();
        user.atCreateReportPage.checkEmailFieldValueIsShowAsText();
        user.atCreateReportPage.checkEmailReportButtonIsDisabled();
        user.atCreateReportPage.clearEmailField();
        user.atCreateReportPage.fillEmailField("invalid@x");
        user.atCreateReportPage.clickOnReturnButtonOnKeyboard();
        user.atCreateReportPage.checkEmailFieldValueIsShowAsText();
        user.atCreateReportPage.checkEmailReportButtonIsDisabled();
        user.atCreateReportPage.clearEmailField();
        user.atCreateReportPage.fillEmailField("invalid@x.x");
        user.atCreateReportPage.clickOnReturnButtonOnKeyboard();
        user.atCreateReportPage.checkEmailFieldValueIsShowAsText();
        user.atCreateReportPage.checkEmailReportButtonIsDisabled();
        user.atCreateReportPage.clearEmailField();
        user.atCreateReportPage.fillEmailField("invalid.xx");
        user.atCreateReportPage.clickOnReturnButtonOnKeyboard();
        user.atCreateReportPage.checkEmailFieldValueIsShowAsText();
        user.atCreateReportPage.checkEmailReportButtonIsDisabled();
        user.atCreateReportPage.clearEmailField();
        user.atCreateReportPage.fillEmailField("report-valid-wizard1@email.com");
        user.atCreateReportPage.clickOnReturnButtonOnKeyboard();
        user.atCreateReportPage.checkEmailFieldIsShownAsGreenPill();
        user.atCreateReportPage.checkEmailReportButtonIsEnabled();
    }
}
