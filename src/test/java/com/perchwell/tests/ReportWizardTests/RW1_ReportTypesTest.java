package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;


public class RW1_ReportTypesTest extends SampleTest {

    @Test
    public void reportTypesTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("core_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnCreateReportButton();
        user.atCreateReportPage.checkAllOptionsAreShown();
        user.atCreateReportPage.clickOnListingReportButton();
        user.atCreateReportPage.shortOptionButtonIsShown();
        user.atCreateReportPage.defaultOptionButtonIsShown();
        user.atCreateReportPage.clickOnBackButton();
        user.atCreateReportPage.clickOnBackButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.clickShareButton();
        user.atOpenedBuildingPage.clickOnCreateReportButton();
        user.atCreateReportPage.checkAllOptionsAreShownAtListingPage();
        user.atCreateReportPage.clickOnBackButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atClientPage.logOut();
        user.atClientPage.clickOnYesButtonLogOutWindow();
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("sothebys_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnCreateReportButton();
        user.atCreateReportPage.checkAllOptionsAreShown();
        user.atCreateReportPage.clickOnListingReportButton();
        user.atCreateReportPage.checkAllOptionsAreShownAtSothebysListingReportPage();
        user.atCreateReportPage.clickOnBackButton();
        user.atCreateReportPage.clickOnBackButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickShareButton();
        user.atOpenedBuildingPage.clickOnCreateReportButton();
        user.atCreateReportPage.checkAllOptionsAreShownAtSothebysListingPage();
        user.atCreateReportPage.clickOnListingReportButton();
        user.atCreateReportPage.detailedOptionButtonIsShown();
        user.atCreateReportPage.clickOnBackButton();
        user.atCreateReportPage.clickOnBackButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atMyTagsPage.clickOnFirstTag();
        user.atMyTagsPage.clickOnSearchButton();
        user.atMyTagsPage.selectFirstListing();
        user.atMyTagsPage.clickOnMoreOptionsButton();
        user.atMyTagsPage.clickOnCreateReportButton();
        user.atCreateReportPage.checkAllOptionsAreShown();
        user.atCreateReportPage.clickOnListingReportButton();
        user.atCreateReportPage.checkAllOptionsAreShownAtSothebysListingReportPage();
    }
}
