package com.perchwell.pages.perchwell;

import com.perchwell.helpers.RandomGenerator;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SettingsProfilePage extends BasePage {

    @iOSXCUITFindBy(accessibility = "UserNameTextField")
    private WebElement nameTextBox;

    @iOSXCUITFindBy(accessibility = "UserCompanyTextField")
    private WebElement companyTextBox;

    @iOSXCUITFindBy(accessibility = "SAVE")
    private WebElement saveButton;

    @iOSXCUITFindBy(accessibility = "OK")
    private WebElement okButton;
    
    public SettingsProfilePage(WebDriver driver) {
            super(driver);
    }

    public void saveButtonClick(){
        element(saveButton).click();
    }

    public void fillInNameTextBox(String name){
        element(nameTextBox).type(name);
    }

    public void fillInCompanyTextBox(String company){
        element(companyTextBox).type(company);
    }

    public String nameProfile(){
        return element(nameTextBox).getText();
    }

    public String companyProfile(){
        return element(companyTextBox).getText();
    }

    public void okButtonClick(){
        element(okButton).click();
    }
}
