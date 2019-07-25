package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.data.ReportTypes;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW10_ReportWizardMultiSelectSaleSPTest extends SampleTest {

    @Test
    public void reportWizardMultiSelectSaleSPTest() {
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
        user.atCreateReportPage.clickOnSubjectPropertyButton();
        user.atAddSubjectPropertyPage.checkCcMaintenanceFieldIsShown();
        user.atAddSubjectPropertyPage.checkReTaxesFiledIsShown();
        user.atAddSubjectPropertyPage.checkSaveButtonIsEnabled();
        user.atAddSubjectPropertyPage.fillInCcMaintenanceField("5000");
        user.atAddSubjectPropertyPage.clickOnSaveButton();
        user.atCreateReportPage.checkSubjectPropertyCellIsShownWithPlaceholders(); //TODO: need to implement locators
        user.atCreateReportPage.clickOnSubjectPropertyCell();
        user.atAddSubjectPropertyPage.checkAddSubjectPropertyPageIsOpened();
        user.atAddSubjectPropertyPage.checkCcMaintenanceFieldIsFilledOut();
        user.atAddSubjectPropertyPage.fillInAddressField(Addresses.DAKOTA_15PLACE);
        user.atAddSubjectPropertyPage.fillInUnitField(Addresses.DAKOTA);
        user.atAddSubjectPropertyPage.fillInPriceField("300000");
        user.atAddSubjectPropertyPage.fillInRoomsField("2.5");
        user.atAddSubjectPropertyPage.fillInBedsField("3.5");
        user.atAddSubjectPropertyPage.fillInBathsField("4.5");
        user.atAddSubjectPropertyPage.fillInSqrFootageField("3500");
        user.atAddSubjectPropertyPage.fillInReTaxesField("3000");
        user.atAddSubjectPropertyPage.clickOnPropertyTypeField(); //TODO: need to implement locator
        user.atAddSubjectPropertyPage.clickOnCondo(); //TODO: need to implement locator
        user.atAddSubjectPropertyPage.selectOutdoorSpaceFilter();
        user.atAddSubjectPropertyPage.selectDoormanBuildingFilter();
        user.atAddSubjectPropertyPage.fillInBuildingSizeField("10x10");
        user.atAddSubjectPropertyPage.clickOnSaveButton();
        user.atCreateReportPage.checkSubjectPropertyCellIsShownWithValue(); //TODO: need to implement locators
        user.atCreateReportPage.clickOnSubjectPropertyCell();
        user.atAddSubjectPropertyPage.checkAllFieldsAreFilledOut();
        user.atAddSubjectPropertyPage.clearAddressField();
        user.atAddSubjectPropertyPage.clearUnitField();
        user.atAddSubjectPropertyPage.clearPriceField();
        user.atAddSubjectPropertyPage.clearBedroomsField();
        user.atAddSubjectPropertyPage.clearBathroomsField();
        user.atAddSubjectPropertyPage.clearSqrFootageField();
        user.atAddSubjectPropertyPage.clickOnSaveButton();
        user.atCreateReportPage.checkSubjectPropertyCellIsShownWithPlaceholders(); //TODO: need to implement locators
        user.atCreateReportPage.clickOnSubjectPropertyCell();
        user.atAddSubjectPropertyPage.fillInAddressField(Addresses.DAKOTA_15PLACE);
        user.atAddSubjectPropertyPage.fillInUnitField(Addresses.DAKOTA);
        user.atAddSubjectPropertyPage.fillInPriceField("300000");
        user.atAddSubjectPropertyPage.fillInBedsField("3.5");
        user.atAddSubjectPropertyPage.fillInBathsField("4.5");
        user.atAddSubjectPropertyPage.fillInSqrFootageField("3500");
        user.atAddSubjectPropertyPage.clickOnSaveButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.fillEmailField("valid-report-wizard1@email.com");
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.CMA_REPORT);
    }
}
