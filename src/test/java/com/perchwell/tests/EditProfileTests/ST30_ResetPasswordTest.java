package com.perchwell.tests.EditProfileTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "EditProfileTests", "Third"})
public class ST30_ResetPasswordTest extends SampleTest {

    @Test
    public void resetPasswordTest() throws Exception{
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("reset_email"),
                AppProperties.INSTANCE.getProperty("new_reset_password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickOpenAccountButton();
        accountSteps.openSettingsProfile();
        settingsProfileSteps.resetPasswordClick();
        resetPasswordSteps.resetPasswordButtonClick();
        resetPasswordSteps.shouldFindSentEmail();
        resetPasswordSteps.getResetToken();
        resetPasswordSteps.setNewPassword();
        settingsProfileSteps.backButtonClick();
        settingsProfileSteps.cancelButtonClick();
        clientSteps.logOut();
        clientSteps.clickYesButtonLogOutWindow();
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("reset_email"),
                AppProperties.INSTANCE.getProperty("old_reset_password"));
        resetPasswordSteps.isAccountNeededToSignInMessageDisplayed();
        resetPasswordSteps.okButtonClick();
        resetPasswordSteps.login(AppProperties.INSTANCE.getProperty("reset_email"),
                AppProperties.INSTANCE.getProperty("new_reset_password"));
        perchwellSteps.shouldSeeInitialIcon();
        resetPasswordSteps.overwritingOldPassword();
    }
}
