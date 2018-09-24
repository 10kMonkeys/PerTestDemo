package com.perchwell.pages.perchwell;

import com.perchwell.crossPlatform.Config;
import com.perchwell.data.Filters;
import com.perchwell.helpers.Helper;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.List;

public class OpenedBuildingPage extends BasePage {

	private List<String> initialBedsAndBathsAmountList = new ArrayList<>();

	//region WebElements

	@iOSXCUITFindBy(accessibility = "DISCUSS THIS WITH YOUR CLIENT OR AGENT. WE'LL ORGANIZE YOUR MESSAGES BY PERSON & LISTING.")
	private WebElement discussThisHint;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView[1]")
	private WebElement collectionForDiscussionSerach;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/my_tags")
	@iOSXCUITFindBy(accessibility = "MY TAGS")
	private WebElement myTagsLabel;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/up_button")
	@iOSXCUITFindBy(accessibility = "ListingViewBackButton")
	private WebElement arrowBackButtonFromListing;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")
	@iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeButton' AND name CONTAINS 'DeleteTagBubbleButton'")
	private WebElement deleteTagButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/title")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar/XCUIElementTypeStaticText[1]")
	private WebElement buildingAddress;

	@iOSXCUITFindBy(accessibility = "Compare Bar Button")
	private WebElement compareButton;

	@AndroidFindBy(xpath = "//*[@text='SEND WITHIN PERCHWELL']")
	@iOSXCUITFindBy(accessibility = "SEND WITHIN PERCHWELL")
	private WebElement disccusWithClientOption;

	@AndroidFindBy(xpath = "//*[@text='SEND WITHIN PERCHWELL']")
	@iOSXCUITFindBy(accessibility = "SEND WITHIN PERCHWELL")
	private WebElement sendWithinPerchwell;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/new_client")
	@iOSXCUITFindBy(accessibility = "NEW")
	private WebElement addDiscus;

	@iOSXCUITFindBy(accessibility = "STUDIO")
	private WebElement textStudio;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
	private WebElement bath1Text;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/share")
	@iOSXCUITFindBy(accessibility = "share")
	private WebElement shareBitton;

	@AndroidFindBy(xpath = "//*[@text='FEATURES & AMENITIES']")
	@iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS 'FEATURES & AMENITIES'")
	private WebElement featuresAmenities;

	@iOSXCUITFindBy(accessibility = "FIREPLACE")
	private WebElement FIREPLACE;

	@iOSXCUITFindBy(accessibility = "SELLER'S AGENTS")
	private WebElement severalSellersAgentsSection;

	@iOSXCUITFindBy(accessibility = "SELLER'S AGENT")
	private WebElement oneSellerAgentSection;

	@AndroidFindBy(xpath = "//*[contains(@text,'CLIENT TEST+CLIENT0')]")
	@iOSXCUITFindBy(accessibility = "CLIENT TEST+CLIENT0")
    private WebElement clientWithDiscussion;

	@AndroidFindBy(xpath = "//*[contains(@text,'TEST TEST-IOS+MGMT-CORE@PERCHWELL.COM')]")
	@iOSXCUITFindBy(accessibility = "Test test-ios+mgmt-core@perchwell.com")
	private WebElement agentWithDiscussion;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/view_all_discussions")
	@iOSXCUITFindBy(accessibility = "VIEW ALL DISCUSSIONS FOR THIS LISTING")
    private WebElement viewAllDiscussionsButton;

	@AndroidFindBy(xpath = "//*[@text='LAUNDRY - BUILDING']")
	@iOSXCUITFindBy(accessibility = "LAUNDRY - BUILDING")
	private WebElement LaundryBLDGD;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/title")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar/XCUIElementTypeStaticText[1]")
	private WebElement buildAddress;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/negative_button")
	@iOSXCUITFindBy(accessibility = "CANCEL")
	private WebElement cancelButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/negative_button")
	@iOSXCUITFindBy(accessibility = "CANCEL")
	private WebElement cancelButtonInDiscussWithClient;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeImage")
	private WebElement listingMap;

	@iOSXCUITFindBy(accessibility = "Listing Preview Search TextField")
	private WebElement listingsSearchField;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH 'INFO'")
	private List<WebElement> currentBedsAndBathsAmountList;

	@iOSXCUITFindBy(accessibility = "Clear text")
	private WebElement clearFieldButton;

	@iOSXCUITFindBy(accessibility = "DISCUSS THIS WITH YOUR CLIENT OR AGENT. WE'LL ORGANIZE YOUR MESSAGES BY PERSON & LISTING.")
	private WebElement discussWithClientHint;

	@iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS '#TEST'")
	//	@iOSXCUITFindBy(accessibility = "240 EAST 35TH ST. #TEST")
//	@iOSXCUITFindBy(accessibility = "ADDRESS-61 WEST 62ND ST. #TEST")
	private WebElement testListing;

	@iOSXCUITFindBy(accessibility = "MORE")
	private WebElement moreButton;

	@iOSXCUITFindBy(xpath = "*//XCUIElementTypeTable/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
	private WebElement neighborhoodValue;

	@iOSXCUITFindBy(xpath = "//*[contains(@name, 'NEIGHBORHOOD')]")
	private List<WebElement> neighborhoodValueList;

	@iOSXCUITFindBy(accessibility = "Segmented Control: MORE IN BUILDING")
	private WebElement moreInBuildingSection;

	@iOSXCUITFindBy(accessibility = "Segmented Control: SIMILAR LISTINGS")
	private WebElement similarListingsSection;

	@iOSXCUITFindBy(accessibility = "Nav Back White")
	private WebElement backFromTagsButton;

	@iOSXCUITFindBy(accessibility = "BuildingViewBackButton")
	private WebElement buildingViewBackButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[$name != 'Table View Cell: Show More' AND name BEGINSWITH 'Table View Cell'$][-1]")
	private WebElement lastListing;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[$name != 'Table View Cell: Show More' AND name BEGINSWITH 'Table View Cell'$]")
	private List<WebElement> listingsList;

	@iOSXCUITFindBy(iOSNsPredicate = "name == 'InContractBanner'")
	private WebElement inContractBanner;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Banner'")
	private WebElement banner;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther/XCUIElementTypeImage[$name BEGINSWITH 'RIBBON'$]")
	private List<WebElement> bannerList;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[$name BEGINSWITH 'Table View Cell' AND visible==1$]/XCUIElementTypeOther/XCUIElementTypeImage[$!name CONTAINS 'Banner'$]")
	private List<WebElement> imagesList;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$name BEGINSWITH 'PRICE'$]")
	private List<WebElement> pricesList;

	@iOSXCUITFindBy(accessibility = "Listing Preview Sort ButtonListing Preview Sort Button: 0")
	private WebElement sortButton;

	@iOSXCUITFindBy(accessibility = "Collection View Cell: LEAST EXPENSIVE")
	private WebElement leastExpensiveButton;

	@iOSXCUITFindBy(accessibility = "Collection View Cell: MOST EXPENSIVE")
	private WebElement mostExpensiveButton;

	@iOSXCUITFindBy(accessibility = "Collection View Cell: BEDROOMS")
	private WebElement sortByBedroomsButton;

	@iOSXCUITFindBy(accessibility = "Collection View Cell Selected: MOST EXPENSIVE")
	private WebElement mostExpensiveButtonSelected;

	@iOSXCUITFindBy(accessibility = "Segmented Control: PAST LISTINGS")
	private WebElement pastListingsSection;

	@iOSXCUITFindBy(accessibility = "Segmented Control: CURRENT LISTINGS")
	private WebElement currentListingsSection;

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

	public void clickOnArrowBackButtonFromListing() {
			element(arrowBackButtonFromListing).click();
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
		if (Config.isAndroid()){
			return buildingAddress.getAttribute("text");
		}
		else{
			return buildingAddress.getAttribute("name");
		}
	}

	public void openExistingDiscussion(String discussionName) {
		if (Config.isAndroid()){
			element(MobileBy.xpath("//*[@text='" + discussionName.toUpperCase() + "']")).click();
		}
		else {
			element(MobileBy.AccessibilityId(discussionName)).click();
		}
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
		if (Config.isAndroid()){
			element(By.xpath("//*[@text='" + discussionName.toUpperCase() + "']")).shouldBeVisible();
		} else {
			element(MobileBy.AccessibilityId(discussionName)).shouldBeVisible();
		}
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
		if(Config.isAndroid()) {
//			Helper.swipeVerticalAndroid(appiumDriver, 0.8, 0.2, 0.5);
			Helper.androidSwipeDownUntilElementVisible(featuresAmenities);
		} else {
			WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
			WebDriver webDriver = webDriverFacade.getProxiedDriver();
			AppiumDriver appiumDriver = (AppiumDriver) webDriver;
			Helper.swipeVertical(appiumDriver, 0.9, 0.1, 0.5, 1);
			Helper.swipeVertical(appiumDriver, 0.9, 0.1, 0.5, 1);
		}
		element(featuresAmenities).click();

	}

	public void isFireplaceDisplayed() {
//		Helper.scrollToElement(FIREPLACE);
		Helper.universalVerticalSwipe(FIREPLACE);
		element(FIREPLACE).shouldBeVisible();
	}

	public WebElement getOneSellersAgentElement() {
		return oneSellerAgentSection;
	}

	public WebElement getSeveralSellersAgentsElement() {
		return severalSellersAgentsSection;
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

	public void openDiscussionWithJustCreatedClient(String client) {
		if(Config.isAndroid()) {
			element(By.xpath("//*[contains(@text,'" + client + "')]")).click();
		} else {
			element(MobileBy.iOSClassChain("**/XCUIElementTypeOther/XCUIElementTypeStaticText[$name == '"
					+ client + "'$]")).click();
		}


	}

	public void isLaundryBLDGDisplayed() {
		if(Config.isAndroid()) {
//			Helper.swipeVerticalAndroid(appiumDriver, 0.8, 0.2, 0.5);
			Helper.androidSwipeDownUntilElementVisible(LaundryBLDGD);
		} else {
			WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
			WebDriver webDriver = webDriverFacade.getProxiedDriver();
			AppiumDriver appiumDriver = (AppiumDriver) webDriver;

			Helper.swipeVertical(appiumDriver, 0.9, 0.1, 0.5, 1);
			Helper.swipeVertical(appiumDriver, 0.9, 0.1, 0.5, 1);
		}

		element(LaundryBLDGD).shouldBeVisible();
	}

	public void clickOnSeveralSellersAgentSection() {
		element(severalSellersAgentsSection).click();
	}

    public void removeAllTAgs() {
		while (Helper.isElementDisplayed(deleteTagButton)) {
			deleteTagButton.click();
		}
    }

	public void shouldSeeAddedTag() {
		if(Config.isAndroid()) {
			element(MobileBy.xpath("//*[contains(@text, '" + SessionVariables.getValueFromSessionVariable("First_Existing_Tag") + "')]")).shouldBeVisible();
		} else {
			element(MobileBy.AccessibilityId(SessionVariables.getValueFromSessionVariable("First_Existing_Tag"))).shouldBeVisible();
		}
	}

	public void saveFirstBuildingAddress() {
		SessionVariables.addValueInSessionVariable("First_building_address", buildAddress.getAttribute("name"));
	}

	public void saveSecondBuildingAddress() {
		SessionVariables.addValueInSessionVariable("Second_building_address", buildAddress.getAttribute("name"));
	}

	public void clickOnCancelButton() {
		element(cancelButton).click();
	}

	public void clickOnCancelButtonInDiscussWithClient() {
		element(cancelButtonInDiscussWithClient).click();
	}

	public boolean isAgentWithDiscussionExist() {
		boolean isAgentWithDiscussion = false;

		if (element(agentWithDiscussion).isVisible()) {
				isAgentWithDiscussion = true;
		}
		return isAgentWithDiscussion;
	}

	public void fixSearchField() {
		WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
		WebDriver webDriver = webDriverFacade.getProxiedDriver();
		AppiumDriver appiumDriver = (AppiumDriver) webDriver;

		Helper.universalVerticalSwipe(listingMap);

		int minX = listingMap.getLocation().getX() + 360;
		int minY = listingMap.getLocation().getY() + 215;

		new TouchAction(appiumDriver).tap(minX, minY).release().perform();
	}

	public void swipeToTheListings(){
		Helper.universalVerticalSwipe(lastListing);
	}

	public void fillInSearchField(String value) {
		element(listingsSearchField).sendKeys(value);
	}

	public void checkIfListingsAreFilteredByBeds() {
		boolean result = true;

		for (WebElement listing : currentBedsAndBathsAmountList) {
			if(!listing.getAttribute("value").contains("2  BEDS")) {
				result = false;
				break;
			}
		}
		Assert.assertTrue(result);
	}

	public void clickOnClearFieldButton() {
		element(clearFieldButton).click();
	}

	public void checkIfListingReturnedToInitialState() {
		for (int i = 0; i<initialBedsAndBathsAmountList.size(); i++){
			Assert.assertEquals(initialBedsAndBathsAmountList.get(i), currentBedsAndBathsAmountList.get(i).getAttribute("value"));
		}
	}

	public void getInitialBedsAndBathsAmountList() {
		for (WebElement element: currentBedsAndBathsAmountList) {
			initialBedsAndBathsAmountList.add(element.getAttribute("value"));
		}
	}

	public void clickOnTestListing() {
		element(testListing).click();
	}

	public void skipDiscussWithClientHint() {
		element(discussWithClientHint).click();
	}

	public void checkIfListingsAreFilteredByBaths() {
		boolean result = true;

		for (WebElement listing : currentBedsAndBathsAmountList) {
			if(!listing.getAttribute("value").contains("2  BATHS")) {
				result = false;
				break;
			}
		}
		Assert.assertTrue(result);
	}

	public void checkIfListingsAreFilteredByNeighborhood() {
		for (WebElement listing : neighborhoodValueList) {
			Assert.assertTrue(listing.getAttribute("value").contains(SessionVariables.getValueFromSessionVariable("Neighborhood_value")));
		}
	}

	public void getNeighborhoodValue() {
		SessionVariables.addValueInSessionVariable("Neighborhood_value", neighborhoodValue.getAttribute("value"));
	}

	public void clickOnMoreInBuildingSection() {
		element(moreInBuildingSection).click();
	}

	public void checkIfSearchFieldIsFilledByNeighborhood() {
		Assert.assertEquals(element(listingsSearchField).getAttribute("value"), SessionVariables.getValueFromSessionVariable("Neighborhood_value"));
	}

	public void clickOnSimilarListingsSection() {
		element(similarListingsSection).click();
	}

	public void checkIfListingsAreFilteredByActiveStatus() {
		element(banner).shouldNotBeVisible();
	}

	public void checkIfListingsAreFilteredByInContractStatus() {
		for (WebElement item : bannerList) {
			Assert.assertEquals(item.getAttribute("name"), "InContractBanner");
		}
		Assert.assertEquals(bannerList.size(), listingsList.size());
	}

	public void clickOnSortButton() {
		element(sortButton).click();
	}

	public void clickOnLeastExpensiveButton() {
		element(leastExpensiveButton).click();
	}

	public void clickOnMostExpensiveButton() {
		element(mostExpensiveButton).click();
	}

	public void clickOnBedroomsSort() {
		element(MobileBy.AccessibilityId("Collection View Cell: BEDROOMS")).click();
	}

	public void clickOnSortByBedroomsButton() {
		element(sortByBedroomsButton).click();
	}

	public void checkIfSearchFieldIsFilledByFilter(String value) {
		Assert.assertEquals(element(listingsSearchField).getAttribute("value"), value);
	}

	public void checkIfMostExpensiveSortingButtonIsEnabled() {
		element(mostExpensiveButtonSelected).shouldBeVisible();
	}

	public void clickOnPastListingsSection() {
		element(pastListingsSection).click();
	}

	public void clickOnCurrentListingsSection() {
		element(currentListingsSection).click();
	}
}
