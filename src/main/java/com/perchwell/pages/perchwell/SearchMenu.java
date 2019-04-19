package com.perchwell.pages.perchwell;

import com.perchwell.helpers.TechHelper;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class SearchMenu extends TechHelper {

    //region WebElements

    @AndroidFindBy(id = "com.perchwell.re.staging:id/title")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
    private WebElement searchMenuIcon;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/edit_search_button")
    @iOSFindBy(accessibility = "Edit Search Button")
    private WebElement editSearchButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/my_saved_searches_button")
    @iOSFindBy(accessibility = "My Saved Searches Button")
    private WebElement mySavedSearchesButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/profile_image")
    @iOSFindBy(accessibility = "Account Bar Button")
    private WebElement openAccountButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/cancel")
    @iOSFindBy(accessibility = "x")
    private WebElement crossButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/search_by_address_button")
    @iOSFindBy(accessibility = "Search By Address Button")
    private WebElement searchByAddressButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/save")
    @iOSFindBy(accessibility = "SAVE")
    private WebElement saveButton;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Sorted by')]")
    @iOSFindBy(accessibility = "Sorted by")
    private WebElement sortByTitle;

    //endregion

    public SearchMenu(WebDriver driver) {
        super(driver);
    }

    public void clickOnSearchMenuIcon() {
        element(searchMenuIcon).click();
    }

    public void clickOnEditSearchButton() {
        element(editSearchButton).click();
    }

    public void clickOnMySavedSearches() {
        element(mySavedSearchesButton).click();
    }

    public void clickOnSearchMenuIconWithPause() {
        waitFor(ExpectedConditions.visibilityOf(openAccountButton));
        this.clickOnSearchMenuIcon();
    }

    public void clickOnSearchByAddressButton() {
        element(searchByAddressButton).click();
    }

    public void shouldSeeSaveButton() {
        element(saveButton).shouldBeVisible();
    }

    public void shouldNotSeeSaveButton() {
        setImplicitTimeout(3, ChronoUnit.SECONDS);
//        Assert.assertFalse(element(saveButton).isVisible());
        Assert.assertEquals(0, getDriver().findElements(MobileBy.AccessibilityId("SAVE")).size());
        resetImplicitTimeout();
    }

    public void waitSortedBy() {
        waitFor(ExpectedConditions.visibilityOf(sortByTitle));
    }
}
