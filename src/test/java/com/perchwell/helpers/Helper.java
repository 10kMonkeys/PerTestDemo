package com.perchwell.helpers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class Helper {

    public static void swipeVertical(AppiumDriver driver, double startPercentage, double finalPercentage, double anchorPercentage, int duration) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * finalPercentage);
        new TouchAction(driver).press(anchor, startPoint).waitAction(Duration.ofSeconds(duration)).moveTo(10, endPoint).release().perform();

    }

    public static void swipeHorizontal(AppiumDriver driver, double startPercentage, double finalPercentage, double anchorPercentage, int duration) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * finalPercentage*(-1));
        new TouchAction(driver).press(startPoint, anchor).waitAction(Duration.ofSeconds(duration)).moveTo(endPoint,0).release().perform();
    }

}
