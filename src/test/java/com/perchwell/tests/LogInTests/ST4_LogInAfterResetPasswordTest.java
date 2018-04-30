package com.perchwell.tests.LogInTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "LogInTests", "First"})
public class ST4_LogInAfterResetPasswordTest extends SampleTest {

    @Test
    public void logInAfterResetPasswordTest() throws Exception{
        loginSteps.clickOnLoginButton();
        resetPasswordSteps.clickOnForgotPassword();
        resetPasswordSteps.setRestEmail(AppProperties.INSTANCE.getProperty("reset_email"));
        resetPasswordSteps.resetPasswordButtonClick();
        resetPasswordSteps.shouldFindSentEmail();
        resetPasswordSteps.getResetToken();
        resetPasswordSteps.setNewPassword();
        resetPasswordSteps.backButtonClick();
        resetPasswordSteps.login(AppProperties.INSTANCE.getProperty("reset_email"),
                AppProperties.INSTANCE.getProperty("old_reset_password"));
        resetPasswordSteps.isAccountNeededToSignInMessageDisplayed();
        resetPasswordSteps.okButtonClick();
        resetPasswordSteps.login(AppProperties.INSTANCE.getProperty("reset_email"),
                AppProperties.INSTANCE.getProperty("new_reset_password"));
        perchwellSteps.shouldSeeEditSearchFiltersHint();
        resetPasswordSteps.overwritingOldPassword();
    }
}
