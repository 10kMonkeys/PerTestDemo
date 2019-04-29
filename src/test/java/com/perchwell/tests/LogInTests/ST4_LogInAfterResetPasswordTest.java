package com.perchwell.tests.LogInTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "LogInTests", "iOS_First", "Android_First", "First"})
public class ST4_LogInAfterResetPasswordTest extends SampleTest {

    @Test
    @Screenshots(disabled=true)
    public void logInAfterResetPasswordTest() {
        user.atLoginPage.clickOnLoginButton();
        user.atResetPasswordPage.clickOnForgotPassword();
        user.atResetPasswordPage.setRestEmail(AppProperties.INSTANCE.getProperty("reset_email")); ////
        user.atResetPasswordPage.resetPasswordButtonClick();
        user.atResetPasswordPage.shouldFindSentEmail();
        user.atResetPasswordPage.getResetToken();
        user.atResetPasswordPage.setNewPassword();  //change to check Chrome
        user.atResetPasswordPage.backButtonClick();
        user.atResetPasswordPage.backFromEmailPageClick();
        user.atResetPasswordPage.login(AppProperties.INSTANCE.getProperty("reset_email"),
                AppProperties.INSTANCE.getProperty("old_reset_password"));
        user.atResetPasswordPage.isAccountNeededToSignInMessageDisplayed();
        user.atResetPasswordPage.okButtonClick();
        user.atResetPasswordPage.clickOnBackFromLogin();
        user.atLoginPage.clickOnLoginButton();
        user.atResetPasswordPage.login(AppProperties.INSTANCE.getProperty("reset_email"),
                AppProperties.INSTANCE.getProperty("new_reset_password"));
        user.atPerchwellPage.shouldSeeEditSearchFiltersHint();
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.usingComplexSteps.returnOldPassword();  //change to check Chrome
    }
}
