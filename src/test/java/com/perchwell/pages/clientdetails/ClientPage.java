package com.perchwell.pages.clientdetails;

import com.perchwell.email.MailTrap;
import com.perchwell.entity.MailTrapResponse;
import com.perchwell.pages.base.BaseSwipe;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ClientPage extends BaseSwipe {

public ClientPage(WebDriver driver) {
	super(driver);
}

@iOSXCUITFindBy(accessibility = "ADD NEW CLIENT")
private WebElement addNewClientButton;

@iOSXCUITFindBy(accessibility = "INVITE MY CLIENTS")
private WebElement inviteNewClientButton;

@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
private WebElement clientNameTextBox;

@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
private WebElement clientEmailTextBox;

@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeButton")
private WebElement groupLabel;

@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText")
private WebElement client;

@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeButton")
private WebElement backButton;

@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeButton")
private WebElement closeButton;

@iOSXCUITFindBy(accessibility = "INVITE")
private WebElement inviteButton;

public WebElement getAddNewClientButton() {
	return addNewClientButton;
}

private WebElement getGroupLabelName(String groupName) {
	WebElement groupLabelName = getDriver().findElement(MobileBy.AccessibilityId(groupName));
	return groupLabelName;
}

public void clickInviteButton() {
	element(inviteButton).click();
}

public void clickAddNewClientButton() {
	element(addNewClientButton).click();
}

public void clickInviteNewClientButton() {
	element(inviteNewClientButton).click();
}

public void setClientName(String clientName) {
	element(clientNameTextBox).sendKeys(clientName);
}

public void setClientEmail(String clientEmail) {
	element(clientEmailTextBox).sendKeys(clientEmail);
}

public void clickGroupLabel() {
	element(groupLabel).click();
}

public void clickClient() {
	element(client).click();
}

public void selectGroup(String groupName) {
	this.getGroupLabelName(groupName).click();
}

public boolean isClientDisplayed(String clientName) throws Exception {
	if (getDriver().findElements(MobileBy.AccessibilityId(clientName)).size() > 0) {
		setImplicitTimeout(1, SECONDS);
		swipeDownUntilElementVisible(clientName);
		resetImplicitTimeout();
	}
	return isElementVisible(MobileBy.AccessibilityId(clientName));
}

public void addValueInSessionVariable(String name, String value) {
	Serenity.setSessionVariable(name).to(value);
}

public String getValueFromSessionVariable(String name) {
	return Serenity.sessionVariableCalled(name);
}

public Boolean invitationEmailSent(String email) {
	MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(getValueFromSessionVariable(email));
	return (mailTrapResponse.length > 0);

}

public String getClientName() {
	return client.getAttribute("name");

}

public void clickBackButton() {
	element(backButton).click();
}

public void closePage() {
	element(closeButton).click();

}

public void clickDesiredClient(String clientName) {
	element(MobileBy.AccessibilityId(clientName)).click();

}
}
