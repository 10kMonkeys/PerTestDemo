package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW4_ReportWizardSuccessMessageTest extends SampleTest {

    @Test
    public void reportWizardSuccessMessageTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.getFirstListingAddress();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnListingReportButton();
        user.atCreateReportPage.clickDefaultButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.fillEmailField("report-valid-wizard1@email.com");
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailReportPopUpIsShown();
        user.atCreateReportPage.checkPopUpExitButtonIsShown();
        user.atCreateReportPage.checkPopUpOkButtonIsShown();
        user.atCreateReportPage.clickOnPopUpOkButton();
        user.atCreateReportPage.checkPopUpMessageIsClosed();
        user.atCreateReportPage.checkEmailFieldIsShownAsGreenPill();
        user.atCreateReportPage.checkSubjectFieldIsFilledOut();
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.clickOnPopUpExitButton();
        user.atPerchwellPage.checkFirstListingIsSelected();
        user.atPerchwellPage.checkOneListingIsSelected();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.clickShareButton();
        user.atOpenedBuildingPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnMediaReportButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.fillEmailField("report-valid-wizard1@email.com");
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailReportPopUpIsShown();
        user.atCreateReportPage.checkPopUpExitButtonIsShown();
        user.atCreateReportPage.checkPopUpOkButtonIsShown();
        user.atCreateReportPage.clickOnPopUpOkButton();
        user.atCreateReportPage.checkPopUpMessageIsClosed();
        user.atCreateReportPage.checkEmailFieldIsShownAsGreenPill();
        user.atCreateReportPage.checkSubjectFieldIsFilledOut();
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.clickOnPopUpExitButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnSearchButton();
        user.atMyTagsPage.selectFirstListing();
        user.atMyTagsPage.getFirstBuildingAddress();
        user.atMyTagsPage.clickOnMoreOptionsButton();
        user.atMyTagsPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnMediaReportButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.fillEmailField("report-valid-wizard1@email.com");
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailReportPopUpIsShown();
        user.atCreateReportPage.checkPopUpExitButtonIsShown();
        user.atCreateReportPage.checkPopUpOkButtonIsShown();
        user.atCreateReportPage.clickOnPopUpOkButton();
        user.atCreateReportPage.checkPopUpMessageIsClosed();
        user.atCreateReportPage.checkEmailFieldIsShownAsGreenPill();
        user.atCreateReportPage.checkSubjectFieldIsFilledOut();
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.clickOnPopUpExitButton();
        user.atMyTagsPage.checkFirstListingsIsSelected();
    }
}
