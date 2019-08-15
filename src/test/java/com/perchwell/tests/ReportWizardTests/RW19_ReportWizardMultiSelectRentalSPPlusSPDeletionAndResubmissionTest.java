package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.data.ReportTypes;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW19_ReportWizardMultiSelectRentalSPPlusSPDeletionAndResubmissionTest extends SampleTest {
    @Test
    public void ReportWizardMultiSelectRentalSPPlusSPDeletionAndResubmissionTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("core_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectRentalsProperty();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnExtendedCMAButton();
        user.atCreateReportPage.clickOnRentalsButton();
        user.atCreateReportPage.clickOnSubjectPropertyButton();
        user.atAddSubjectPropertyPage.checkCcMaintenanceFieldIsNotShown();
        user.atAddSubjectPropertyPage.checkReTaxesFiledIsNotShown();
        user.atAddSubjectPropertyPage.checkSaveButtonIsEnabled();
        user.atAddSubjectPropertyPage.fillInAddressField(Addresses.DAKOTA_15PLACE);
        user.atAddSubjectPropertyPage.fillInUnitField("#77");
        user.atAddSubjectPropertyPage.fillInPriceField("300000");
        user.atAddSubjectPropertyPage.fillInRoomsField("2.5");
        user.atAddSubjectPropertyPage.fillInBedsField("3");
        user.atAddSubjectPropertyPage.fillInBathsField("4.5");
        user.atAddSubjectPropertyPage.fillInSqrFootageField("3500"); //temp fix inside
        user.atAddSubjectPropertyPage.clickOnPropertyTypeField();
        user.atAddSubjectPropertyPage.clickOnCondo();
        user.atAddSubjectPropertyPage.selectOutdoorSpaceCrossFilter();
        user.atAddSubjectPropertyPage.selectDoormanBuildingCrossFilter();
        user.atAddSubjectPropertyPage.fillInBuildingSizeField("10x10");
        user.atAddSubjectPropertyPage.clickOnSaveButton();
        user.atCreateReportPage.checkAddressPlaceholderWithValue(); //TODO: need to implement locator
        user.atCreateReportPage.checkUnitPlaceholderWithValue(); //TODO: need to implement locator
        user.atCreateReportPage.checkPricePlaceholderWithValue(); //TODO: need to implement locator
        user.atCreateReportPage.checkPriceWithoutMO();
        user.atCreateReportPage.checkPropertyTypePlaceholderWithValue(); //TODO: need to implement locator
        user.atCreateReportPage.checkBedroomsPlaceholderWithValue(); //TODO: need to implement locator
        user.atCreateReportPage.checkBathroomsPlaceholderWithValue(); //TODO: need to implement locator
        user.atCreateReportPage.checkSqrFootagePlaceholderWithValue(); //TODO: need to implement locator
        user.atCreateReportPage.swipeLeftSubjectPropertyCell();
        user.atCreateReportPage.clickOnDeleteButton();
        user.atCreateReportPage.checkSubjectPropertyFieldIsNotShown();
        user.atCreateReportPage.checkSubjectPropertyPlusIconIsShown();
        user.atCreateReportPage.clickOnSubjectPropertyButton();
        user.atAddSubjectPropertyPage.checkAllFieldsAreEmpty();
        user.atAddSubjectPropertyPage.fillInAddressField(Addresses.DAKOTA_15PLACE);
        user.atAddSubjectPropertyPage.fillInUnitField("#77");
        user.atAddSubjectPropertyPage.fillInPriceField("300000");
        user.atAddSubjectPropertyPage.fillInRoomsField("2.5");
        user.atAddSubjectPropertyPage.fillInBedsField("3");
        user.atAddSubjectPropertyPage.fillInBathsField("4.5");
        user.atAddSubjectPropertyPage.fillInSqrFootageField("3500"); //temp fix inside
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
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.EXTENDED_CMA_REPORT);
    }
}
