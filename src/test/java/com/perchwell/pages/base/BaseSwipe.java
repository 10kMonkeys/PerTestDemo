package com.perchwell.pages.base;

import com.perchwell.helpers.Helper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseSwipe extends BasePage{
    public BaseSwipe(WebDriver driver){
        super(driver);
    }

    public void swipeDownUntilElementVisible(String elementName) throws Exception {

        By byElement = MobileBy.iOSNsPredicateString("name == '" + elementName + "' AND visible==1");

        boolean isFoundTheElement = getDriver().findElements(byElement).size() > 0;

        while (!isFoundTheElement) {

            WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
            WebDriver webDriver = webDriverFacade.getProxiedDriver();
            AppiumDriver appiumDriver = (AppiumDriver) webDriver;

            Helper.swipeVertical(appiumDriver, 0.9, 0.2, 0.5, 1);

            isFoundTheElement = getDriver().findElements(byElement).size() > 0;

        }
    }

    public void swipeDownUntilElementVisible(WebElement element) throws Exception {

        while (!element.isDisplayed()) {
            WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
            WebDriver webDriver = webDriverFacade.getProxiedDriver();
            AppiumDriver appiumDriver = (AppiumDriver) webDriver;
            Helper.swipeVertical(appiumDriver, 0.9, 0.2, 0.5, 1);

        }
    }

public void swipeRightUntilElementVisible(WebElement element) throws Exception {

    while  (!element.isDisplayed()) {

        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;
        Helper.swipeHorizontal(appiumDriver, 0.9, 0.5, 0.7, 1);

    }
}

	public boolean swipeRightUntilElementVisible(String elementName) throws Exception {

    By byElement = MobileBy.iOSNsPredicateString("name == '" + elementName + "' AND visible==1");

    boolean isFoundTheElement = getDriver().findElements(byElement).size() > 0;

    while (!isFoundTheElement) {

        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;
        Helper.swipeHorizontal(appiumDriver, 0.9, 0.5, 0.7, 1);
        isFoundTheElement = getDriver().findElements(byElement).size() > 0;

    }
    return isFoundTheElement;
}

}
