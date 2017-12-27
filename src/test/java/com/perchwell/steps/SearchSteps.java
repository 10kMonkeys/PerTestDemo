package com.perchwell.steps;

import com.perchwell.pages.perchwell.SearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchSteps extends ScenarioSteps {
	SearchPage searchPage;

@Step
public void clickDeleteFirstLocation(){
	searchPage.clickDeleteFirstLocation();}

@Step
public void clickDeleteSecondLocation(){
	searchPage.clickDeleteSecondLocation();}

@Step
public void clickApplyButton(){
	searchPage.clickApplyButton();}



}
