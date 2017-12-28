package com.perchwell.steps;

import com.perchwell.pages.perchwell.OpenedBuildingPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class OpenedBuildingSteps extends ScenarioSteps {

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
        addBuildingAddressInList(openedBuildingPage.getBuildingAddress());

    }

     protected void addBuildingAddressInList(String buildingAddress){

                 openedBuildingPage.buildingAddressList.add(buildingAddress);
}

public void shouldSeeBuildingAddress() {
    Assert.assertTrue(openedBuildingPage.getBuildingAddress().equalsIgnoreCase(openedBuildingPage.buildingAddressList.get(0)));

}
}
