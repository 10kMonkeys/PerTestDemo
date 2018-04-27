package com.perchwell.tests.LogInTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "LogInTests", "First"})
public class ST2_LoginAsBrokerTest extends SampleTest {
	@Test
	public void logInAsBroker() throws Exception {

	loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
			AppProperties.INSTANCE.getProperty("password"));
	perchwellSteps.skipAllHints();
	perchPopupSteps.clickNotNowButton();
	perchwellSteps.clickOnOpenAccountButton();
	accountSteps.shouldSeeOptionClient();
	accountSteps.shouldSeeOptionDiscussions();
	accountSteps.shouldSeeOptionTags();
	accountSteps.shouldSeeOptionCompare();
}
}