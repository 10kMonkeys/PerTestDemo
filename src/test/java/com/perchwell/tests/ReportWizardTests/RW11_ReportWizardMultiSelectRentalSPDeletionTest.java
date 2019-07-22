package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW11_ReportWizardMultiSelectRentalSPDeletionTest extends SampleTest {

    @Test
    public void reportWizardMultiSelectRentalSPDeletionTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("core_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectRentalsProperty();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnCmaButton();
        user.atCreateReportPage.clickOnRentalsButton();
        user.atCreateReportPage.clickOnSubjectPropertyButton();
        user.atAddSubjectPropertyPage.checkCcMaintenanceFieldIsShown();
        user.atAddSubjectPropertyPage.checkReTaxesFiledIsNotShown();
        user.atAddSubjectPropertyPage.checkSaveButtonIsEnabled();
        user.atAddSubjectPropertyPage.fillInAddressField(Addresses.WEST_72ND);
        user.atAddSubjectPropertyPage.fillInUnitField("3");
        user.atAddSubjectPropertyPage.fillInPriceField("300000");
        user.atAddSubjectPropertyPage.fillInRoomsField("2.5");
        user.atAddSubjectPropertyPage.fillInBedsField("3.5");
        user.atAddSubjectPropertyPage.fillInBathsField("4.5");
        user.atAddSubjectPropertyPage.fillInSqrFootageField("3500");
        user.atAddSubjectPropertyPage.clickOnDateFiled();
        user.atAddSubjectPropertyPage.setDateForNextMonth("25");
        user.atAddSubjectPropertyPage.clickOnPropertyTypeField();
        user.atAddSubjectPropertyPage.clickOnCondo();
        user.atAddSubjectPropertyPage.selectOutdoorSpaceCrossFilter();
        user.atAddSubjectPropertyPage.selectDoormanBuildingCrossFilter();
        user.atAddSubjectPropertyPage.fillInBuildingSizeField("10x10");
        user.atAddSubjectPropertyPage.clickOnSaveButton();
        user.atCreateReportPage.checkSubjectPropertyCellIsShownWithValue();
        user.atCreateReportPage.swipeLeftSubjectPropertyCell();
        user.atCreateReportPage.clickOnDeleteButton();
        user.atCreateReportPage.checkSubjectPropertyFieldIsNotShown();
        user.atCreateReportPage.checkSubjectPropertyPlusIconIsShown();
        user.atCreateReportPage.clickOnSubjectPropertyButton();
        user.atAddSubjectPropertyPage.checkAllFieldsAreEmpty();
        user.atAddSubjectPropertyPage.fillInAddressField(Addresses.WEST_72ND);
        user.atAddSubjectPropertyPage.fillInUnitField("3");
        user.atAddSubjectPropertyPage.fillInPriceField("300000");
        user.atAddSubjectPropertyPage.fillInRoomsField("2.5");
        user.atAddSubjectPropertyPage.fillInBedsField("3.5");
        user.atAddSubjectPropertyPage.fillInBathsField("4.5");
        user.atAddSubjectPropertyPage.fillInSqrFootageField("3500");
        user.atAddSubjectPropertyPage.clickOnDateFiled();
        user.atAddSubjectPropertyPage.setDateForNextMonth("25");
        user.atAddSubjectPropertyPage.clickOnPropertyTypeField();
        user.atAddSubjectPropertyPage.clickOnCondo();
        user.atAddSubjectPropertyPage.selectOutdoorSpaceCrossFilter();
        user.atAddSubjectPropertyPage.selectDoormanBuildingCrossFilter();
        user.atAddSubjectPropertyPage.fillInBuildingSizeField("10x10");
        user.atAddSubjectPropertyPage.clickOnSaveButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.fillEmailField("valid-report-wizard1@email.com");
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport();
    }
}
