package com.perchwell.pages.perchwell;

import com.perchwell.email.MailTrap;
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

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	private WebElement firstItem;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	private WebElement firstDiscussionClient;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]")
	private WebElement firstDiscussionMessage;

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

	public Boolean discussionsEmailSent(String emailText, String client_email) {
			//if string containcs of ' ' then must use - .replaceAll("[\\s]", "%20"));
		Boolean reportWasFound =false;
		MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(emailText);
		if (mailTrapResponse.length > 0) {
			for (MailTrapResponse my_responce : mailTrapResponse) {
				if (my_responce.getTo_email().equalsIgnoreCase(client_email)) {
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
}
