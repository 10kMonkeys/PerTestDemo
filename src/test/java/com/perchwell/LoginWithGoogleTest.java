package com.perchwell;

import com.perchwell.steps.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


public class LoginWithGoogleTest extends SampleTest {

@Test
public void logInWithGoogle() throws Exception {
	loginSteps.loginWithGoogle();
	perchwellSteps.shouldSeeEditSearchFiltersHint();
}
}