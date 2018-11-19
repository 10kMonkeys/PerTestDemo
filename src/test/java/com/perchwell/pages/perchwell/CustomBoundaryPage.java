package com.perchwell.pages.perchwell;

import com.perchwell.pages.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomBoundaryPage extends BasePage {

    //region WebElements

    @iOSXCUITFindBy(accessibility = "Polygon Color: #37d2be")
    private WebElement defaultPolygonColorIcon;

    @iOSXCUITFindBy(accessibility = "Color Picker: #ea6656")
    private WebElement redPolygonColorIcon;

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

    //endregion

    public CustomBoundaryPage(WebDriver driver) {
        super(driver);
    }

    public void getCenterPointOfMap() {

        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;

        Dimension size = getDriver().manage().window().getSize();
        int deviceWidth = size.width;
        int deviceHigh = size.height;

        System.out.println("width = " + deviceWidth);
        System.out.println("high = " + deviceHigh);

        int centerWidth = deviceWidth / 2;
        int centerHifh =  deviceHigh / 2;

        TouchAction action = new TouchAction(appiumDriver);

        action.tap(centerWidth, centerHifh).release().perform().tap(centerWidth, centerHifh).release().perform();
        waitABit(1000);
        element(cancelBoundaryDrawButton).click();
        action.tap(centerWidth, centerHifh).release().perform().tap(centerWidth, centerHifh).release().perform();
        waitABit(1000);
        element(cancelBoundaryDrawButton).click();
        action.tap(centerWidth, centerHifh).release().perform().tap(centerWidth, centerHifh).release().perform();
        waitABit(1000);
        element(cancelBoundaryDrawButton).click();
        action.tap(centerWidth, centerHifh).release().perform().tap(centerWidth, centerHifh).release().perform();
        waitABit(1000);
        element(cancelBoundaryDrawButton).click();
        action.tap(centerWidth, centerHifh).release().perform().tap(centerWidth, centerHifh).release().perform();
        waitABit(1000);
        element(cancelBoundaryDrawButton).click();
        action.tap(centerWidth, centerHifh).release().perform().tap(centerWidth, centerHifh).release().perform();
        waitABit(1000);
        element(cancelBoundaryDrawButton).click();
        action.tap(centerWidth, centerHifh).release().perform().tap(centerWidth, centerHifh).release().perform();


        waitABit(100000);
    }

    public void clickOnDefaultColorIcon() {
        element(defaultPolygonColorIcon).click();
    }

    public void selectRedColor() {
        element(redPolygonColorIcon).click();
    }

    public void setCustomBoundaryName(String name) {
        element(customBoundaryNameField).sendKeys(name);
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
        waitABit(1000000);
    }

    public void justDrawnFinishedPolygonIsShown() {
        element(newBoundarySquarePointOne).shouldBeVisible();
        element(newBoundarySquarePointThree).shouldBeVisible();
        element(newBoundarySquarePointFive).shouldBeVisible();
        element(newBoundarySquarePointSeven).shouldBeVisible();
    }
}
