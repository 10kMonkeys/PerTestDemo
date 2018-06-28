package com.perchwell.pages.starting;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.perchwell.pages.base.BasePage;

public class WelcomePage extends BasePage {

	//region WebElements

    @AndroidFindBy(id="com.perchwell.re:id/log_in")
    @iOSXCUITFindBy(accessibility = "LOG IN")
    private WebElement loginButton;

    //@iOSXCUITFindBy(accessibility = "CONNECT WITH")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeButton")
    private WebElement connectWithButton;

    @iOSXCUITFindBy(accessibility = "“Perchwell Staging” Wants to Use “google.com” to Sign In")
    private WebElement useGoogleComMsg;

	@iOSXCUITFindBy(accessibility = "Continue")
	private WebElement continueButton;

	@iOSXCUITFindBy(accessibility = "FORGOT PASSWORD")
	private WebElement forgotPassword;

	//endregion

	public WelcomePage(WebDriver driver) {
		super (driver);
	}

    public void clickOnConnectWith() {
		element(connectWithButton).click();
	}

	public void clickOnForgotPassword() {
		element(forgotPassword).click();
	}

    public void clickOnLoginButton(){
        element(loginButton).click();
    }

	public void clickOnContinueButton(){
		element(continueButton).click();
	}

	public WebElement getUseGoogleComMsg() {
		return useGoogleComMsg;
	}
	
	public boolean isElementDisplayed(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}