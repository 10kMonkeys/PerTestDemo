package com.perchwell.helpers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.*;

import java.time.Duration;

import static java.util.concurrent.TimeUnit.SECONDS;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public abstract class  Helper {

    private static void swipeVertical(AppiumDriver driver, double startPercentage, double finalPercentage, double anchorPercentage, int duration) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * finalPercentage);
        new TouchAction(driver).press(anchor, startPoint).waitAction(Duration.ofSeconds(duration)).moveTo(10, endPoint).release().perform();

    }

    public static void swipeHorizontal(AppiumDriver driver, double startPercentage, double finalPercentage, double anchorPercentage, int duration) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * finalPercentage*(-1));
        new TouchAction(driver).press(startPoint, anchor).waitAction(Duration.ofSeconds(duration)).moveTo(endPoint,0).release().perform();
    }

    @Deprecated
    public void swipeRightUntilElementVisible(WebElement element) throws Exception {

        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;
        while (!element.isDisplayed()) {

            this.swipeHorizontal(appiumDriver, 0.9, 0.5, 0.7, 1);

        }
    }

    public static boolean swipeRightUntilElementVisible(String elementName) throws Exception {

        By byElement = MobileBy.iOSNsPredicateString("name == '" + elementName + "' AND visible==1");
        boolean isFoundTheElement = getDriver().findElements(byElement).size() > 0;
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;
        while (!isFoundTheElement) {

            swipeHorizontal(appiumDriver, 0.9, 0.5, 0.7, 1);
            isFoundTheElement = getDriver().findElements(byElement).size() > 0;

        }
        return isFoundTheElement;
    }

    public static boolean isElementDisplayed(WebElement element) {
              try {
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public static void swipeDownUntilElementVisible(String elementName) throws Exception {

        By byElement = MobileBy.iOSNsPredicateString("name == '" + elementName + "' AND visible==1");
        boolean isFoundTheElement = getDriver().findElements(byElement).size() > 0;
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;

        while (!isFoundTheElement) {

            swipeVertical(appiumDriver, 0.9, 0.2, 0.5, 1);

            isFoundTheElement = getDriver().findElements(byElement).size() > 0;

        }
    }

    public static void swipeDownUntilElementVisible(WebElement element) throws Exception {
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;

        while (!element.isDisplayed()) {

            swipeVertical(appiumDriver, 0.9, 0.2, 0.5, 1);

        }
    }

    public static  void clickByCoordinates(double yCoordinate, double xCoordinate) {

        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;

        Dimension size = appiumDriver.manage().window().getSize();
        int width = (int) (size.width * xCoordinate);
        int height = (int) (size.height * yCoordinate);
        getDriver().manage().timeouts().setScriptTimeout(6,SECONDS);
        new TouchAction(appiumDriver).press(width, height).perform();
    }
}
