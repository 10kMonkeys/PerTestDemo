package com.perchwell.email;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.apache.xpath.operations.Bool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NewInstanceDriverForCheckEmail {

private  AppiumDriver iosDriver;

public RemoteWebDriver getDriver(){
	try {
		new NewInstanceDriverForCheckEmail();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}

	return iosDriver;
}

public NewInstanceDriverForCheckEmail() throws InterruptedException {

	//Thread.sleep(5000);
	DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	desiredCapabilities.setCapability("platformName", "iOS");
	desiredCapabilities.setCapability("platformVersion", "11.2");
	desiredCapabilities.setCapability("deviceName", "iPhone 7");
	desiredCapabilities.setCapability("browserName", "Safari");
	desiredCapabilities.setCapability("safariInitialUrl", "https://mailtrap.io");
//	desiredCapabilities.setCapability("START_IWDP", true);
//	desiredCapabilities.setCapability("app", "safari");
	//safariInitialUrl
	URL url = null;

	try {
		url = new URL("http://127.0.0.1:4723/wd/hub");
	}
	catch (MalformedURLException e)
	{
		e.printStackTrace();
	}
	//WebDriver remoteWebDriver = new SafariDriver();
	RemoteWebDriver iosDriver = null;

		iosDriver = new AppiumDriver(url,desiredCapabilities);

iosDriver.get("http://www.google.com");
//	WebElement ele = iosDriver.findElement(By.name("q"));
//	ele.click();
//	ele.sendKeys("Packt Publishing");
//	WebElement searchButton = iosDriver.findElement(By.name("btnG"));
//	System.out.println(searchButton.getSize());
//	searchButton.click();

//
//	driver
//			.contexts().then(function (contexts) { // get list of available views. Returns array: ["NATIVE_APP","WEBVIEW_1"]
//		return driver.context(contexts[1]); // choose the webview context
//	})
//// do some web testing
//.elementsByCss('.green_button').click()
//		 .context('NATIVE_APP') // leave webview context
//// do more native stuff here if we want
//		 .quit() // stop webdrivage


	MailTrap.getEmail("test");
	Thread.sleep(50000);
	iosDriver.quit();

}
}
