package com.perchwell.pages.reportWizard;

import com.perchwell.helpers.SessionVariables;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class AddSubjectPropertyPage extends TechHelper {

    @iOSXCUITFindBy(accessibility = "Save")
    private WebElement saveButton;

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Address-'")
    private WebElement addressField;

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Unit-'")
    private WebElement unitField;

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Price-'")
    private WebElement priceField;

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Rooms-'")
    private WebElement roomsField;

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Beds-'")
    private WebElement bedsField;

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Baths-'")
    private WebElement bathsField;

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Square Footage-'")
    private WebElement sqrFootageField;

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'CC/Maintenance-'")
    private WebElement ccMaintenanceField;

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'RE Taxes-'")
    private WebElement reTaxesField;

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Property Type-'")
    private WebElement propertyTypeField;

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Building Size-'")
    private WebElement buildingSizeField;

    @iOSXCUITFindBy(accessibility = " Suboption: Condo")
    private WebElement condoOption;

    @iOSXCUITFindBy(accessibility = "Outdoor Space-checkmark")
    private WebElement outdoorSpaceFilter;

    @iOSXCUITFindBy(accessibility = "Doorman Building-checkmark")
    private WebElement doormanBuildingFilter;

    @iOSXCUITFindBy(iOSNsPredicate = "label == 'ADD SUBJECT PROPERTY'")
    private WebElement addSubjectPropertyTypeLabel;

    @iOSXCUITFindBy(accessibility = "Doorman Building-checkmark-SELECTED")
    private WebElement selectedDoormanBuildingFilter;

    @iOSXCUITFindBy(accessibility = "Outdoor Space-checkmark-SELECTED")
    private WebElement selectedOutdoorSpaceFilter;

    @iOSXCUITFindBy(accessibility = "chevronRight")
    private WebElement nextMonthPageButton;

    @iOSXCUITFindBy(accessibility = "Outdoor Space-cross")
    private WebElement outdoorSpaceCrossFilter;

    @iOSXCUITFindBy(accessibility = "Doorman Building-cross")
    private WebElement doormanBuildingCrossFilter;

    public AddSubjectPropertyPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSaveButton() {
        element(saveButton).click();
    }

    public void fillInAddressField(String address) {
        element(addressField).sendKeys(address);
        SessionVariables.addValueInSessionVariable("addressValue", address);
        hideKeyboard();
    }

    public void fillInUnitField(String unit) {
        element(unitField).sendKeys(unit);
        SessionVariables.addValueInSessionVariable("unitValue", unit);
        hideKeyboard();
    }

    public void fillInPriceField(String price) {
        element(priceField).sendKeys(price);
        SessionVariables.addValueInSessionVariable("priceValue", price);
    }

    public void fillInRoomsField(String rooms) {
        element(roomsField).sendKeys(rooms);
        SessionVariables.addValueInSessionVariable("roomsValue", rooms);
    }

    public void fillInBedsField(String beds) {
        element(bedsField).sendKeys(beds);
        SessionVariables.addValueInSessionVariable("bedsValue", beds);
    }

    public void fillInBathsField(String baths) {
        element(bathsField).sendKeys(baths);
        SessionVariables.addValueInSessionVariable("bathsValue", baths);
    }

    public void fillInSqrFootageField(String sqrFootage) {
        element(sqrFootageField).sendKeys(sqrFootage);
        SessionVariables.addValueInSessionVariable("sqrFootageValue", sqrFootage);

        element(unitField).click();
        hideKeyboard();
    }

    public void fillInCcMaintenanceField(String ccMaintenance) {
        element(ccMaintenanceField).sendKeys(ccMaintenance);
        SessionVariables.addValueInSessionVariable("ccMaintenanceValue", ccMaintenance);
    }

    public void fillInReTaxesField(String reTaxes) {
        element(reTaxesField).sendKeys(reTaxes);
        SessionVariables.addValueInSessionVariable("reTaxesValue", reTaxes);

        singleUpShortSwipeIOS();
        element(unitField).click();
        hideKeyboard();
    }

    public void fillInBuildingSizeField(String buildingSize) {
        element(buildingSizeField).sendKeys(buildingSize);
        SessionVariables.addValueInSessionVariable("buildingSizeValue", buildingSize);
    }

    public void clickOnPropertyTypeField() {
        element(propertyTypeField).click();
    }

    public void checkCcMaintenanceFieldIsShown() {
        element(ccMaintenanceField).shouldBeVisible();
    }

    public void checkReTaxesFiledIsShown() {
        element(reTaxesField).shouldBeVisible();
    }

    public void clickOnCondo() {
        element(condoOption).click();
    }

    public void selectOutdoorSpaceFilter() {
        element(outdoorSpaceFilter).click();
    }

    public void selectDoormanBuildingFilter() {
        element(doormanBuildingFilter).click();
    }

    public void checkAddSubjectPropertyPageIsOpened() {
        element(addSubjectPropertyTypeLabel).shouldBeVisible();
    }

    public void checkCcMaintenanceFieldIsFilledOut() {
        Assert.assertEquals(SessionVariables.getValueFromSessionVariable("ccMaintenanceValue"), element(ccMaintenanceField).getValue().replace("$", "").replace(",", ""));
    }

    public void checkAddressFieldIsFilledOut() {
        Assert.assertEquals(SessionVariables.getValueFromSessionVariable("addressValue"), element(addressField).getValue());
    }

    public void checkUnitFieldIsFilledOut() {
        Assert.assertEquals(SessionVariables.getValueFromSessionVariable("unitValue"), element(unitField).getValue());
    }

    public void checkPriceFieldIsFilledOut() {
        Assert.assertEquals(SessionVariables.getValueFromSessionVariable("priceValue"), element(priceField).getValue().replace("$", "").replace(",", ""));
    }

    public void checkRoomsFieldIsFilledOut() {
        Assert.assertEquals(SessionVariables.getValueFromSessionVariable("roomsValue"), element(roomsField).getValue());
    }

    public void checkBedsFieldIsFilledOut() {
        Assert.assertEquals(SessionVariables.getValueFromSessionVariable("bedsValue"), element(bedsField).getValue());
    }

    public void checkBathsFieldIsFilledOut() {
        Assert.assertEquals(SessionVariables.getValueFromSessionVariable("bathsValue"), element(bathsField).getValue());
    }

    public void checkSqrFootageFieldIsFilledOut() {
        Assert.assertEquals(SessionVariables.getValueFromSessionVariable("sqrFootageValue"), element(sqrFootageField).getValue().replace(",", ""));
    }

    public void checkReTaxesFieldIsFilledOut() {
        Assert.assertEquals(SessionVariables.getValueFromSessionVariable("reTaxesValue"), element(reTaxesField).getValue().replace("$", "").replace(",", ""));
    }

    public void checkBuildingSizeFieldIsFilledOut() {
        Assert.assertEquals(SessionVariables.getValueFromSessionVariable("buildingSizeValue"), element(buildingSizeField).getValue());
    }

    public void checkCondoIsVisibleInPropertyType() {
        Assert.assertEquals("Condo", element(propertyTypeField).getValue());
    }

    public void checkDoormanBuildingIsSelected() {
        element(selectedDoormanBuildingFilter).shouldBeVisible();
    }

    public void checkOutdoorSpaceIsSelected() {
        element(selectedOutdoorSpaceFilter).shouldBeVisible();
    }

    public void clearAddressField() {
        element(addressField).clear();
    }

    public void clearUnitField() {
        element(unitField).clear();
    }

    public void clearPriceField() {
        element(priceField).clear();
    }

    public void clearBedroomsField() {
        element(bedsField).clear();
    }

    public void clearBathroomsField() {
        element(bathsField).clear();
    }

    public void clearSqrFootageField() {
        element(sqrFootageField).clear();
    }

    public void selectOutdoorSpaceCrossFilter() {
        element(outdoorSpaceCrossFilter).click();
    }

    public void selectDoormanBuildingCrossFilter() {
        element(doormanBuildingCrossFilter).click();
    }

    public void checkReTaxesFiledIsNotShown() {
        setImplicitTimeout(3, TimeUnit.SECONDS);
        element(reTaxesField).shouldNotBeVisible();
        resetImplicitTimeout();
    }

    public void checkSaveButtonIsEnabled() {
        element(saveButton).shouldBeEnabled();
    }

    public void checkAddressFieldIsEmpty() {
        Assert.assertEquals("Address", element(addressField).getValue());
    }

    public void checkUnitFieldIsEmpty() {
        Assert.assertEquals("Unit", element(unitField).getValue());
    }

    public void checkPriceFieldIsEmpty() {
        Assert.assertEquals("Price", element(priceField).getValue());
    }

    public void checkRoomsFieldIsEmpty() {
        Assert.assertEquals("Number of total rooms", element(roomsField).getValue());
    }

    public void checkBedsFieldIsEmpty() {
        Assert.assertEquals("Beds", element(bedsField).getValue());
    }

    public void checkBathsFieldIsEmpty() {
        Assert.assertEquals("Use .5 for half baths", element(bathsField).getValue());
    }

    public void checkSqrFootageFieldIsEmpty() {
        Assert.assertEquals("Square Footage", element(sqrFootageField).getValue());
    }

    public void checkPropertyTypeFieldIsEmpty() {
        Assert.assertEquals("Select a property type", element(propertyTypeField).getValue());
    }

    public void checkDoormanBuildingIsDeselected() {
        element(doormanBuildingFilter).shouldBeVisible();
        element(doormanBuildingCrossFilter).shouldBeVisible();
    }

    public void checkOutdoorSpaceIsDeselected() {
        element(outdoorSpaceFilter).shouldBeVisible();
        element(outdoorSpaceCrossFilter).shouldBeVisible();
    }

    public void checkBuildingSizeFieldIsEmpty() {
        Assert.assertEquals("10 x 10", element(buildingSizeField).getValue());
    }

    public void checkCcMaintenanceFieldIsNotShown() {
        setImplicitTimeout(3, TimeUnit.SECONDS);
        element(ccMaintenanceField).shouldNotBeVisible();
        resetImplicitTimeout();
    }
}
