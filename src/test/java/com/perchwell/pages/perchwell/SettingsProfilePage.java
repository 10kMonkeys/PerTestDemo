package com.perchwell.pages.perchwell;

import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SettingsProfilePage extends BasePage {

    @iOSXCUITFindBy(accessibility = "")
    private WebElement nameTextBox;
    
        public SettingsProfilePage(WebDriver driver) {
            super(driver);
        }
}
