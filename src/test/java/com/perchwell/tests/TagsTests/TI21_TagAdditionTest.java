package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TI21_TagAdditionTest extends SampleTest {

    @Test
    public void tagAddition() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.checkTagBelowOtherTagsLabel();
        user.atTagsPage.shouldSeeJustCreatedTagsPill();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clearTextField();
        user.atTagsPage.clickOnFirstTagAndGetValue();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.shouldSeeAddedNewTag();
        user.atOpenedBuildingPage.shouldSeeFirstExistingTag();
    }
}
