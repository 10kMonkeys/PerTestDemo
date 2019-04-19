package com.perchwell;

import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import com.perchwell.tests.AnalyticsTests.*;
import com.perchwell.tests.ClientTests.*;
import com.perchwell.tests.CompareTests.*;
import com.perchwell.tests.DiscussTests.*;
import com.perchwell.tests.EditProfileTests.*;
import com.perchwell.tests.FiltersTests.*;
import com.perchwell.tests.ListViewTests.*;
import com.perchwell.tests.LogInTests.*;
import com.perchwell.tests.MapTests.*;
import com.perchwell.tests.SearchTests.*;
import com.perchwell.tests.TagsTests.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({

        //Log in
        ST1_LogInAsClientTest.class,
        ST2_LoginAsBrokerTest.class,
        ST3_LoginWithGoogleTest.class,
        ST4_LogInAfterResetPasswordTest.class,

        //Clients
        ST5_AddClientTest.class,

        //Tags
        ST6_CreateNewTagForListingTest.class,
        ST7_UseExistingTagForListingTest.class,
        ST8_ShareTagTest.class,
        ST9_DeleteCreatedTagTest.class,

        //Compare
        ST10_AddToCompareTest.class,
        ST11_DeleteFromCompareTest.class,

        //Search
        ST12_NewSearch.class,
        ST13_SaveChangesAsNewSearch.class,
        ST14_ChangeExistingSearch.class,

        //Filters
        ST15_ApplyingLocationFilterTest.class,
        ST17_ApplyingStatusTypeFilter.class,
        ST18_ApplyingFilterOnMapView.class,
        ST19_ApplyingFilterOnAnalyticsTest.class,

        //List View
        ST20_ListViewTest.class,

        //Map View
        ST21_MapView.class,

        //Discuss with my client
        ST22_DiscussionWithNewClientTest.class,
        ST23_DiscussionWithExistingClient.class,
        ST24_AddMessageInDiscussionTest.class,

        //Discuss with my broker
        ST25_DiscussionWithNewAgentTest.class,
        ST26_DiscussionWithExistingAgent.class,
        ST27_AddMessageInDiscussionWithAgent.class,

        //Edit profile
        ST28_UpdateSettingsAsBroker.class,
        ST29_UpdateSettingsAsClient.class,
        ST30_ResetPasswordTest.class,

        //Analytics
        ST31_AddGraphicsTest.class,
        ST32_DeleteChartTest.class,
        ST33_SendGraphicReportsToMyEmail.class,
        ST34_SendGraphicReportToClientEmail.class,
        ST35_ReportDetailsOpeningTest.class,
        ST36_SendReportDetailsPDF.class,
        ST37_AddChartAsClientTest.class,

})

public class SmokeSuite extends TestSuite {
}
