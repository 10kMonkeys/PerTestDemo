package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_MultipleTagsSecond", "Android_MultipleTagsSecond", "MultipleTagsSecond", "Local_Android_Run"})
public class TI44_ListViewSearchTest extends SampleTest {

    @Test
    public void listViewSearchTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("muilt_tags_second_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.removeAllTagPills();
        user.atTagsPage.setSpecificTagIfNotExist("CLIENT TEST+ +CLIENT0");
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.fillInTagSearchField("TEST");
        user.atTagsPage.shouldSeeOnlySearchedTags("TEST", 3);
        user.atTagsPage.clearTextField();
        user.atTagsPage.checkIfTagsPageIsReturnedToInitialState(3);
        user.atTagsPage.fillInTagSearchField("EST");
        user.atTagsPage.shouldSeeOnlySearchedTags("EST", 3);
        user.atTagsPage.clearTextField();
        user.atTagsPage.checkIfTagsPageIsReturnedToInitialState(3);
        user.atTagsPage.fillInTagSearchField("CLIENT0");
        user.atTagsPage.shouldSeeOnlySearchedTags("CLIENT0", 2);
    }
}
