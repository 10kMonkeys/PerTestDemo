package com.perchwell.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.perchwell.pages.perchwell.PerchwellPage;


public class PerchwellSteps extends ScenarioSteps {
    PerchwellPage perchwellPage;

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
    public void openSecondBuilding() { perchwellPage.openSecondBuilding();
    }

    @Step
    public void openThirdBuilding() { perchwellPage.openThirdBuilding();
    }


}
