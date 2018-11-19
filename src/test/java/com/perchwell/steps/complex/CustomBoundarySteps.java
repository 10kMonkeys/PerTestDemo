package com.perchwell.steps.complex;

import com.perchwell.pages.perchwell.CustomBoundaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CustomBoundarySteps extends ScenarioSteps {

    private CustomBoundaryPage onPage;


    @Step
    public void getCenterPointOfMap() {
        onPage.getCenterPointOfMap();
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
}
