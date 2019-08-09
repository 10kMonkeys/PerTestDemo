package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.data.ReportTypes;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW38_ReportWizardIndividualListingGeneratingDetailedReportFromIndividualListingRentalsDescriptionAndCommentsTest extends SampleTest {
    @Test
    public void reportWizardIndividualListingGeneratingDetailedReportFromIndividualListingRentalsDescriptionAndCommentsTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("core_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectRentalsProperty();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.clickShareButton();
        user.atOpenedBuildingPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnListingReportButton();
        user.atCreateReportPage.clickOnListingReportButton();
        user.atCreateReportPage.clickOnDetailedButton();
        user.atCreateReportPage.checkNextButtonIsEnabled();
        user.atCreateReportPage.clickOnDescriptionField();
        user.atCreateReportPage.clearDescriptionField();
        user.atCreateReportPage.checkCharactersLabelMarkedRed(); //todo no color diff attributes
        user.atCreateReportPage.clickOnDoneButton();
        user.atCreateReportPage.checkDescriptionFieldMarkedRed(); //todo no color diff attributes
        user.atCreateReportPage.checkNextButtonIsDisabled();
        user.atCreateReportPage.clickOnDescriptionField();
        user.atCreateReportPage.fillInDescriptionFieldWithCountSymbols(2001); //todo no locators for field
        user.atCreateReportPage.checkCharactersLabelMarkedRed();
        user.atCreateReportPage.clickOnDoneButton();
        user.atCreateReportPage.checkNextButtonIsDisabled();
        user.atCreateReportPage.checkDescriptionFieldMarkedRed();
        user.atCreateReportPage.clickOnDescriptionField();
        user.atCreateReportPage.removeOneSymboldFromDescriptionField();
        user.atCreateReportPage.checkCharactersLabelMarkedGreen(); //todo no color diff attributes
        user.atCreateReportPage.clickOnDoneButton();
        user.atCreateReportPage.checkNextButtonIsEnabled();
        user.atCreateReportPage.checkDescriptionFieldMarkedGreen(); //todo no color diff attributes
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.fillEmailField("valid-report-wizard1@email.com");
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.LONG_REPORT);
        user.atCreateReportPage.clickOnPopUpOkButton();
        user.atCreateReportPage.clickOnBackButton();
        user.atCreateReportPage.clickOnBackButton();
        user.atCreateReportPage.clickOnCommentsField();
        user.atCreateReportPage.fillCommentsField(2001); //todo no locators for field
        user.atCreateReportPage.clickOnDoneButton();
        user.atCreateReportPage.checkNextButtonIsDisabled();
        user.atCreateReportPage.checkCommentsLabelIsGreen(); //todo no color diff attributes
        user.atCreateReportPage.clickOnCommentsField();
        user.atCreateReportPage.removeOneSymboldFromDescriptionField();
        user.atCreateReportPage.clickOnDoneButton();
        user.atCreateReportPage.checkNextButtonIsEnabled();
        user.atCreateReportPage.checkCommentsLabelIsGreen();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clearSubjectField();
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.LONG_REPORT);
    }
}
