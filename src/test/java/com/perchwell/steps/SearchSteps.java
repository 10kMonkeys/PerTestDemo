package com.perchwell.steps;

import com.perchwell.pages.perchwell.SearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchSteps extends ScenarioSteps {
SearchPage onPage;

@Step
public void clickDeleteFirstLocation() {
	onPage.clickDeleteFirstLocation();
}

@Step
public void clickDeleteSecondLocation() {
	onPage.clickDeleteSecondLocation();
}

@Step
public void clickApplyButton() {
	onPage.clickApplyButton();
}

}
