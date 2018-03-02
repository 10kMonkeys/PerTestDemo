package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;

@WithTag(type = "SmokeTestSuit", name = "FiltersTests")
public class TC17_ApplyingStatusTypeFilter extends SampleTest {

    @Test
    public void applyingStatusTypeFilter() throws Exception{
            loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                    AppProperties.INSTANCE.getProperty("password"));
            perchwellSteps.skipAllHints();
            perchPopupSteps.clickNotNowButton();
            perchwellSteps.clickMyNewSearch();
            searchSteps.selectRandomStatusFilter();
    }
}
