package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.data.ReportTypes;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW34_ReportWizardMultiSelectExportToExcelTest extends SampleTest {

    @Test
    public void reportWizardMultiSelectExportToExcelTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectRentalsProperty();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.deselectActiveFilter();
        user.atSearchPage.selectSoldOrRentFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.inSearchMenu.openAddressSearch();
        user.atSearchPage.fillInAddressSearchField(Addresses.EAST_35TH);
        user.atSearchPage.openFirstBuilding();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atSearchPage.closeAddressSearch();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atMyTagsPage.searchJustCreatedTag();
        user.atMyTagsPage.clickOnFirstTag();
        user.atMyTagsPage.clickOnSearchButton();
        user.atMyTagsPage.getListingsAddresses(3);
        user.atMyTagsPage.selectFirstListing();
        user.atMyTagsPage.clickOnSelectAll();
        user.atMyTagsPage.clickOnMoreOptionsButton();
        user.atMyTagsPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnExportToExcelButton();
        user.atCreateReportPage.checkFirstAndSecondListingsInListingsSection();
        user.atCreateReportPage.checkBuildingInBuildingsSection();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.checkAllOptionsAreSelected(31);
        user.atCreateReportPage.checkExternalPageOptionIsSelected();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.EXPORT_TO_EXCEL_REPORT);
        user.atCreateReportPage.clickOnPopUpOkButton();
        user.atCreateReportPage.clickOnBackButton();
        user.atCreateReportPage.selectPerchwellLinkOption();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clearSubjectField();
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.EXPORT_TO_EXCEL_REPORT);
    }
}
