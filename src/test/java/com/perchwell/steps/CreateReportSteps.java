package com.perchwell.steps;

import com.perchwell.pages.perchwell.CreateReportPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CreateReportSteps extends ScenarioSteps {

    CreateReportPage onPage;

    @Step
    public void clickOnListingReportButton() {
        onPage.clickOnListingReportButton();
    }

    @Step
    public void checkAllOptionsAreShown() {
        onPage.cmaOptionButtonIsShown();
        onPage.extendedCmaOptionButtonIsShown();
        onPage.listingReportOptionButtonIsShown();
        onPage.showSheetOptionButtonIsShown();
        onPage.exportToExcelOptionButtonIsShown();
        onPage.itineraryOptionButtonIsShown();
        onPage.mediaReportOptionButtonIsShown();
    }

    @Step
    public void shortOptionButtonIsShown() {
        onPage.shortOptionButtonIsShown();
    }

    @Step
    public void defaultOptionButtonIsShown() {
        onPage.defaultOptionButtonIsShown();
    }

    @Step
    public void clickOnBackButton() {
        onPage.clickOnBackButton();
    }

    @Step
    public void checkAllOptionsAreShownAtListingPage() {
        onPage.cmaOptionButtonIsShown();
        onPage.extendedCmaOptionButtonIsShown();
        onPage.showSheetOptionButtonIsShown();
        onPage.mediaReportOptionButtonIsShown();
    }

    @Step
    public void checkAllOptionsAreShownAtSothebysListingReportPage() {
        onPage.shortOptionButtonIsShown();
        onPage.defaultIncludesBuildingButtonIsShown();
        onPage.detailedOptionButtonIsShown();
        onPage.mediumButtonIsShown();
    }

    @Step
    public void checkAllOptionsAreShownAtSothebysListingPage() {
        onPage.cmaOptionButtonIsShown();
        onPage.extendedCmaOptionButtonIsShown();
        onPage.listingReportOptionButtonIsShown();
        onPage.showSheetOptionButtonIsShown();
        onPage.mediaReportOptionButtonIsShown();
    }

    @Step
    public void detailedOptionButtonIsShown() {
        onPage.detailedOptionButtonIsShown();
    }
}
