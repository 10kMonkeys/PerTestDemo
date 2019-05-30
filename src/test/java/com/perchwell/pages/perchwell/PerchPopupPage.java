package com.perchwell.pages.perchwell;

import com.perchwell.helpers.TechHelper;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PerchPopupPage extends TechHelper {

    //region WebElements

    @iOSXCUITFindBy(accessibility = "NOT NOW")
    private WebElement notNowButton;

    @iOSXCUITFindBy(accessibility ="WOULD YOU LIKE TO RECEIVE NOTIFICATIONS FROM PERCHWELL?")
    private WebElement text;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/positive_button")
    @iOSXCUITFindBy(accessibility ="YES")
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
