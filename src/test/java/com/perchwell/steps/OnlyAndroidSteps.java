package com.perchwell.steps;

import com.perchwell.crossPlatform.Config;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

import static com.perchwell.helpers.Helper.singleUpShortSwipeAndroid;

public class OnlyAndroidSteps extends ScenarioSteps{

    @Steps
    private PerchwellSteps atPerchwellPage1;

    @Steps
    private SearchMenuSteps inSearchMenu1;

    @Steps
    private SearchSteps atSearchPage1;

    @Steps
    private ClientSteps atClientPage1;

    @Steps
    private TagsSteps atTagsPage1;

    @Steps
    private MyTagsSteps atMyTagsPage1;

    @Steps
    private CreateReportSteps atCreateReportPage;

    @Step
    public void resetListViewBySearch() {
        if(Config.isAndroid()) {
            inSearchMenu1.openSearchPage();
            atSearchPage1.clickOnApplyButton();
        }
    }

    @Step
    public void searchCreatedClient() {
        if(Config.isAndroid()) {
            atClientPage1.searchCreatedClient();
            atClientPage1.onPage.hideKeyboard();
        }
    }

    @Step
    public void searchJustCreatedTag() {
        if(Config.isAndroid()) {
            atTagsPage1.searchJustCreatedTag();
        }
    }

    @Step
    public void resetListViewBySwipe() {
        if(Config.isAndroid()) {
            singleUpShortSwipeAndroid();
        }
    }

    @Step
    public void clickOnBackButtonAndReturnOnDefaultReportPage() {
        if(Config.isAndroid()) {
            atCreateReportPage.clickOnBackButton();
            atCreateReportPage.clickDefaultButton();
        }
    }
}
