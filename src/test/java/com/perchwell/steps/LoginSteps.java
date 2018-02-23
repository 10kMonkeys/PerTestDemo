package com.perchwell.steps;

import com.perchwell.entity.AppProperties;
import com.perchwell.pages.starting.GoogleLoginPage;
import com.perchwell.pages.starting.LoginPage;
import com.perchwell.pages.starting.WelcomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {

  //  Account account;
    WelcomePage welcomePage;
    LoginPage loginPage;
 	GoogleLoginPage googleLoginPage;

    private void login (String email, String password) {
        welcomePage.clickLoginButton();
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        loginPage.clickLogin();

    }

    @Step ("Log in as Client: {0}, {1}")
    public void loginAsClient(String email,String password){
      login(email,password);
       // AppProperties.INSTANCE.getProperty("client_email"), AppProperties.INSTANCE.getProperty("client_password")
    }

	@Step
	public void clickLoginButton(){
		welcomePage.clickLoginButton();
	}

    @Step ("Log in as Broker: {0}, {1}")
    public void loginAsBroker(String email,String password){
        login(email,password);
    }
    // AppProperties.INSTANCE.getProperty("email"), AppProperties.INSTANCE.getProperty("password")
    @Step
    public void clickForgotPassword() { welcomePage.clickForgotPassword(); }

    @Step ("Log in with Google ")
    public void loginWithGoogle() {
        welcomePage.clickConnectWith();
        if (welcomePage.isElementDisplayed(welcomePage.getUseGoogleComMsg())){
            welcomePage.clickContinueButton();
        };
        if (googleLoginPage.isElementDisplayed(googleLoginPage.getExistingAccount())) {
            googleLoginPage.clickExistingAccountDisplayed();
            googleLoginPage.selectNativeView();
            //welcomePage.clickConnectWith();
        }
        else {
            googleLoginPage.selectWebView();
            googleLoginPage.setEmail(AppProperties.INSTANCE.getProperty("client_email"));
            googleLoginPage.clickLogin();
            googleLoginPage.setPassword(AppProperties.INSTANCE.getProperty("client_password"));
            googleLoginPage.clickNextButton();
            googleLoginPage.selectNativeView();
        };
    }
}
