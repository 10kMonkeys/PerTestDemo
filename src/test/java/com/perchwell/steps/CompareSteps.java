package com.perchwell.steps;

import com.perchwell.pages.perchwell.ComparePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CompareSteps extends ScenarioSteps {
    ComparePage comparePage;
    OpenedBuildingSteps openedBuildingSteps;

    @Step
    public void clickSwipeUpToRemoveHint() {
       comparePage.clickSwipeUpToRemoveHint();
    }

    @Step(("The first building is displayed without swipe"))
    public void firstBuildingIsDispayed(){
        Assert.assertTrue(comparePage.firstBuildingIsDispayed());
     }


    @Step("Shoud see the first building is selected earlier for compare")
    public void shoudSeeFirstBuildingInCompare() {

		Assert.assertTrue(comparePage.getFirstBuildingAddress().equalsIgnoreCase(openedBuildingSteps.building.get(2)));
       //Assert.assertTrue(comparePage.getFirstBuildingAddress().equalsIgnoreCase(openedBuildingSteps.building.get(0)));
    }


    @Step("The second building is displayed without swipe")
    public void secondBuildingIsDispayed(){
        Assert.assertTrue(comparePage.secondBuildingIsDispayed());
    }


    @Step("Shoud see the second building is selected earlier for compare")
    public void shoudSeeSecondBuildingInCompare() {
        Assert.assertTrue(comparePage.getSecondBuildingAddress().equalsIgnoreCase(openedBuildingSteps.building.get(1)));
    }

	@Step(("The third building is displayed with swipe"))
	public void thirdBuildingIsDispayed() throws Exception {

    	String elementName=openedBuildingSteps.building.get(0);
		Assert.assertTrue(comparePage.isBuildingDisplayedWithSwipe(elementName));
	}

//	@Step(("The third building is displayed with swipe"))
//	public void thirdBuildingIsDispayed() throws Exception {
//
//		System.out.print("Third building"+comparePage.thirdBuildingIsDispayed());
//		//String elementName=openedBuildingSteps.building.get(2);
//		Assert.assertTrue(comparePage.thirdBuildingIsDispayed());
//	}
//
//	@Step("Shoud see the third building is selected earlier for compare")
//	public void shoudSeeThirdBuildingInCompare() {
//		String elementName=openedBuildingSteps.building.get(0);
//		System.out.print("Third building"+elementName);
//		Assert.assertTrue(comparePage.getThirddBuildingAddress().equalsIgnoreCase(openedBuildingSteps.building.get(0)));
//		//Assert.assertTrue(comparePage.getThirddBuildingAddress().equalsIgnoreCase(openedBuildingSteps.building.get(2)));
//	}
    @Step
    public void click() {
        comparePage.clickSwipeUpToRemoveHint();
    }


}
