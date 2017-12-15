package com.perchwell.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.perchwell.pages.perchwell.OpenedBuildingPage;

import java.util.List;

public class OpenedBuildingSteps extends ScenarioSteps{
    OpenedBuildingPage openedBuildingPage;

    @Step
    public void clickDiscussWithMyClientHint() { openedBuildingPage.clickDiscussWithMyClientHint(); }

    @Step
    public void clickMyTagsLabel() {
        openedBuildingPage.clickMyTagsLabel();
    }

    @Step
    public void clickBackButton() {
        openedBuildingPage.clickBackButton();
    }

    @Step
    public void ckickDeleteTagButton() {
        openedBuildingPage.ckickDeleteTagButton();
    }

    @Step
    public void addToCompare() {
        openedBuildingPage.clickAddToCompareButton();

    }


}
