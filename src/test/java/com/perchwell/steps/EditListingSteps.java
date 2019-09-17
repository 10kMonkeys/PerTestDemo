package com.perchwell.steps;

import com.perchwell.pages.reportWizard.EditListingPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class EditListingSteps extends ScenarioSteps {

    EditListingPage onPage;

    @Step
    public void checkEditListingPageIsOpened() {
        onPage.checkEditListingPageIsOpened();
    }

    @Step
    public void clickOnAppointmentTimeField() {
        onPage.clickOnAppointmentTimeField();
    }

    @Step
    public void checkIncludeMapIsSelected() {
        onPage.checkIncludeMapIsSelected();
    }

    @Step
    public void checkDefaultTimeIsSetOnTenAm() {
        onPage.checkDefaultTimeIsSetOnTenAm();
    }

    @Step
    public void checkNotesMaxSymbolsLabelIsFortyHundred() {
        onPage.checkNotesMaxSymbolsLabelIsFortyHundred();
    }

    @Step
    public void changeTime() {
        onPage.changeTime();
    }

    @Step
    public void clickOnRevertIcon() {
        onPage.clickOnRevertIcon();
    }

    @Step
    public void clickOnCloseButton() {
        onPage.clickOnCloseButton();
    }

    @Step
    public void checkAppointmentTimeFieldIsEmpty() {
        onPage.checkAppointmentTimeFieldIsEmpty();
    }

    @Step
    public void checkTimeIsChange() {
        onPage.checkTimeIsChange();
    }

    @Step
    public void clickOnSaveButton() {
        onPage.clickOnSaveButton();
    }

    @Step
    public void checkSelectedTimeIsShown() {
        onPage.checkSelectedTimeIsShown();
    }

    @Step
    public void clickOnDoneButton() {
        onPage.clickOnDoneButton();
    }

    @Step
    public void selectNoMapOption() {
        onPage.selectNoMapOption();
    }

    @Step
    public void checkNoMapOptionIsSelected() {
        onPage.checkNoMapOptionIsSelected();
    }

    @Step
    public void checkNotesMaxSymbolsLabelIsChangedOnEightyHundred() {
        onPage.checkNotesMaxSymbolsLabelIsChangedOnEightyHundred();
    }

    @Step
    public void clickOnNotesField() {
        onPage.clickOnNotesField();
    }

    @Step
    public void fillInExpendedNotesField(int length) {
        onPage.fillInExpendedNotesField(length);
    }

    @Step
    public void clickOnDoneButtonOnNotesField() {
        onPage.clickOnDoneButtonOnNotesField();
    }

    @Step
    public void checkCharactersLabelIsRed() {
        onPage.checkCharactersLabelIsRed();
    }

    @Step
    public void checkDoneButtonIsDisabled() {
        onPage.checkDoneButtonIsDisabled();
    }

    @Step
    public void checkNotesLabelIsRed() {
        onPage.checkNotesLabelIsRed();
    }

    @Step
    public void removeOneSymbol() {
        onPage.removeOneSymbol();
    }

    @Step
    public void checkCharactersLabelIsGreen() {
        onPage.checkCharactersLabelIsGreen();
    }

    @Step
    public void checkDoneButtonIsEnabled() {
        onPage.checkDoneButtonIsEnabled();
    }

    @Step
    public void checkNotesLabelIsGreen() {
        onPage.checkNotesLabelIsGreen();
    }

    @Step
    public void selectIncludeMapOption() {
        onPage.selectIncludeMapOption();
    }

    @Step
    public void clearNotesField() {
        onPage.clearNotesField();
    }
}
