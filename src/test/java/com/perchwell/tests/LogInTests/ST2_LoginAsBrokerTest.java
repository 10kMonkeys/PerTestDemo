package com.perchwell.tests.LogInTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;


@WithTagValuesOf({"SmokeTestSuit", "LogInTests", "iOS_First", "Android_First", "Android_First"})
public class ST2_LoginAsBrokerTest extends SampleTest {

	@Test
	@Screenshots(disabled=true)
	public void logInAsBroker() {
		user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.atPerchwellPage.clickOnOpenAccountButton();
		user.atAccountPage.shouldSeeOptionClient();
		user.atAccountPage.shouldSeeOptionDiscussions();
		user.atAccountPage.shouldSeeOptionTags();
	}
}