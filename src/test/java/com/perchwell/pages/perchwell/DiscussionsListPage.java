package com.perchwell.pages.perchwell;

import com.perchwell.email.MailTrap;
import com.perchwell.entity.AppProperties;
import com.perchwell.entity.MailTrapResponse;
import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

public class DiscussionsListPage extends BasePage {
	public DiscussionsListPage(WebDriver driver) {
		super(driver);
	}

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	private WebElement firstItem;

	//@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	private WebElement firstDiscussionClient;

	//@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]")
	private WebElement firstDiscussionMessage;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell/XCUIElementTypeButton")
	private WebElement deleteButton;

	@iOSXCUITFindBy(accessibility = "DiscussionsCancelButton")
	private WebElement closeButton;

	@iOSXCUITFindBy(accessibility = "DiscussionsSearchBar")
	private WebElement discussionsSearchBar;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'TEST CLIENT' AND visible==1")
	private WebElement testClientInFilterByPersonResult;

	@iOSXCUITFindBy(accessibility = "Clear text")
	private WebElement clearTextButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable/XCUIElementTypeCell[`visible == 1`]")
	private List<WebElement> clientsListOrDiscussionsList;

	public String getFistDiscussionClient() {
		return element(firstDiscussionClient).getAttribute("name");
	}

	public String getFistDiscussionMessage() {
		return element(firstDiscussionMessage).getAttribute("name");
	}

	public void addValueInSessionVariable(String name, String value) {
		Serenity.setSessionVariable(name).to(value);
	}

	public String getValueFromSessionVariable(String name) {
		return Serenity.sessionVariableCalled(name);
	}

	public void clickFirstDiscussion() {
		element(firstItem).click();
	}

	public Boolean discussionsEmailSent(String emailText) {
			//if string containcs of ' ' then must use - .replaceAll("[\\s]", "%20"));
		Boolean reportWasFound =false;
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


	public boolean discusionWithMsgIsDispayed(String message) {
		return Helper.isElementDisplayed(element(MobileBy.name(message)));
	}

	public WebElement getFirstItemValue() {
		return firstItem;
	}

	public void swipeFirstDiscussionName(WebElement name) throws Exception{
		int y = firstItem.getLocation().getY();
		Helper.swipeRightElementWithSetY(name, y+1);
	}

	public void clickOnDeleteButton() {
		element(deleteButton).click();
	}

	public boolean isDeletedDiscussionNotPresentInDiscussionsList(String name) {
		return !element(MobileBy.AccessibilityId(name)).isPresent();
	}

	public void closePage() {
		element(closeButton).click();
	}

	public void enterValueInSearchField(String text) {
		element(discussionsSearchBar).sendKeys(text);
	}

	public boolean isTestClientInFilterSearchResult() {
		return element(testClientInFilterByPersonResult).isPresent();
	}

	public void clickOnClearTextButton() {
		element(clearTextButton).click();
	}

	public boolean isFilterByPersonEmpty() {
		return clientsListOrDiscussionsList.isEmpty();
	}

	public void clickOnTestClientInFilterSearch() throws Exception {
		if (!element(testClientInFilterByPersonResult).isVisible()) {
			Helper.swipeDownUntilElementVisible(testClientInFilterByPersonResult);
		}
		element(testClientInFilterByPersonResult).click();
	}

	public boolean isOnlyDiscussionWithTestClientDisplayed() {

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
}
