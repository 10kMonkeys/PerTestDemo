package com.perchwell.pages.starting;

import com.perchwell.helpers.TechHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.URL;
import java.util.Set;

public class GoogleLoginPage extends TechHelper {

	//region WebElements
    @FindBy(xpath= "//*[@id='identifierId']")
    private WebElement emailTextBox;

    @FindBy(xpath = "//*[@id='passwordNext']/content/span")
    private WebElement passwordNextButton;

	@FindBy(xpath = "//*[@id='identifierNext']/content/span")
	private WebElement identifierNextButton;

    @FindBy(xpath= "//*[@id='password']/div[1]/div/div[1]/input")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id='view_container']/form/div[2]/div/div/div/ul[1]/li[1]/div/div[2]/p[2]")
	//@FindBy(xpath = "//*[@id='view_container']/form/div[2]/div/div/div/ul[1]/li[1]/div")
	private WebElement existingAccount;

	@iOSXCUITFindBy(accessibility = "Choose an account")
	private WebElement chooseAnAccountLabel;

	//endregion

	public GoogleLoginPage(WebDriver driver) {
		super(driver);
	}

	public void selectWebView() {
		WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
		WebDriver webDriver = webDriverFacade.getProxiedDriver();
		AppiumDriver appiumDriver = (AppiumDriver) webDriver;
		Set contextNames = appiumDriver.getContextHandles();
		if (contextNames.size() > 1) {
			appiumDriver.context((String) contextNames.toArray()[1]);
		}
	}

	public void selectNativeView() {
		WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
		WebDriver webDriver = webDriverFacade.getProxiedDriver();
		AppiumDriver appiumDriver = (AppiumDriver) webDriver;
		Set contextNames = appiumDriver.getContextHandles();
		System.out.println(contextNames);
		appiumDriver.context("NATIVE_APP");
	}

	public void setEmail(String email) {
		waitABit(30000);
		emailTextBox.sendKeys(email);
    }

    public void clickLogin() {
		element(identifierNextButton).click();
	}

    public void clickNextButton(){
		element(passwordNextButton).click();
	}

    public void setPassword(String password) {
		element(passwordField).sendKeys(password);
	}

	public void clickExistingAccountDisplayed() {
		element(existingAccount).click();
	}

	public WebElement getExistingAccount() {
		return existingAccount;
	}

	public WebElement getPasswordField() {
		return emailTextBox;
	}

	public boolean isElementDisplayed(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
