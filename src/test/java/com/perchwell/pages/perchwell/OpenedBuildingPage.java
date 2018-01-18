package com.perchwell.pages.perchwell;

import com.perchwell.pages.base.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
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
	@iOSXCUITFindBy(xpath = "/XCUIElementTypeCollectionView")
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

	@iOSXCUITFindBy(accessibility = "DISCUSS WITH MY CLIENT")
	private WebElement disccusWithClientButton;

	@iOSXCUITFindBy(accessibility = "NEW")
	private WebElement addDiscus;

	public void clickAddDiscus() {
		element(addDiscus).click();
	}

	public void clickDiscussWithClientButton() {
		element(disccusWithClientButton).click();
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
		element(MobileBy.AccessibilityId(discussionName)).click();
		//WebElement clicablElement = getDiscussion(discussionName);
		//clicablElement.click();
	}

	private WebElement getDiscussion(String discussionName) {
		List<WebElement> listCells = collectionForDiscussionSeach.findElements(By.className("XCUIElementTypeCell"));
		WebElement parentCell = null;
		WebElement clicablElement = null;
		if (listCells.size() > 0) {
			System.out.print("Number + " + listCells.size());
			for (WebElement desiredElement : listCells) {
				if (desiredElement.findElements(MobileBy.AccessibilityId(discussionName)).size() != 0) {
					parentCell = desiredElement;
					break;
				}
			}
			if (parentCell != null) {
				clicablElement = parentCell.findElements(By.className("XCUIElementTypeImage")).get(0);
			}
		}
		return clicablElement;
	}

	public boolean duscussionIsDisplayed(String discussionName) {
		WebElement clicablElement = element(MobileBy.AccessibilityId(discussionName));
		System.out.print(clicablElement);

		//WebElement clicablElement = getDiscussion(discussionName);
		return ((clicablElement != null) ? true : false);

	}
}
