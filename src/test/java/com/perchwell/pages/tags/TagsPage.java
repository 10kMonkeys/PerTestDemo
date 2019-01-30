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

	@iOSXCUITFindBy(id = "TagsViewControllerCancelButton")
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

	public void clickOnFirstTag() {
		if(Config.isAndroid()) {
			SessionVariables.addValueInSessionVariable("First_Existing_Tag", firstTag.getAttribute("text"));
		} else {
			SessionVariables.addValueInSessionVariable("First_Existing_Tag", firstTag.getAttribute("value")
					.substring(0, firstTag.getAttribute("value").indexOf(" ")));
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
		setImplicitTimeout(5, SECONDS);
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

	public void getTagsAmount() {
		tagsListSize = editIconList.size();
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
		Assert.assertEquals(0, getDriver().findElements(MobileBy.iOSNsPredicateString("name CONTAINS 'image: notification active'")).size());
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

	public void clickOnTagPillInSearchField() {
		element(MobileBy.AccessibilityId(SessionVariables.getValueFromSessionVariable("First_Existing_Tag"))).click();
	}

	public void checkIfTagPillIsRemoved() {
		setImplicitTimeout(5, SECONDS);
		element(MobileBy.AccessibilityId(SessionVariables.getValueFromSessionVariable("First_Existing_Tag"))).shouldNotBeVisible();
		resetImplicitTimeout();
	}

	public void getTestClientsItemsValue() {
		String element = firstClientTag.getAttribute("value");

		if (element.length() == 19) {
			tagsItemsValue = 0;
		} else {
			tagsItemsValue = Integer.parseInt(element.replace(SearchRequests.CLIENT0_TEST, "")
					.replace(" items", "").replace("   ", ""));
		}
	}

	public void clickOnFirstClientTag() {
		String clientValue = firstClientTag.getAttribute("value").replace(" items", "").replace("  ", "");
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
					.replace(" items", "").replace("   ", ""));
		}
		Assert.assertEquals(tagsItemsValue, itemsAmount-value);
	}

    public void checkIfTagsCheckMarIsNotSelected() {
		String element = element(MobileBy.iOSNsPredicateString("label CONTAINS '" +
				SessionVariables.getValueFromSessionVariable("First_Existing_Tag") + "'")).getAttribute("name");
		String checkMarkNumber = element.substring(element.length()-5);

		element(MobileBy.iOSNsPredicateString("name == 'image: tag deselected '" + checkMarkNumber));
    }

	public void searchJustCreatedClientTag(String userName) {
		element(searchTagTexBox).sendKeys(userName);
	}

	public void checkTagBelowOtherTagsLabel() {
		WebElement tag = element(MobileBy.iOSNsPredicateString("value CONTAINS '"
				+ SessionVariables.getValueFromSessionVariable("Just_Created_Tag") + "'"));

		Assert.assertEquals(getYPositionOfElement(otherTagsLabel) + 60, getYPositionOfElement(tag));
	}

	public void checkClientTagBelowSharedWithClientLabel() {
		WebElement clientTag = element(MobileBy.iOSNsPredicateString("value CONTAINS '"
				+ SessionVariables.getValueFromSessionVariable("User_name") + "'"));

		Assert.assertEquals(getYPositionOfElement(sharedWithClientLabel) + 61, getYPositionOfElement(clientTag));
	}

	public void findAndSelectFirstCreatedTag() {
		element(searchTagTexBox).sendKeys(SessionVariables.getValueFromSessionVariable("First_tag"));
		element(firstTag).click();
	}

	public void	findAndSelectSecondCreatedTag() {
		element(searchTagTexBox).sendKeys(SessionVariables.getValueFromSessionVariable("Second_tag"));
		element(firstTag).click();
	}
}