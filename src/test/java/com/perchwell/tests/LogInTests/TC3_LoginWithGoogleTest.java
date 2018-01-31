package com.perchwell.tests.LogInTests;

import com.perchwell.SampleTest;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
@WithTag(type = "Test", name = "Test")
public class TC3_LoginWithGoogleTest extends SampleTest {

@Test
public void logInWithGoogle() throws Exception {
	loginSteps.loginWithGoogle();
	perchwellSteps.shouldSeeEditSearchFiltersHint();
}
}