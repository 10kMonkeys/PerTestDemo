package com.perchwell.steps;


import com.perchwell.entity.Account;
import com.perchwell.pages.starting.LoginPage;
import com.perchwell.pages.starting.WelcomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class LoginSteps extends ScenarioSteps {

    Account account;
    WelcomePage welcomePage;
    LoginPage loginPage;

    @Step
    public void login() {

        welcomePage.clickLoginButton();
        loginPage.setEmail(account.email);
        loginPage.setPassword(account.password);
        loginPage.clickLogin();
    }
}
