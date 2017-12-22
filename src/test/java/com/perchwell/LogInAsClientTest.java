package com.perchwell;

import com.perchwell.steps.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


public class LogInAsClientTest extends SampleTest {

@Test
public void logInAsClient() throws Exception {

	loginSteps.loginAsClient();
	perchwellSteps.skipAllHints();
	perchPopupSteps.clickNotNowButton();
	perchwellSteps.clickOpenAccountButton();
	accountSteps.shouldSeeOptionAgents();
	accountSteps.shouldSeeOptionDisscussions();
	accountSteps.shouldSeeOptionTags();
	accountSteps.shouldSeeOptionCompare();
}
}