package com.perchwell.pages.account;

import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage extends BasePage {

    @iOSXCUITFindBy(accessibility = "CLIENTS")
    private WebElement clientLabel;

    @iOSXCUITFindBy(accessibility = "TAGS")
    private WebElement tagsLabel;

    @iOSXCUITFindBy(accessibility = "DISCUSSIONS")
    private WebElement discussionsLabel;


    @iOSXCUITFindBy(accessibility = "COMPARE")
    private WebElement compareLabel;

    @iOSXCUITFindBy(accessibility = "AGENTS")
    private WebElement agentsLabel;


    public AccountPage(WebDriver driver){
        super (driver);
    }


    public void clickClientsLabel() { element(clientLabel).click(); }

    public void clickTagsLabel() { element(tagsLabel).click(); }


    public boolean optionTagsIsDispalyed() {
        return tagsLabel.isDisplayed();
    }

    public boolean optionCompareIsDispalyed() {
        return compareLabel.isDisplayed();
    }

    public boolean optionDiscussionsIsDispalyed() {
        return discussionsLabel.isDisplayed();
    }

    public boolean optionClientsIsDispalyed() {
        return clientLabel.isDisplayed();
    }

    public boolean optionAgentsIsDispalyed() {
        return agentsLabel.isDisplayed();
    }

}
