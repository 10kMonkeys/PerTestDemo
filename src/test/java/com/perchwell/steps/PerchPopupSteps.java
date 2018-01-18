package com.perchwell.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.perchwell.pages.perchwell.PerchPopupPage;
import org.junit.Assert;

public class PerchPopupSteps extends ScenarioSteps {
    PerchPopupPage onPage;

    @Step
    public void clickNotNowButton () {
        onPage.clickNotNowButton();
    }


    @Step
    public void shouldSeePopupText() throws Exception {
        Assert.assertTrue(onPage.popupTextIsDispalyed());
    }


}
