package com.perchwell.pages.perchwell;

import com.perchwell.email.MailTrap;
import com.perchwell.entity.AppProperties;
import com.perchwell.entity.MailTrapResponse;
import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DiscussionsListPage extends BasePage {
	public DiscussionsListPage(WebDriver driver) {
		super(driver);
	}

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	private WebElement firstItem;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	private WebElement firstDiscussionClient;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]")
	private WebElement firstDiscussionMessage;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell/XCUIElementTypeButton")
	private WebElement deleteButton;

	@iOSXCUITFindBy(accessibility = "DiscussionsCancelButton")
	private WebElement closeButton;

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
}
