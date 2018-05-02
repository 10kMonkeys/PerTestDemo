package com.perchwell.steps;

import com.perchwell.email.NewInstanceSafariDriver;
import com.perchwell.entity.AppProperties;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.starting.LoginPage;
import com.perchwell.pages.starting.WelcomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class ResetPasswordSteps extends ScenarioSteps {

    LoginPage loginPage;
    WelcomePage welcomePage;

    @Step
    public void setRestEmail(String email){
        loginPage.setRestEmail(email);
    }

    @Step
    public void resetPasswordButtonClick(){
        loginPage.resetPasswordButtonClick();
    }

    @Step
    public void shouldFindSentEmail(){
        Assert.assertTrue(loginPage.shouldFindSentEmail(AppProperties.INSTANCE.getProperty("reset_email")));
    }

    @Step
    public void getResetToken(){
        loginPage.getResetToken(SessionVariables.getValueFromSessionVariable("emailText"));
    }

    @Step
    public void setNewPassword() throws InterruptedException {
        NewInstanceSafariDriver.resetPasswordInSafari(loginPage.generateNewPassword());
    }

    @Step
    public void backButtonClick(){
        loginPage.backButtonClick();
    }

    @Step
    public void isAccountNeededToSignInMessageDisplayed(){
        loginPage.shouldSeeAccountNeededToSignInMessage();
    }

    @Step
    public void okButtonClick(){
        loginPage.okButtonCLick();
    }

    @Step
    public void clickOnForgotPassword() {
        welcomePage.clickOnForgotPassword();
    }

    @Step
    public void login(String email, String password) {
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        loginPage.clickOnLoginButton();
    }

    @Step
    public void overwritingOldPassword(){
        AppProperties.INSTANCE.setProperty("old_reset_password",AppProperties.INSTANCE.getProperty("new_reset_password"));
    }
}
