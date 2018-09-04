package com.perchwell.tests.EditProfileTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "EditProfileTests", "Fourth"})
public class ST30_ResetPasswordTest extends SampleTest {

    @Test
    public void resetPasswordTest(){
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("reset_email"),
                AppProperties.INSTANCE.getProperty("old_reset_password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.openSettingProfile();
        user.atSettingsProfilePage.resetPasswordClick();
        user.atResetPasswordPage.resetPasswordButtonClick();
        user.atResetPasswordPage.shouldFindSentEmail();
        user.atResetPasswordPage.getResetToken();
        user.atResetPasswordPage.setNewPassword();
        user.atSettingsProfilePage.backButtonClick();
        user.atSettingsProfilePage.cancelButtonClick();
        user.atClientPage.logOut();
        user.atClientPage.clickOnYesButtonLogOutWindow();
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("reset_email"),
                AppProperties.INSTANCE.getProperty("old_reset_password"));
        user.atResetPasswordPage.isAccountNeededToSignInMessageDisplayed();
        user.atResetPasswordPage.okButtonClick();
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("reset_email"),
                AppProperties.INSTANCE.getProperty("new_reset_password"));
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.shouldSeeInitialIcon();
        user.usingComplexSteps.returnOldPassword();
    }
}
