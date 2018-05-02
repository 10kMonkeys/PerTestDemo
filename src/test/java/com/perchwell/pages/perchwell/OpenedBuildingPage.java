package com.perchwell.pages.perchwell;

import com.perchwell.helpers.Helper;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OpenedBuildingPage extends BasePage {

	//region WebElements

	@iOSXCUITFindBy(accessibility = "DISCUSS THIS WITH YOUR CLIENT OR AGENT. WE'LL ORGANIZE YOUR MESSAGES BY PERSON & LISTING.")
	private WebElement discussThisHint;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView[1]")
	private WebElement collectionForDiscussionSerach;

	@iOSXCUITFindBy(accessibility = "MY TAGS")
	private WebElement myTagsLabel;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeButton")
	private WebElement backButton;

	@iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeButton' AND name CONTAINS 'DeleteTagBubbleButton'")
	private WebElement deleteTagButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar/XCUIElementTypeStaticText[1]")
	private WebElement buildingAddress;

	@iOSXCUITFindBy(accessibility = "compare untinted")
	private WebElement compareButton;

	@iOSXCUITFindBy(accessibility = "SEND WITHIN PERCHWELL")
	private WebElement disccusWithClientOption;

	@iOSXCUITFindBy(accessibility = "SEND WITHIN PERCHWELL")
	private WebElement sendWithinPerchwell;

	@iOSXCUITFindBy(accessibility = "NEW")
	private WebElement addDiscus;

	@iOSXCUITFindBy(accessibility = "STUDIO")
	private WebElement textStudio;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
	private WebElement bath1Text;

	@iOSXCUITFindBy(accessibility = "share")
	private WebElement shareBitton;

	@iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeOther' AND name CONTAINS 'FEATURES & AMENITIES'")
	private WebElement featuresAmenities;

	@iOSXCUITFindBy(accessibility = "FIREPLACE")
	private WebElement FIREPLACE;

	@iOSXCUITFindBy(accessibility = "SELLER'S AGENTS")
	private WebElement severalSellersAgentsSection;

	@iOSXCUITFindBy(accessibility = "SELLER'S AGENT")
	private WebElement oneSellerAgentSection;

	@iOSXCUITFindBy(accessibility = "Constant client")
    private WebElement clientWithDiscussion;

	@iOSXCUITFindBy(accessibility = "VIEW ALL DISCUSSIONS FOR THIS LISTING")
    private WebElement viewAllDiscussionsButton;

	//endregion

	public OpenedBuildingPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnAddDiscus() {
		element(addDiscus).click();
	}

	public void clickOnDiscussWithClientOption() {
		element(disccusWithClientOption).click();
	}

	public void clickOnDiscussWithMyClientHint() {
		element(discussThisHint).click();
	}

	public void clickOnMyTagsLabel() {
		element(myTagsLabel).click();
	}

	public void clickOnBackButton() {
		element(backButton).click();
	}

	public void clickOnDeleteTagButton() {
		while (element(deleteTagButton).isPresent()) {
			element(deleteTagButton).click();
		}
	}

	public void clickOnAddToCompareButton() {
		element(compareButton).click();
	}

	public String getBuildingAddress() {
		return buildingAddress.getAttribute("name");
	}

	public void openExistingDiscussion(String discussionName) {
		element(MobileBy.AccessibilityId(discussionName)).click();
	}

	public void openExistingDiscussionWithAgent(String discussionName) {
		List<WebElement> listCells = collectionForDiscussionSerach.findElements(By.className("XCUIElementTypeCell"));
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

	public void discussionIsDisplayed(String discussionName) {
		element(MobileBy.AccessibilityId(discussionName)).shouldBeVisible();
	}

	public void clickOnSendWithinPerchwell() {
		element(sendWithinPerchwell).click();
	}

	public void isDiscussionWithMyClientDisplayed() {
		Assert.assertTrue(Helper.isElementDisplayed(disccusWithClientOption));
	}

	public void isTextStudioDisplayed() {
		Assert.assertTrue(Helper.isElementDisplayed(textStudio));
	}

	public void isText1BathDisplayed() {
		Assert.assertTrue(Helper.isElementDisplayed(bath1Text));
	}

	public void clickOnShareButton() {
		element(shareBitton).click();
	}

	public void isBuildingOpen() {
		element(myTagsLabel).shouldBeVisible();
	}

	public void clickFeaturesAmenities() throws Exception {
	//	Helper.swipeDownUntilElementVisible(featuresAmenities);
	//Helper.scrollToElement(featuresAmenities);
		WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
		WebDriver webDriver = webDriverFacade.getProxiedDriver();
		AppiumDriver appiumDriver = (AppiumDriver) webDriver;
		Helper.swipeVertical(appiumDriver, 0.8, 0.2, 0.5, 1);
		element(featuresAmenities).click();
	}

	public void isFireplaceDisplayed() {
		Helper.scrollToElement(FIREPLACE);
		element(FIREPLACE).shouldBeVisible();
	}

	public WebElement getOneSellersAgentElement() {
		return oneSellerAgentSection;
	}

	public void swipeDownUntilElementVisible(WebElement name) throws Exception {
		Helper.swipeDownUntilElementVisible(name);
	}

	public boolean isSeveralSellersAgentsPresent() {
		return element(severalSellersAgentsSection).isPresent();
	}

	public boolean isOneSellersAgent() {
		return element(oneSellerAgentSection).isPresent();
	}

	public void clickOnOneSellersAgentSection() {
		element(oneSellerAgentSection).click();
	}

	public boolean isClientWithDiscussionExist() {
	    boolean isClientWithDiscussion = false;

	    if (element(clientWithDiscussion).isVisible()) {
	        isClientWithDiscussion = true;
        }
        return isClientWithDiscussion;
    }

	public void clickOnViewAllDiscussionsButton() {
	    element(viewAllDiscussionsButton).click();
    }

	public void isBuildingAddressDisplayed() {
		Assert.assertTrue(getBuildingAddress()
				.equalsIgnoreCase(SessionVariables.getValueFromSessionVariable("buildingAddress")));
	}
}
