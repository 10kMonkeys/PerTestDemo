package com.perchwell.pages.reportWizard;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class AddSubjectPropertyPage extends TechHelper {

    @AndroidFindBy(accessibility = "Save")
    @iOSXCUITFindBy(accessibility = "Save")
    private WebElement saveButton;

    @AndroidFindBy(accessibility = "Address textField color:#606060")
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Address-'")
    private WebElement addressField;

    @AndroidFindBy(accessibility = "Unit textField color:#606060")
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Unit-'")
    private WebElement unitField;

    @AndroidFindBy(accessibility = "Price textField color:#606060")
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Price-'")
    private WebElement priceField;

    @AndroidFindBy(accessibility = "Rooms textField color:#606060")
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Rooms-'")
    private WebElement roomsField;

    @AndroidFindBy(accessibility = "Beds textField color:#606060")
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Beds-'")
    private WebElement bedsField;

    @AndroidFindBy(accessibility = "Baths textField color:#606060")
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Baths-'")
    private WebElement bathsField;

    @AndroidFindBy(accessibility = "Square Footage textField color:#606060")
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Square Footage-'")
    private WebElement sqrFootageField;

    @AndroidFindBy(accessibility = "CC/Maintenance textField color:#606060")
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'CC/Maintenance-'")
    private WebElement ccMaintenanceField;

    @AndroidFindBy(accessibility = "RE Taxes textField color:#606060")
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'RE Taxes-'")
    private WebElement reTaxesField;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/select_property_type_button")
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Property Type-'")
    private WebElement propertyTypeField;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/selected_radio_button")
    private WebElement selectedPropertyType;

    @AndroidFindBy(accessibility = "Building Size textField color:#606060")
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Building Size-'")
    private WebElement buildingSizeField;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Condo']")
    @iOSXCUITFindBy(accessibility = " Suboption: Condo")
    private WebElement condoOption;

    @AndroidFindBy(accessibility = "Outdoor Space-checkmark")
    @iOSXCUITFindBy(accessibility = "Outdoor Space-checkmark")
    private WebElement outdoorSpaceFilter;

    @AndroidFindBy(accessibility = "Doorman Building-checkmark")
    @iOSXCUITFindBy(accessibility = "Doorman Building-checkmark")
    private WebElement doormanBuildingFilter;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'ADD SUBJECT PROPERTY']")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'ADD SUBJECT PROPERTY'")
    private WebElement addSubjectPropertyTypeLabel;

    @AndroidFindBy(accessibility = "Doorman Building-checkmark-SELECTED")
    @iOSXCUITFindBy(accessibility = "Doorman Building-checkmark-SELECTED")
    private WebElement selectedDoormanBuildingFilter;

    @AndroidFindBy(accessibility = "Outdoor Space-checkmark-SELECTED")
    @iOSXCUITFindBy(accessibility = "Outdoor Space-checkmark-SELECTED")
    private WebElement selectedOutdoorSpaceFilter;

    @AndroidFindBy(accessibility = "Outdoor Space-cross")
    @iOSXCUITFindBy(accessibility = "Outdoor Space-cross")
    private WebElement outdoorSpaceCrossFilter;

    @AndroidFindBy(accessibility = "Doorman Building-cross")
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
        if(!Config.isAndroid()) {
            hideKeyboard();
        }
    }

    public void fillInUnitField(String unit) {
        element(unitField).sendKeys(unit);
        SessionVariables.addValueInSessionVariable("unitValue", unit);
        if(!Config.isAndroid()) {
            hideKeyboard();
        }
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
        if(!Config.isAndroid()) {
            element(unitField).click();
            hideKeyboard();
        }
    }

    public void fillInCcMaintenanceField(String ccMaintenance) {
        element(ccMaintenanceField).sendKeys(ccMaintenance);
        SessionVariables.addValueInSessionVariable("ccMaintenanceValue", ccMaintenance);
    }

    public void fillInReTaxesField(String reTaxes) {
        element(reTaxesField).sendKeys(reTaxes);
        SessionVariables.addValueInSessionVariable("reTaxesValue", reTaxes);

        if(!Config.isAndroid()) {
            singleUpShortSwipeIOS();
            element(unitField).click();
            hideKeyboard();
        }
    }

    public void fillInBuildingSizeField(String buildingSize) {
        if(Config.isAndroid()) {
            androidSwipeDownUntilElementVisible(buildingSizeField);
        }
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
        if(Config.isAndroid()) {
            swipeDownUntilElementVisible(condoOption);
        }
        element(condoOption).click();
        SessionVariables.addValueInSessionVariable("propertyTypeValue", element(condoOption).getText());
    }

    public void selectOutdoorSpaceFilter() {
        if(Config.isAndroid()) {
            androidSwipeDownUntilElementVisible(outdoorSpaceFilter);
        }
        element(outdoorSpaceFilter).click();
    }

    public void selectDoormanBuildingFilter() {
        if(Config.isAndroid()) {
            androidSwipeDownUntilElementVisible(doormanBuildingFilter);
        }
        element(doormanBuildingFilter).click();
    }

    public void checkAddSubjectPropertyPageIsOpened() {
        element(addSubjectPropertyTypeLabel).shouldBeVisible();
    }

    public void checkCcMaintenanceFieldIsFilledOut() {
        if(Config.isAndroid()) {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("ccMaintenanceValue"), element(ccMaintenanceField).getText().replaceAll("[$,]",""));
        } else {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("ccMaintenanceValue"), element(ccMaintenanceField).getValue().replaceAll("[$,]",""));
        }
    }

    public void checkAddressFieldIsFilledOut() {
        if(Config.isAndroid()) {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("addressValue"), element(addressField).getText());
        } else {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("addressValue"), element(addressField).getValue());
        }
    }

    public void checkUnitFieldIsFilledOut() {
        if(Config.isAndroid()) {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("unitValue"), element(unitField).getText());
        } else {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("unitValue"), element(unitField).getValue());
        }
    }

    public void checkPriceFieldIsFilledOut() {
        if(Config.isAndroid()) {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("priceValue"), element(priceField).getText().replaceAll("[$,]",""));
        } else {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("priceValue"), element(priceField).getValue().replaceAll("[$,]",""));
        }
    }

    public void checkRoomsFieldIsFilledOut() {
        if(Config.isAndroid()) {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("roomsValue"), element(roomsField).getText());
        } else {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("roomsValue"), element(roomsField).getValue());
        }
    }

    public void checkBedsFieldIsFilledOut() {
        if(Config.isAndroid()) {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("bedsValue"), element(bedsField).getText());
        } else {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("bedsValue"), element(bedsField).getValue());
        }
    }

    public void checkBathsFieldIsFilledOut() {
        if(Config.isAndroid()) {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("bathsValue"), element(bathsField).getText());
        } else {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("bathsValue"), element(bathsField).getValue());
        }
    }

    public void checkSqrFootageFieldIsFilledOut() {
        if(Config.isAndroid()) {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("sqrFootageValue"), element(sqrFootageField).getText().replace(",", ""));
        } else {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("sqrFootageValue"), element(sqrFootageField).getValue().replace(",", ""));
        }
    }

    public void checkReTaxesFieldIsFilledOut() {
        if(Config.isAndroid()) {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("reTaxesValue"), element(reTaxesField).getText().replaceAll("[$,]",""));
        } else {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("reTaxesValue"), element(reTaxesField).getValue().replaceAll("[$,]",""));
        }
    }

    public void checkBuildingSizeFieldIsFilledOut() {
        if(Config.isAndroid()) {
            swipeDownUntilElementVisible(buildingSizeField);
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("buildingSizeValue"), element(buildingSizeField).getText());
        } else {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("buildingSizeValue"), element(buildingSizeField).getValue());
        }

    }

    public void checkCondoIsVisibleInPropertyType() {
        if(Config.isAndroid()) {
            Assert.assertEquals("Condo", element(selectedPropertyType).getText());
        } else {
            Assert.assertEquals("Condo", element(propertyTypeField).getValue());
        }
    }

    public void checkDoormanBuildingIsSelected() {
        if(Config.isAndroid()) {
            androidSwipeDownUntilElementVisible(selectedDoormanBuildingFilter);
        }
        element(selectedDoormanBuildingFilter).shouldBeVisible();
    }

    public void checkOutdoorSpaceIsSelected() {
        if(Config.isAndroid()) {
            androidSwipeDownUntilElementVisible(selectedOutdoorSpaceFilter);
        }
        element(selectedOutdoorSpaceFilter).shouldBeVisible();
    }

    public void clearAddressField() {
        if(Config.isAndroid()) {
            singleUpShortSwipeAndroid();
        }
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
        if(Config.isAndroid()) {
            Assert.assertEquals("Address", element(addressField).getText());
        } else {
            Assert.assertEquals("Address", element(addressField).getValue());
        }
    }

    public void checkUnitFieldIsEmpty() {
        if(Config.isAndroid()) {
            Assert.assertEquals("Unit", element(unitField).getText());
        } else {
            Assert.assertEquals("Unit", element(unitField).getValue());
        }
    }

    public void checkPriceFieldIsEmpty() {
        if(Config.isAndroid()) {
            Assert.assertEquals("Price", element(priceField).getText());
        } else {
            Assert.assertEquals("Price", element(priceField).getValue());
        }
    }

    public void checkRoomsFieldIsEmpty() {
        if(Config.isAndroid()) {
            Assert.assertEquals("Number of total rooms", element(roomsField).getText());
        } else {
            Assert.assertEquals("Number of total rooms", element(roomsField).getValue());
        }
    }

    public void checkBedsFieldIsEmpty() {
        if(Config.isAndroid()) {
            Assert.assertEquals("Beds", element(bedsField).getText());
        } else {
            Assert.assertEquals("Beds", element(bedsField).getValue());
        }
    }

    public void checkBathsFieldIsEmpty() {
        if(Config.isAndroid()) {
            Assert.assertEquals("Use .5 for half baths", element(bathsField).getText());
        } else {
            Assert.assertEquals("Use .5 for half baths", element(bathsField).getValue());
        }
    }

    public void checkSqrFootageFieldIsEmpty() {
        if(Config.isAndroid()) {
            Assert.assertEquals("Square Footage", element(sqrFootageField).getText());
        } else {
            Assert.assertEquals("Square Footage", element(sqrFootageField).getValue());
        }
    }

    public void checkPropertyTypeFieldIsEmpty() {
        if(Config.isAndroid()) {
            Assert.assertEquals("Select a property type", element(propertyTypeField).getText());
        } else {
            Assert.assertEquals("Select a property type", element(propertyTypeField).getValue());
        }
    }

    public void checkDoormanBuildingIsDeselected() {
        if(Config.isAndroid()) {
            androidSwipeDownUntilElementVisible(doormanBuildingFilter);
        }
        element(doormanBuildingFilter).shouldBeVisible();
        element(doormanBuildingCrossFilter).shouldBeVisible();
    }

    public void checkOutdoorSpaceIsDeselected() {
        if(Config.isAndroid()) {
            androidSwipeDownUntilElementVisible(outdoorSpaceFilter);
        }
        element(outdoorSpaceFilter).shouldBeVisible();
        element(outdoorSpaceCrossFilter).shouldBeVisible();
    }

    public void checkBuildingSizeFieldIsEmpty() {
        if(Config.isAndroid()) {
            androidSwipeDownUntilElementVisible(buildingSizeField);
            Assert.assertEquals("10 x 10", element(buildingSizeField).getText());
        } else {
            Assert.assertEquals("10 x 10", element(buildingSizeField).getValue());
        }
        if (Config.isAndroid()) {
            singleUpShortSwipeAndroidToReturnListInInitialState();
        }
    }

    public void checkCcMaintenanceFieldIsNotShown() {
        setImplicitTimeout(3, TimeUnit.SECONDS);
        element(ccMaintenanceField).shouldNotBeVisible();
        resetImplicitTimeout();
    }
}
