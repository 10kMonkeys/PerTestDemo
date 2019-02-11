package com.perchwell.pages;

import com.perchwell.helpers.RandomGenerator;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class EditTagPage extends TechHelper {

    @iOSXCUITFindBy(accessibility = "DELETE")
    private WebElement removeButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeCell' AND label == 'DELETE'")
//    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[$name == 'DELETE'$][1]")
    private WebElement confirmButton;

    @iOSXCUITFindBy(accessibility = "DUPLICATE")
    private WebElement duplicateButton;

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'EDIT TAG' AND visible == 1")
    private WebElement editTagLabel;

    private WebElement duplicateCancelButton;

    private WebElement duplicateSaveButton;

    private WebElement duplicateTagNameTextField;

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'SAVE' AND visible == 1")
    private WebElement saveButton;

    @iOSXCUITFindBy(accessibility = "Tag Name textField")
    private WebElement tagNameTextField;

    @iOSXCUITFindBy(accessibility = " Option: On")
    private WebElement alertsOn;

    @iOSXCUITFindBy(accessibility = " Option Selected: On")
    private WebElement alertsOnSelected;

    @iOSXCUITFindBy(accessibility = " Option: Off")
    private WebElement alertsOff;

    @iOSXCUITFindBy(accessibility = " Option Selected: Off")
    private WebElement alertsOffSelected;

    @iOSXCUITFindBy(accessibility = "CANCEL")
    private WebElement cancelButton;

    @iOSXCUITFindBy(accessibility = "iconChevronLeft")
    private WebElement chevronLeft;

    @iOSXCUITFindBy(accessibility = "DISCARD")
    private WebElement discardButton;

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
        setImplicitTimeout(3, TimeUnit.SECONDS);
        element(MobileBy.AccessibilityId(valueToCheck)).shouldBeVisible();
        resetImplicitTimeout();
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
        setImplicitTimeout(3, TimeUnit.SECONDS);
        element(saveButton).shouldBeVisible();
        resetImplicitTimeout();
    }

    public void clickOnSaveButton() {
        element(saveButton).click();
    }

    public void fillInRandomTagName(String newTagName) {
        element(duplicateTagNameTextField).sendKeys(newTagName);
    }

    public void checkIfAlertsAreTurnedOn() {
        element(alertsOnSelected).shouldBeVisible();
    }

    public void switchAlertsToOff() {
        element(alertsOff).click();
    }

    public void checkIfAlertsAreTurnedOff() {
        element(alertsOffSelected).shouldBeVisible();
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
        element(MobileBy.AccessibilityId(clientName)).shouldBeVisible();
    }

    public void clickOnDiscardButton() {
        element(discardButton).click();
    }
}
