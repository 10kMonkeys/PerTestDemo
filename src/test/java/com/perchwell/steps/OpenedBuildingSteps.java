package com.perchwell.steps;

import com.perchwell.pages.perchwell.OpenedBuildingPage;
import net.serenitybdd.core.Serenity;
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

    @Step ("Add to compare {0}")
    public void addToCompare(String buildingName) {
        openedBuildingPage.clickAddToCompareButton();
        addBuildingAddressInSessionVariable(buildingName, openedBuildingPage.getBuildingAddress());

    }

     private void addBuildingAddressInSessionVariable(String buildingName, String buildingAddress){
        openedBuildingPage.addBuildingAddressInSessionVariable(buildingName, buildingAddress);


}

public void shouldSeeBuildingAddress() {
    Assert.assertTrue(openedBuildingPage.getBuildingAddress().equalsIgnoreCase(openedBuildingPage.getBuildingAddressFromSessionVariable("buidingAddress")));

}
}
