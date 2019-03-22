package com.perchwell.pages.perchwell;

import com.perchwell.helpers.TechHelper;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

public class BuildingSearchPage extends TechHelper {

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'BUILDING ADDRESS: '")
    private List<WebElement> buildingAddressesList;

    @iOSXCUITFindBy(accessibility = "Tag Cell: Search Text Field")
    private WebElement addressSearchField;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/up_button")
    @iOSXCUITFindBy(accessibility = "MY NEW SEARCH")
    private WebElement backButtonFromBuildingSearch;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    private WebElement firstBuilding;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeImage[$name CONTAINS 'buildingSelectionIndicator'$][1]")
    private WebElement firstSelectedBuildingIcon;

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Remove Button: '")
    private List<WebElement> removePillsIconList;

    public BuildingSearchPage(WebDriver driver) {
        super(driver);
    }

    public void checkIfListOfBuildingsReturned(int amount) {
        for (int i = 0; i < amount; i++) {
            Assert.assertEquals(SearchPage.listOfBuildingAddresses.get(i), buildingAddressesList.get(i).getAttribute("value"));
        }
    }

    public void fillInSearchField(String value) {
        element(addressSearchField).sendKeys(value);
    }

    public void clickOnBackFromBuildingSearchPage() {
        element(backButtonFromBuildingSearch).click();
    }

    public void clickOnFirstBuilding() {
        element(firstBuilding).click();
    }

    public void checkFirstBuildingIsSelected() {
        element(firstSelectedBuildingIcon).shouldBeVisible();
    }

    public void checkBuildingPillIsDisplayed(String address) {
        element(MobileBy.iOSClassChain("**/XCUIElementTypeOther[$name BEGINSWITH 'tag color: #'$]" +
                "/XCUIElementTypeOther/XCUIElementTypeStaticText[$name='" + address + "'$]")).shouldBeVisible();
    }

    public void checkFirstBuildingIsNotSelected() {
        setImplicitTimeout(3, SECONDS);
        element(firstSelectedBuildingIcon).shouldNotBeVisible();
        resetImplicitTimeout();
    }

    public void checkBuildingPillIsNotDisplayed(String address) {
        setImplicitTimeout(3, SECONDS);
        element(MobileBy.iOSClassChain("**/XCUIElementTypeOther[$name BEGINSWITH 'tag color: #'$]" +
                "/XCUIElementTypeOther/XCUIElementTypeStaticText[$name='" + address + "'$]")).shouldNotBeVisible();
        resetImplicitTimeout();
    }

    public void removeBuildingPill(String address) {
        element(MobileBy.AccessibilityId("Remove Button: " + address)).click();
    }

    public void checkNoOnePillIsShown() {
        Assert.assertEquals(0, removePillsIconList.size());
    }
}
