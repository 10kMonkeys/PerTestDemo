package com.perchwell.pages.tags;

import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

public class TagsPage extends BasePage {

	//region WebElements

	@iOSXCUITFindBy(accessibility = "TagSearchButton")
	private WebElement tagSearchButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/search_src_text")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSearchField")
	private WebElement searchTagTexBox;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/create_tag")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell")
	private WebElement createTagLabel;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/up_button")
	@iOSXCUITFindBy(accessibility = "Nav Back White")
	private WebElement backButton;

	@iOSXCUITFindBy(accessibility = "search")
	private WebElement searchButton;

	@iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeButton' AND name CONTAINS 'DeleteTagBubbleButton'")
	private WebElement deleteTagButton;

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

	public void clickOnBackButton() {
		element(backButton).click();
	}


	public void clickOnTagLabel(String TagName) {
		this.getCreatedTagLabel(TagName).click();
	}

	public void clickOnSearchButton() {
		element(searchButton).click();
	}

	public boolean isTagDisplayed(String tagName) {
		return isElementVisible(MobileBy.AccessibilityId(tagName));

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
		return getDriver().findElement(MobileBy.AccessibilityId(uniqueTagName));
	}

	public void shouldSeeJustCreatedTagUpCaseWithSwipe(String tagName) throws Exception {
		WebElement justCreatedTag = getDriver().findElement(MobileBy.AccessibilityId(tagName));
		Helper.swipeDownUntilElementVisible(justCreatedTag);
		element(justCreatedTag).shouldBeVisible();
	}

	public void justCreatedTagIsAddedToListingWithRemoveAnotherTags(String tagName) {
		while(!(element(MobileBy.AccessibilityId(tagName)).isPresent())) {
			element(deleteTagButton).click();
		}
		element(MobileBy.AccessibilityId(tagName)).shouldBeVisible();
	}
}