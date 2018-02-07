package com.perchwell.tests.LogInTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
@WithTag(type = "Test", name = "Test")
public class TC2_LoginAsBrokerTest extends SampleTest {


@Test
public void logInAsBroker() throws Exception {

	loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
			AppProperties.INSTANCE.getProperty("password"));
	perchwellSteps.skipAllHints();
	perchPopupSteps.clickNotNowButton();
	perchwellSteps.clickOpenAccountButton();
	accountSteps.shouldSeeOptionClient();
	accountSteps.shouldSeeOptionDisscussions();
	accountSteps.shouldSeeOptionTags();
	accountSteps.shouldSeeOptionCompare();
}
}