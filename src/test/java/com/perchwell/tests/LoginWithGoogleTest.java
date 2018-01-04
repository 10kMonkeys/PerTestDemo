package com.perchwell.tests;

import com.perchwell.SampleTest;
import org.junit.Test;

public class LoginWithGoogleTest extends SampleTest {

@Test
public void logInWithGoogle() throws Exception {
	loginSteps.loginWithGoogle();
	perchwellSteps.shouldSeeEditSearchFiltersHint();
}
}