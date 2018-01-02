package com.perchwell.pages.perchwell;

import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class OpenedBuildingPage extends BasePage {

    public OpenedBuildingPage(WebDriver driver){
        super (driver);
    }
    // public static List<String> buildingAddressList = new ArrayList<String>();

    @iOSXCUITFindBy(accessibility = "DISCUSS THIS WITH YOUR CLIENT OR AGENT. WE'LL ORGANIZE YOUR MESSAGES BY PERSON & LISTING.")
    private WebElement discussThisHint;

    @iOSXCUITFindBy(accessibility = "MY TAGS")
    private WebElement myTagsLabel;


    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeButton")
    private WebElement backButton;

  @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton[1]")
    private WebElement deleteTagButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar/XCUIElementTypeStaticText[1]")
    private WebElement buildingAddress;

    @iOSXCUITFindBy(accessibility = "compare untinted")
    private WebElement compareButton;

    public void clickDiscussWithMyClientHint() { element(discussThisHint).click(); }

    public void clickMyTagsLabel() { element(myTagsLabel).click(); }

    public void clickBackButton(){ element(backButton).click(); }


    public void ckickDeleteTagButton() {
        while (element(deleteTagButton).isPresent()) {
            element(deleteTagButton).click();
        }
    }

    public void clickAddToCompareButton() {
        element(compareButton).click();
    }

    public String getBuildingAddress()  {
        return  buildingAddress.getAttribute("name");
         }

public void addBuildingAddressInSessionVariable(String buildingName, String buildingAddress) {

    Serenity.setSessionVariable(buildingName).to(buildingAddress);
}
public String getBuildingAddressFromSessionVariable(String buildingName) {
	return Serenity.sessionVariableCalled(buildingName);
}
}
