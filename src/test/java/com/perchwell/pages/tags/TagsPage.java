package com.perchwell.pages.tags;

import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

public class TagsPage extends BasePage {
	public TagsPage(WebDriver driver) {
		super(driver);
	}

	//@iOSXCUITFindBy(accessibility = "tagSearchButton")
	@iOSXCUITFindBy(accessibility = "TagSearchButton")
	private WebElement tagSearchButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSearchField")
	private WebElement searchTagTexBox;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell")
	private WebElement createTagLabel;

	@iOSXCUITFindBy(accessibility = "Nav Back White")
	private WebElement back;

	private WebElement getCreatedTagLabel(String uniqueTagName) {
		WebElement createdTag = getDriver().findElement(MobileBy.AccessibilityId(uniqueTagName));
		return createdTag;
	}

	@iOSXCUITFindBy(accessibility = "search")
	private WebElement searchButton;

	public void setUniqueSearchTagTextBox(String uniqueTagName) {
		element(searchTagTexBox).sendKeys(uniqueTagName);
	}

	public void clickCreateTagLabel() {
		element(createTagLabel).click();
	}

	public void clickBackButton() {
		element(back).click();
	}

	public void clickTagSearchButton() {
		element(tagSearchButton).click();
	}

	public void clickTagLabel(String TagName) {
		this.getCreatedTagLabel(TagName).click();
	}

	public void clickSearchButton() {
		element(searchButton).click();
	}

	public boolean isTagDisplayed(String tagName) {
		return isElementVisible(MobileBy.AccessibilityId(tagName));

	}

	public boolean isTagDisplayedWithSwipe(String tagName) throws Exception {
		if (getDriver().findElements(MobileBy.AccessibilityId(tagName)).size() > 0) {
			setImplicitTimeout(1, SECONDS);
			Helper.swipeDownUntilElementVisible(tagName);
			resetImplicitTimeout();
		}
		return isElementVisible(MobileBy.AccessibilityId(tagName));
	}

	public WebElement findExistingTagLabel() {
		WebElement parentCell = null;
		WebElement parentLabelElement = null;
		WebElement table = getDriver().findElement(By.xpath("//XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeTable"));
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


}