package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class NFT20_CustomBoundaryDrawingAndCreatingTest extends SampleTest {

    @Test
    public void customBoundaryDrawingAndCreatingTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.openCustomBoundariesPage();
        user.atCustomBoundaryPage.getPolygonColor();
        user.atCustomBoundaryPage.drawSquareFinishedPolygonManually();
        user.atCustomBoundaryPage.checkPolygonIsDrawnWithSelectedColor();
        user.atCustomBoundaryPage.checkSaveButtonIsShown();
        user.atCustomBoundaryPage.clickOnRevertButton();
        user.atCustomBoundaryPage.checkFinishButtonIsShown();
        user.atCustomBoundaryPage.clickOnFinishButton();
        user.atCustomBoundaryPage.checkPolygonIsDrawnWithSelectedColor();
        user.atCustomBoundaryPage.getCustomBoundaryName();
        user.atCustomBoundaryPage.clickOnSaveButton();
        user.atCustomBoundaryPage.checkPolygonIsSavedWithProvidedName();
        user.atCustomBoundaryPage.checkPolygonIsDrawnWithSelectedColor();
    }
}
