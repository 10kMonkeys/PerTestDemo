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
    public void checkEmailContainsPDFReport(String reportType) {
        Assert.assertTrue(MailTrap.shouldFindAttachmentWithReport(reportType));
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
    public void checkCCMaintIsVisible() {
        onPage.checkCCMaintIsVisible();
    }

    @Step
    public void checkRETaxedIsVisible() {
        onPage.checkRETaxedIsVisible();
    }

    @Step
    public void checkTotalMonthliesIsVisible() {
        onPage.checkTotalMonthliesIsVisible();
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
    public void deselectOriginalPriceSuboption() {
        onPage.deselectOriginalPriceSuboption();
    }

    @Step
    public void selectPriceChangeSuboption() {
        onPage.selectPriceChangeSuboption();
    }

    @Step
    public void checkElevenFieldsCounterIsVisible() {
        onPage.checkElevenFieldsCounterIsVisible();
    }

    @Step
    public void checkTwelveFieldsCounterIsVisible() {
        onPage.checkTwelveFieldsCounterIsVisible();
    }

    @Step
    public void selectContractDateSuboption() {
        onPage.selectContractDateSuboption();
    }

    @Step
    public void checkUnselectedContractDateSuboptionIsVisible() {
        onPage.checkUnselectedContractDateSuboptionIsVisible();
    }

    @Step
    public void checkUnselectedCCMaintIsVisible() {
        onPage.checkUnselectedCCMaintIsVisible();
    }

    @Step
    public void checkUnselectedRETaxedIsVisible() {
        onPage.checkUnselectedRETaxedIsVisible();
    }

    @Step
    public void swipeToPortrait() {
        onPage.swipeToPortrait();
    }

    @Step
    public void checkDeleteButtonIsNotDisplayed() {
        onPage.checkDeleteButtonIsNotDisplayed();
    }

    @Step
    public void clickOnTagsField() {
        onPage.clickOnTagsField();
    }

    @Step
    public void checkFirstListingInActiveSection() {
        onPage.checkFirstListingInActiveSection();
    }

    @Step
    public void checkSecondListingInContractSection() {
        onPage.checkSecondListingInContractSection();
    }

    @Step
    public void checkThirdAndFourthListingsInOffMarketSection() {
        onPage.checkThirdAndFourthListingsInOffMarketSection(SessionVariables.getValueFromSessionVariable("reportWizardAddress3"),
                SessionVariables.getValueFromSessionVariable("reportWizardAddress4"));
    }

    @Step
    public void checkFifthListingInSoldSection() {
        onPage.checkFifthListingInSoldSection();
    }

    @Step
    public void checkCCMaintIsNotPresented() {
        onPage.checkCCMaintIsNotPresented();
    }

    @Step
    public void checkRETaxedIsNotPresented() {
        onPage.checkRETaxedIsNotPresented();
    }

    @Step
    public void checkTotalMonthliesIsNotPresented() {
        onPage.checkTotalMonthliesIsNotPresented();
    }

    @Step
    public void selectPerchwellLinkOption() {
        onPage.selectPerchwellLinkOption();
    }

    @Step
    public void checkExternalPageOptionUnselected() {
        onPage.checkExternalPageOptionUnselected();
    }

    @Step
    public void checkPerchwellLinkOptionSelected() {
        onPage.checkPerchwellLinkOptionSelected();
    }

    @Step
    public void deselectBedsSuboption() {
        onPage.deselectBedsSuboption();
    }

    @Step
    public void selectBedsSuboption() {
        onPage.selectBedsSuboption();
    }

    @Step
    public void selectRoomsSuboption() {
        onPage.selectRoomsSuboption();
    }

    @Step
    public void checkUnselectedRoomsSuboptionIsVisible() {
        onPage.checkUnselectedRoomsSuboptionIsVisible();
    }

    @Step
    public void checkNineFieldsCounterIsVisible() {
        onPage.checkNineFieldsCounterIsVisible();
    }

    @Step
    public void checkEightFieldsCounterIsVisible() {
        onPage.checkEightFieldsCounterIsVisible();
    }

    @Step
    public void checkBathroomsIsHidden() {
        onPage.checkBathroomsIsHidden();
    }

    @Step
    public void checkEighthListingInActiveSection() {
        onPage.checkEighthListingInActiveSection();
    }

    @Step
    public void checkNinthListingInRentedSection() {
        onPage.checkNinthListingInRentedSection();
    }

    @Step
    public void checkAddressPlaceholderWithValue() {
        onPage.checkAddressPlaceholderWithValue();
    }

    @Step
    public void checkUnitPlaceholderWithValue() {
        onPage.checkUnitPlaceholderWithValue();
    }

    @Step
    public void checkPricePlaceholderWithValue() {
        onPage.checkPricePlaceholderWithValue();
    }

    @Step
    public void checkPropertyTypePlaceholderWithValue() {
        onPage.checkPropertyTypePlaceholderWithValue();
    }

    @Step
    public void checkBedroomsPlaceholderWithValue() {
        onPage.checkBedroomsPlaceholderWithValue();
    }

    @Step
    public void checkBathroomsPlaceholderWithValue() {
        onPage.checkBathroomsPlaceholderWithValue();
    }

    @Step
    public void checkSqrFootagePlaceholderWithValue() {
        onPage.checkSqrFootagePlaceholderWithValue();
    }

    @Step
    public void checkSixPerEightListingIsNotShown() {
        onPage.checkSixPerEightListingIsNotShown();
    }

    @Step
    public void checkBuildingIsNotShown() {
        onPage.checkBuildingIsNotShown();
    }

    @Step
    public void checkEightAndNineListingsIsShown() {
        onPage.checkEightAndNineListingsIsShown();
    }

    @Step
    public void checkRentalSectionIsShown() {
        onPage.checkRentalSectionIsShown();
    }

    @Step
    public void checkFirstListingIsShown() {
        onPage.checkFirstListingIsShown();
    }

    @Step
    public void deleteReportWizardTag() {
        onPage.deleteReportWizardTag();
    }

    @Step
    public void checkFirstAddressInActiveSectionAfterFirstListing() {
        onPage.checkFirstAddressInActiveSectionAfterFirstListing(SessionVariables.getValueFromSessionVariable("reportWizardAddress1"));
    }

    @Step
    public void checkListingsAmount(int amount) {
        onPage.checkListingsAmount(amount);
    }

    @Step
    public void checkUnitForListing() {
        onPage.checkUnitForListing();
    }

    @Step
    public void openSecondListing() {
        onPage.openSecondListing();
    }

    @Step
    public void clickOnExtendedCMAButton() {
        onPage.clickOnExtendedCMAButton();
    }

    @Step
    public void checkFirstListingIsShownOnce() {
        onPage.checkFirstListingIsShownOnce();
    }

    @Step
    public void checkRentalListingIsShownOnce() {
        onPage.checkRentalListingIsShownOnce();
    }

    @Step
    public void fillInReportLabelField(int length) {
        onPage.fillInReportLabelField(length);
    }

    @Step
    public void checkOnlySeventySymbolsAllowed() {
        onPage.checkOnlySeventySymbolsAllowed();
    }

    @Step
    public void checkFirstAndSecondListingsInListingsSection() {
        onPage.checkFirstAndSecondListingsInListingsSection(SessionVariables.getValueFromSessionVariable("reportWizardAddress1"),
                SessionVariables.getValueFromSessionVariable("reportWizardAddress2"));
    }

    @Step
    public void checkThirdListingIsNotShown() {
        onPage.checkThirdListingIsNotShown();
    }

    @Step
    public void checkIncludeExactAddressOptionIsSelected() {
        onPage.checkIncludeExactAddressOptionIsSelected();
    }

    @Step
    public void checkListingAgentInfoOptionIsUnselected() {
        onPage.checkListingAgentInfoOptionIsUnselected();
    }

    @Step
    public void selectListingAgentInfoOption() {
        onPage.selectListingAgentInfoOption();
    }

    @Step
    public void deselectIncludeExactAddressOption() {
        onPage.deselectIncludeExactAddressOption();
    }

    @Step
    public void clearSubjectField() {
        onPage.clearSubjectField();
    }

    @Step
    public void fillInDescriptionField(String description) {
        onPage.fillInDescriptionField(description);
    }

    @Step
    public void clickOnAppointmentDate() {
        onPage.clickOnAppointmentDate();
    }

    @Step
    public void checkTodayMonthAndYearCalendarAreShown() {
        onPage.checkTodayMonthAndYearCalendarAreShown();
    }

    @Step
    public void setDateForNextMonth(String date) {
        onPage.setDateForNextMonth(date);
    }

    @Step
    public void checkCalendarIsClosed() {
        onPage.checkCalendarIsClosed();
    }

    @Step
    public void checkSelectedDateIsShown() {
        onPage.checkSelectedDateIsShown();
    }

    @Step
    public void checkTodayDateIsSelected() {
        onPage.checkTodayDateIsSelected();
    }

    @Step
    public void clickOnAppointmentTime() {
        onPage.clickOnAppointmentTime();
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
    public void checkTimeIsReset() {
        onPage.checkTimeIsReset();
    }

    @Step
    public void clickOnSaveButton() {
        onPage.clickOnSaveButton();
    }

    @Step
    public void checkTimeSelectorIsShown() {
        onPage.checkTimeSelectorIsShown();
    }

    @Step
    public void checkSelectedTimeIsShown() {
        onPage.checkSelectedTimeIsShown();
    }

    @Step
    public void clickOnFloorplanEditIcon() {
        onPage.clickOnFloorplanEditIcon();
    }

    @Step
    public void clickOnPhotosEditIcon() {
        onPage.clickOnPhotosEditIcon();
    }

    @Step
    public void clearDescriptionField() {
        onPage.clearDescriptionField();
    }

    @Step
    public void clickOnShowSheetButton() {
        onPage.clickOnShowSheetButton();
    }

    @Step
    public void checkDomSuboptionSelected() {
        onPage.checkDomSuboptionSelected();
    }

    @Step
    public void checkListDateSuboptionSelected() {
        onPage.checkListDateSuboptionSelected();
    }

    @Step
    public void checkSubwayInfoSuboptionSelected() {
        onPage.checkSubwayInfoSuboptionSelected();
    }

    @Step
    public void checkIncludeMapSuboptionSelected() {
        onPage.checkIncludeMapSuboptionSelected();
    }

    @Step
    public void checkFloorplanSuboptionSelected() {
        onPage.checkFloorplanSuboptionSelected();
    }

    @Step
    public void checkOpenHouseSuboptionSelected() {
        onPage.checkOpenHouseSuboptionSelected();
    }

    @Step
    public void checkNeighborhoodSuboptionSelected() {
        onPage.checkNeighborhoodSuboptionSelected();
    }

    @Step
    public void deselectAllOptions() {
        onPage.deselectAllOptions();
    }

    @Step
    public void checkAllOptionsDeselected() {
        onPage.checkAllOptionsDeselected();
    }

    @Step
    public void selectAllOptions() {
        onPage.selectAllOptions();
    }

    @Step
    public void checkAllOptionsAreSelected(int amount) {
        onPage.checkAllOptionsAreSelected(amount);
    }

    @Step
    public void checkDescriptionFieldMarkedRed() {
//        TODO
    }

    @Step
    public void checkNextButtonIsDisabled() {
        onPage.checkNextButtonIsDisabled();
    }

    @Step
    public void checkFloorplanIsShown() {
        //        TODO
    }

    @Step
    public void checkPhotosAreShown() {
        //        TODO
    }

    @Step
    public void clickOnDescriptionField() {
        onPage.clickOnDescriptionField();
    }

    @Step
    public void checkDescriptionFieldExpanded() {
//    TODO
    }

    @Step
    public void removeSymbolsToLeaveOnly1160() {
//        TODO
    }

    @Step
    public void checkCharactersLabelMarkedBlack() {
//        TODO
    }

    @Step
    public void clickOnDoneButton() {
        onPage.clickOnDoneButton();
    }

    @Step
    public void fillInDescriptionFieldWithCountSymbols(int length) {
        onPage.fillInDescriptionFieldWithCountSymbols(length);
    }

    @Step
    public void checkOnePerOneSelectedLabelIsShown() {
        onPage.checkOnePerOneSelectedLabelIsShown();
    }

    @Step
    public void checkOneIsShownOnFirstFloorplan() {
        onPage.checkOneIsShownOnFirstFloorplan();
    }

    @Step
    public void checkSecondFloorplanNotSelected() {
//        todo no listings with 2 floorplans
    }

    @Step
    public void clickOnSecondFloorplan() {
//        todo no listings with 2 floorplans
    }

    @Step
    public void clickOnFirstFloorplan() {
        onPage.clickOnFirstFloorplan();
    }

    @Step
    public void checkZeroPerOneSelectedLabelIsShown() {
        onPage.checkZeroPerOneSelectedLabelIsShown();
    }

    @Step
    public void oneSelectedLabelRemovedFromFirstFloorplan() {
        onPage.oneSelectedLabelRemovedFromFirstFloorplan();
    }

    @Step
    public void checkFloorplanRemovedFromReportScreen() {
//        todo no locators for floorplan
    }

    @Step
    public void checkNextButtonIsEnabled() {
        onPage.checkNextButtonIsEnabled();
    }

    @Step
    public void checkFourPerFourSelectedLabelIsShown() {
        onPage.checkFourPerFourSelectedLabelIsShown();
    }

    @Step
    public void checkFirstPhotoSelected() {
        onPage.checkFirstPhotoSelected();
    }

    @Step
    public void checkSecondPhotoSelected() {
        onPage.checkSecondPhotoSelected();
    }

    @Step
    public void checkThirdPhotoSelected() {
        onPage.checkThirdPhotoSelected();
    }

    @Step
    public void selectFithPhoto() {
        onPage.selectFithPhoto();
    }

    @Step
    public void checkFifthPhotoIsNotSelected() {
        onPage.checkFifthPhotoIsNotSelected();
    }

    @Step
    public void deselectAllPhotos() {
        onPage.deselectAllPhotos();
    }

    @Step
    public void zeroPerFourSelectedLabelIsShown() {
        onPage.zeroPerFourSelectedLabelIsShown();
    }

    @Step
    public void checkPhotosRemovedFromReportScreen() {
        //        todo no locators for photos
    }

    @Step
    public void checkFourthPhotoSelected() {
        onPage.checkFourthPhotoSelected();
    }

    @Step
    public void checkListingAgentCommissionIsUnselected() {
        onPage.checkListingAgentCommissionIsUnselected();
    }

    @Step
    public void selectListingAgentCommissionOption() {
        onPage.selectListingAgentCommissionOption();
    }

    @Step
    public void clickOnMediumButton() {
        onPage.clickOnMediumButton();
    }

    @Step
    public void clickDefaultIncludesBuildingsButton() {
        onPage.clickDefaultIncludesBuildingsButton();
    }

    @Step
    public void checkBuildingInBuildingsSection() {
        onPage.checkBuildingInBuildingsSection();
    }

    @Step
    public void clickOnExportToExcelButton() {
        onPage.clickOnExportToExcelButton();
    }

    @Step
    public void clickOnDetailedButton() {
        onPage.clickOnDetailedButton();
    }

    @Step
    public void checkCharactersLabelMarkedRed() {
    }

    @Step
    public void removeOneSymboldFromDescriptionField() {
        onPage.removeOneSymboldFromDescriptionField();
    }

    @Step
    public void checkCharactersLabelMarkedGreen() {
    }

    @Step
    public void checkDescriptionFieldMarkedGreen() {
    }

    @Step
    public void clickOnCommentsField() {
        onPage.clickOnCommentsField();
    }

    @Step
    public void fillCommentsField(int length) {
        onPage.fillCommentsField(length);
    }

    @Step
    public void checkCommentsLabelIsGreen() {
    }

    @Step
    public void checkBuildingSectionIsNotShown() {
        onPage.checkBuildingSectionIsNotShown();
    }

    @Step
    public void checkOnlyTwoListingsAreShownInEmailWithoutExactAddresses() {
        MailTrap.checkOnlyTwoListingsAreShownInEmailWithoutExactAddresses();
    }

    @Step
    public void selectPhotosSuboption() {
        onPage.selectPhotosSuboption();
    }

    @Step
    public void switchToFloorplanSuboption() {
        onPage.switchToFloorplanSuboption();
    }

    @Step
    public void moveFirstListingToSecondListingByDragging() {
        onPage.moveFirstListingToSecondListingByDragging();
    }

    @Step
    public void checkFirstAndSecondListingsAreReordered() {
        onPage.checkFirstAndSecondListingsAreReordered();
    }

    @Step
    public void selectInternalInformationOption() {
        onPage.selectInternalInformationOption();
    }

    @Step
    public void selectIncludeExactAddressOption() {
        onPage.selectIncludeExactAddressOption();
    }

    @Step
    public void clickOnItineraryButton() {
        onPage.clickOnItineraryButton();
    }

    @Step
    public void swipeLeftSecondListing() {
        onPage.swipeLeftSecondListing();
    }

    @Step
    public void clickOnEditButton() {
        onPage.clickOnEditButton();
    }

    @Step
    public void swipeLeftThirdListing() {
        onPage.swipeLeftThirdListing();
    }

    @Step
    public void checkAppointmentTimeIsShownForListing() {
        onPage.checkAppointmentTimeIsShownForListing();
    }

    @Step
    public void swipeLeftFourthListing() {
        onPage.swipeLeftFourthListing();
    }

    @Step
    public void checkListingsOrderIsSavedInEmailAndOnlyThreeListingsAreShown() {
        MailTrap.checkOnlyThreeListingsAreShownInEmail();
        MailTrap.checkListingsOrderIsSavedInEmailAndNotDeletedListings();
    }

    @Step
    public void checkAppointmentDateFieldIsRed() {
        onPage.checkAppointmentDateFieldIsRed();
    }

    @Step
    public void clickOnNextYear() {
        onPage.clickOnNextYear();
    }

    @Step
    public void checkYearIsSwitched() {
        onPage.checkYearIsSwitched();
    }

    @Step
    public void clickOnPreviousMonth() {
        onPage.clickOnPreviousMonth();
    }

    @Step
    public void clickOnNextMonth() {
        onPage.clickOnNextMonth();
    }

    @Step
    public void checkPreviousMonthIsShown() {
        onPage.checkPreviousMonthIsShown();
    }

    @Step
    public void checkNextMonthIsShown() {
        onPage.checkNextMonthIsShown();
    }

    @Step
    public void clickOnCloseButton() {
        onPage.clickOnCloseButton();

    }

    @Step
    public void checkAppointmentDateFieldIsEmpty() {
        onPage.checkAppointmentDateFieldIsEmpty();
    }

    @Step
    public void clickOnStartTimeField() {
        onPage.clickOnStartTimeField();
    }

    @Step
    public void clickOnEndTimeField() {
        onPage.clickOnEndTimeField();
    }

    @Step
    public void checkStartTimeFieldIsFilled() {
        onPage.checkStartTimeFieldIsFilled();
    }

    @Step
    public void checkEndTimeFieldIsFilled() {
        onPage.checkEndTimeFieldIsFilled();
    }

    @Step
    public void fillInMeetingLocationField(String meetingLocation) {
        onPage.fillInMeetingLocationField(meetingLocation);
    }

    @Step
    public void fillInPreparedForField(String preparedFor) {
        onPage.fillInPreparedForField(preparedFor);
    }

    @Step
    public void selectBrokerageOption() {
        onPage.selectBrokerageOption();
    }

    @Step
    public void selectAgentNameOption() {
        onPage.selectAgentNameOption();
    }

    @Step
    public void selectAgentPhoneNumberOption() {
        onPage.selectAgentPhoneNumberOption();
    }

    @Step
    public void selectOpenHouseOption() {
        onPage.selectOpenHouseOption();
    }

    @Step
    public void selectLargeMapOption() {
        onPage.selectLargeMapOption();
    }

    @Step
    public void selectNeighborhoodOption() {
        onPage.selectNeighborhoodOption();
    }

    @Step
    public void selectIncludeCrossStreetsOption() {
        onPage.selectIncludeCrossStreetsOption();
    }

    @Step
    public void deselectFirstPhoto() {
        onPage.deselectFirstPhoto();
    }

    @Step
    public void checkNumberInCircleIsNotShown() {
        //TODO: need to add id for element
    }

    @Step
    public void checkGreenFrameIsRemoved() {
        //TODO: need to add id for element
    }

    @Step
    public void checkPhotosCountIsChanged(int amount) {
        onPage.checkPhotosCountIsChanged(amount);
    }

    @Step
    public void moveFirstPhotoToSecondPhotoByDragging() {
        onPage.moveFirstPhotoToSecondPhotoByDragging();
    }

    @Step
    public void checkPhotosAreReordered() {
        //TODO: need to add id for element
    }

    @Step
    public void checkPhotosAreShownInUpdatedOrder() {
        //TODO: need to add id for element
    }

    @Step
    public void moveFirstFloorplanToSecondFloorplanByDragging() {
        onPage.moveFirstPhotoToSecondPhotoByDragging();
    }

    @Step
    public void checkFloorplanAreReordered() {
        //TODO: need to add id for element
    }

    @Step
    public void checkFloorplanAreShownInUpdatedOrder() {
        //TODO: need to add id for element
    }

    @Step
    public void getAmountSelectedPhotos() {
        onPage.getAmountSelectedPhotos();
    }
}
