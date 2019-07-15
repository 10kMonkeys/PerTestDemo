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

    @Step
    public void clickDefaultButton() {
        onPage.clickOnDefaultButton();
    }

    @Step
    public void clickNextButton() {
        onPage.clickOnNextButton();
    }

    @Step
    public void fillEmailField(String email) {
        onPage.fillEmailField(email);
    }

    @Step
    public void checkEmailReportButtonIsDisabled() {
        onPage.checkEmailReportButtonIsDisabled();
    }

    @Step
    public void fillSubjectField(String message) {
        onPage.fillSubjectField(message);
    }

    @Step
    public void checkEmailReportButtonIsEnabled() {
        onPage.checkEmailReportButtonIsEnabled();
    }

    @Step
    public void clickOnReturnButtonOnKeyboard() {
        onPage.clickOnReturnButtonOnKeyboard();
    }

    @Step
    public void clearEmailField() {
        onPage.clearEmailField();
    }

    @Step
    public void checkEmailFieldValueIsShowAsText(){
        onPage.checkEmailFieldValueIsShownAsText();
    }

    @Step
    public void checkEmailFieldIsShownAsGreenPill() {
        onPage.checkEmailFieldIsShownAsGreenPill();
    }

    @Step
    public void clickOnEmailReportButton() {
        onPage.clickOnEmailReportButton();
    }

    @Step
    public void checkPopUpExitButtonIsShown() {
        onPage.checkPopUpExitButtonIsShown();
    }

    @Step
    public void checkPopUpOkButtonIsShown() {
        onPage.checkPopUpOkButtonIsShown();
    }

    @Step
    public void clickOnPopUpOkButton() {
        onPage.clickOnPopUpOkButton();
    }

    @Step
    public void checkPopUpMessageIsClosed() {
        onPage.checkPopUpMessageIsClosed();
    }

    @Step
    public void checkSubjectFieldIsFilledOut() {
        onPage.checkSubjectFieldIsFilledOut();
    }

    @Step
    public void clickOnPopUpExitButton() {
        onPage.clickOnPopUpExitButton();
    }

    @Step
    public void clickOnMediaReportButton() {
        onPage.clickOnMediaReportButton();
    }

    @Step
    public void fillInMessageFiled(String message) {
        onPage.fillInMessageField(message);
    }

    @Step
    public void clickOnShrinkButton() {
        onPage.clickOnShrinkButton();
    }

    @Step
    public void removeValidEmail() {
        onPage.removeValidEmail();
    }

    @Step
    public void checkEmailReportPopUpIsShown() {
        onPage.checkEmailReportPopUpIsShown();
    }

    @Step
    public void shouldFindSentReportBySubjectAndMessage() {
        onPage.shouldFindSentReportBySubjectAndMessage();
    }
}
