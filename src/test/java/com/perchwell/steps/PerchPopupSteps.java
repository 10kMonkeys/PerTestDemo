package com.perchwell.steps;

import com.perchwell.crossPlatform.Config;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.perchwell.pages.perchwell.PerchPopupPage;

public class PerchPopupSteps extends ScenarioSteps {

    PerchPopupPage onPage;

    @Step
    public void clickNotNowButton () {
        if(!Config.isAndroid()) {
            onPage.clickOnNotNowButton();
        }
    }

    /* Not use in the new version
    @Step
    public void shouldSeePopupText() throws Exception {
        Assert.assertTrue(onPage.isPopupTextDispalyed());
    }
    */
}
