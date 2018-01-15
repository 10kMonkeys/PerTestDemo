package com.perchwell.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.perchwell.pages.perchwell.PerchwellPage;
import org.junit.Assert;

public class PerchwellSteps extends ScenarioSteps {
    PerchwellPage perchwellPage;
//OpenedBuildingSteps openedBuildingSteps;


   @Step
    public void skipAllHints(){

        perchwellPage.clickEditSearchFiltersHint();
        perchwellPage.clickManageYourProfileHint();
        perchwellPage.clickTransformDataHint();
        perchwellPage.clickExploreSearchResultHint();
    }

	@Step
	public void shouldSeeEditSearchFiltersHint() throws Exception {
		Assert.assertTrue(perchwellPage.editSearchFiltersHintIsDispalyed());
	}

    @Step
    public void clickOpenAccountButton(){
        perchwellPage.clickOpenAccountButton();
    }

    @Step
    public void clickMagnifer(){
        perchwellPage.clickMagnifer();
    }


    @Step
    public void openFirstBuilding() {
        perchwellPage.openFirstBuilding();
    }

    @Step
    public void openSecondBuilding() {
        perchwellPage.openSecondBuilding();
    }

    @Step
    public void openThirdBuilding() throws Exception {
       perchwellPage.isBuildingDisplayedWithSwipe(perchwellPage.getThirdBuilding());
       perchwellPage.openThirdBuilding(); }

	@Step
	public void countItemsInListViewBeforApplyingFilter(){
	perchwellPage.numberOfItemsInListView=perchwellPage.countItemsInListView();

   }

	@Step
	public void shoudSeeNoLessItemsInListViewAfterDeleteFilter(){
		System.out.print("Count before 2"+perchwellPage.numberOfItemsInListView);
     	Assert.assertTrue(perchwellPage.countItemsInListView() >= perchwellPage.numberOfItemsInListView);
		//Save new value number of items
     	perchwellPage.numberOfItemsInListView=perchwellPage.countItemsInListView();
		System.out.print("Count before  3 "+perchwellPage.numberOfItemsInListView);
	}

	@Step
	public void clickMap(){
		perchwellPage.clickMap();
	}

    @Step
    public void getFirstBuildingAddress() {
            perchwellPage.addBuildingAddressInSessionVariable("buidingAddress",perchwellPage.getFistBuildingAddress());
       }
    @Step
    public void clickAnalytics(){
        perchwellPage.openAnalytics();
    }
}
