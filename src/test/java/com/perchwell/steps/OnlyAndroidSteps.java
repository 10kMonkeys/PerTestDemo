package com.perchwell.steps;

import com.perchwell.crossPlatform.Config;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class OnlyAndroidSteps extends ScenarioSteps{

    @Steps
    private PerchwellSteps atPerchwellPage1;

    @Steps
    private SearchMenuSteps inSearchMenu1;

    @Steps
    private SearchSteps atSearchPage1;

    @Step
    public void resetListView() {
        inSearchMenu1.openSearchPage();
        atSearchPage1.clickOnApplyButton();
    }
}
