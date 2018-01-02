package com.perchwell.tests;

import com.perchwell.steps.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class SampleTest {

    @Managed
    WebDriver driver;

    @Steps
    protected  CompareSteps compareSteps;

    @Steps
    protected  OpenedBuildingSteps openedBuildingSteps;

     @Steps
    protected LoginSteps loginSteps;

    @Steps
    protected PerchwellSteps perchwellSteps;

    @Steps
    protected PerchPopupSteps perchPopupSteps;

    @Steps
    protected AccountSteps accountSteps;

	@Steps
	protected ClientSteps clientSteps;

	@Steps
	protected TagsSteps tagsSteps;

	@Steps
	protected SearchSteps searchSteps;

	@Steps
	protected MapSteps mapSteps;
}