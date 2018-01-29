package com.perchwell.pages.perchwell;

import com.perchwell.helpers.RandomGenerator;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SettingsProfilePage extends BasePage {

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeTextField[1]")
    private WebElement nameTextBox;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeTextField[2]")
    private WebElement companyTextBox;

    @iOSXCUITFindBy(accessibility = "SAVE")
    private WebElement saveButton;
    
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
}
