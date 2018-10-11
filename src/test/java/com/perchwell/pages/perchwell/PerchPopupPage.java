package com.perchwell.pages.perchwell;

import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.perchwell.pages.base.BasePage;


public class PerchPopupPage extends BasePage {

    //region WebElements

    @iOSXCUITFindBy(accessibility = "NOT NOW")
    private WebElement notNowButton;

    @iOSXCUITFindBy(accessibility ="WOULD YOU LIKE TO RECEIVE NOTIFICATIONS FROM PERCHWELL?")
    private WebElement text;

    //endregion

    public PerchPopupPage(WebDriver driver){
        super (driver);
    }

    public void clickOnNotNowButton() {
        element(notNowButton).click();
    }

    public boolean isPopupTextDispalyed() {
            return text.isDisplayed();
        }
}
