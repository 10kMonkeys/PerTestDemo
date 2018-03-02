package com.perchwell.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.perchwell.pages.perchwell.PerchwellPage;
import org.junit.Assert;

public class PerchwellSteps extends ScenarioSteps {
    PerchwellPage onPage;
//OpenedBuildingSteps openedBuildingSteps;


   @Step
    public void skipAllHints(){
        onPage.clickEditSearchFiltersHint();
        if (onPage.isEditSearchFiltersHintisDisplayed()){
			onPage.clickEditSearchFiltersHint();}
        onPage.clickManageYourProfileHint();
        onPage.clickTransformDataHint();
        onPage.clickExploreSearchResultHint();
    }

	@Step
	public void shouldSeeEditSearchFiltersHint() throws Exception {
		Assert.assertTrue(onPage.editSearchFiltersHintIsDispalyed());
	}

    @Step
    public void clickOpenAccountButton(){
        onPage.clickOpenAccountButton();
    }

    @Step
    public void clickMyNewSearch(){
        onPage.clickMagnifer();
    }

    @Step
    public void openFirstBuilding() {
        onPage.openFirstBuilding();
    }

    @Step
    public void openSecondBuilding() {
        onPage.openSecondBuilding();
    }

    @Step
    public void openThirdBuilding() throws Exception {
       onPage.isBuildingDisplayedWithSwipe(onPage.getThirdBuilding());
       onPage.openThirdBuilding();
    }

	@Step
	public void countItemsInListViewBeforApplyingFilter(){
	onPage.numberOfItemsInListView= onPage.countItemsInListView();
	}

	@Step
	public void shoudSeeNoLessItemsInListViewAfterDeleteFilter(){
		System.out.print("Count before 2"+ onPage.numberOfItemsInListView);
     	Assert.assertTrue(onPage.countItemsInListView() >= onPage.numberOfItemsInListView);
		//Save new value number of items
     	onPage.numberOfItemsInListView= onPage.countItemsInListView();
		System.out.print("Count before  3 "+ onPage.numberOfItemsInListView);
	}

	@Step
	public void clickMap(){
		onPage.clickMap();
	}

    @Step
    public void getFirstBuildingAddress() {
            onPage.addBuildingAddressInSessionVariable("buidingAddress", onPage.getFistBuildingAddress());
    }

    @Step
    public void clickAnalytics(){
        onPage.openAnalytics();
    }

	@Step
	public void clickList() {
   	    onPage.clickList();
	}

	@Step("Should see listings only from selected district {0}")
	public void shouldSeeListingsOnlyFromSelectedDistrict(String city) {
   	Assert.assertTrue(onPage.isElementExistsInEachCell(city));
	}

	@Step("Should see listing with filters are applyed {0}")
	public void isFilter1Bath1BedApplied(String search) {
		Assert.assertTrue(onPage.isElementExistsInEachCell(search));
	}

}
