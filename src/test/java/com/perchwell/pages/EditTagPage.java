package com.perchwell.pages;

import com.perchwell.helpers.TechHelper;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditTagPage extends TechHelper {

    @iOSXCUITFindBy(accessibility = "DELETE")
    private WebElement removeButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[$name == 'DELETE'&][2]")
    private WebElement confirmButton;

    public EditTagPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnDeleteButton() {
        element(removeButton).click();
    }

    public void confirmRemoving() {
        element(confirmButton);
    }
}
