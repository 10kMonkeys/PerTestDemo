package com.perchwell.pages.perchwell;

import com.perchwell.email.MailTrap;
import com.perchwell.entity.AppProperties;
import com.perchwell.entity.MailTrapResponse;
import com.perchwell.helpers.Helper;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

public class DiscussionsListPage extends BasePage {

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	private WebElement firstItem;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	private WebElement firstDiscussionClient;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]")
	private WebElement firstDiscussionMessage;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell/XCUIElementTypeButton")
	private WebElement deleteButton;

	@iOSXCUITFindBy(accessibility = "DiscussionsCancelButton")
	private WebElement closeButton;

	@iOSXCUITFindBy(accessibility = "DiscussionsSearchBar")
	private WebElement discussionsSearchBar;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'TEST CLIENT1' AND visible==1")
	private WebElement testClientInFilterByPersonResult;

	@iOSXCUITFindBy(accessibility = "Clear text")
	private WebElement clearTextButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable/XCUIElementTypeCell[`visible == 1`]")
	private List<WebElement> clientsListOrDiscussionsList;

	public DiscussionsListPage(WebDriver driver) {
		super(driver);
	}

	private String getFistDiscussionClient() {
		return element(firstDiscussionClient).getAttribute("name");
	}

	private String getFistDiscussionMessage() {
		return element(firstDiscussionMessage).getAttribute("name");
	}

	public void clickOnFirstDiscussion() {
		element(firstItem).click();
	}

	public void shouldBeCreatedDiscussionFirst() {
		Assert.assertTrue(getFistDiscussionClient().equalsIgnoreCase(SessionVariables.getValueFromSessionVariable("Client")));
		Assert.assertTrue(getFistDiscussionMessage().equalsIgnoreCase(SessionVariables.getValueFromSessionVariable("message")));
	}

	public void shouldBeLastDiscussionWithBrokerFirst() {
		Assert.assertTrue(getFistDiscussionMessage().equalsIgnoreCase(SessionVariables.getValueFromSessionVariable("message")));
	}

	private boolean discussionsEmailSent(String emailText) {
			//if string containcs of ' ' then must use - .replaceAll("[\\s]", "%20"));
		boolean reportWasFound =false;
		MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(AppProperties.INSTANCE.getProperty("HEADER_DISCUSS"));
		if (mailTrapResponse.length > 0) {
			for (MailTrapResponse my_responce : mailTrapResponse) {
				if (my_responce.getHtml_body().contains(emailText)) {
					reportWasFound = true;
					break;
				}
			}
		}
		return reportWasFound;
	}

	public void shouldFindDiscussionsEmailForExistingClient() {
		Assert.assertTrue(discussionsEmailSent(SessionVariables.getValueFromSessionVariable("message")));
	}

	public void shouldNotBeDiscussionWithMessageDisplayed() {
		String messageForAgent = SessionVariables.getValueFromSessionVariable("Msg_for_agent");
		element(MobileBy.name(messageForAgent)).shouldNotBeVisible();
	}

	public WebElement getFirstItemValue() {
		return firstItem;
	}

	public void swipeFirstDiscussionName(WebElement name) throws Exception {
		Helper.swipeDownUntilElementVisible(name);
		int y = name.getLocation().getY();
		Helper.swipeRightElementWithSetY(name, y+1);
	}

	public void clickOnDeleteButton() {
		element(deleteButton).click();
	}

	public void shouldBeDiscussionDeletedFromDiscussionsList() {
		String message = SessionVariables.getValueFromSessionVariable("message");

		element(MobileBy.AccessibilityId(message)).shouldNotBePresent();
	}

	public void closePage() {
		element(closeButton).click();
	}

	public void enterValueInSearchField(String text) {
		element(discussionsSearchBar).sendKeys(text);
	}

	public void shouldBeTestClientPresentInFilterResult() {
		element(testClientInFilterByPersonResult).shouldBePresent();
	}

	public void clickOnClearTextButton() {
		element(clearTextButton).click();
	}

	public void shouldBeNothingDisplayedInFilterByPerson() {
		Assert.assertTrue(clientsListOrDiscussionsList.isEmpty());
	}

	public void clickOnTestClientInFilterSearch() throws Exception {
		if (!element(testClientInFilterByPersonResult).isVisible()) {
			Helper.swipeDownUntilElementVisible(testClientInFilterByPersonResult);
		}
		element(testClientInFilterByPersonResult).click();
	}

	private boolean isOnlyDiscussionWithTestClientDisplayed() {
		for (WebElement item : clientsListOrDiscussionsList) {
			int k = 0;
			List<WebElement> oneDiscussion = item.findElements(By.xpath("//XCUIElementTypeStaticText[@name]"));
			Iterator<WebElement> iterator = oneDiscussion.iterator();

			while (iterator.hasNext()) {
				String text = iterator.next().getText();
				if (text.contains("TEST CLIENT")) {
					k++;
					break;
				}
			}

			if (k != 1) {
				return false;
			}
		}
		return true;
	}

	public void shouldBeOnlyDiscussionWithTestClientDisplayed() {
		Assert.assertTrue(isOnlyDiscussionWithTestClientDisplayed());
	}

	public WebElement getJustCreatedDiscussion(String message) {
		return getDriver().findElement(MobileBy.AccessibilityId(message));
	}
}
