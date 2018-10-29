package com.perchwell.steps;

import com.perchwell.entity.AppProperties;
import com.perchwell.helpers.SlackMessageSender;
import com.perchwell.pages.starting.GoogleLoginPage;
import com.perchwell.pages.starting.LoginPage;
import com.perchwell.pages.starting.WelcomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {

    WelcomePage welcomePage;
    LoginPage loginPage;
 	GoogleLoginPage googleLoginPage;

    private void login (String email, String password) {
//        welcomePage.clickOnLoginButton();
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        loginPage.clickOnLoginButton();
    }

    @Step ("Log in as Client: {0}, {1}")
    public void loginAsClient(String email,String password){
      login(email,password);
    }

	@Step
	public void clickOnLoginButton(){
		welcomePage.clickOnLoginButton();
	}

    @Step ("Log in as Broker: {0}, {1}")
    public void loginAsBroker(String email,String password){
        login(email,password);
    }

    @Step ("Log in with Google ")
    public void loginWithGoogle() {
        welcomePage.clickOnConnectWith();
        if (welcomePage.isElementDisplayed(welcomePage.getUseGoogleComMsg())){
            welcomePage.clickOnContinueButton();
        }
        googleLoginPage.selectWebView();
        if (googleLoginPage.isElementDisplayed(googleLoginPage.getExistingAccount())) {
            googleLoginPage.clickExistingAccountDisplayed();
            googleLoginPage.selectNativeView();
        }
        else {
            googleLoginPage.setEmail(AppProperties.INSTANCE.getProperty("client_email"));
            googleLoginPage.clickLogin();
            googleLoginPage.setPassword(AppProperties.INSTANCE.getProperty("client_password"));
            googleLoginPage.clickNextButton();
            googleLoginPage.selectNativeView();
        }
    }
}
