package com.perchwell;

import com.perchwell.helpers.TravisAlive;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

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
}