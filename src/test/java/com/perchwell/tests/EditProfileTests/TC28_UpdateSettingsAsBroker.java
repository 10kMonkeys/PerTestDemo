package com.perchwell.tests.EditProfileTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TC28_UpdateSettingsAsBroker extends SampleTest {

    @Test
    public void updateSettingAsBrokerTest() {
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickOpenAccountButton();
        accountSteps.openSettingsProfile();
        settingsProfileSteps.changeName();
        settingsProfileSteps.changeCompany();
        settingsProfileSteps.saveButtonClick();
        settingsProfileSteps.isNameTextBoxChange();
        settingsProfileSteps.isCompanyTextBoxChange();



    }
}
