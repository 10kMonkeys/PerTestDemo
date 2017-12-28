package com.perchwell.test;

import org.junit.Test;

public class LoginWithGoogleTest extends SampleTest {

@Test
public void logInWithGoogle() throws Exception {
	loginSteps.loginWithGoogle();
	perchwellSteps.shouldSeeEditSearchFiltersHint();
}
}