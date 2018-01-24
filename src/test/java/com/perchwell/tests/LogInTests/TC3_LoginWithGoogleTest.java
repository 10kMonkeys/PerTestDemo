package com.perchwell.tests.LogInTests;

import com.perchwell.SampleTest;
import org.junit.Test;

public class TC3_LoginWithGoogleTest extends SampleTest {

@Test
public void logInWithGoogle() throws Exception {
	loginSteps.loginWithGoogle();
	perchwellSteps.shouldSeeEditSearchFiltersHint();
}
}