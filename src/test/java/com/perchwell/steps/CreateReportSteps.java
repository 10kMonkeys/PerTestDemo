package com.perchwell.steps;

import com.perchwell.email.MailTrap;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.reportWizard.CreateReportPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

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
        MailTrap.shouldFindSentReportBySubjectAndMessage();
    }

    @Step
    public void clickOnShortButton() {
        onPage.clickOnShortButton();
    }

    @Step
    public void checkListingType(String property) {
        onPage.checkListingType(property);
    }

    @Step
    public void checkStudioIsDisplayed() {
        onPage.checkStudioIsDisplayed();
    }

    @Step
    public void checkSquareFeetValueWithoutApproxLabel() {
        onPage.checkSquareFeetValueWithoutApproxLabel();
    }

    @Step
    public void checkPriceWithoutMO() {
        onPage.checkPriceWithoutMO();
    }

    @Step
    public void checkOneAndHalfBathroomIsShown() {
        onPage.checkOneAndHalfBathroomIsShown();
    }

    @Step
    public void checkOnlySquareFeetWithApproxLabel() {
        onPage.checkOnlySquareFeetWithApproxLabel();
    }

    @Step
    public void checkPriceWithMO() {
        onPage.checkPriceWithMO();
    }

    @Step
    public void checkOpenHouseInfoIsShown() {
        onPage.checkOpenHouseInfoIsShown();
    }

    @Step
    public void swipeLeftListingByAddress() {
        onPage.swipeLeftByAddress(SessionVariables.getValueFromSessionVariable("listingAddress1"));
    }

    @Step
    public void clickOnDeleteButton() {
        onPage.clickOnDeleteButton();
    }

    @Step
    public void moveFirstListingToThirdListingByDragging() {
        onPage.moveFirstListingToThirdListingByDragging();
    }

    @Step
    public void swipeLeftBuildingByAddress() {
        onPage.swipeLeftByAddress(SessionVariables.getValueFromSessionVariable("buildingAddress1"));
    }

    @Step
    public void checkFirstListingIsDeleted() {
        onPage.checkFirstListingIsDeleted();
    }

    @Step
    public void checkFirstBuildingIsDeleted() {
        onPage.checkFirstBuildingIsDeleted();
    }

    @Step
    public void checkListingsOrderIsSavedInEmailAndNotDeletedListings() {
        MailTrap.checkListingsOrderIsSavedInEmailAndNotDeletedListings();
    }

    @Step
    public void moveFirstBuildingToSecondBuildingByDragging() {
        onPage.moveFirstBuildingToSecondBuildingByDragging();
    }

    @Step
    public void getListingsAndBuildingsOrder() {
        onPage.getListingsAndBuildingsOrder();
    }

    @Step
    public void clickOnCmaButton() {
        onPage.clickOnCmaButton();
    }

    @Step
    public void clickOnSalesButton() {
        onPage.clickOnSalesButton();
    }

    @Step
    public void checkEmailContainsPDFReport() {
        Assert.assertTrue(MailTrap.shouldFindAttachmentWithReport());
    }

    @Step
    public void clickOnSubjectPropertyButton() {
        onPage.clickOnSubjectPropertyButton();
    }

    @Step
    public void checkSubjectPropertyCellIsShownWithPlaceholders() {
        onPage.checkAddressPlaceholderIsShown();
        onPage.checkUnitPlaceholderIsShown();
        onPage.checkPricePlaceholderIsShown();
        onPage.checkPropertyTypePlaceholderIsShown();
        onPage.checkBedroomsPlaceholderIsShown();
        onPage.checkBathroomsPlaceholderIsShown();
        onPage.checkSqrFootagePlaceholderIsShown();
    }

    @Step
    public void clickOnSubjectPropertyCell() {
        onPage.clickOnSubjectPropertyCell();
    }

    @Step
    public void checkSubjectPropertyCellIsShownWithValue() {
        onPage.checkAddressPlaceholderWithValue();
        onPage.checkUnitPlaceholderWithValue();
        onPage.checkPricePlaceholderWithValue();
        onPage.checkPropertyTypePlaceholderWithValue();
        onPage.checkBedroomsPlaceholderWithValue();
        onPage.checkBathroomsPlaceholderWithValue();
        onPage.checkSqrFootagePlaceholderWithValue();
    }

    @Step
    public void clickOnRentalsButton() {
        onPage.clickOnRentalsButton();
    }

    @Step
    public void swipeLeftSubjectPropertyCell() {
        onPage.swipeLeftSubjectPropertyCell();
    }

    @Step
    public void checkSubjectPropertyPlusIconIsShown() {
        onPage.checkSubjectPropertyPlusIconIsShown();
    }

    @Step
    public void checkSubjectPropertyFieldIsNotShown() {
        onPage.checkSubjectPropertyFieldIsNotShown();
    }

    @Step
    public void checkLayoutIsLandscape() {
        onPage.checkLayoutIsLandscape();
    }

    @Step
    public void checkSelectedFieldsAmount(int amount) {
        onPage.checkSelectedFieldsAmount(amount);
    }

    @Step
    public void checkCCMaintIsPresented() {
        onPage.checkSelectedCCMaintIsPresented();
    }

    @Step
    public void checkRETaxedIsPresented() {
        onPage.checkSelectedRETaxedIsPresented();
    }

    @Step
    public void checkTotalMonthliesIsPresented() {
        onPage.checkTotalMonthliesIsPresented();
    }

    @Step
    public void checkExternalPageOptionIsSelected() {
        onPage.checkExternalPageOptionIsSelected();
    }

    @Step
    public void switchToPortrait() {
        onPage.switchToPortrait();
    }

    @Step
    public void switchToLandscape() {
        onPage.switchToLandscape();
    }

    @Step
    public void selectedOriginalPriceSuboptionClick() {
        onPage.selectedOriginalPriceSuboptionClick();
    }

    @Step
    public void unselectedOriginalPriceSuboptionClick() {
        onPage.unselectedOriginalPriceSuboptionClick();
    }

    @Step
    public void checkElevenFieldsCounterIsPresented() {
        onPage.checkElevenFieldsCounterIsPresented();
    }

    @Step
    public void checkTwelveFieldsCounterIsPresented() {
        onPage.checkTwelveFieldsCounterIsPresented();
    }

    @Step
    public void unselectedContractDateSuboptionClick() {
        onPage.unselectedContractDateSuboptionClick();
    }

    @Step
    public void checkUnselectedContractDateSuboptionIsPresent() {
        onPage.checkUnselectedContractDateSuboptionIsPresent();
    }

    @Step
    public void checkUnselectedCCMaintIsPresented() {
        onPage.checkUnselectedCCMaintIsPresented();
    }

    @Step
    public void checkUnselectedRETaxedIsPresented() {
        onPage.checkUnselectedRETaxedIsPresented();
    }
}