package com.perchwell.tests.EditProfileTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "EditProfileTests"})
public class TC28_UpdateSettingsAsBroker extends SampleTest {

    @Test
    public void updateSettingAsBrokerTest() {
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("broker_test_email"),
                AppProperties.INSTANCE.getProperty("broker_test_password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickOpenAccountButton();
        accountSteps.openSettingsProfile();
        settingsProfileSteps.changeName();
        settingsProfileSteps.changeCompany();
        settingsProfileSteps.saveButtonClick();
        settingsProfileSteps.okButtonClick();
        settingsProfileSteps.isNameTextBoxChange();
        settingsProfileSteps.isCompanyTextBoxChange();
    }
}
