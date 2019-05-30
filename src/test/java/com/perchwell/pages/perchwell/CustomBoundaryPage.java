package com.perchwell.pages.perchwell;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomBoundaryPage extends TechHelper {

    //region WebElements

    @iOSXCUITFindBy(accessibility = "Polygon Color: #37d2be")
    private WebElement defaultPolygonColorIcon;

    @iOSXCUITFindBy(accessibility = "Color Picker: #ea6656")
    private WebElement redPolygonColorIcon;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/search_src_text")
    @iOSXCUITFindBy(accessibility = "Polygon Name TextField: Custom Boundary 1")
    private WebElement customBoundaryNameField;

    @iOSXCUITFindBy(accessibility = "iOsButtonFloatingIconAddNew")
    private WebElement cancelBoundaryDrawButton;

    @iOSXCUITFindBy(accessibility = "Circle at (32.0000534057617, 189.500045776367)")
    private WebElement newBoundarySquarePointOne;

    @iOSXCUITFindBy(accessibility = "Circle at (187.499980926514, 189.500045776367)")
    private WebElement newBoundarySquarePointTwo;

    @iOSXCUITFindBy(accessibility = "Circle at (342.999908447266, 189.500045776367)")
    private WebElement newBoundarySquarePointThree;

    @iOSXCUITFindBy(accessibility = "Circle at (342.999908447266, 345.000007629395)")
    private WebElement newBoundarySquarePointFour;

    @iOSXCUITFindBy(accessibility = "Circle at (342.999908447266, 500.499969482422)")
    private WebElement newBoundarySquarePointFive;

    @iOSXCUITFindBy(accessibility = "Circle at (187.499980926514, 500.499969482422)")
    private WebElement newBoundarySquarePointSix;

    @iOSXCUITFindBy(accessibility = "Circle at (32.0000534057617, 500.499969482422)")
    private WebElement newBoundarySquarePointSeven;

    @iOSXCUITFindBy(accessibility = "Circle at (32.0000534057617, 345.000007629395)")
    private WebElement newBoundarySquarePointEight;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/finish_save_button")
    @iOSXCUITFindBy(accessibility = "Polygon Editing Button")
    private WebElement saveButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/up_button")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name CONTAINS 'MY NEW SEARCH'")
    private WebElement backToSearchButton;

    //endregion

    public CustomBoundaryPage(WebDriver driver) {
        super(driver);
    }

    public void zoomMapOneTime() {

        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;

        Dimension size = getDriver().manage().window().getSize();
        int deviceWidth = size.width;
        int deviceHigh = size.height;

//        System.out.println("width = " + deviceWidth);
//        System.out.println("high = " + deviceHigh);

        int centerWidth = deviceWidth / 2;
        int centerHigh =  deviceHigh / 2;

        TouchAction action = new TouchAction(appiumDriver);

        action.tap(centerWidth, centerHigh).release().perform().tap(centerWidth, centerHigh).release().perform();
        waitABit(1000);
        element(cancelBoundaryDrawButton).click();
    }

    public void clickOnDefaultColorIcon() {
        element(defaultPolygonColorIcon).click();
    }

    public void selectRedColor() {
        element(redPolygonColorIcon).click();
    }

    public void setCustomBoundaryName(String name) {
        element(customBoundaryNameField).sendKeys(name);
        SessionVariables.addValueInSessionVariable("Custom_Boundary_name", name);
    }

    public void drawSquareFinishedPolygonManually() {
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;

        Dimension size = getDriver().manage().window().getSize();
        int deviceWidth = size.width;
        int deviceHigh = size.height;

        int firstAndLastPointWidth = deviceWidth / 2;
        int firstAndLastPointHigh = deviceHigh / 2;

        TouchAction action = new TouchAction(appiumDriver);

        action.tap(firstAndLastPointWidth, firstAndLastPointHigh).release().perform();
        waitABit(1000);
        action.tap(firstAndLastPointWidth + 70, firstAndLastPointHigh).release().perform();
        waitABit(1000);
        action.tap(firstAndLastPointWidth + 70, firstAndLastPointHigh + 70).release().perform();
        waitABit(1000);
        action.tap(firstAndLastPointWidth, firstAndLastPointHigh + 70).release().perform();
        waitABit(1000);
        action.tap(firstAndLastPointWidth , firstAndLastPointHigh).release().perform();
    }

    public void justDrawnFinishedPolygonIsShown() {
        element(newBoundarySquarePointOne).shouldBeVisible();
        element(newBoundarySquarePointThree).shouldBeVisible();
        element(newBoundarySquarePointFive).shouldBeVisible();
        element(newBoundarySquarePointSeven).shouldBeVisible();
    }

    public void clickOnSaveButton() {
        if(Config.isAndroid()) {
            element(saveButton).click();
            element(saveButton).click();
        } else {
            element(saveButton).click();
        }
    }

    public void clickOnBackToSearchPageButton() {
        if(Config.isAndroid()) {
            element(backToSearchButton).click();
        } else {
            WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
            WebDriver webDriver = webDriverFacade.getProxiedDriver();
            AppiumDriver appiumDriver = (AppiumDriver) webDriver;
            TouchAction action = new TouchAction(appiumDriver);

            action.tap(20, 60).release().perform();
        }
    }

    public void getCustomBoundaryName() {
        if(Config.isAndroid()) {
            SessionVariables.addValueInSessionVariable("Custom_Boundary_name", element(customBoundaryNameField).getAttribute("text"));
        }
        else {
            SessionVariables.addValueInSessionVariable("Custom_Boundary_name", element(customBoundaryNameField).getAttribute("value"));
        }
    }
}
