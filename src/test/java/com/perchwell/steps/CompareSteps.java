package com.perchwell.steps;

import com.perchwell.pages.perchwell.ComparePage;
import com.perchwell.pages.perchwell.OpenedBuildingPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CompareSteps extends ScenarioSteps {
    ComparePage comparePage;
    OpenedBuildingPage openedBuildingPage;

    @Step
    public void clickSwipeUpToRemoveHint() {
       comparePage.clickSwipeUpToRemoveHint();
    }

    @Step(("The first buildingAddressList is displayed without swipe"))
    public void firstBuildingIsDispayed(){
        Assert.assertTrue(comparePage.firstBuildingIsDispayed());
     }


    @Step("Shoud see the first buildingAddressList is selected earlier for compare")
    public void shoudSeeFirstBuildingInCompare() {

		Assert.assertTrue(comparePage.getFirstBuildingAddress().equalsIgnoreCase(openedBuildingPage.buildingAddressList.get(0)));

    }


    @Step("The second buildingAddressList is displayed without swipe")
    public void secondBuildingIsDispayed(){
        Assert.assertTrue(comparePage.secondBuildingIsDispayed());
    }


    @Step("Shoud see the second buildingAddressList is selected earlier for compare")
    public void shoudSeeSecondBuildingInCompare() {
        Assert.assertTrue(comparePage.getSecondBuildingAddress().equalsIgnoreCase(openedBuildingPage.buildingAddressList.get(1)));
    }

	@Step(("The third buildingAddressList is displayed with swipe"))
	public void thirdBuildingIsDispayed() throws Exception {

    	String elementName=openedBuildingPage.buildingAddressList.get(2);
		Assert.assertTrue(comparePage.isBuildingDisplayedWithSwipe(elementName));
	}

    @Step
    public void click() {
        comparePage.clickSwipeUpToRemoveHint();
    }


}
