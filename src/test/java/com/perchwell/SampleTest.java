package com.perchwell;

import com.perchwell.helpers.TravisAlive;
import com.perchwell.helpers.stepListener.StepTestListener;
import com.perchwell.helpers.stepListener.TestResult;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import net.thucydides.core.steps.StepEventBus;
import net.thucydides.core.steps.StepListener;
import org.junit.After;
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

//    private StepTestListener listener;
//    private TestResult testResult;
//
//    protected StepListener getStepListener(TestResult testResult) {
//        if (listener == null) {
//            listener = new StepTestListener(testResult);
//        }
//        return listener;
//    }
//
//    protected TestResult getTestResult() {
//        if (testResult == null) {
//            testResult = new TestResult();
//        }
//        return testResult;
//    }
//
//    public void setStepListener(StepTestListener stepListener) {
//        listener = stepListener;
//    }
//
//    @Before
//    public void before() {
//        StepEventBus.getEventBus().registerListener(getStepListener(getTestResult()));
//    }
//
//    @After
//    public void after(){
//                driver.quit();
//                if (listener != null) {
//                        StepEventBus.getEventBus().dropListener(listener);
//                }
//    }


}