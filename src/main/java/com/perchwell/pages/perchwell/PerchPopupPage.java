package com.perchwell.pages.perchwell;

import com.perchwell.helpers.TechHelper;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PerchPopupPage extends TechHelper {

    //region WebElements

    @iOSFindBy(accessibility = "NOT NOW")
    private WebElement notNowButton;

    @iOSFindBy(accessibility ="WOULD YOU LIKE TO RECEIVE NOTIFICATIONS FROM PERCHWELL?")
    private WebElement text;

    @iOSFindBy(accessibility ="YES")
    private WebElement yesButton;

    //endregion

    public PerchPopupPage(WebDriver driver){
        super (driver);
    }

    public void clickOnNotNowButton() {
        element(notNowButton).click();
    }

    public void clickOnYesButton() {
        waitABit(3000);
        element(yesButton).click();
    }

    public boolean isPopupTextDispalyed() {
            return text.isDisplayed();
        }
}
