package com.perchwell;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.TravisAlive;
import com.perchwell.helper.stepListener.StepTestListener;
import com.perchwell.helper.stepListener.TestResult;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import net.thucydides.core.steps.StepEventBus;
import net.thucydides.core.steps.StepListener;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.Timer;
import java.util.TimerTask;


@RunWith(SerenityRunner.class)
public abstract class SampleTest {

    static TimerTask task = new TravisAlive();
    static Timer timer;

    public static StepTestListener listener;
    public TestResult testResult;

//    private StepTestListener listener;
//    private TestResult testResult;

    @Managed
    WebDriver driver;

    @Steps
    public User user;

    @BeforeClass
    public static void keepTravisAlive() {
        System.out.println("Keeping Travis Alive");
        if(timer == null){
            TimerTask task = new TravisAlive();
            timer = new Timer(true);

            timer.schedule(task, 15000, 540000);

        }
    }


    protected StepListener getStepListener(TestResult testResult) {
        if (listener == null) {
            listener = new StepTestListener(testResult);
        }
        return listener;
    }

    protected TestResult getTestResult() {
        if (testResult == null) {
            testResult = new TestResult();
        }
        return testResult;
    }

    public void setStepListener(StepTestListener stepListener) {
        listener = stepListener;
    }

    @Before
    public void before() {
        if(Config.isOnTravis()) {
            StepEventBus.getEventBus().registerListener(getStepListener(getTestResult()));
        }
    }
}