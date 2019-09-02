package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.data.ReportTypes;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW42_ReportWizardIndividualListingMediaReportFromIndividualListingPhotosAndFloorPlansSelectionAndReorderOptionsTest extends SampleTest {

    @Test
    public void qreportWizardIndividualListingMediaReportFromIndividualListingPhotosAndFloorPlansSelectionAndReorderOptionsTest() {
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
        user.atCreateReportPage.clickOnMediaReportButton();
        user.atCreateReportPage.clickOnPhotosEditIcon();
        user.atCreateReportPage.getAmountSelectedPhotos();
        user.atCreateReportPage.deselectFirthPhoto();
        user.atCreateReportPage.checkNumberInCircleIsNotShown(); //TODO: need to add id for element iOS
        user.atCreateReportPage.checkGreenFrameIsRemoved(5); //TODO: need to add id for element
        user.atCreateReportPage.checkPhotosCountIsChanged(-1);
        user.atCreateReportPage.moveFirstPhotoToSecondPhotoByDragging();
        user.atCreateReportPage.checkPhotoIsMovedToThePosition(1, 2); //TODO: need to add id for element
        user.atCreateReportPage.clickOnShrinkButton();
        user.atCreateReportPage.checkPhotosAreShownInUpdatedOrder(2, 1,3,4); //TODO: need to add id for element
        user.atCreateReportPage.clickOnFloorplanEditIcon();
        user.atCreateReportPage.getAmountSelectedPhotos();
        user.atCreateReportPage.deselectThirdPhoto();
        user.atCreateReportPage.checkNumberInCircleIsNotShown(); //TODO: need to add id for element
        user.atCreateReportPage.checkGreenFrameIsRemoved(3); //TODO: need to add id for element
        user.atCreateReportPage.checkPhotosCountIsChanged(-1);
        user.atCreateReportPage.moveFirstPhotoToSecondPhotoByDragging();
        user.atCreateReportPage.checkPhotoIsMovedToThePosition(2,1); //TODO: need to add id for element
        user.atCreateReportPage.clickOnShrinkButton();
        user.atCreateReportPage.checkFloorplanAreShownInUpdatedOrder(2,1); //TODO: need to add id for element
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.deselectAllOptions();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.fillEmailField("valid-report-wizard1@email.com");
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.MEDIA_REPORT);
        user.atCreateReportPage.clickOnPopUpOkButton();
        user.atCreateReportPage.clickOnBackButton();
        user.atCreateReportPage.selectListingAgentInfoOption();
        user.atCreateReportPage.selectIncludeExactAddressOption();
        user.atCreateReportPage.selectOpenHouseOption();
        user.atCreateReportPage.selectNeighborhoodOption();
        user.atCreateReportPage.selectIncludeCrossStreetsOption();
        user.atCreateReportPage.selectPerchwellLinkOption();
        user.atCreateReportPage.selectPhotosSuboption();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clearSubjectField();
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.MEDIA_REPORT);
        user.atCreateReportPage.clickOnPopUpOkButton();
        user.atCreateReportPage.clickOnBackButton();
        user.atCreateReportPage.switchToFloorplanSuboption();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clearSubjectField();
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.MEDIA_REPORT);
    }
}
