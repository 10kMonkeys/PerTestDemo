package com.perchwell.helpers;

import com.perchwell.crossPlatform.Config;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebElement;

import java.time.Duration;
import java.util.HashMap;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public abstract class Helper {

   public static void swipeVertical(AppiumDriver driver, double startPercentage, double finalPercentage, double anchorPercentage, int duration) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * finalPercentage * (-1));

        new TouchAction(driver).longPress(anchor, startPoint).moveTo(10, endPoint).release().perform();
//        new TouchAction(driver).press(anchor, startPoint).waitAction(Duration.ofMillis(duration)).moveTo(10, endPoint).release().perform();
    }

    public static void swipeHorizontal(AppiumDriver driver, double startPercentage, double finalPercentage, double anchorPercentage, int duration) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * finalPercentage * (-1));
        new TouchAction(driver).press(startPoint, anchor).waitAction(Duration.ofSeconds(duration)).moveTo(endPoint, 0).release().perform();
    }

    public static void swipeHorizontalAndroid(AppiumDriver driver, double startPercentage, double finalPercentage, double anchorPercentage) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * finalPercentage);
        new TouchAction(driver).longPress(startPoint, anchor).moveTo(endPoint, 0).release().perform();
    }

    public static void swipeHorizontalWithSetY(AppiumDriver driver, double startPercentage, double finalPercentage, int y, int duration) throws Exception {

        Dimension size = driver.manage().window().getSize();
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * finalPercentage/* * (-1)*/);

        new TouchAction(driver).longPress(startPoint, y).moveTo(endPoint, y).release().perform();
//        new TouchAction(driver).press(startPoint, y).waitAction(Duration.ofSeconds(duration)).moveTo(endPoint, 0).release().perform();
    }

    public static void swipeHorizontalWithSetYAndroid(AppiumDriver driver, double startPercentage, double finalPercentage, int y) throws Exception {

        Dimension size = driver.manage().window().getSize();
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * finalPercentage);
        new TouchAction(driver).press(startPoint, y).waitAction(Duration.ofSeconds(1)).moveTo(endPoint, y).release().perform();
    }

    public static void swipeVerticalAndroid(AppiumDriver driver, double startPercentage, double finalPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * finalPercentage);
        new TouchAction(driver).longPress(anchor, startPoint).moveTo(anchor, endPoint).release().perform();
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

    public static void swipeRightElementWithSetY(WebElement element, int y) throws Exception {
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;

        if (element.isDisplayed()) {
            swipeHorizontalWithSetY(appiumDriver, 0.9, 0.5, y, 1);
        }
    }

    public static boolean swipeRightElementWithSetY(String elementName, int y) throws Exception {

        By byElement = MobileBy.iOSNsPredicateString("name == '" + elementName + "' AND visible==1");
        boolean isFoundTheElement = getDriver().findElements(byElement).size() > 0;
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;
        if (isFoundTheElement) {
            swipeHorizontalWithSetY(appiumDriver, 0.9, 0.5, y, 1);
            isFoundTheElement = getDriver().findElements(byElement).size() > 0;

        }
        return isFoundTheElement;
    }

    public static boolean swipeRightElementWithSetYAndroid(String elementName, int y) throws Exception {

        By byElement = MobileBy.xpath("//*[contains(@text,'" + elementName + "')]");
        boolean isFoundTheElement = getDriver().findElements(byElement).size() > 0;
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;
        if (isFoundTheElement) {
            swipeHorizontalWithSetYAndroid(appiumDriver, 0.9, 0.5, y);
            isFoundTheElement = getDriver().findElements(byElement).size() > 0;

        }
        return isFoundTheElement;
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
        } catch (Exception e) {
            return false;
        }
    }

    public static void swipeDownUntilElementVisible(String elementName) throws Exception {
        int counter = 0;
        By byElement = MobileBy.iOSNsPredicateString("name == '" + elementName + "' AND visible==1");
        boolean isFoundTheElement = getDriver().findElements(byElement).size() > 0;
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();

        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;
        while (!(isFoundTheElement) && counter < 10) {

            swipeVertical(appiumDriver, 0.9, 0.2, 0.5, 1);

            isFoundTheElement = getDriver().findElements(byElement).size() > 0;
            counter += 1;
        }
    }

    public static void swipeDownUntilElementVisible(WebElement element) {
        int counter = 0;
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;

        while (!(isElementDisplayed(element)) && counter < 10) {
            swipeVertical(appiumDriver, 0.8, 0.2, 0.5, 1);
            counter += 1;
        }
    }

    public static void androidSwipeDownUntilElementVisible(WebElement element) {
        int counter = 0;
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;

        while (!(isElementDisplayed(element)) && counter < 10) {
            swipeVerticalAndroid(appiumDriver, 0.8, 0.2, 0.5);
            counter += 1;
        }
    }

    public static void scrollToElement(WebElement elementForSearch) {
        RemoteWebElement element = (RemoteWebElement) elementForSearch;
        //RemoteWebElement element = (RemoteWebElement)getDriver().findElement(By.name(name));
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        String elementID = element.getId();
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("element", elementID);
        scrollObject.put("toVisible", "not an empty string");
        js.executeScript("mobile:scroll", scrollObject);
    }

    public static String getDriverFromProperty() {
        EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
        return variables.getProperty("appium.platformName");
    }

    public static String removeChar(String s, char charToRemove) {
        String newString = "";
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) != charToRemove) {
                newString += s.charAt(i);
            }
        }
        return newString;
    }

    public static void swipeRightElementABitWithSetY(int y) {
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;

        swipeVertical(appiumDriver, 0.9, 0.899, y, 1);
    }

    public static void swipeDownUntilElementVisibleForCharButtons(WebElement element) throws Exception {
        int counter = 0;
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;

        while (!isElementDisplayed(element) && counter < 10) {
            swipeVertical(appiumDriver, 0.8, 0.2, 0.5, 1);
            counter += 1;
        }
    }


    public static void androidSwipeDownUntilElementVisible(String elementName) {
        int counter = 0;
        By byElement = MobileBy.xpath("//*[contains(@text, '" + elementName + "')]");
        boolean isFoundTheElement = getDriver().findElements(byElement).size() > 0;
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();

        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;
        while (!(isFoundTheElement) && counter < 10) {

            swipeVerticalAndroid(appiumDriver, 0.8, 0.2, 0.5);

            isFoundTheElement = getDriver().findElements(byElement).size() > 0;
            counter += 1;
        }
    }

    public static void swipeDownUntilElementVisibleForCharButtonsIPad(WebElement element) throws Exception {
        int counter = 0;
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;

        while (!(isElementDisplayed(element)) && counter < 10) {
            swipeVertical(appiumDriver, 0.5, 0.3, 0.5, 1);
            counter += 1;
        }
    }

    public static void universalVerticalSwipe(WebElement element) {
        int counter = 0;
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;

        if(Config.isAndroid()) {
            while (!(isElementDisplayed(element)) && counter < 10) {
                swipeVerticalAndroid(appiumDriver, 0.8, 0.2, 0.5);
                counter += 1;
            }
        } else {
            while (!(isElementDisplayed(element)) && counter < 10) {
                swipeVertical(appiumDriver, 0.8, 0.2, 0.5, 1);
                counter += 1;
            }
        }
    }

    public static void universalVerticalShortSwipe(WebElement element) {
        int counter = 0;
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;

        if(Config.isAndroid()) {
            while (!(isElementDisplayed(element) && counter < 10)) {
                swipeVerticalAndroid(appiumDriver, 0.8, 0.2, 0.5);
                counter += 1;
            }
        } else {
            while (!(isElementDisplayed(element) && counter < 10)) {
                swipeVertical(appiumDriver, 0.4, 0.1, 0.5, 1);
                counter += 1;
            }
        }
    }

    public static void universalHorizontalSwipe(WebElement element, int y) throws Exception {
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;

        if(Config.isAndroid()) {
            swipeHorizontalWithSetYAndroid(appiumDriver, 0.9, 0.5, y);
            } else {
            swipeHorizontalWithSetY(appiumDriver, 0.9, 0.5, y, 1);
        }
    }

    public static void universalSingleSwipe() {
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;

        if(Config.isAndroid()) {
            swipeVerticalAndroid(appiumDriver, 0.8, 0.2, 0.5);
        } else {
            swipeVertical(appiumDriver, 0.8, 0.2, 0.5, 1);
        }
    }
}
