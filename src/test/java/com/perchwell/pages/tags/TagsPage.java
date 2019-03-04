package com.perchwell.pages.tags;

import com.perchwell.crossPlatform.Config;
import com.perchwell.data.SearchRequests;
import com.perchwell.helpers.Helper;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class TagsPage extends TechHelper {

	private List<WebElement> tagsList = new ArrayList<>();
	private int tagsListSize;
	String tagName;
	int tagsItemsValue;

	//region WebElements

	@iOSXCUITFindBy(accessibility = "TagSearchButton")
	private WebElement tagSearchButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/search_src_text")
	@iOSXCUITFindBy(accessibility = "Tag Cell: Search Text Field")
	private WebElement searchTagTexBox;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/create_tag")
	@iOSXCUITFindBy(accessibility = "button: create tag")
	private WebElement createTagLabel;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/up_button")
	@iOSXCUITFindBy(accessibility = "chevronLeft")
	private WebElement arrowBackFromTagsButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/search_by_tags")
	@iOSXCUITFindBy(accessibility = "SHOW ITEMS IN SELECTED TAGS")
	private WebElement searchButton;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView")
	@iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeButton' AND name CONTAINS 'DeleteTagBubbleButton'")
	private WebElement deleteTagButton;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.TextView")
	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS 'More'")
	private WebElement moreTagIcon;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/tag_name")
//	@iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS '11CLIENTNAME'")
//	@iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS 'TAGNAME'")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS '11CLIENTNAME' OR name CONTAINS 'TAGNAME'`][1]")
	private WebElement firstTag;

	@iOSXCUITFindBy(accessibility = "TagsViewControllerCancelButton")
	private WebElement tagsPageCloseButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$name BEGINSWITH 'ADDRESS: '$][$visible = 1$]")
	private WebElement buildingAddress;

	@iOSXCUITFindBy(accessibility = "Clear text")
	private WebElement clearTextFieldButton;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'button: edit tag'")
	private WebElement editIcon;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'button: edit tag'")
	private List<WebElement> editIconList;

	@iOSXCUITFindBy(accessibility = "DELETE")
	private WebElement deleteThisTagButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable/XCUIElementTypeCell[`visible==1`]/XCUIElementTypeStaticText")
	private List<WebElement> visibleTagsList;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'image: notification active'")
	private List<WebElement> activeBellIconsList;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'button: set notification active'")
	private List<WebElement> inactiveBellButtonsList;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'button: set notification active'")
	private WebElement inactiveBellButton;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'button: set notification inactive'")
	private WebElement activeBellButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label CONTAINS 'CLIENT TEST'`][1]")
	private WebElement firstClientTag;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$name == 'Other Tags'$][1]")
	private WebElement otherTagsLabel;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$name == 'Shared with clients'$][1]")
	private WebElement sharedWithClientLabel;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'item'")
	private WebElement oneItem;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'image: tag deselected'")
	private List<WebElement> uncheckedTagsList;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'image: tag selected'")
	private List<WebElement> checkedTagsList;

	@iOSXCUITFindBy(accessibility = "ADD TAG")
	private WebElement addTagLabel;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[$name BEGINSWITH 'tag color: #'$]/XCUIElementTypeOther/XCUIElementTypeStaticText[$visible == 1$]")
	private WebElement tagsFirstPill;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label CONTAINS '11CLIENTNAME20'`][1]")
	private WebElement firstCustomClientTag;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name BEGINSWITH 'Remove Button: '")
	private WebElement removingTagPill;

	@iOSXCUITFindBy(accessibility = "TagsViewControllerCancelButton")
	private WebElement crossFromAccountTagsButton;

	@iOSXCUITFindBy(accessibility = "MY TAGS")
	private WebElement myTagsLabel;

	@iOSXCUITFindBy(accessibility = "TagsViewControllerCancelButton")
	private WebElement crossBackFromTagsButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable[$name=='TagsTableView'$]/XCUIElementTypeCell/XCUIElementTypeStaticText[$name CONTAINS 'items'$][1]")
	private WebElement firstTagWithItems;

	//endregion

	public TagsPage(WebDriver driver) {
		super(driver);
	}

	public void fillInTagSearchField(String uniqueTagName) {
		waitFor(1000);
		element(searchTagTexBox).sendKeys(uniqueTagName);
	}

	public void clickOnCreateTagLabel() {
		element(createTagLabel).click();
	}

	public void clickOnArrowBackFromTagsButton() {
		element(arrowBackFromTagsButton).click();
	}

	public void clickOnTagLabel(String TagName) {
		this.getCreatedTagLabel(TagName).click();
	}

	public void clickOnSearchButton() {
		element(searchButton).click();
	}

	public boolean isTagDisplayed(String tagName) {
		Boolean elementIsVisible;

		if (Config.isAndroid()) {
			elementIsVisible = isElementVisible(MobileBy.xpath("//*[contains(@text, '" + tagName + "')]"));
		} else {
			elementIsVisible = isElementVisible(MobileBy.AccessibilityId(tagName));
		}
		return elementIsVisible;
	}

	public boolean isTagDisplayedWithSwipe(String tagName) {
		if (getDriver().findElements(MobileBy.AccessibilityId(tagName)).size() > 0) {
			setImplicitTimeout(1, SECONDS);
			Helper.scrollToElement(getDriver().findElements(MobileBy.AccessibilityId(tagName)).get(0));
			resetImplicitTimeout();
		}
		return isElementVisible(MobileBy.AccessibilityId(tagName));
	}

	public WebElement findExistingTagLabel() {
		WebElement parentCell = null;
		WebElement parentLabelElement = null;
		WebElement table = getDriver().findElements(By.className("XCUIElementTypeTable")).get(0);
		List<WebElement> listCells = table.findElements(By.className("XCUIElementTypeCell"));
		if (listCells.size() > 0) {
			for (WebElement desiredElement : listCells) {
				if (desiredElement.findElements(By.className("XCUIElementTypeButton")).size() == 0) {
					parentCell = desiredElement;
					break;
				}
			}
			if (parentCell != null) {
				parentLabelElement = parentCell.findElements(By.className("XCUIElementTypeStaticText")).get(0);
			}
		}
		return parentLabelElement;
	}

	private WebElement getCreatedTagLabel(String uniqueTagName) {
		WebElement tag;

		if(Config.isAndroid()) {
			tag = getDriver().findElement(MobileBy.xpath("//*[contains(@text, '" + uniqueTagName + "')]"));
		} else {

			tag = element(MobileBy.iOSNsPredicateString(
					"type == 'XCUIElementTypeStaticText' AND name CONTAINS '" + uniqueTagName + "'"));
		}
		return tag;
	}

	public void shouldSeeJustCreatedTagUpCaseWithSwipe(String tagName) {
		if (Config.isAndroid()) {
			setImplicitTimeout(1, SECONDS);
			Helper.androidSwipeDownUntilElementVisible(tagName);
			resetImplicitTimeout();
			element(MobileBy.xpath("//*[contains(@text, '" + tagName + "')]")).shouldBeVisible();
		} else {
			element(searchTagTexBox).sendKeys(tagName);
			element(MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[$name CONTAINS '" + tagName + "'$]")).shouldBeVisible();
//			WebElement justCreatedTag = getDriver().findElement(MobileBy.AccessibilityId(tagName));
//			Helper.swipeDownUntilElementVisible(justCreatedTag);
//			element(justCreatedTag).shouldBeVisible();
		}
	}

	public void justCreatedTagIsAddedToListingWithRemoveAnotherTags(String tagName) {
		if(Config.isAndroid()) {
			while((getDriver().findElements(By.xpath("//*[contains(@text, '" + tagName + "')]")).size() < 1)/* && Helper.isElementDisplayed(moreTagIcon)*/) {
				element(deleteTagButton).click();
			}
			element(MobileBy.xpath("//*[contains(@text, '" + tagName + "')]")).shouldBeVisible();
		} else {
//			while((!(element(MobileBy.AccessibilityId(tagName)).isPresent()))/* && Helper.isElementDisplayed(moreTagIcon)*/) {
//				element(deleteTagButton).click();
//			}
			element(MobileBy.AccessibilityId(tagName)).shouldBeVisible();
		}
	}

	public void shouldSeeTaggedListing(String stringBuildingAddress) {
		if(Config.isAndroid()) {
			element(MobileBy.xpath("//*[contains(@text,'" + stringBuildingAddress + "')]")).shouldBeVisible();
		} else {
			Assert.assertEquals(stringBuildingAddress.toLowerCase(), buildingAddress.getAttribute("value").toLowerCase());
		}
	}

	public void clickOnFirstTagAndGetValue() {
		String firstTagAttribute;
		if(Config.isAndroid()) {
			firstTagAttribute = firstTag.getAttribute("text");
		} else {
			firstTagAttribute = firstTag.getAttribute("value");
		}

		if (firstTagAttribute.contains("item")) {
			SessionVariables.addValueInSessionVariable("First_Existing_Tag", firstTag.getAttribute("value")
					.substring(0, firstTag.getAttribute("value").indexOf(" ")));
		} else {
			SessionVariables.addValueInSessionVariable("First_Existing_Tag", firstTagAttribute);
		}
		element(firstTag).click();
	}

	public void closeTagsPage() {
		element(tagsPageCloseButton).click();
	}

	public void clickOnExistingTag() {
		if(Config.isAndroid()) {
			element(MobileBy.xpath("//*[contains(@text,'" + SessionVariables.getValueFromSessionVariable("First_Existing_Tag") + "')]")).click();
		} else {
			element(MobileBy.iOSNsPredicateString("value CONTAINS '" + SessionVariables.getValueFromSessionVariable("First_Existing_Tag") + "'")).click();
		}
	}

	public void shouldNotSeeCreatedTagUpperCase(String tag) {
		setImplicitTimeout(3, SECONDS);
		if (Config.isAndroid()) {
			element(MobileBy.xpath("//android.widget.TextView[@text='" + tag + "']")).shouldNotBeVisible();
		} else {
			element(MobileBy.iOSNsPredicateString("label CONTAINS '" + tag + "'")).shouldNotBeVisible();
		}
		resetImplicitTimeout();
	}

	public void clearTextField() {
		element(clearTextFieldButton).click();
	}

	public void checkIfTagsPageIsReturnedToInitialState(int sizeToCheck) {
		Assert.assertTrue(visibleTagsList.size() > sizeToCheck);
	}

	public void shouldSeeOnlySearchedTags(String text, int numberTags) {
		boolean onlySearchedTagsAreShown = false;

		if(visibleTagsList.size() == numberTags) {
			onlySearchedTagsAreShown = true;
			for(WebElement tag: visibleTagsList) {

				if(!tag.getAttribute("value").contains(text)) {
					onlySearchedTagsAreShown = false;
					break;
				}
			}
		}
		Assert.assertTrue(onlySearchedTagsAreShown);
	}

	public void swipeTag(String tagName) {
		WebElement tag = element(MobileBy.iOSNsPredicateString("value BEGINSWITH '" + tagName + "'"));
		horizontalElementSwipeForIOS(tag, 120);
	}

	public void clickOnEditTagIcon() {
		element(editIcon).click();
	}

	public void checkJustTagHasGreenBellIcon() {
		Assert.assertEquals(1, activeBellIconsList.size());
	}

	public void grayBellButtonIsShown() {
		Assert.assertEquals(1, inactiveBellButtonsList.size());
	}

	public void editIconIsShown() {
		Assert.assertEquals(1, editIconList.size());
	}

	public void clickOnGrayBellButton() {
		element(inactiveBellButton).click();
	}

	public void checkNoOneActiveBellDisplayed() {
		setImplicitTimeout(3, SECONDS);
		element(MobileBy.iOSNsPredicateString("name CONTAINS 'image: notification active'")).shouldNotBeVisible();
		resetImplicitTimeout();
	}

	public void clickOnGreenBellButton() {
//		waitFor(ExpectedConditions.visibilityOf(activeBellButton));
		element(activeBellButton).click();
	}

	public void checkIfTagsItemsListIsChanged(int value) {
		int itemsAmount;

		String element = element(MobileBy.iOSNsPredicateString("label CONTAINS '" +
				SessionVariables.getValueFromSessionVariable("First_Existing_Tag") + "'")).getAttribute("value");
		if (element.length() == 26) {
			itemsAmount = 0;
		} else {
			itemsAmount = Integer.parseInt(element.substring(element.indexOf(" ") + 1).replaceAll("[ items]", ""));
		}
		Assert.assertEquals(tagsItemsValue, itemsAmount-value);
	}

	public void getFirstTagsItemsValue() {
		String element = firstTag.getAttribute("value");

		if (element.length() == 26) {
			tagsItemsValue = 0;
		} else {
			tagsItemsValue = Integer.parseInt(element.substring(element
					.indexOf(" ") + 1).replaceAll("[ items]", ""));
		}
	}

	public void clickOnSpecificTagPillInSearchField(String tagName) {
//		element(MobileBy.AccessibilityId(tagName)).click();
		element(MobileBy.iOSClassChain("**/XCUIElementTypeOther[$name BEGINSWITH 'tag color: #'$]/XCUIElementTypeOther/XCUIElementTypeStaticText[$name='" + tagName + "'$]")).click();
	}

	public void checkIfTagPillIsRemoved(String tagName) {
		setImplicitTimeout(5, SECONDS);
//		element(MobileBy.AccessibilityId("Tag view: " + tagName)).shouldNotBeVisible();
		element(MobileBy.iOSClassChain("**/XCUIElementTypeOther[$name BEGINSWITH 'tag color: #'$]/XCUIElementTypeOther/XCUIElementTypeStaticText[$name='" + tagName + "'$]")).shouldNotBeVisible();
		resetImplicitTimeout();
	}

	public void getTestClientsItemsValue() {
		String element = firstClientTag.getAttribute("value");

		if (element.length() == 19) {
			tagsItemsValue = 0;
		} else {
			tagsItemsValue = Integer.parseInt(element.replace(SearchRequests.CLIENT0_TEST, "")
					.replace(" item", "").replace("   ", "").replace("s", ""));
		}
	}

	public void clickOnFirstClientTag() {
		String clientValue = firstClientTag.getAttribute("value").replace(" item", "")
                .replace("  ", "").replace("s", "");
		String processedClientValue = clientValue.substring(0, clientValue.lastIndexOf(" "));
		SessionVariables.addValueInSessionVariable("First_Existing_Tag", processedClientValue);
		element(firstClientTag).click();
	}

	public void checkIfClientTagsItemsListIsChanged(int value) {
		int itemsAmount;

		String element = element(MobileBy.iOSNsPredicateString("label CONTAINS '" +
				SessionVariables.getValueFromSessionVariable("First_Existing_Tag") + "'")).getAttribute("value");
		if (element.length() == 19) {
			itemsAmount = 0;
		} else {
			itemsAmount = Integer.parseInt(element.replace(SearchRequests.CLIENT0_TEST, "")
					.replace(" item", "").replace("   ", "").replace("s", ""));
		}
		Assert.assertEquals(tagsItemsValue, itemsAmount-value);
	}

    public void checkIfTagsCheckMarIsNotSelected() {
		String element = element(MobileBy.iOSNsPredicateString("label CONTAINS '" +
				SessionVariables.getValueFromSessionVariable("First_Existing_Tag") + "'")).getAttribute("name");
		String checkMarkNumber = element.substring(element.length()-5);

		element(MobileBy.iOSNsPredicateString("name == 'image: tag deselected '" + checkMarkNumber)).shouldNotBeVisible();
    }

	public void checkTagBelowOtherTagsLabel(String value) {
		WebElement tag = element(MobileBy.iOSNsPredicateString("value CONTAINS '"
				+ value + "'"));

		Assert.assertEquals(getYPositionOfElement(otherTagsLabel) + 60, getYPositionOfElement(tag));
	}

	public void checkClientTagBelowSharedWithClientLabel(String userName) {
		WebElement clientTag = element(MobileBy.iOSNsPredicateString("value CONTAINS '"
				+ userName + "'"));

		Assert.assertEquals(getYPositionOfElement(sharedWithClientLabel) + 61, getYPositionOfElement(clientTag));
	}

	public void checkNoOneTagIsAdded() {
		setImplicitTimeout(1, SECONDS);
		Assert.assertEquals(0, getDriver().findElements(MobileBy.iOSNsPredicateString("name CONTAINS 'Remove Button:'")).size());
		resetImplicitTimeout();
	}

	public void clickOnFirstAddedTagPil(String tag) {
//		element(MobileBy.AccessibilityId("Tag view: " + tag)).click();
		element(MobileBy.iOSClassChain("**/XCUIElementTypeOther[$name BEGINSWITH 'tag color: #'$]/XCUIElementTypeOther/XCUIElementTypeStaticText[$name='" + tag + "'$]")).click();
	}

	public void noOneTagWithItemIsShown() {
		setImplicitTimeout(3, SECONDS);
		Assert.assertEquals(0, getDriver().findElements(MobileBy.iOSNsPredicateString("name CONTAINS 'item'")).size());
		resetImplicitTimeout();
	}

	public void allTagsAreDeselected(int amount) {
		Assert.assertEquals(amount, uncheckedTagsList.size());
	}

	public void allTagsAreSelected(int amount) {
		Assert.assertEquals(amount, checkedTagsList.size());
	}

	public void oneItemForSearchedTagIsShown() {
		element(oneItem).shouldBeVisible();
	}

	public void shouldSeeSpecificTagsPill(String tagName) {
//		element(MobileBy.AccessibilityId("Tag view: " + tagName)).shouldBeVisible();
		element(MobileBy.iOSClassChain("**/XCUIElementTypeOther[$name BEGINSWITH 'tag color: #'$]/XCUIElementTypeOther/XCUIElementTypeStaticText[$name='" + tagName + "'$]")).shouldBeVisible();
	}

	public void clickOnFirstTag() {
		element(firstTag).click();
	}

	public void shouldSeeAddTagLabel() {
		element(addTagLabel).shouldBeVisible();
	}

	public void checkDuplicatedAndExistingTagsItemsAreSame() {
		int itemsAmount;

		String element = element(MobileBy.iOSNsPredicateString("label CONTAINS '" +
				SessionVariables.getValueFromSessionVariable("Duplicated_Tag") + "'")).getAttribute("value");

		itemsAmount = Integer.parseInt(element.substring(element.indexOf(" ") + 1).replaceAll("[ items]", ""));

		Assert.assertEquals(tagsItemsValue, itemsAmount);
	}

	public void checkIfSpecificTagIsVisible(String tagName) {
		setImplicitTimeout(3, SECONDS);
		element(MobileBy.iOSNsPredicateString("name CONTAINS 'label: " + tagName + "'")).shouldBeVisible();
		resetImplicitTimeout();
	}

	public void checkIfSpecificTagIsNotVisible(String tagName) {
		setImplicitTimeout(3, SECONDS);
		element(MobileBy.AccessibilityId("label: " + tagName)).shouldNotBeVisible();
		resetImplicitTimeout();
	}

	public void shouldNotSeeSpecificTagsPill(String tagName) {
		setImplicitTimeout(3, SECONDS);
		element(MobileBy.iOSClassChain("**/XCUIElementTypeOther[$name BEGINSWITH 'tag color: #'$]/XCUIElementTypeOther/XCUIElementTypeStaticText[$name='" + tagName + "'$]")).shouldNotBeVisible();
		resetImplicitTimeout();
	}

	public void checkIfTagsPillIsRenamed() {
		Assert.assertEquals(element(tagsFirstPill).getAttribute("name"), SessionVariables.getValueFromSessionVariable("Renamed_Tag"));
	}

	public void clickOnFirstCustomClientTagAndGetValue() {
		element(firstCustomClientTag).click();
		String tagValue = firstCustomClientTag.getAttribute("value");
		SessionVariables.addValueInSessionVariable("First_Custom_Client", tagValue.substring(0, tagValue.indexOf(" ")));
	}

	public void checkCustomTagsItemsValue() {
		element(MobileBy.AccessibilityId("items with tag: " + tagsItemsValue)).shouldBeVisible();
	}

	public void clearSearchField() {
		element(searchTagTexBox).clear();
	}

	public boolean isTagExists(String tagName) {
		return element(MobileBy.iOSNsPredicateString("name CONTAINS 'label: " + tagName + "'")).isVisible();
	}

	public void clickOnSpecificTag(String tagName) {
		element(MobileBy.iOSNsPredicateString("name CONTAINS 'label: " + tagName + "'")).click();
	}

	public void removeAllTagPills() {
		setImplicitTimeout(1, TimeUnit.SECONDS);
		while (element(removingTagPill).isVisible()) {
			element(removingTagPill).click();
		}
		resetImplicitTimeout();
	}


	public void clickOnCrossFromAccountTagsButton() {
		element(crossFromAccountTagsButton).click();
	}

	public void shouldSeeMyTagLabel() {
		element(myTagsLabel).shouldBeVisible();

	}

	public void clickOnCrossBackFromTagsButton() {
		element(crossBackFromTagsButton).click();
	}

	public void getTestClientZeroTagItemsAmount() {
		String element = firstTagWithItems.getAttribute("value");

		SessionVariables.addValueInSessionVariable("itemsAmount", element.substring(element
				.indexOf(" ") + 13).replaceAll("[ items]", ""));
	}

	public void clickOnFirstTagWithItems() {
		element(firstTagWithItems).click();
	}
}