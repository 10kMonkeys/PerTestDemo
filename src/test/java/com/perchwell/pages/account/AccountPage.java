package com.perchwell.pages.account;

import com.perchwell.pages.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage extends BasePage {


    public AccountPage(WebDriver driver){
        super (driver);
    }

    @iOSXCUITFindBy(accessibility = "CLIENTS")
    private WebElement clientLabel;

    @iOSXCUITFindBy(accessibility = "TAGS")
    private WebElement tagsLabel;

    public void clickClientsLabel() { element(clientLabel).click(); }

    public void clickTagsLabel() { element(tagsLabel).click(); }
}
