package com.perchwell.steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.perchwell.pages.account.AccountPage;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;

import static io.appium.java_client.touch.offset.PointOption.point;

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
    public void clickOnCompareLabel() {
        onPage.clickOnCompareLabel();
    }

    @Step
    public void shouldSeeOptionClient() {
        onPage.optionClientsIsDisplayed();
    }

    @Step
    public void shouldSeeOptionCompare() {
        onPage.optionCompareIsDisplayed();
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

        new TouchAction(appiumDriver).tap(point(60,60)).release().perform();
    }
}
