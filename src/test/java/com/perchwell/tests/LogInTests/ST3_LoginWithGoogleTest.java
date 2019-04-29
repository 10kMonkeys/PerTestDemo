package com.perchwell.tests.LogInTests;

import com.perchwell.SampleTest;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "LogInTests", "iOS_First", "Android_First", "First"})
public class ST3_LoginWithGoogleTest extends SampleTest {

	@Ignore
	@Test
	@Screenshots(disabled=true)
	public void logInWithGoogle() {
		user.atLoginPage.loginWithGoogle();
		user.atPerchwellPage.shouldSeeEditSearchFiltersHint();
	}
}