package com.perchwell.pages;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.RandomGenerator;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class EditTagPage extends TechHelper {

    @AndroidFindBy(id = "com.perchwell.re.staging:id/delete_background")
    @iOSXCUITFindBy(accessibility = "label: delete")
    private WebElement removeButton;

//    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeCell' AND label == 'DELETE'")
    @AndroidFindBy(id = "com.perchwell.re.staging:id/positive_button")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView/XCUIElementTypeCell[$name == 'DELETE'$]")
    private WebElement confirmButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/duplicate_text")
    @iOSXCUITFindBy(accessibility = "label: duplicate")
    private WebElement duplicateButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/title")
    @iOSXCUITFindBy(iOSNsPredicate = "name == 'EDIT TAG' AND visible == 1")
    private WebElement editTagLabel;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/negative_button")
    private WebElement duplicateCancelButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/positive_button")
    private WebElement duplicateSaveButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/rename_group_edit_text")
    private WebElement duplicateTagNameTextField;

//    @iOSXCUITFindBy(iOSNsPredicate = "name == 'SAVE' AND visible == 1")
    @AndroidFindBy(id = "com.perchwell.re.staging:id/save")
    @iOSXCUITFindBy(accessibility = "bar button: save")
    private WebElement saveButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/search_src_text")
    @iOSXCUITFindBy(accessibility = "Tag Name textField")
    private WebElement tagNameTextField;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/on")
    @iOSXCUITFindBy(accessibility = " Option: On")
    private WebElement alertsOn;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/on")
    @iOSXCUITFindBy(accessibility = " Option Selected: On")
    private WebElement alertsOnSelected;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/off")
    @iOSXCUITFindBy(accessibility = " Option: Off")
    private WebElement alertsOff;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/off")
    @iOSXCUITFindBy(accessibility = " Option Selected: Off")
    private WebElement alertsOffSelected;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/negative_button")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView/XCUIElementTypeCell[$name == 'CANCEL'$]")
    private WebElement cancelButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/arrow")
    @iOSXCUITFindBy(accessibility = "iconChevronLeft")
    private WebElement chevronLeft;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/negative_button")
    @iOSXCUITFindBy(accessibility = "DISCARD")
    private WebElement discardButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/positive_button")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name='SAVE']")
    private WebElement popUpSaveButton;

    public EditTagPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnDeleteButton() {
        element(removeButton).click();
    }

    public void confirmRemoving() {
        element(confirmButton).click();
    }

    public void clickOnDuplicateButton() {
        element(duplicateButton).click();
    }

    public void shouldSeeEditTagLabel() {
        element(editTagLabel).shouldBeVisible();
    }

    public void clickOnCancelButton() {
        element(duplicateCancelButton).click();
    }

    public void checkTagsItemsAmount(String valueToCheck) {
        if(Config.isAndroid()) {
            Assert.assertEquals(valueToCheck, element(MobileBy.id("com.perchwell.re.staging:id/items_with_tag_value")).getAttribute("text"));
        } else {
            element(MobileBy.AccessibilityId(valueToCheck)).shouldBeVisible();
        }
    }

    public void checkIfSaveButtonIsNotDisplayed() {
        setImplicitTimeout(3, TimeUnit.SECONDS);
        element(saveButton).shouldNotBeVisible();
        resetImplicitTimeout();
    }

    public void changeTagName(String tag) {
        String newTagName = RandomGenerator.getRandomString(tag);
        SessionVariables.addValueInSessionVariable("Renamed_Tag", newTagName);

        element(tagNameTextField).clear();
        element(tagNameTextField).sendKeys(newTagName);
    }

    public void checkIfSaveButtonIsDisplayed() {
        element(saveButton).shouldBeVisible();
    }

    public void clickOnSaveButton() {
        element(saveButton).click();
    }

    public void fillInRandomTagName(String newTagName) {
        element(duplicateTagNameTextField).sendKeys(newTagName);
    }

    public void checkIfAlertsAreTurnedOn() {
        if(Config.isAndroid()) {
            Assert.assertEquals("true", element(alertsOnSelected).getAttribute("checked"));
        } else {
            element(alertsOnSelected).shouldBeVisible();
        }
    }

    public void switchAlertsToOff() {
        element(alertsOff).click();
    }

    public void checkIfAlertsAreTurnedOff() {
        if(Config.isAndroid()) {
            Assert.assertEquals("true", element(alertsOffSelected).getAttribute("checked"));
        } else {
            element(alertsOffSelected).shouldBeVisible();
        }

    }

    public void switchAlertsToOn() {
        element(alertsOn).click();
    }

    public void cancelTagRemoving() {
        element(cancelButton).click();
    }

    public void clickOnArrowBackFromEditTagPage() {
        element(chevronLeft).click();
    }

    public void shouldSeeClient(String clientName) {
        if(Config.isAndroid()) {
            element(MobileBy.xpath("//android.widget.EditText[contains(@text, '" + clientName + "')]")).shouldBeVisible();
        } else {
            element(MobileBy.AccessibilityId(clientName)).shouldBeVisible();
        }
    }

    public void clickOnDiscardButton() {
        element(discardButton).click();
    }

    public void clickOnPopUpSaveButton() {
        element(popUpSaveButton).click();
    }
}
