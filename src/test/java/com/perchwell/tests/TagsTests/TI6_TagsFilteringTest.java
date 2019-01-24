package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TI6_TagsFilteringTest extends SampleTest {

    @Test
    public void tagsFiltering() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.setSpecificTagAndSave("CLIENT TEST+ +CLIENT0");
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.fillInTagSearchField("CLIENT ");
        user.atTagsPage.shouldSeeOnlySearchedTags("CLIENT TEST+");
        user.atTagsPage.clearTextField();
        user.atTagsPage.fillInTagSearchField("TEST+");
        user.atTagsPage.shouldSeeOnlySearchedTags("CLIENT TEST+");
        user.atTagsPage.clearTextField();
        user.atTagsPage.fillInTagSearchField("+CLIENT0");

    }
}
