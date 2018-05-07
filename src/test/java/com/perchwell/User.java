package com.perchwell;

import com.perchwell.helpers.TravisAlive;
import com.perchwell.steps.*;
import com.perchwell.steps.analytics.*;
import com.perchwell.steps.complex.ComplexSteps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.BeforeClass;

import java.util.Timer;
import java.util.TimerTask;

public class User extends ScenarioSteps {

    @Steps
    public OpenedBuildingSteps atOpenedBuildingPage;

    @Steps
    public LoginSteps atLoginPage;

    @Steps
    public PerchwellSteps atPerchwellPage;

    @Steps
    public PerchPopupSteps atPerchPopup;

    @Steps
    public AccountSteps atAccountPage;

    @Steps
    public ClientSteps atClientPage;

    @Steps
    public TagsSteps atTagsPage;

    @Steps
    public SearchSteps atSearchPage;

    @Steps
    public MapSteps atMapPage;

    @Steps
    public SelectResultSteps atSelectResultPage;

    @Steps
    public DiscussionsListSteps atDiscussionsListPage;

    @Steps
    public  CompareSteps atComparePage;

    @Steps
    public DiscussionSteps atDiscussionPage;

    @Steps
    public AnalyticsSteps atAnalyticsPage;

    @Steps
    public SettingsProfileSteps atSettingsProfilePage;

    @Steps
    public ShareTaggedItemsSteps atShareTaggedItemsPage;

    @Steps
    public SellersAgentSteps atSellersAgentPage;

    @Steps
    public DiscussThisListingSteps atDiscussThisListingPage;

    @Steps
    public MyTagsSteps atMyTagsPage;

    @Steps
    public REBNYListingsSteps atRebnyListingsPage;

    @Steps
    public ACRISClosingSteps atAcrisClosingPage;

    @Steps
    public NYCTownhousesSteps atNycTownhousesPage;

    @Steps
    public ManagementSteps atManagementPage;

    @Steps
    public ResetPasswordSteps atResetPasswordPage;

    static TimerTask task = new TravisAlive();
    static Timer timer;


    @BeforeClass
    public static void keepTravisAlive(){
        if(timer == null){
            TimerTask task = new TravisAlive();
            timer = new Timer(true);

            timer.schedule(task, 15000, 540000);

        }
    }

    @Steps
    public EmailSteps atEmailPage;

    @Steps
    public ComplexSteps usingComplexSteps;
}
