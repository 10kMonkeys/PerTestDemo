package com.perchwell.steps;

import com.perchwell.pages.reportWizard.AddSubjectPropertyPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AddSubjectPropertySteps extends ScenarioSteps {

    AddSubjectPropertyPage onPage;

    @Step
    public void clickOnSaveButton() {
        onPage.clickOnSaveButton();
    }

    @Step
    public void fillInAddressField(String address) {
        onPage.fillInAddressField(address);
    }

    @Step
    public void fillInUnitField(String unit) {
        onPage.fillInUnitField(unit);
    }

    @Step
    public void fillInPriceField(String price) {
        onPage.fillInPriceField(price);
    }

    @Step
    public void fillInRoomsField(String rooms) {
        onPage.fillInRoomsField(rooms);
    }

    @Step
    public void fillInBedsField(String beds) {
        onPage.fillInBedsField(beds);
    }

    @Step
    public void fillInBathsField(String baths) {
        onPage.fillInBathsField(baths);
    }

    @Step
    public void fillInSqrFootageField(String sqrFootage) {
        onPage.fillInSqrFootageField(sqrFootage);
    }

    @Step
    public void fillInCcMaintenanceField(String ccMaintenance) {
        onPage.fillInCcMaintenanceField(ccMaintenance);
    }

    @Step
    public void fillInReTaxesField(String reTaxes) {
        onPage.fillInReTaxesField(reTaxes);
    }

    public void fillInBuildingSizeField(String buildingSize) {
        onPage.fillInBuildingSizeField(buildingSize);
    }

    @Step
    public void clickOnPropertyTypeField() {
        onPage.clickOnPropertyTypeField();
    }

    @Step
    public void clickOnDateFiled() {
        onPage.clickOnDateFiled();
    }

    @Step
    public void checkCcMaintenanceFieldIsShown() {
        onPage.checkCcMaintenanceFieldIsShown();
    }

    @Step
    public void checkReTaxesFiledIsShown() {
        onPage.checkReTaxesFiledIsShown();
    }

    @Step
    public void clickOnCondo() {
        onPage.clickOnCondo();
    }

    @Step
    public void selectOutdoorSpaceFilter() {
        onPage.selectOutdoorSpaceFilter();
    }

    @Step
    public void selectDoormanBuildingFilter() {
        onPage.selectDoormanBuildingFilter();
    }

    @Step
    public void checkAddSubjectPropertyPageIsOpened() {
        onPage.checkAddSubjectPropertyPageIsOpened();
    }

    @Step
    public void checkCcMaintenanceFieldIsFilledOut() {
        onPage.checkCcMaintenanceFieldIsFilledOut();
    }

    @Step
    public void checkAllFieldsAreFilledOut() {
        onPage.checkAddressFieldIsFilledOut();
        onPage.checkUnitFieldIsFilledOut();
        onPage.checkPriceFieldIsFilledOut();
        onPage.checkRoomsFieldIsFilledOut();
        onPage.checkBedsFieldIsFilledOut();
        onPage.checkBathsFieldIsFilledOut();
        onPage.checkSqrFootageFieldIsFilledOut();
        onPage.checkCcMaintenanceFieldIsFilledOut();
        onPage.checkReTaxesFieldIsFilledOut();
        onPage.checkCondoIsVisible();
        onPage.checkDoormanBuildingIsSelected();
        onPage.checkOutdoorSpaceIsSelected();
        onPage.checkBuildingSizeFieldIsFilledOut();
    }

    @Step
    public void clearAddressField() {
        onPage.clearAddressField();
    }

    @Step
    public void clearUnitField() {
        onPage.clearUnitField();
    }

    @Step
    public void clearPriceField() {
        onPage.clearPriceField();
    }

    @Step
    public void clearBedroomsField() {
        onPage.clearBedroomsField();
    }

    @Step
    public void clearBathroomsField() {
        onPage.clearBathroomsField();
    }

    @Step
    public void clearSqrFootageField() {
        onPage.clearSqrFootageField();
    }

    @Step
    public void setDateForNextMonth(String date) {
        onPage.openNextMonthPage();
        onPage.setDate(date);
    }

    @Step
    public void selectOutdoorSpaceCrossFilter() {
        onPage.selectOutdoorSpaceCrossFilter();
    }

    @Step
    public void selectDoormanBuildingCrossFilter() {
        onPage.selectDoormanBuildingCrossFilter();
    }

    @Step
    public void checkReTaxesFiledIsNotShown() {
        onPage.checkReTaxesFiledIsNotShown();
    }

    @Step
    public void checkSaveButtonIsEnabled() {
        onPage.checkSaveButtonIsEnabled();
    }

    @Step
    public void checkAllFieldsAreEmpty() {
        onPage.checkAddressFieldIsEmpty();
        onPage.checkUnitFieldIsEmpty();
        onPage.checkPriceFieldIsEmpty();
        onPage.checkRoomsFieldIsEmpty();
        onPage.checkBedsFieldIsEmpty();
        onPage.checkBathsFieldIsEmpty();
        onPage.checkSqrFootageFieldIsEmpty();
        onPage.checkCcMaintenanceFieldIsEmpty();
        onPage.checkPropertyTypeFieldIsEmpty();
        onPage.checkDoormanBuildingIsDeselected();
        onPage.checkOutdoorSpaceIsDeselected();
        onPage.checkBuildingSizeFieldIsEmpty();
    }
}
