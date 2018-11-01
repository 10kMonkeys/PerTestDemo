package com.perchwell.steps;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.tags.MyTagsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import javax.swing.*;

public class MyTagsSteps extends ScenarioSteps {

	MyTagsPage onPage;

	@Step
	public void clickOnTagSearchButton() {
		onPage.clickOnTagSearchButton();
	}

	@Step
	public void clickOnSeveralExistingTagLabel() {
		WebElement firstTag = onPage.findExistingTagLabel();
		if (firstTag != null) {
			firstTag.click();
		} else {
			Assert.assertFalse("Does not exist any tags", true);
		}
		WebElement secondTag = onPage.findExistingTagLabel();
		if (secondTag != null) {
			secondTag.click();
		} else {
			Assert.assertFalse("Does not exist several tags", true);
		}
	}

	@Step
	public void checkTwoJustCreatedTags() throws Exception {
		onPage.checkJustCreatedTag(SessionVariables.getValueFromSessionVariable("First_tag"));
		if(!Config.isAndroid()) {
			onPage.clearSearchField();
		}
		onPage.checkJustCreatedTag(SessionVariables.getValueFromSessionVariable("Second_tag"));
	}
}
