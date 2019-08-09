package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.data.ReportTypes;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW25_ReportWizardIndividualListingNextButtonPlusReportWithMinimumInfoTest extends SampleTest {

    @Test
    public void reportWizardIndividualListingNextButtonPlusReportWithMinimumInfoTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("core_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openAddressSearch();
        user.atSearchPage.fillInAddressSearchField(Addresses.AVENUE_5800);
        user.atSearchPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnReportListing();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.clickShareButton();
        user.atOpenedBuildingPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnShowSheetButton();
        user.atCreateReportPage.clickOnShowSheetButton();
        user.atCreateReportPage.checkDescriptionFieldMarkedRed();
        user.atCreateReportPage.checkNextButtonIsDisabled(); //todo we have not enough description
        user.atCreateReportPage.checkFloorplanIsShown();
        user.atCreateReportPage.checkPhotosAreShown();
        user.atCreateReportPage.clickOnDescriptionField();
        user.atCreateReportPage.checkDescriptionFieldExpanded();
        user.atCreateReportPage.removeSymbolsToLeaveOnly1160();
        user.atCreateReportPage.checkCharactersLabelMarkedBlack();
        user.atCreateReportPage.clickOnDoneButton();
        user.atCreateReportPage.clickOnDescriptionField();
        user.atCreateReportPage.fillInDescriptionFieldWithCountSymbols(412); //todo no locators for field
        user.atCreateReportPage.clickOnDoneButton();
        user.atCreateReportPage.clickOnFloorplanEditIcon();
        user.atCreateReportPage.checkOnePerOneSelectedLabelIsShown();
        user.atCreateReportPage.checkOneIsShownOnFirstFloorplan();
        user.atCreateReportPage.clickOnSecondFloorplan();
        user.atCreateReportPage.checkSecondFloorplanNotSelected();
        user.atCreateReportPage.clickOnFirstFloorplan();
        user.atCreateReportPage.checkZeroPerOneSelectedLabelIsShown();
        user.atCreateReportPage.oneSelectedLabelRemovedFromFirstFloorplan();
        user.atCreateReportPage.clickOnShrinkButton();
        user.atCreateReportPage.checkFloorplanRemovedFromReportScreen();
        user.atCreateReportPage.checkNextButtonIsEnabled();
        user.atCreateReportPage.clickOnPhotosEditIcon();
        user.atCreateReportPage.checkFourPerFourSelectedLabelIsShown(); // todo there is only 3 photos
        user.atCreateReportPage.checkFirstPhotoSelected();
        user.atCreateReportPage.checkSecondPhotoSelected();
        user.atCreateReportPage.checkThirdPhotoSelected();
        user.atCreateReportPage.checkFourthPhotoSelected(); // todo there is only 3 photos
        user.atCreateReportPage.selectFithPhoto(); // todo there is only 3 photos
        user.atCreateReportPage.checkFifthPhotoIsNotSelected();
        user.atCreateReportPage.deselectAllPhotos();
        user.atCreateReportPage.zeroPerFourSelectedLabelIsShown();
        user.atCreateReportPage.clickOnShrinkButton();
        user.atCreateReportPage.checkPhotosRemovedFromReportScreen();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.fillEmailField("valid-report-wizard1@email.com");
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.EXTENDED_CMA_REPORT);
    }
}
