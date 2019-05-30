package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_TagsFirst", "Android_TagsFirst", "TagsFirst"})
public class TI11_TagsFilteringTest extends SampleTest {

    @Test
    public void tagsFiltering() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atOpenedBuildingPage.clearTagsList();
        user.atTagsPage.setSpecificTagIfNotExist("CLIENT TEST+ +CLIENT0");
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.openSecondBuilding();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.fillInTagSearchField("CLIENT T");
        user.atTagsPage.shouldSeeOnlySearchedTags("CLIENT TEST+", 4);
        user.atTagsPage.clearTextField();
        user.atTagsPage.checkIfTagsPageIsReturnedToInitialState(4);
        user.atTagsPage.fillInTagSearchField("TEST+");
        user.atTagsPage.shouldSeeOnlySearchedTags("CLIENT TEST+", 4);
        user.atTagsPage.clearTextField();
        user.atTagsPage.checkIfTagsPageIsReturnedToInitialState(4);
        user.atTagsPage.fillInTagSearchField("+CLIENT0");
        user.atTagsPage.shouldSeeOnlySearchedTags("CLIENT TEST+", 2);
    }
}
