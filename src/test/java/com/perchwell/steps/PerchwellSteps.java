package com.perchwell.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.perchwell.pages.perchwell.PerchwellPage;

import java.util.List;


public class PerchwellSteps extends ScenarioSteps {
    PerchwellPage perchwellPage;
    public static List<String> building;

   @Step
    public void skipAllHints(){

        perchwellPage.clickEditSearchFiltersHint();
        perchwellPage.clickManageYourProfileHint();
        perchwellPage.clickTransformDataHint();
        perchwellPage.clickExploreSearchResultHint();
    }

    @Step
    public void clickOpenAccountButton(){
        perchwellPage.clickOpenAccountButton();
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


}
