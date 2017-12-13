package com.perchwell.pages.perchwell;

import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.perchwell.pages.base.BasePage;


public class PerchPopupPage extends BasePage {

    public PerchPopupPage(WebDriver driver){super (driver);}

    @iOSXCUITFindBy(accessibility = "NOT NOW")
    private WebElement notNowButton;

    public void clickNotNowButton() { element(notNowButton).click(); }
}
