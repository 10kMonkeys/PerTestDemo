package com.perchwell.tests.LogInTests;

import com.perchwell.SampleTest;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "LogInTests", "Second"})
public class ST3_LoginWithGoogleTest extends SampleTest {

	@Test
	public void logInWithGoogle() throws Exception {
		loginSteps.loginWithGoogle();
		perchwellSteps.shouldSeeEditSearchFiltersHint();
	}
}