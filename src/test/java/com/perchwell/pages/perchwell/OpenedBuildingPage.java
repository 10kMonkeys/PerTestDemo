package com.perchwell.pages.perchwell;

import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OpenedBuildingPage extends BasePage {

	public OpenedBuildingPage(WebDriver driver) {
		super(driver);
	}

	@iOSXCUITFindBy(accessibility = "DISCUSS THIS WITH YOUR CLIENT OR AGENT. WE'LL ORGANIZE YOUR MESSAGES BY PERSON & LISTING.")
	private WebElement discussThisHint;

	//XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView
	@iOSXCUITFindBy(xpath = "*//XCUIElementTypeCollectionView[1]")
	private WebElement collectionForDiscussionSeach;

	@iOSXCUITFindBy(accessibility = "MY TAGS")
	private WebElement myTagsLabel;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeButton")
	private WebElement backButton;

	//@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton[1]")
	@FindBy(xpath = "//XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton[1]")
	private WebElement deleteTagButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar/XCUIElementTypeStaticText[1]")
	private WebElement buildingAddress;

	@iOSXCUITFindBy(accessibility = "compare untinted")
	private WebElement compareButton;

	@iOSXCUITFindBy(accessibility = "DISCUSS WITH CLIENT")
	private WebElement disccusWithClientOption;

	@iOSXCUITFindBy(accessibility = "SEND WITHIN PERCHWELL")
	private WebElement sendWithinPerchwell;

	@iOSXCUITFindBy(accessibility = "NEW")
	private WebElement addDiscus;

	@iOSXCUITFindBy(xpath = "*//XCUIElementTypeStaticText[@name=\"STUDIO\"][1]")
	private WebElement textStudio;


	@iOSXCUITFindBy(xpath = "*//XCUIElementTypeOther[XCUIElementTypeStaticText[@name=\"BATH\"] and XCUIElementTypeStaticText[@name=\"1\"]]")
	private WebElement bath1Text;

	@iOSXCUITFindBy(accessibility = "share")
	private WebElement shareBitton;


	public void clickAddDiscus() {
		element(addDiscus).click();
	}

	public void clickDiscussWithClientOption() {
		element(disccusWithClientOption).click();
	}

	public void clickDiscussWithMyClientHint() {
		element(discussThisHint).click();
	}

	public void clickMyTagsLabel() {
		element(myTagsLabel).click();
	}

	public void clickBackButton() {
		element(backButton).click();
	}

	public void ckickDeleteTagButton() {
		while (element(deleteTagButton).isPresent()) {
			element(deleteTagButton).click();
		}
	}

	public void clickAddToCompareButton() {
		element(compareButton).click();
	}

	public String getBuildingAddress() {
		return buildingAddress.getAttribute("name");
	}

	public void addAddressInSessionVariable(String name, String buildingAddress) {
		Serenity.setSessionVariable(name).to(buildingAddress);
	}

	public String getFromSessionVariable(String name) {
		return Serenity.sessionVariableCalled(name);
	}

	public void openExistingDuscussion(String discussionName) {
		WebElement discuss = getDriver().findElements(By.name(discussionName)).get(0);
		discuss.click();
	}

	public void openExistingDiscussionWithAgent(String discussionName) {
		List<WebElement> listCells = collectionForDiscussionSeach.findElements(By.className("XCUIElementTypeCell"));
		if (listCells.size() > 0) {
			for (WebElement desiredElement : listCells) {
				WebElement original_element = desiredElement.findElements(By.className("XCUIElementTypeStaticText")).get(0);
				String name_element = desiredElement.findElements(By.className("XCUIElementTypeStaticText")).get(0).getAttribute("name");

				if (discussionName.equalsIgnoreCase(original_element.getAttribute("name"))) {
					element(MobileBy.AccessibilityId(name_element)).click();
					break;
				}
			}
		}
	}

	public boolean duscussionIsDisplayed(String discussionName) {
		WebElement clicablElement = element(MobileBy.AccessibilityId(discussionName));
		System.out.print(clicablElement);
		return ((clicablElement != null) ? true : false);

	}

	public void clickSendWithinPerchwell() {
		element(sendWithinPerchwell).click();
	}

	public boolean isDiscussionWithMyClientDisplayed() {
		return Helper.isElementDisplayed(disccusWithClientOption);
	}

	public boolean isTextStudioDisplayed() {return Helper.isElementDisplayed(textStudio);
	}

	public boolean isText1BathDisplayed() {
		return Helper.isElementDisplayed(bath1Text);
	}

	public void clickShareButton() {
		element(shareBitton).click();
	}
}
