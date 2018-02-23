package com.perchwell.tests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Ignore;
import org.junit.Test;

public class TC20_ListViewTest extends SampleTest {


@Test
public void listView() {
	loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
			AppProperties.INSTANCE.getProperty("password"));
	perchwellSteps.skipAllHints();
	perchPopupSteps.clickNotNowButton();
	perchwellSteps.getFirstBuildingAddress();
	perchwellSteps.openFirstBuilding();
	openedBuildingSteps.clickDiscussWithMyClientHint();
	openedBuildingSteps.shouldSeeBuildingAddress();

}
}
