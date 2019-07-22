package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW12_ReportWizardMultiSelectSaleCustomOptionsTest extends SampleTest {

    @Test
    public void reportWizardMultiSelectSaleCustomOptionsTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("core_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnCmaButton();
        user.atCreateReportPage.clickOnSalesButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.checkLayoutIsLandscape();
        user.atCreateReportPage.checkSelectedFieldsAmount(12);
        user.atCreateReportPage.checkCCMaintIsPresented();
        user.atCreateReportPage.checkRETaxedIsPresented();
        user.atCreateReportPage.checkTotalMonthliesIsPresented();
        user.atCreateReportPage.checkExternalPageOptionIsSelected();
//        #TODO Field check
        user.atCreateReportPage.switchToPortrait();
        user.atCreateReportPage.checkSelectedFieldsAmount(9);
        user.atCreateReportPage.checkUnselectedCCMaintIsPresented();
        user.atCreateReportPage.checkUnselectedRETaxedIsPresented();
        user.atCreateReportPage.checkTotalMonthliesIsPresented();
        user.atCreateReportPage.switchToLandscape();
        user.atCreateReportPage.selectedOriginalPriceSuboptionClick();
        user.atCreateReportPage.checkElevenFieldsCounterIsPresented();
        user.atCreateReportPage.unselectedOriginalPriceSuboptionClick();
        user.atCreateReportPage.checkTwelveFieldsCounterIsPresented();
        user.atCreateReportPage.unselectedContractDateSuboptionClick();
        user.atCreateReportPage.checkUnselectedContractDateSuboptionIsPresent();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.fillEmailField("valid-report-wizard1@email.com");
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.clickOnPopUpExitButton();
        user.atCreateReportPage.checkEmailContainsPDFReport();
    }
}
