package com.perchwell;


import com.perchwell.helpers.TravisAlive;
import com.perchwell.steps.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.Timer;
import java.util.TimerTask;


@RunWith(SerenityRunner.class)
public abstract class SampleTest {

    @Managed
    WebDriver driver;

    @Steps
    protected  CompareSteps compareSteps;

    @Steps
    protected  OpenedBuildingSteps openedBuildingSteps;

    @Steps
    protected LoginSteps loginSteps;

    @Steps
    protected ResetPasswordSteps resetPasswordSteps;

    @Steps
    protected PerchwellSteps perchwellSteps;

    @Steps
    protected PerchPopupSteps perchPopupSteps;

    @Steps
    protected AccountSteps accountSteps;

    @Steps
    protected ClientSteps clientSteps;

    @Steps
    protected TagsSteps tagsSteps;

    @Steps
    protected SearchSteps searchSteps;

    @Steps
    protected MapSteps mapSteps;

    @Steps
    protected DiscussionSteps discussionSteps;

    @Steps
    protected SelectResultSteps selectResultStep;

    @Steps
    protected DiscussionsListSteps discussionsListSteps;


    static TimerTask task = new TravisAlive();
    static Timer timer;


    @BeforeClass
    public static void keepTravisAlive(){
        if(timer == null){
            TimerTask task = new TravisAlive();
            timer = new Timer(true);
            timer.schedule(task, 15000, 10000);
        }
    }
}