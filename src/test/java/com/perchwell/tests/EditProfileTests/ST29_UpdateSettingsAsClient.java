package com.perchwell.tests.EditProfileTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "EditProfileTests", "Third"})
public class ST29_UpdateSettingsAsClient extends SampleTest {

    @Ignore //temp solution until new clients will be added
    @Test
    public void updateSettingAsClientTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("client_test_email"),
                AppProperties.INSTANCE.getProperty("client_test_password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.openSettingProfile();
        user.atSettingsProfilePage.changeNameAndCompany();
        user.atSettingsProfilePage.backButtonClick();
        user.atClientPage.logOut();
        user.atClientPage.clickOnYesButtonLogOutWindow();
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("client_test_email"),
                AppProperties.INSTANCE.getProperty("client_test_password"));
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.openSettingProfile();
        user.atSettingsProfilePage.isNameTextBoxChange();
        user.atSettingsProfilePage.isCompanyTextBoxChange();
    }
}
