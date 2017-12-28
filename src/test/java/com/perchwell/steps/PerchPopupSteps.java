package com.perchwell.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.perchwell.pages.perchwell.PerchPopupPage;
import org.junit.Assert;

public class PerchPopupSteps extends ScenarioSteps {
    PerchPopupPage perchPopupPage;

    @Step
    public void clickNotNowButton () {
        perchPopupPage.clickNotNowButton();
    }


    @Step
    public void shouldSeePopupText() throws Exception {
        Assert.assertTrue(perchPopupPage.popupTextIsDispalyed());
    }


}
