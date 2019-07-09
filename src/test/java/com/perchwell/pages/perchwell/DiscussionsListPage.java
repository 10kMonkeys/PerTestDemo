package com.perchwell.pages.perchwell;

import com.perchwell.crossPlatform.Config;
import com.perchwell.email.MailTrap;
import com.perchwell.entity.AppProperties;
import com.perchwell.entity.MailTrapResponse;
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
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.perchwell.email.MailTrap.getTextBody;

public class DiscussionsListPage extends TechHelper {

	@AndroidFindBy(id = "com.perchwell.re.staging:id/foreground_container")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	private WebElement firstItem;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/client_name")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	private WebElement firstDiscussionClient;

	@AndroidFindBy(xpath = "(//*[@resource-id='com.perchwell.re.staging:id/last_message'])[1]")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]")
	private WebElement firstDiscussionMessage;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/delete_button")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell/XCUIElementTypeButton")
	private WebElement deleteButton;

	@iOSXCUITFindBy(accessibility = "DiscussionsCancelButton")
	private WebElement closeButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/search_src_text")
	@iOSXCUITFindBy(accessibility = "DiscussionsSearchBar")
	private WebElement discussionsSearchBar;

	@AndroidFindBy(xpath = "//*[contains(@text, 'CLIENT TEST+CLIENT-TH-CHARTS')]")
	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'CLIENT TEST+CLIENT-TH-CHARTS' AND visible==1")
	private WebElement testClientInFilterByPersonResult;

	@AndroidFindBy(accessibility = "Clear query")
	@iOSXCUITFindBy(accessibility = "Clear text")
	private WebElement clearTextButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable/XCUIElementTypeCell[`visible == 1`]")
	private List<WebElement> clientsListOrDiscussionsList;

	public DiscussionsListPage(WebDriver driver) {
		super(driver);
	}

	private String getFistDiscussionClient() {
		if (Config.isAndroid()){
			return element(firstDiscussionClient).getAttribute("text");
		}
		else {
			return element(firstDiscussionClient).getAttribute("name");
		}
	}

	private String getFistDiscussionMessage() {
		if (Config.isAndroid()){
			return element(firstDiscussionMessage).getAttribute("text");
		}
		else {
			return element(firstDiscussionMessage).getAttribute("name");
		}
	}

	public void clickOnFirstDiscussion() {
//		element(firstItem).click();
		element(firstDiscussionMessage).click();
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
			for (MailTrapResponse my_response : mailTrapResponse) {
				if (getTextBody(my_response.getTxt_path()).contains(emailText)) {
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
		Helper.universalHorizontalSwipe(name, y+1);
	}

	public void clickOnDeleteButton() {
		element(deleteButton).click();
		if(!Config.isAndroid()) {
			waitFor(ExpectedConditions.invisibilityOf(deleteButton));
		}
	}

	public void shouldBeDiscussionDeletedFromDiscussionsList() {
		String message = SessionVariables.getValueFromSessionVariable("message");

		setImplicitTimeout(3, TimeUnit.SECONDS);
		if (Config.isAndroid()) {
			element(MobileBy.xpath("//*[@text = '" + message + "']")).shouldNotBePresent();
		} else {
			element(MobileBy.AccessibilityId(message)).shouldNotBePresent();
		}
		resetImplicitTimeout();
	}

	public void closePage() {
		element(closeButton).click();
	}

	public void enterValueInSearchField(String text) {
		if(Config.isAndroid()) {
			element(discussionsSearchBar).click();
		}
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
				if (text.contains("CLIENT TEST+CLIENT-TH-CHARTS")) {
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
		if (Config.isAndroid()) {
			return element(MobileBy.xpath("//*[@text = '" + message + "']"));
		} else {
			return getDriver().findElement(MobileBy.AccessibilityId(message));
		}
	}
}
