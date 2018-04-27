package com.perchwell.tests.LogInTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "LogInTests", "First"})
public class ST1_LogInAsClientTest extends SampleTest {

	@Test
	public void logInAsClient() throws Exception {

		loginSteps.loginAsClient(AppProperties.INSTANCE.getProperty("client_email"),
				AppProperties.INSTANCE.getProperty("client_password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickOnOpenAccountButton();
		accountSteps.shouldSeeOptionAgents();
		accountSteps.shouldSeeOptionDiscussions();
		accountSteps.shouldSeeOptionTags();
		accountSteps.shouldSeeOptionCompare();
	}
}