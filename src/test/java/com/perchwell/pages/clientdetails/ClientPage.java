package com.perchwell.pages.clientdetails;

import com.perchwell.email.MailTrap;
import com.perchwell.entity.MailTrapResponse;

import com.perchwell.helpers.Helper;
import com.perchwell.helpers.RandomGenerator;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ClientPage extends BasePage {

	public ClientPage(WebDriver driver) {
		super(driver);
	}

	@iOSXCUITFindBy(accessibility = "ADD NEW CLIENT")
	private WebElement addNewClientButton;

	@iOSXCUITFindBy(accessibility = "ADD NEW AGENT")
	private WebElement addNewAgentButton;

	@iOSXCUITFindBy(accessibility = "INVITE MY CLIENTS")
	private WebElement inviteNewClientButton;

	@iOSXCUITFindBy(accessibility = "client_name_text_field")
	private WebElement clientNameTextBox;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextView")
	private WebElement addMessageField;

	@iOSXCUITFindBy(accessibility = "client_email_text_field")
	private WebElement clientEmailTextBox;

	@iOSXCUITFindBy(accessibility = "agent_email_text_field")
	private WebElement agentEmailTextBox;

	@iOSXCUITFindBy(accessibility = "client_group_button")
	private WebElement groupLabel;

	//@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	private WebElement firstClientOrAgent;

	@iOSXCUITFindBy(accessibility = "AddClientViewControllerBackButton")
	private WebElement backButton;

	@iOSXCUITFindBy(accessibility = "Nav Back White")
	private WebElement backButtonCreateAgent;

	@iOSXCUITFindBy(accessibility = "contactsViewCloseButton")
	//@FindBy(xpath="//XCUIElementTypeNavigationBar[@name=\"SELECT CLIENT\"]/XCUIElementTypeButton")
	private WebElement closeButton;

	@iOSXCUITFindBy(accessibility = "INVITE")
	private WebElement inviteButton;

	@iOSXCUITFindBy(accessibility = "LOG OUT")
	private WebElement logOutButton;

	@iOSXCUITFindBy(accessibility = "YES")
	private WebElement yesButtonLogOutWindow;

	@iOSXCUITFindBy(accessibility = "OK")
	private WebElement okButton;

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

	public void clickYesButtonLogOutWindow() {
		element(yesButtonLogOutWindow).click();
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

	public void clickFirstClientOrAgent() {
		element(firstClientOrAgent).click();
	}

	public void selectGroup(String groupName) {
		this.getGroupLabelName(groupName).click();
	}

	public boolean isClientOrAgentDisplayed(String name) throws Exception {
		if (getDriver().findElements(MobileBy.AccessibilityId(name)).size() > 0) {
			setImplicitTimeout(1, SECONDS);
			Helper.swipeDownUntilElementVisible(name);
			resetImplicitTimeout();
		}
		return isElementVisible(MobileBy.AccessibilityId(name));
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

	public String getFirstClientOrAgentName() {
		return firstClientOrAgent.findElement(By.className("XCUIElementTypeStaticText")).getAttribute("name");
	}

	public void clickBackButton() {
		element(backButton).click();
	}

	public void closePage() {
		element(closeButton).click();
	}

	public void clickDesiredClientOrAgent(String name) {
		element(MobileBy.AccessibilityId(name)).click();
	}

	public void logOut() {
		element(logOutButton).click();
	}

	public String generateClientName() {
		return RandomGenerator.getRandomString("11CLIENTNAME");
	}

	public String generateClientEmail() {
		return RandomGenerator.getRandomString("11CLIENTEMAIL") + "@EMAIL.COM";
	}

	public void clickAddNewAgentButton() {
		element(addNewAgentButton).click();
	}

	public void setAgentEmail(String email) {
		element(agentEmailTextBox).sendKeys(email);
	}

	public void setMessageField(String message) {
		element(addMessageField).sendKeys(message);
	}

	public void clickBackButtonCreateAgent() {
		element(backButtonCreateAgent).click();
	}

	public void clickClientSuccessfullyAddedOkButton() {

		element(okButton).click();

	}
}
