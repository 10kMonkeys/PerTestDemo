package com.perchwell.pages.starting;

import com.perchwell.pages.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.URL;
import java.util.Set;

public class GoogleLoginPage  extends BasePage {

    public GoogleLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath= "//*[@id=\"identifierId\"]")
    private WebElement emailTextBox;

    @FindBy(xpath = "//*[@id=\"passwordNext\"]/content/span")
    private WebElement passwordNextButton;

	@FindBy(xpath = "//*[@id=\"identifierNext\"]/content/span")
	private WebElement identifierNextButton;

    @FindBy(xpath= "//*[@id=\"password\"]/div[1]/div/div[1]/input")
    private WebElement passwordField;

	@FindBy(xpath = "//*[@id=\"view_container\"]/form/div[2]/div/div/div/ul[1]/li[1]/div")
	private WebElement existingAccount;

	@iOSXCUITFindBy(accessibility = "Choose an account")
	private WebElement chooseAnAccountLabel;

	public void selectWebView(){
		WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
		WebDriver webDriver = webDriverFacade.getProxiedDriver();
		AppiumDriver appiumDriver = (AppiumDriver) webDriver;
		Set<String> contextNames = appiumDriver.getContextHandles();
		appiumDriver.context((String) contextNames.toArray()[1]); // set context to WEBVIEW_1
	}

	public void selectNativeView(){
		WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
		WebDriver webDriver = webDriverFacade.getProxiedDriver();
		AppiumDriver appiumDriver = (AppiumDriver) webDriver;
		Set<String> contextNames = appiumDriver.getContextHandles();
		appiumDriver.context("NATIVE_APP");
	}

	public void setEmail(String email) {
    //  waitFor(emailTextBox);
		emailTextBox.sendKeys(email);
    }

    public void clickLogin() { element(identifierNextButton).click(); }

    public void clickNextButton(){
		element(passwordNextButton).click();
	}

    public void setPassword(String password) { element(passwordField).sendKeys(password); }

	public void clickExistingAccountDisplayed() { element(existingAccount).click(); }

	public WebElement getExistingAccount() {
		selectWebView();
		return existingAccount;
	}

	public boolean isElementDisplayed(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
