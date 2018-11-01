package com.perchwell.tests.LogInTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "LogInTests", "iOS_First", "Android_First", "First"})
public class ST1_LogInAsClientTest extends SampleTest {

	@Test
	public void logInAsClient() {
		user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("client_email"),
				AppProperties.INSTANCE.getProperty("client_password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.atPerchwellPage.clickOnOpenAccountButton();
		user.atAccountPage.shouldSeeOptionAgents();
		user.atAccountPage.shouldSeeOptionDiscussions();
		user.atAccountPage.shouldSeeOptionTags();
		user.atAccountPage.shouldSeeOptionCompare();
	}
}