package com.perchwell.crossPlatform;

import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Config {

    public static boolean isAndroid () {
        return getPlatformCapability().equals("ANDROID");
    }

    private static String getPlatformCapability() {
        Capabilities capabilities = ((RemoteWebDriver)((WebDriverFacade) getDriver()).getProxiedDriver()).getCapabilities();
        return String.valueOf(capabilities.getCapability("platformName"));
    }

    public static boolean isIPad() {
        return getDeviceNameCapability().contains("iPad");
    }

    private static String getDeviceNameCapability() {
        Capabilities capabilities = ((RemoteWebDriver)((WebDriverFacade) getDriver()).getProxiedDriver()).getCapabilities();
        return String.valueOf(capabilities.getCapability("deviceName"));
    }
}

