package com.perchwell.pages;

import com.perchwell.helpers.RandomGenerator;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EditTagPage extends TechHelper {

    @iOSXCUITFindBy(accessibility = "DELETE")
    private WebElement removeButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[$name == 'DELETE'$][1]")
    private WebElement confirmButton;

    @iOSXCUITFindBy(accessibility = "DUPLICATE")
    private WebElement duplicateButton;

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'EDIT TAG' AND visible == 1")
    private WebElement editTagLabel;

    private WebElement cancelButton;

    private WebElement saveButton;

    private WebElement duplicateTagNameTextField;

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
        element(cancelButton).click();
    }

    public void clickOnSaveButton() {
        element(saveButton).click();
    }

    public void fillInRandomTagName(String newTagName) {
        element(duplicateTagNameTextField).sendKeys(newTagName);
    }
}
