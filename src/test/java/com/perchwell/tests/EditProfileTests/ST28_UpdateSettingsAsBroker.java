package com.perchwell.tests.EditProfileTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "EditProfileTests", "Third"})
public class ST28_UpdateSettingsAsBroker extends SampleTest {

    @Test
    public void updateSettingAsBrokerTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("broker_test_email"),
                AppProperties.INSTANCE.getProperty("broker_test_password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.openSettingProfile();
        user.atSettingsProfilePage.changeName();
        user.atSettingsProfilePage.changeCompany();
        user.atSettingsProfilePage.saveButtonClick();
        user.atSettingsProfilePage.okButtonClick();
        user.atSettingsProfilePage.isNameTextBoxChange();
        user.atSettingsProfilePage.isCompanyTextBoxChange();
    }
}
