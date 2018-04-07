package com.perchwell.email;

import com.perchwell.entity.AppProperties;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public abstract class NewInstanceDriverForResetPassword {

    public static void resetPasswordInSafari(String newPassword) throws InterruptedException {
        WebDriver safariDriver = new SafariDriver();

        safariDriver.navigate().to("https://staging.perchwell.com/accounts/password/edit?reset_password_token=" + getValueFromSessionVariable("resetToken"));
        AppProperties.INSTANCE.setProperty("new_reset_password",newPassword);
        WebElement passwordTextBox = safariDriver.findElement(By.xpath("//*[@id='c43']"));
        WebElement confirmPasswordTextBox = safariDriver.findElement(By.xpath("//*[@id='c44']"));
        WebElement resetPasswordButton = safariDriver.findElement(By.xpath("//*[@id='new_user']/div[3]/input"));
        passwordTextBox.sendKeys(AppProperties.INSTANCE.getProperty("new_reset_password"));
        confirmPasswordTextBox.sendKeys(AppProperties.INSTANCE.getProperty("new_reset_password"));
        resetPasswordButton.click();
        WebDriverWait wait = new WebDriverWait(safariDriver,60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sortable']/div[1]/div[1]")));
        safariDriver.quit();
    }

    public static String getValueFromSessionVariable(String name) {
        return Serenity.sessionVariableCalled(name);
    }
}
