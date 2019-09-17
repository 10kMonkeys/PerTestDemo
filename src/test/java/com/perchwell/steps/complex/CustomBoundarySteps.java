package com.perchwell.steps.complex;

import com.perchwell.pages.perchwell.CustomBoundaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CustomBoundarySteps extends ScenarioSteps {

    private CustomBoundaryPage onPage;


    @Step
    public void zoomMapOneTime() {
        onPage.zoomMapOneTime();
    }


    @Step
    public void clickOnDefaultColorIcon() {
        onPage.clickOnDefaultColorIcon();
    }

    @Step
    public void selectRedColor() {
        onPage.selectRedColor();
    }

    @Step
    public void setCustomBoundaryName(String name) {
        onPage.setCustomBoundaryName(name);
    }

    @Step
    public void drawSquareFinishedPolygonManually() {
        onPage.drawSquareFinishedPolygonManually();
    }

    @Step
    public void justDrawnFinishedPolygonIsShown() {
        onPage.justDrawnFinishedPolygonIsShown();
    }

    @Step
    public void drawAndSaveLargeSquare() {
        onPage.drawSquareFinishedPolygonManually();
        onPage.getCustomBoundaryName();
        onPage.clickOnSaveButton();
        onPage.clickOnBackToSearchPageButton();
    }

    @Step
    public void clickOnRevertButton() {
        onPage.clickOnRevertButton();
    }

    @Step
    public void clickOnSaveButton() {
        onPage.clickOnSaveButton();
    }

    @Step
    public void clickOnFinishButton() {
        onPage.clickOnSaveButton();
    }

    @Step
    public void checkFinishButtonIsShown() {
        onPage.checkSaveButtonIsShown();
    }

    @Step
    public void getPolygonColor() {
        onPage.getPolygonColor();
    }

    @Step
    public void checkSaveButtonIsShown() {
        onPage.checkSaveButtonIsShown();
    }

    @Step
    public void checkPolygonIsDrawnWithSelectedColor() {
        onPage.checkPolygonIsDrawnWithSelectedColor();
    }

    @Step
    public void checkPolygonIsSavedWithProvidedName() {
        onPage.checkPolygonIsSavedWithProvidedName();
    }

    @Step
    public void getCustomBoundaryName() {
        onPage.getCustomBoundaryName();
    }
}
