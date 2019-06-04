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
import org.openqa.selenium.support.ui.ExpectedConditions;

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
	private WebElement searchTagTextBox;

	@AndroidFindBy(xpath = "*//android.widget.TextView[contains(@text, '+ Create tag')]")
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

	@AndroidFindBy(xpath = "*//android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[@resource-id='com.perchwell.re.staging:id/tag_name']")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS '11CLIENTNAME' OR name CONTAINS 'TAGNAME'`][1]")
	private WebElement firstTag;

	@iOSXCUITFindBy(accessibility = "TagsViewControllerCancelButton")
	private WebElement tagsPageCloseButton;

	@AndroidFindBy(xpath = "//*[contains(@content-desc, 'ADDRESS: ')]")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$name BEGINSWITH 'ADDRESS: '$][$visible = 1$]")
	private WebElement buildingAddress;

	@AndroidFindBy(accessibility = "Clear query")
	@iOSXCUITFindBy(accessibility = "Clear text")
	private WebElement clearTextFieldButton;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'button: edit tag'")
	private WebElement editIcon;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'button: edit tag')]")
	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'button: edit tag'")
	private List<WebElement> editIconList;

	@iOSXCUITFindBy(accessibility = "DELETE")
	private WebElement deleteThisTagButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@content-desc, 'label:')]")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable/XCUIElementTypeCell[`visible==1`]/XCUIElementTypeStaticText")
	private List<WebElement> visibleTagsList;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'image: notification active')]")
	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'image: notification active'")
	private List<WebElement> activeBellIconsList;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'button: set notification active'")
	private List<WebElement> inactiveBellButtonsList;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'button: set notification inactive')]")
	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'button: set notification active'")
	private WebElement inactiveBellButton;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'button: set notification active')]")
	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'button: set notification inactive'")
	private WebElement activeBellButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'CLIENT TEST')]")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label CONTAINS 'CLIENT TEST'`][1]")
	private WebElement firstClientTag;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Other Tags']")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$name == 'Other Tags'$][1]")
	private WebElement otherTagsLabel;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Shared with clients']")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$name == 'Shared with clients'$][1]")
	private WebElement sharedWithClientLabel;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@content-desc, ' item ')]")
	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'item'")
	private WebElement oneItem;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'image: tag deselected')]")
	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'image: tag deselected'")
	private List<WebElement> uncheckedTagsList;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'image: tag selected')]")
	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'image: tag selected'")
	private List<WebElement> checkedTagsList;

	@iOSXCUITFindBy(accessibility = "ADD TAG")
	private WebElement addTagLabel;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[$name BEGINSWITH 'tag color: #'$]/XCUIElementTypeOther/XCUIElementTypeStaticText[$visible == 1$]")
	private WebElement tagsFirstPill;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label CONTAINS '11CLIENTNAME20'`][1]")
	private WebElement firstCustomClientTag;

	@AndroidFindBy(xpath = "*//android.widget.ImageView[contains(@content-desc, 'Remove Button: ')]")
	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name BEGINSWITH 'Remove Button: '")
	private WebElement removingTagPill;

	@iOSXCUITFindBy(accessibility = "TagsViewControllerCancelButton")
	private WebElement crossFromAccountTagsButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'MY TAGS')]")
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
		element(searchTagTextBox).sendKeys(uniqueTagName);
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
			tag = getDriver().findElement(MobileBy.xpath("//android.widget.TextView[contains(@text, '" + uniqueTagName + "')]"));
		} else {

			tag = element(MobileBy.iOSNsPredicateString(
					"type == 'XCUIElementTypeStaticText' AND name CONTAINS '" + uniqueTagName + "'"));
		}
		return tag;
	}

	public void shouldSeeJustCreatedTagUpCaseWithSwipe(String tagName) {
		if (Config.isAndroid()) {
			element(searchTagTextBox).sendKeys(tagName);
			element(MobileBy.xpath("//*[contains(@text, '" + tagName + "')]")).shouldBeVisible();
		} else {
			element(searchTagTextBox).sendKeys(tagName);
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
			Assert.assertEquals(stringBuildingAddress.toLowerCase(), buildingAddress.getAttribute("text").toLowerCase());
		} else {
			Assert.assertEquals(stringBuildingAddress.toLowerCase(), buildingAddress.getAttribute("value").toLowerCase());
		}
	}

    public void clickOnFirstTagAndGetValue() {
        String firstTagAttribute;
        if (Config.isAndroid()) {
            firstTagAttribute = firstTag.getAttribute("text");

            if (firstTagAttribute.contains("Item")) {
                SessionVariables.addValueInSessionVariable("First_Existing_Tag", firstTag.getAttribute("text")
                        .substring(0, firstTag.getAttribute("text").indexOf(" ")));
            } else {
                SessionVariables.addValueInSessionVariable("First_Existing_Tag", firstTagAttribute);
            }
        } else {
            firstTagAttribute = firstTag.getAttribute("value");

            if (firstTagAttribute.contains("item")) {
                SessionVariables.addValueInSessionVariable("First_Existing_Tag", firstTag.getAttribute("value")
                        .substring(0, firstTag.getAttribute("value").indexOf(" ")));
            } else {
                SessionVariables.addValueInSessionVariable("First_Existing_Tag", firstTagAttribute);
            }
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
		if(Config.isAndroid()) {
			element(searchTagTextBox).clear();
		} else {
			element(clearTextFieldButton).click();
		}
	}

	public void checkIfTagsPageIsReturnedToInitialState(int sizeToCheck) {
		Assert.assertTrue(visibleTagsList.size() > sizeToCheck);
	}

	public void shouldSeeOnlySearchedTags(String text, int numberTags) {
		boolean onlySearchedTagsAreShown = false;

		if(visibleTagsList.size() == numberTags) {
			onlySearchedTagsAreShown = true;

			if (Config.isAndroid()) {
				for (WebElement tag : visibleTagsList) {

					if (!tag.getAttribute("text").contains(text)) {
						onlySearchedTagsAreShown = false;
						break;
					}
				}
			} else {
				for (WebElement tag : visibleTagsList) {

					if (!tag.getAttribute("value").contains(text)) {
						onlySearchedTagsAreShown = false;
						break;
					}
				}
			}
		}
		Assert.assertTrue(onlySearchedTagsAreShown);
	}

	public void swipeTag(String tagName) {
		WebElement tag;
		if(Config.isAndroid()) {
			tag = element(MobileBy.xpath("//android.widget.TextView[contains(@text, '" + tagName +"')]"));
			int y = tag.getLocation().getY();
			universalHorizontalSwipe(tag, y + 1);
		} else {
			tag = element(MobileBy.iOSNsPredicateString("value BEGINSWITH '" + tagName + "'"));
			horizontalElementSwipeForIOS(tag, 120);
		}

	}

	public void clickOnEditTagIcon() {
		element(editIcon).click();
	}

	public void checkJustTagHasGreenBellIcon() {
		Assert.assertEquals(1, activeBellIconsList.size());
	}

	public void grayBellButtonIsShown() {
		if(Config.isAndroid()) {
			element(inactiveBellButton).shouldBeVisible();
		} else {
			Assert.assertEquals(1, inactiveBellButtonsList.size());
		}
	}

	public void editIconIsShown() {
		Assert.assertEquals(1, editIconList.size());
	}

	public void clickOnGrayBellButton() {
		element(inactiveBellButton).click();
	}

	public void checkNoOneActiveBellDisplayed() {
		setImplicitTimeout(3, SECONDS);
		if(Config.isAndroid()) {
			element(MobileBy.xpath("//android.widget.ImageView[contains(@content-desc, 'image: notification active')]")).shouldNotBeVisible();
		} else {
			element(MobileBy.iOSNsPredicateString("name CONTAINS 'image: notification active'")).shouldNotBeVisible();
		}
		resetImplicitTimeout();
	}

	public void clickOnGreenBellButton() {
//		waitFor(ExpectedConditions.visibilityOf(activeBellButton));
		element(activeBellButton).click();
	}

	public void checkIfTagsItemsListIsChanged(String tagName, int value) {
		int itemsAmount;
		String element;

		if(Config.isAndroid()) {
			element = element(MobileBy.xpath("//android.widget.TextView[contains(@content-desc, 'label:') and" +
					" contains(@text, '" + tagName + "')]")).getAttribute("text");
			if (element.length() == 26) {
				itemsAmount = 0;
			} else {
				itemsAmount = Integer.parseInt(element.substring(element.indexOf(" ") + 1).replaceAll("[ Items]", ""));
			}
		} else {
			element = element(MobileBy.iOSNsPredicateString("label CONTAINS '" +
					tagName + "'")).getAttribute("value");
			if (element.length() == 26) {
				itemsAmount = 0;
			} else {
				itemsAmount = Integer.parseInt(element.substring(element.indexOf(" ") + 1).replaceAll("[ items]", ""));
			}
		}
		Assert.assertEquals(tagsItemsValue, itemsAmount-value);
	}

	public void getFirstTagsItemsValue() {
		String element;

		if(Config.isAndroid()) {
			element = firstTag.getAttribute("text");

			if (element.length() == 26) {
				tagsItemsValue = 0;
			} else {
				tagsItemsValue = Integer.parseInt(element.substring(element
						.indexOf(" ") + 1).replaceAll("[ Items]", ""));
			}
		} else {
			element = firstTag.getAttribute("value");

			if (element.length() == 26) {
				tagsItemsValue = 0;
			} else {
				tagsItemsValue = Integer.parseInt(element.substring(element
						.indexOf(" ") + 1).replaceAll("[ items]", ""));
			}
		}
	}

	public void clickOnSpecificTagPillInSearchField(String tagName) {
//		element(MobileBy.AccessibilityId(tagName)).click();
		if(Config.isAndroid()) {
			waitFor(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.LinearLayout/android.widget.TextView[contains(@content-desc, '" + tagName + "')]")));
			element(MobileBy.xpath("//android.widget.LinearLayout/android.widget.TextView[contains(@content-desc, '" + tagName + "')]")).click();
		} else {
			waitFor(ExpectedConditions.elementToBeClickable(MobileBy.iOSClassChain("**/XCUIElementTypeOther[$name BEGINSWITH 'tag color: #'$]/XCUIElementTypeOther/XCUIElementTypeStaticText[$name='" + tagName + "'$]")));
			element(MobileBy.iOSClassChain("**/XCUIElementTypeOther[$name BEGINSWITH 'tag color: #'$]/XCUIElementTypeOther/XCUIElementTypeStaticText[$name='" + tagName + "'$]")).click();
		}
	}

	public void checkIfTagPillIsRemoved(String tagName) {
		setImplicitTimeout(5, SECONDS);
		if(Config.isAndroid()) {
			element(MobileBy.xpath("//android.widget.LinearLayout/android.widget.TextView[contains(@content-desc, '" + tagName + "')]")).shouldNotBeVisible();
		} else {
//		element(MobileBy.AccessibilityId("Tag view: " + tagName)).shouldNotBeVisible();
			element(MobileBy.iOSClassChain("**/XCUIElementTypeOther[$name BEGINSWITH 'tag color: #'$]/XCUIElementTypeOther/XCUIElementTypeStaticText[$name='" + tagName + "'$]")).shouldNotBeVisible();
		}
		resetImplicitTimeout();
	}

	public void getTestClientsItemsValue() {
		if(Config.isAndroid()) {
			String element = firstClientTag.getAttribute("text");

			if (element.length() == 19) {
				tagsItemsValue = 0;
			} else {
				tagsItemsValue = Integer.parseInt(element.replace(SearchRequests.CLIENT0_TEST, "")
						.replace(" Item", "").replace(" ", "").replace("s", ""));
			}
		} else {
			String element = firstClientTag.getAttribute("value");

			if (element.length() == 19) {
				tagsItemsValue = 0;
			} else {
				tagsItemsValue = Integer.parseInt(element.replace(SearchRequests.CLIENT0_TEST, "")
						.replace(" item", "").replace("   ", "").replace("s", ""));
			}
		}
	}

	public void clickOnFirstClientTag() {
		if(Config.isAndroid()) {
			String clientValue = firstClientTag.getAttribute("text").replace(" Item", "").replace("s", "");
			String processedClientValue = clientValue.substring(0, clientValue.lastIndexOf(" ") - 1);
			SessionVariables.addValueInSessionVariable("First_Existing_Tag", processedClientValue);
			element(firstClientTag).click();
		} else {
			String clientValue = firstClientTag.getAttribute("value").replace(" item", "")
					.replace("  ", "").replace("s", "");
			String processedClientValue = clientValue.substring(0, clientValue.lastIndexOf(" "));
			SessionVariables.addValueInSessionVariable("First_Existing_Tag", processedClientValue);
			element(firstClientTag).click();
		}
	}

	public void checkIfClientTagsItemsListIsChanged(int value) {
		int itemsAmount;

		if(Config.isAndroid()) {
			String element = element(MobileBy.xpath("//android.widget.TextView[contains(@text, '" +
					SessionVariables.getValueFromSessionVariable("First_Existing_Tag") + " ')]")).getAttribute("text");
			if (element.length() == 19) {
				itemsAmount = 0;
			} else {
				itemsAmount = Integer.parseInt(element.replace(SearchRequests.CLIENT0_TEST, "")
						.replace(" Item", "").replace(" ", "").replace("s", ""));
			}
			Assert.assertEquals(tagsItemsValue, itemsAmount-value);
		} else {
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
	}

    public void checkIfTagsCheckMarIsNotSelected() {
		setImplicitTimeout(5, SECONDS);
		if(Config.isAndroid()) {
			String element = element(MobileBy.xpath("//android.widget.TextView[contains(@content-desc, 'label:') and" +
					" contains(@text, '" + SessionVariables.getValueFromSessionVariable("First_Existing_Tag") + "')]")).getAttribute("name");
			String checkMarkNumber = element.substring(element.length() - 5);

			element(MobileBy.xpath("//android.widget.ImageView[contains(@content-desc, 'image: tag deselected " + checkMarkNumber + "')] ")).shouldNotBeVisible();
		} else {
			String element = element(MobileBy.iOSNsPredicateString("label CONTAINS '" +
					SessionVariables.getValueFromSessionVariable("First_Existing_Tag") + "'")).getAttribute("name");
			String checkMarkNumber = element.substring(element.length() - 5);

			element(MobileBy.iOSNsPredicateString("name == 'image: tag deselected '" + checkMarkNumber)).shouldNotBeVisible();
		}
		resetImplicitTimeout();
    }

	public void checkTagBelowOtherTagsLabel(String value) {
		WebElement tag;
		if(Config.isAndroid()) {
			tag = element(MobileBy.xpath("//android.widget.TextView[contains(@text, '" + value +"')]"));
			setImplicitTimeout(3, SECONDS);
			if(isElementDisplayed(myTagsLabel)) {
				Assert.assertEquals(getYPositionOfElement(otherTagsLabel) + 236, getYPositionOfElement(tag));
			} else {
				Assert.assertEquals(getYPositionOfElement(otherTagsLabel) - 233, getYPositionOfElement(tag));
			}
			resetImplicitTimeout();
		} else {
			tag = element(MobileBy.iOSNsPredicateString("value CONTAINS '"
					+ value + "'"));
			Assert.assertEquals(getYPositionOfElement(otherTagsLabel) + 60, getYPositionOfElement(tag));
		}

		System.out.println(getYPositionOfElement(otherTagsLabel));
		System.out.println(getYPositionOfElement(tag));
	}

	public void checkClientTagBelowSharedWithClientLabel(String userName) {
		WebElement clientTag;
		if(Config.isAndroid()) {
			clientTag = element(MobileBy.xpath("//android.widget.TextView[contains(@text, '" + userName +"')]"));
			Assert.assertEquals(getYPositionOfElement(sharedWithClientLabel) + 236, getYPositionOfElement(clientTag));
		} else {
			clientTag = element(MobileBy.iOSNsPredicateString("value CONTAINS '"
					+ userName + "'"));
			Assert.assertEquals(getYPositionOfElement(sharedWithClientLabel) + 61, getYPositionOfElement(clientTag));
		}
		System.out.println(getYPositionOfElement(sharedWithClientLabel));
		System.out.println(getYPositionOfElement(clientTag));
	}

	public void checkNoOneTagIsAdded() {
		if(Config.isAndroid()) {
			setImplicitTimeout(1, SECONDS);
			Assert.assertEquals(0, getDriver().findElements(MobileBy.xpath("*//android.widget.ImageView[contains(@content-desc, 'Remove Button: ')]")).size());
			resetImplicitTimeout();
		} else {
			setImplicitTimeout(1, SECONDS);
			Assert.assertEquals(0, getDriver().findElements(MobileBy.iOSNsPredicateString("name CONTAINS 'Remove Button:'")).size());
			resetImplicitTimeout();
		}
	}

	public void clickOnFirstAddedTagPil(String tag) {
//		element(MobileBy.AccessibilityId("Tag view: " + tag)).click();
		if(Config.isAndroid()) {
			element(MobileBy.xpath("//android.widget.LinearLayout[contains(@content-desc, 'tag color: #')]/android.widget.TextView[contains(@content-desc, '" + tag + "')]")).click();
		} else {
			element(MobileBy.iOSClassChain("**/XCUIElementTypeOther[$name BEGINSWITH 'tag color: #'$]/XCUIElementTypeOther/XCUIElementTypeStaticText[$name='" + tag + "'$]")).click();
		}
	}

	public void noOneTagWithItemIsShown() {
		if(Config.isAndroid()) {
			setImplicitTimeout(3, SECONDS);
			Assert.assertEquals(0, getDriver().findElements(MobileBy.xpath("//android.widget.TextView[contains(@content-desc, ' item ')]")).size());
			resetImplicitTimeout();
		} else {
			setImplicitTimeout(3, SECONDS);
			Assert.assertEquals(0, getDriver().findElements(MobileBy.iOSNsPredicateString("name CONTAINS 'item'")).size());
			resetImplicitTimeout();
		}
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
		if(Config.isAndroid()) {
			element(MobileBy.xpath("//android.widget.LinearLayout[contains(@content-desc, 'tag color: #')]/android.widget.TextView[contains(@content-desc, '" + tagName + "')]")).shouldBeVisible();
		} else {
			element(MobileBy.iOSClassChain("**/XCUIElementTypeOther[$name BEGINSWITH 'tag color: #'$]/XCUIElementTypeOther/XCUIElementTypeStaticText[$name='" + tagName + "'$]")).shouldBeVisible();
		}
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
		element(MobileBy.iOSNsPredicateString("name CONTAINS 'label: " + tagName + "'")).shouldNotBeVisible();
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
		element(searchTagTextBox).clear();
	}

	public boolean isTagExists(String tagName) {

		boolean isTagExist;

		if(Config.isAndroid()) {
			isTagExist = element(MobileBy.xpath("//android.widget.TextView[contains(@text, '" + tagName +"')]")).isVisible();
		} else {
			isTagExist = element(MobileBy.iOSNsPredicateString("name CONTAINS 'label: " + tagName + "'")).isVisible();
		}


		return isTagExist;
	}

	public void clickOnSpecificTag(String tagName) {
		if(Config.isAndroid()) {
			element(MobileBy.xpath("//android.widget.TextView[contains(@text, '" + tagName + "')]")).click();
		} else {
			element(MobileBy.iOSNsPredicateString("name CONTAINS 'label: " + tagName + "'")).click();
		}
	}

	public void removeAllTagPills() {
		waitABit(3000);
		setImplicitTimeout(3, TimeUnit.SECONDS);
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

	public void swipeTagPill(String tagName, int duration) {
		swipeUpElementIOS(element(MobileBy.iOSClassChain("**/XCUIElementTypeOther[$name BEGINSWITH 'tag color: #'$]/XCUIElementTypeOther/XCUIElementTypeStaticText[$name='" + tagName + "'$]")), duration);
	}

	public void checkIfFirstTagsItemsListIsEqual(int value) {
		this.getFirstTagsItemsValue();
		Assert.assertEquals(value, tagsItemsValue);
	}

	public void swipeAnyTagPill(int duration) {
		swipeUpElementIOS(element(MobileBy.iOSClassChain("**/XCUIElementTypeOther[$name BEGINSWITH 'tag color: #'$]/XCUIElementTypeOther/XCUIElementTypeStaticText[$value BEGINSWITH 'tag color: #'$]")), duration);
	}
}