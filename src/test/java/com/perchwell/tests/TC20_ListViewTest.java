package com.perchwell.tests;

import com.perchwell.SampleTest;
import org.junit.Test;

public class TC20_ListViewTest extends SampleTest {


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
