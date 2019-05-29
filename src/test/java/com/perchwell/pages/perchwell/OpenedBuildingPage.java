package com.perchwell.pages.perchwell;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.Helper;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.helpers.TechHelper;
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

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class OpenedBuildingPage extends TechHelper {

	private List<String> initialBedsAndBathsAmountList = new ArrayList<>();
	private  List<String> listOfAddresses = new ArrayList<>();

	//region WebElements

	@iOSXCUITFindBy(accessibility = "DISCUSS THIS WITH YOUR CLIENT OR AGENT. WE'LL ORGANIZE YOUR MESSAGES BY PERSON & LISTING.")
	private WebElement discussThisHint;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView[1]")
	private WebElement collectionForDiscussionSerach;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/my_tags")
	@iOSXCUITFindBy(accessibility = "TAGS")
	private WebElement myTagsLabel;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/up_button")
	@iOSXCUITFindBy(accessibility = "Back")
	private WebElement arrowBackButtonFromListing;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/remove_icon")
	@iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeButton' AND name BEGINSWITH 'Remove Button: '")
	private WebElement deleteTagButton;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='RemoveButton']")
	@iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeButton' AND name CONTAINS 'DeleteTagBubbleButton'")
	private List<WebElement> deleteButtonList;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/title")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	private WebElement buildingAddress;

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
	@iOSXCUITFindBy(accessibility = "share24")
	private WebElement shareBitton;

	@AndroidFindBy(xpath = "//*[@text='FEATURES & AMENITIES']")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$value = 'FEATURES & AMENITIES'$]")
	private WebElement featuresAmenities;

	@iOSXCUITFindBy(accessibility = "FIREPLACE")
	private WebElement FIREPLACE;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/more_agents")
	@iOSXCUITFindBy(accessibility = "SELLER'S AGENTS")
	private WebElement severalSellersAgentsSection;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/listing_agent")
	@iOSXCUITFindBy(accessibility = "SELLER'S AGENT")
	private WebElement oneSellerAgentSection;

	@AndroidFindBy(xpath = "//*[contains(@text,'CLIENT TEST+CLIENT0')]")
	@iOSXCUITFindBy(accessibility = "CLIENT TEST+CLIENT0")
    private WebElement clientWithDiscussion;

	@AndroidFindBy(xpath = "//*[contains(@text,'TEST TEST-IOS+MGMT-CORE@PERCHWELL.COM')]")
	@iOSXCUITFindBy(accessibility = "TEST TEST-IOS+MGMT-STRIBLING@PERCHWELL.COM")
	private WebElement agentWithDiscussion;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/view_all_discussions")
	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'VIEW ALL DISCUSSIONS FOR THIS'")
    private WebElement viewAllDiscussionsButton;

	@AndroidFindBy(accessibility = "Laundry - Building")
	@iOSXCUITFindBy(accessibility = "BUILDING LAUNDRY")
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

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeImage")
	private WebElement listingMap;

	@iOSXCUITFindBy(accessibility = "Listing Preview Search TextField")
	private WebElement listingsSearchField;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Info:'")
	private List<WebElement> currentBedsAndBathsAmountList;

	@iOSXCUITFindBy(accessibility = "Clear text")
	private WebElement clearFieldButton;

	@iOSXCUITFindBy(accessibility = "DISCUSS THIS WITH YOUR CLIENT OR AGENT. WE'LL ORGANIZE YOUR MESSAGES BY PERSON & LISTING.")
	private WebElement discussWithClientHint;

	@iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS '#TEST'")
	private WebElement testListing;

	@iOSXCUITFindBy(accessibility = "MORE")
	private WebElement moreButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	private WebElement neighborhoodValue;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Neighborhood'")
	private List<WebElement> neighborhoodValueList;

	@iOSXCUITFindBy(accessibility = "Segmented Control: deselected MORE IN BUILDING")
	private WebElement moreInBuildingSection;

	@iOSXCUITFindBy(accessibility = "Segmented Control: deselected SIMILAR LISTINGS")
	private WebElement similarListingsSection;

	@iOSXCUITFindBy(accessibility = "Nav Back White")
	private WebElement backFromTagsButton;

	@iOSXCUITFindBy(accessibility = "BuildingViewBackButton")
	private WebElement buildingViewBackButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[$name != 'Table View Cell: Show More' AND name BEGINSWITH 'Table View Cell'$][-1]")
	private WebElement lastListing;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[$name != 'Table View Cell: Show More' AND name != 'Table View Cell: Show Message' AND name BEGINSWITH 'Table View Cell'$]")
	private List<WebElement> listingsList;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'InContractBanner'")
	private List<WebElement> inContractBannerList;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Banner'")
	private WebElement banner;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther/XCUIElementTypeImage[$name BEGINSWITH 'RIBBON'$]")
	private List<WebElement> bannerList;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[$name BEGINSWITH 'Table View Cell' AND visible==1$]/XCUIElementTypeOther/XCUIElementTypeImage[$!name CONTAINS 'Banner'$]")
	private List<WebElement> imagesList;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$name BEGINSWITH 'PRICE'$]")
	private List<WebElement> pricesList;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[$name BEGINSWITH 'Listing Preview Sort Button'$]")
	private WebElement sortButton;

	@iOSXCUITFindBy(accessibility = "Collection View Cell: LEAST EXPENSIVE")
	private WebElement leastExpensiveButton;

	@iOSXCUITFindBy(accessibility = "Collection View Cell: MOST EXPENSIVE")
	private WebElement mostExpensiveButton;

	@iOSXCUITFindBy(accessibility = "Collection View Cell: BEDROOMS")
	private WebElement sortByBedroomsButton;

	@iOSXCUITFindBy(accessibility = "Collection View Cell Selected: MOST EXPENSIVE")
	private WebElement mostExpensiveSortButtonSelected;

	@iOSXCUITFindBy(accessibility = "Collection View Cell Selected: LEAST EXPENSIVE")
	private WebElement leastExpensiveSortButtonSelected;

	@iOSXCUITFindBy(accessibility = "Collection View Cell Selected: BEDROOMS")
	private WebElement bedroomsSortButtonSelected;

	@iOSXCUITFindBy(accessibility = "Segmented Control: deselected PAST LISTINGS")
	private WebElement pastListingsSection;

	@iOSXCUITFindBy(accessibility = "Segmented Control: deselected CURRENT LISTINGS")
	private WebElement currentListingsSection;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[$name != 'Table View Cell: Show More' AND name BEGINSWITH 'Table View Cell'$][1]")
	private WebElement firstListing;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[$name BEGINSWITH 'Collection View Cell Selected'$]")
	private WebElement selectedSortButton;

	@iOSXCUITFindBy(accessibility = "MORTGAGE CALCULATOR")
	private WebElement mortgageCalculator;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Info'")
	private List<WebElement> bedsAndBathsAmountList;

	@iOSXCUITFindBy(xpath = "*//XCUIElementTypeCell[position()<12]/XCUIElementTypeStaticText[starts-with(@name, 'Info')]")
	private List<WebElement> currentTenBedsAndBathsAmountList;

	@AndroidFindBy(xpath = "*//android.widget.TextView[contains(@text, 'More')]")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$name ENDSWITH 'More'$]")
	private WebElement notVisibleTagsAmount;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/ok")
	@iOSXCUITFindBy(accessibility = "OK")
	private WebElement positiveButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/more_agents")
	private WebElement moreAgentsButton;

	@iOSXCUITFindBy(accessibility = "Segmented Control: selected MORE IN BUILDING")
	private WebElement selectedMoreInBuildingSection;

	@iOSXCUITFindBy(accessibility = "Segmented Control: selected SIMILAR LISTINGS")
	private WebElement selectedSimilarListingsSection;

	@iOSXCUITFindBy(accessibility = "Segmented Control: selected PAST LISTINGS")
	private WebElement selectedPastListingsSection;

	@iOSXCUITFindBy(accessibility = "Segmented Control: selected CURRENT LISTINGS")
	private WebElement selectedCurrentListingsSection;

	@iOSXCUITFindBy(accessibility = "NO MATCH")
	private WebElement noMatchLabel;

	@AndroidFindBy(xpath = "*//android.widget.ImageView[contains(@content-desc, 'Remove Button: ')]")
	@iOSXCUITFindBy(iOSNsPredicate = "label CONTAINS 'removeBubble'")
	private WebElement removeButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$name CONTAINS 'PRICE:'$][1]")
	private WebElement firstPrice;

	@iOSXCUITFindBy(accessibility = "DiscussBuildingButton")
	private WebElement shareButton;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Address: '")
	private List<WebElement> currentListingsAddresses;

	@iOSXCUITFindBy(accessibility = "Collection View Cell: NEWEST")
	private WebElement sortByNewestButton;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Active Sales: '")
	private WebElement activeSalesCount;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Pending Sales: '")
	private WebElement pendingSalesCount;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Active Rental: '")
	private WebElement activeRentalsCount;

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
		if (!Config.isAndroid()) {
			element(discussThisHint).click();
		}
	}

	public void clickOnMyTagsLabel() {
		element(myTagsLabel).click();
	}

	public void clickOnArrowBackButtonFromListing() {
			element(arrowBackButtonFromListing).click();
	}

	public void clickOnDeleteTagButton() {
		setImplicitTimeout(5,TimeUnit.SECONDS);
		while (element(deleteTagButton).isPresent()) {
			element(deleteTagButton).click();
		}
		resetImplicitTimeout();
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
			element(MobileBy.iOSNsPredicateString("value CONTAINS '" + discussionName + "' AND visible == 1")).click();
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
			element(MobileBy.iOSNsPredicateString("value CONTAINS '" + discussionName + "' AND visible == 1")).shouldBeVisible();
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
//			Helper.universalVerticalShortSwipe(myTagsLabel);
			Helper.swipeVertical(appiumDriver, 0.4, 0.1, 0.5, 1);
//			Helper.universalVerticalSwipe(mortgageCalculator);
		}
		element(featuresAmenities).click();
//		WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
//		WebDriver webDriver = webDriverFacade.getProxiedDriver();
//		AppiumDriver appiumDriver = (AppiumDriver) webDriver;
//
//		int minX = myTagsLabel.getLocation().getX() + 115;
//		int minY = myTagsLabel.getLocation().getY() + 175;
//
//		new TouchAction(appiumDriver).tap(minX, minY).release().perform();
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

	public void swipeDownUntilElementVisible(WebElement name) {
		universalVerticalSwipe(name);
	}

	public boolean isSeveralSellersAgentsPresent() {
		return element(severalSellersAgentsSection).isPresent();
	}

	public boolean isOneSellersAgent() {
		if (Config.isAndroid()) {
			Helper.universalVerticalSwipe(oneSellerAgentSection);
			return element(oneSellerAgentSection).isPresent();
		} else {
			return element(oneSellerAgentSection).isPresent();
		}
	}

	public void clickOnOneSellersAgentSection() {
		universalVerticalSwipe(oneSellerAgentSection);
		element(oneSellerAgentSection).click();
	}

	public boolean isClientWithDiscussionExist() {
	    boolean isClientWithDiscussion = false;

	    setImplicitTimeout(3, TimeUnit.SECONDS);
	    if (element(clientWithDiscussion).isVisible()) {
	        isClientWithDiscussion = true;
        }
        resetImplicitTimeout();
        return isClientWithDiscussion;
    }

	public void clickOnViewAllDiscussionsButton() {
	    element(viewAllDiscussionsButton).click();
    }

	public void isBuildingAddressDisplayed() {
		Assert.assertTrue(getBuildingAddress()
				.equalsIgnoreCase(SessionVariables.getValueFromSessionVariable("listingAddress1")));
	}

	public void openDiscussionWithJustCreatedClient(String client) {
		waitABit(60000);
		if(Config.isAndroid()) {
			element(By.xpath("//*[contains(@text,'" + client + "')]")).click();
		} else {
//			element(iOSClassChain("**/XCUIElementTypeOther/XCUIElementTypeStaticText[$name == '"
			element(MobileBy.iOSClassChain("**/XCUIElementTypeOther/XCUIElementTypeStaticText[$name == '"
					+ client + "'$]")).click();
		}


	}

	public void isLaundryBLDGDisplayed() {
//		if(Config.isAndroid()) {
////			Helper.swipeVerticalAndroid(appiumDriver, 0.8, 0.2, 0.5);
//			Helper.androidSwipeDownUntilElementVisible(LaundryBLDGD);
//		} else {
//			WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
//			WebDriver webDriver = webDriverFacade.getProxiedDriver();
//			AppiumDriver appiumDriver = (AppiumDriver) webDriver;
//
//			Helper.swipeVertical(appiumDriver, 0.9, 0.1, 0.5, 1);
//			Helper.swipeVertical(appiumDriver, 0.9, 0.1, 0.5, 1);
//		}

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

	public void shouldSeeSpecificTag(String tagName) {
		if(Config.isAndroid()) {
			element(MobileBy.xpath("//*[contains(@text, '" + tagName + "')]")).shouldBeVisible();
		} else {
			element(MobileBy.AccessibilityId(tagName)).shouldBeVisible();
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

//		Helper.universalVerticalSwipe(listingMap);
//
//		int minX = listingMap.getLocation().getX() + 360;
//		int minY = listingMap.getLocation().getY() + 215;

		Helper.universalVerticalSwipe(firstPrice);

		int minX = firstPrice.getLocation().getX() + 70;
		int minY = firstPrice.getLocation().getY() - 70;

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
		if (currentBedsAndBathsAmountList.isEmpty()) {
			result = false;
		} else {
			for (WebElement listing : currentBedsAndBathsAmountList) {
				if(!listing.getAttribute("value").contains("2  BEDS")) {
					result = false;
					break;
				}
			}
		}
		Assert.assertTrue(result);
	}

	public void clickOnClearFieldButton() {
		element(clearFieldButton).click();
	}

	public void checkIfListingReturnedToInitialState() {
		for (int i = 0; i<initialBedsAndBathsAmountList.size(); i++){
			Assert.assertEquals(initialBedsAndBathsAmountList.get(i), bedsAndBathsAmountList.get(i).getAttribute("value"));
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

		if (currentBedsAndBathsAmountList.isEmpty()) {
			result = false;
		} else {
			for (WebElement listing : currentBedsAndBathsAmountList) {
				if(!listing.getAttribute("value").contains("2  BATHS")) {
					result = false;
					break;
				}
			}
		}
		Assert.assertTrue(result);
	}

	public void checkIfListingsAreFilteredByNeighborhood() {
	    boolean result = true;

	    if (neighborhoodValueList.isEmpty()) {
            result = false;
        } else {
            for (WebElement listing : neighborhoodValueList) {
                if (!listing.getAttribute("value").contains(SessionVariables.getValueFromSessionVariable("Neighborhood_value"))) {
                    result = false;
                    break;
                }
            }
        }
        Assert.assertTrue(result);
	}

	public void getNeighborhoodValue() {
//		Assert.assertTrue(neighborhoodValue.getAttribute("value").contains("MURRAY HILL"));
//		SessionVariables.addValueInSessionVariable("Neighborhood_value", "MURRAY HILL");
		SessionVariables.addValueInSessionVariable("Neighborhood_value", neighborhoodValue.getAttribute("value").replaceFirst("THE ", ""));
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
		Assert.assertTrue(inContractBannerList.size() == bedsAndBathsAmountList.size());
	}

	public void checkIfListingsAreFilteredByInContractStatusWithoutLabel() {
		boolean isListingsAreFiltered = false;
		if (bedsAndBathsAmountList.size()==0) {
			isListingsAreFiltered = true;
		} else {
			if (inContractBannerList.size() == bedsAndBathsAmountList.size()) {
				isListingsAreFiltered = true;
			}
		}
		Assert.assertTrue(isListingsAreFiltered);
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

	public void clickOnSortByBedroomsButton() {
		element(sortByBedroomsButton).click();
	}

	public void checkIfSearchFieldIsFilledByFilter(String value) {
		Assert.assertEquals(element(listingsSearchField).getAttribute("value"), value);
	}

	public void checkIfMostExpensiveSortingButtonIsEnabled() {
		element(mostExpensiveSortButtonSelected).shouldBeVisible();
	}

    public void checkIfLeastExpensiveSortingButtonIsEnabled() {
		element(leastExpensiveSortButtonSelected).shouldBeVisible();
    }

	public void bedroomsSortButtonShouldBeEnabled() {
		element(bedroomsSortButtonSelected).shouldBeVisible();
	}

	public void clickOnPastListingsSection() {
		element(pastListingsSection).click();
	}

	public void clickOnCurrentListingsSection() {
		element(currentListingsSection).click();
	}

	public void fixListingsSearchField() {
		WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
		WebDriver webDriver = webDriverFacade.getProxiedDriver();
		AppiumDriver appiumDriver = (AppiumDriver) webDriver;

		Helper.universalVerticalSwipe(firstListing);

		int minX = firstListing.getLocation().getX() + 220;
		int minY = firstListing.getLocation().getY() - 90;

		new TouchAction(appiumDriver).tap(minX, minY).release().perform();
	}

	public void closeSortWindow() {
		element(selectedSortButton).click();
	}

	public void clickOnPositiveButton() {
		element(positiveButton).click();
	}

	public void checkIfTenListingsReturnedToInitialState() {
//		for (int i = 0; i<initialBedsAndBathsAmountList.size(); i++) {
//			Assert.assertEquals(initialBedsAndBathsAmountList.get(i), currentTenBedsAndBathsAmountList.get(i).getAttribute("value"));
		Assert.assertEquals(initialBedsAndBathsAmountList.get(0), element(MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[$name CONTAINS 'Info:'$][1]")).getAttribute("value"));
		Assert.assertEquals(initialBedsAndBathsAmountList.get(1), element(MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[$name CONTAINS 'Info:'$][2]")).getAttribute("value"));
		Assert.assertEquals(initialBedsAndBathsAmountList.get(2), element(MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[$name CONTAINS 'Info:'$][3]")).getAttribute("value"));
		Assert.assertEquals(initialBedsAndBathsAmountList.get(3), element(MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[$name CONTAINS 'Info:'$][4]")).getAttribute("value"));
		Assert.assertEquals(initialBedsAndBathsAmountList.get(4), element(MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[$name CONTAINS 'Info:'$][5]")).getAttribute("value"));
//	}
	}

	public void checkMoreInBuildingSectionIsOpened() {
		element(selectedMoreInBuildingSection).shouldBeVisible();
	}

	public void checkSimilarListingsSectionIsOpened() {
		element(selectedSimilarListingsSection).shouldBeVisible();
	}

	public void checkPastListingsSectionIsOpened() {
		element(selectedPastListingsSection).shouldBeVisible();
	}

	public void checkCurrentListingsSectionIsOpened() {
		element(selectedCurrentListingsSection).shouldBeVisible();
	}

	public void checkListingsStatus(String status) {
//		List<WebElement> statusList = getDriver().findElements(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value == '" + status + "'"));
//		Assert.assertEquals(statusList.size(), currentBedsAndBathsAmountList.size());
		Assert.assertEquals(status, element(MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[$name CONTAINS 'Listing Status:'$][1]")).getAttribute("value"));
		Assert.assertEquals(status, element(MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[$name CONTAINS 'Listing Status:'$][2]")).getAttribute("value"));
		Assert.assertEquals(status, element(MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[$name CONTAINS 'Listing Status:'$][3]")).getAttribute("value"));
		Assert.assertEquals(status, element(MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[$name CONTAINS 'Listing Status:'$][4]")).getAttribute("value"));
		Assert.assertEquals(status, element(MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[$name CONTAINS 'Listing Status:'$][5]")).getAttribute("value"));
	}

	public void checkListingsStatusNormal(String status) {
		List<WebElement> statusList = getDriver().findElements(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value == '" + status + "'"));
		Assert.assertEquals(statusList.size(), currentBedsAndBathsAmountList.size());
	}

	public void shouldSeeNoMatchLabel() {
		element(noMatchLabel).shouldBeVisible();
	}

	public void checkIfBuildingsAreFilteredByNeighborhood() {
		String location = SessionVariables.getValueFromSessionVariable("Neighborhood_value");
		Assert.assertTrue(element(MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[$name CONTAINS 'Neighborhood:'$][1]")).getAttribute("value").contains(location));
		Assert.assertTrue(element(MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[$name CONTAINS 'Neighborhood:'$][2]")).getAttribute("value").contains(location));
		Assert.assertTrue(element(MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[$name CONTAINS 'Neighborhood:'$][3]")).getAttribute("value").contains(location));
		Assert.assertTrue(element(MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[$name CONTAINS 'Neighborhood:'$][4]")).getAttribute("value").contains(location));
		Assert.assertTrue(element(MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[$name CONTAINS 'Neighborhood:'$][5]")).getAttribute("value").contains(location));
	}

	public void getTestAgentEmail() {
		String agentEmail;

		if(Config.isAndroid()) {
			agentEmail = element(MobileBy.id("com.perchwell.re.staging:id/agent_name")).getAttribute("text").toLowerCase();
		} else {
			agentEmail = element(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND " +
					"name CONTAINS 'seller agent: '")).getValue().toLowerCase();
		}

		SessionVariables.addValueInSessionVariable("Test_agent",
				agentEmail.replace("test ", ""));
	}

    public void clearTagsList() {
		waitABit(3000);
		if(Config.isAndroid()) {
			setImplicitTimeout(3, TimeUnit.SECONDS);
			while (element(MobileBy.xpath("*//android.widget.ImageView[contains(@content-desc, 'Remove Button: ')]")).isVisible()) {
				element(removeButton).click();
			}
			resetImplicitTimeout();
		}
		else {
			setImplicitTimeout(3, TimeUnit.SECONDS);
			while (element(MobileBy.iOSNsPredicateString("label CONTAINS 'removeBubble'")).isVisible()) {
				element(removeButton).click();
			}
			resetImplicitTimeout();
		}
    }

	public void shouldNotSeeSpecificTag(String tag) {
		setImplicitTimeout(3, TimeUnit.SECONDS);
		element(MobileBy.AccessibilityId(tag)).shouldNotBeVisible();
		resetImplicitTimeout();
	}

	public void shouldSeeSpecificClient() {
		setImplicitTimeout(3, TimeUnit.SECONDS);
		element(MobileBy.AccessibilityId(SessionVariables.getValueFromSessionVariable("Client"))).shouldBeVisible();
		resetImplicitTimeout();
	}

	public void getFifthBuildingAddress() {
		if(Config.isAndroid()) {
			SessionVariables.addValueInSessionVariable("buildingAddress" + 5, buildingAddress.getAttribute("text"));
		} else {
			SessionVariables.addValueInSessionVariable("buildingAddress" + 5, buildingAddress.getAttribute("value"));
		}
	}

	public void shouldSeeAddedNewTag() {
		element(MobileBy.AccessibilityId(SessionVariables.getValueFromSessionVariable("Just_Created_Tag"))).shouldBeVisible();
	}

	public void clickOnListingsBuilding() {
		String listingsAddress = buildingAddress.getAttribute("value");
		WebElement buildingAddress = element(MobileBy.AccessibilityId(listingsAddress.substring(0, listingsAddress.lastIndexOf(" "))));

		universalVerticalSwipe(buildingAddress);
		element(buildingAddress).click();
	}

	public void swipeUpToMyTagsLabel() {
		universalUpSwipe(myTagsLabel);
	}

	public void checkNoOneTagIsAdded() {
		setImplicitTimeout(1, SECONDS);
		Assert.assertEquals(0, getDriver().findElements(MobileBy.iOSNsPredicateString("name CONTAINS 'Remove Button:'")).size());
		resetImplicitTimeout();
	}

	public void checkIfShareButtonIsDisplayed() {
		element(shareButton).shouldBePresent();
	}

	public void checkIfCountActiveSalesIsSame() {
		int activeSales;
		int activeSalesBuilding;
		String activeSalesString = SessionVariables.getValueFromSessionVariable("activeSalesAndRentals");

		activeSales = Integer.parseInt(activeSalesString.substring(0, activeSalesString.indexOf(" ")));

		activeSalesBuilding = Integer.parseInt(activeSalesCount.getAttribute("value")) + Integer.parseInt(pendingSalesCount.getAttribute("value"));

		Assert.assertEquals(activeSales, activeSalesBuilding);
	}

	public void checkIfNeighborhoodAndBuildingType() {
		element(MobileBy.AccessibilityId(SearchPage.neighborhoodAndBuilding)).shouldBeVisible();
	}

	public void getCurrentListingsAddresses() {
		for(int i = 0; i < currentListingsAddresses.size(); i++) {
			SessionVariables.addValueInSessionVariable("currentListingsAddress" + (i + 1), currentListingsAddresses.get(i).getAttribute("value").toUpperCase());
		}
	}

	public void clickOnNewestButton() {
		element(sortByNewestButton).click();
	}

	public void checkIfCountActiveRentalsSame() {
		int activeRentals;
		int activeRentalsBuilding;
        String activeRentalsString = SessionVariables.getValueFromSessionVariable("activeSalesAndRentals");

        activeRentals = Integer.parseInt(activeRentalsString.substring(activeRentalsString.indexOf("|") + 3,
                activeRentalsString.indexOf(" ACTIVE RENTAL")));
		activeRentalsBuilding = Integer.parseInt(activeRentalsCount.getAttribute("value"));
		Assert.assertEquals(activeRentals, activeRentalsBuilding);
	}
}
