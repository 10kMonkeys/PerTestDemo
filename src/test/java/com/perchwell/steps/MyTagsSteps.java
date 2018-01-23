package com.perchwell.steps;

import com.perchwell.pages.tags.MyTagsPage;
import com.perchwell.pages.tags.TagsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class MyTagsSteps extends ScenarioSteps {
	MyTagsPage onPage;

	@Step
	public void clickTagSearchButton() {
		onPage.clickTagSearchButton();
	}

	@Step
	public void clickSeveralExistingTagLabel() {
		WebElement firstTag = onPage.findExistingTagLabel();
		if (firstTag != null) {
			firstTag.click();
		} else {
			Assert.assertFalse("Does not exist any tags", firstTag == null);
		}

		WebElement secondTag = onPage.findExistingTagLabel();
		if (secondTag != null && firstTag != null) {
			secondTag.click();
		} else {
			Assert.assertFalse("Does not exist several tags", secondTag == null);
		}
	}
}
