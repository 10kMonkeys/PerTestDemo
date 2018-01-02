package com.perchwell.steps;

import com.perchwell.pages.perchwell.ComparePage;
import com.perchwell.pages.perchwell.OpenedBuildingPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CompareSteps extends ScenarioSteps {
    ComparePage comparePage;



    @Step(("The first buildingAddressList is displayed without swipe"))
    public void firstBuildingIsDispayed(){
        Assert.assertTrue(comparePage.firstBuildingIsDispayed());
     }

      @Step("The second buildingAddressList is displayed without swipe")
    public void secondBuildingIsDispayed(){
        Assert.assertTrue(comparePage.secondBuildingIsDispayed());
    }


    @Step("Shoud see {0} is selected earlier for compare")
    public void shoudSeeSecondBuildingInCompare(String building) {
        Assert.assertTrue(comparePage.getSecondBuildingAddress().equalsIgnoreCase(comparePage.getBuildingAddressFromSessionVariable(building)));
    }

	@Step(("The third buildingAddressList is displayed with swipe"))
	public void thirdBuildingIsDispayed(String building) throws Exception {

		Assert.assertTrue(comparePage.isBuildingDisplayedWithSwipe(comparePage.getBuildingAddressFromSessionVariable(building)));
	}

    @Step
    public void clickSwipeUpToRemoveHint() {
        comparePage.clickSwipeUpToRemoveHint();
    }


	@Step
	public void clickCancelMsgButton() {
		comparePage.clickCancelMsgButton();
	}

	@Step
	public void clickRemoveMsgButtom() {
		comparePage.clickRemoveMsgButtom();
	}

	@Step
	public void scrollUpFirstBuilding() throws Exception {
		comparePage.scrollUpFirstBulding();
	}

	@Step
	public void shoudSeeRemovePropertyMsg() {
		Assert.assertTrue(comparePage.removePropertyMsgIsDispayed());
	}


 @Step("Shoudn't exist {0} in compare")
	public void notSeeFirstBuildingInCompare(String building) {
			Assert.assertFalse(comparePage.getFirstBuildingAddress().equalsIgnoreCase(comparePage.getBuildingAddressFromSessionVariable(building)));
	}

@Step("Shoud see {0} is selected earlier for compare")
public void shoudSeeFirstBuildingInCompare(String building) {
	Assert.assertTrue(comparePage.getFirstBuildingAddress().equalsIgnoreCase(comparePage.getBuildingAddressFromSessionVariable(building)));
}


//@Deprecated
//@Step("Shoud see the first buildingAddressList is selected earlier for compare")
//public void shoudSeeFirstBuildingInCompare() {
//
//	Assert.assertTrue(comparePage.getFirstBuildingAddress().equalsIgnoreCase(openedBuildingPage.buildingAddressList.get(0)));
//
//}

}
