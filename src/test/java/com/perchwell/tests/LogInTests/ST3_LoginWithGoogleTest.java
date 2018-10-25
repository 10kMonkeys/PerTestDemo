package com.perchwell.tests.LogInTests;

import com.perchwell.SampleTest;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "LogInTests", "First"})
public class ST3_LoginWithGoogleTest extends SampleTest {

	@Ignore
	@Test
	public void logInWithGoogle() {
		user.atLoginPage.loginWithGoogle();
		user.atPerchwellPage.shouldSeeEditSearchFiltersHint();
	}
}