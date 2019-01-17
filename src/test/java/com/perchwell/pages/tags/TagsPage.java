package com.perchwell.pages.tags;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.Helper;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.base.BasePage;
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

public class TagsPage extends BasePage {

	private List<WebElement> tagsList = new ArrayList<>();

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

	//endregion

	public TagsPage(WebDriver driver) {
		super(driver);
	}

	public void setUniqueSearchTagTextBox(String uniqueTagName) {
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
			SessionVariables.addValueInSessionVariable("First_Existing_Tag", firstTag.getAttribute("name")
					.substring(0, firstTag.getAttribute("name").indexOf(" ")));
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
		if (Config.isAndroid()) {
			element(MobileBy.xpath("//android.widget.TextView[@text='" + tag + "']")).shouldNotBeVisible();
		} else {
			element(MobileBy.AccessibilityId(tag)).shouldNotBeVisible();
		}
	}
}