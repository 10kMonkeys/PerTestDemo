package com.perchwell.tests.EditProfileTests;

import com.perchwell.SampleTest;
import org.junit.Test;

public class TC29_UpdateSettingsAsClient extends SampleTest {

    @Test
    public void updateSettingAsBrokerTest() {
        loginSteps.loginAsClient();
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
