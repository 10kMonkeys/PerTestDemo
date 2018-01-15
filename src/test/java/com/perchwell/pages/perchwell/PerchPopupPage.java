package com.perchwell.pages.perchwell;

import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.perchwell.pages.base.BasePage;


public class PerchPopupPage extends BasePage {

public PerchPopupPage(WebDriver driver){super (driver);}

@iOSXCUITFindBy(accessibility = "NOT NOW")
private WebElement notNowButton;

@iOSXCUITFindBy(accessibility ="WOULD YOU LIKE TO RECEIVE NOTIFICATIONS FROM PERCHWELL?")
private WebElement text;

public void clickNotNowButton() {element(notNowButton).click(); }

public boolean popupTextIsDispalyed() {
        return text.isDisplayed();
    }


}
