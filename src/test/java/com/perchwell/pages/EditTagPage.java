package com.perchwell.pages;

import com.perchwell.data.SearchRequests;
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

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[$name == 'DELETE'$][1]")
    private WebElement confirmButton;

    @iOSXCUITFindBy(accessibility = "SAVE")
    private WebElement saveButton;

    @iOSXCUITFindBy(accessibility = "Tag Name textField")
    private WebElement tagNameTextField;

    public EditTagPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnDeleteButton() {
        element(removeButton).click();
    }

    public void confirmRemoving() {
        element(confirmButton).click();
    }

    public void checkTagsItemsAmount(String valueToCheck) {
        setImplicitTimeout(3, TimeUnit.SECONDS);
        element(MobileBy.AccessibilityId(valueToCheck)).shouldBeVisible();
        resetImplicitTimeout();
    }

    public void checkIfSaveButtonIsDisabled() {
        setImplicitTimeout(3, TimeUnit.SECONDS);
        element(saveButton).shouldNotBeVisible();
        resetImplicitTimeout();
    }

    public void changeTagName() {
        String newTagName = RandomGenerator.getRandomString("TAGNAME");
        SessionVariables.addValueInSessionVariable("Renamed_Tag", newTagName);

        element(tagNameTextField).clear();
        element(tagNameTextField).sendKeys(newTagName);
    }

    public void checkIfSaveButtonIsEnabled() {
        setImplicitTimeout(3, TimeUnit.SECONDS);
        element(saveButton).shouldBeVisible();
        resetImplicitTimeout();
    }

    public void clickOnSaveButton() {
        element(saveButton).clear();
    }

    public void shouldSeeTestClient() {
        element(MobileBy.AccessibilityId(SearchRequests.CLIENT0_TEST)).shouldBeVisible();
    }

    public void checkClientTagsItemsAmount() {
        element(MobileBy.AccessibilityId(SessionVariables.getValueFromSessionVariable("Clients_Items_Amount"))).shouldBeVisible();
    }

    public void changeBackTestClientsName() {
        element(tagNameTextField).clear();
        element(tagNameTextField).sendKeys(SearchRequests.CLIENT0_TEST);
    }
}
