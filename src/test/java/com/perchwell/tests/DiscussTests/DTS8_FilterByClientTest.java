package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@WithTagValuesOf({"DiscussTests"})
public class DTS8_FilterByClientTest extends SampleTest {
    private DateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");

    @Test
    public void filterByClient() throws Exception {
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.openSecondBuilding();
        openedBuildingSteps.clickDiscussWithMyClientHint();
        openedBuildingSteps.clickShareButton();
        openedBuildingSteps.clickSendWithinPerchwell();
        openedBuildingSteps.clickAddDiscusButton();
        clientSteps.selectTestClient();
        discussionSteps.sendMessage("I'd_like_discuss_with_you " + simpleDateFormat.format(new Date()));
        discussionSteps.clickBackButton();
        clientSteps.closePage();
        openedBuildingSteps.clickBackButton();
        perchwellSteps.clickOpenAccountButton();
        accountSteps.clickDiscusionsLabel();
        discussionsListSteps.enterValueInSearchField("Te");
        discussionsListSteps.shouldTestClientBePresentInFilterResult();
        discussionsListSteps.clickDeleteIconNextToSearchText();
        discussionsListSteps.shouldNothingBeDisplayedInFilterByPerson();
        discussionsListSteps.enterValueInSearchField("lie");
        discussionsListSteps.shouldTestClientBePresentInFilterResult();
        discussionsListSteps.clickDeleteIconNextToSearchText();
        discussionsListSteps.shouldNothingBeDisplayedInFilterByPerson();
        discussionsListSteps.enterValueInSearchField("nt");
        discussionsListSteps.shouldTestClientBePresentInFilterResult();
        discussionsListSteps.selectTestClient();
        discussionsListSteps.shouldOnlyDiscussionWithTestClientBeDisplayed();
    }
}
