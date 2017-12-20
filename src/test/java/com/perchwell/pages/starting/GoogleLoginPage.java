package com.perchwell.pages.starting;

import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class GoogleLoginPage  extends BasePage {
    public GoogleLoginPage(WebDriver driver) {
        super(driver);
    }

    @iOSXCUITFindBy(accessibility= "Email or phone")
    private WebElement emailTextBox;


    @iOSXCUITFindBy(accessibility = "NEXT")
    private WebElement loginButton;


    @iOSXCUITFindBy(accessibility= "Enter your password")
    private WebElement passwordField;


	@iOSXCUITFindBy(accessibility = "Itech Perch itech.perch.test@gmail.com")
		private WebElement existingAccount;


	@iOSXCUITFindBy(accessibility = "Choose an account")
		private WebElement chooseAnAccountLabel;

    public void setEmail(String email) { element(emailTextBox).sendKeys(email); }

    public void clickLogin() { element(loginButton).click(); }

    public void setPassword(String password) { element(passwordField).sendKeys(password); }

	public void clickExistingAccountDisplayed() { element(existingAccount).click(); }
	public WebElement getExistingAccount() {
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
