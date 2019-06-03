package com.perchwell.steps;

import com.perchwell.crossPlatform.Config;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.perchwell.pages.account.AccountPage;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class AccountSteps extends ScenarioSteps {

    AccountPage onPage;

    @Step
    public void clickOnClientsLabel() {
        onPage.clickOnClientsLabel();
    }

    @Step
    public void clickOnTagsLabel() {
        onPage.clickOnTagsLabel();
    }

    @Step
    public void shouldSeeOptionClient() {
        onPage.optionClientsIsDisplayed();
    }

    @Step
    public void shouldSeeOptionDiscussions() {
        onPage.optionDiscussionsIsDisplayed();
    }

    @Step
    public void shouldSeeOptionTags() {
        onPage.optionTagsIsDisplayed();
    }

    @Step
    public void shouldSeeOptionAgents() {
        onPage.optionAgentsIsDisplayed();
    }

    @Step
    public void clickOnDiscussionsLabel() {
        onPage.clickOnDiscussionsLabel();
    }

    @Step
    public void openSettingProfile() {
        onPage.clickOnSettingProfileButton();
    }

    @Step
    public void closeAccountMenu() {
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;

        if(Config.isAndroid()) {
            waitABit(1000);
            new TouchAction(appiumDriver).tap(150, 150).release().perform();
        } else {
            new TouchAction(appiumDriver).tap(60, 60).release().perform();
        }
    }
}
