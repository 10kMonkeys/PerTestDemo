package com.perchwell.test;

import org.junit.Test;

public class ListViewTest  extends SampleTest {


@Test
public void listView() {
	loginSteps.loginAsBroker();
	perchwellSteps.skipAllHints();
	perchPopupSteps.clickNotNowButton();
	perchwellSteps.getFirstBuildingAddress();
	perchwellSteps.openFirstBuilding();
	openedBuildingSteps.clickDiscussWithMyClientHint();
	openedBuildingSteps.shouldSeeBuildingAddress();

}
}
