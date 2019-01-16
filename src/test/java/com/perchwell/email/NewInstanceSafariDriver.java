package com.perchwell.email;

import com.perchwell.crossPlatform.Config;
import com.perchwell.entity.AppProperties;
import com.perchwell.helpers.SessionVariables;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class NewInstanceSafariDriver {

    public static void resetPasswordInSafari(String newPassword){
        WebDriver safariDriver = new SafariDriver();

        safariDriver.navigate().to("https://staging.perchwell.com/accounts/password/edit?reset_password_token=" + SessionVariables.getValueFromSessionVariable("resetToken"));
        AppProperties.INSTANCE.setProperty("new_reset_password",newPassword);
        WebElement passwordTextBox = safariDriver.findElement(By.xpath("//*[@id='c45']"));
        WebElement confirmPasswordTextBox = safariDriver.findElement(By.xpath("//*[@id='c46']"));
        WebElement resetPasswordButton = safariDriver.findElement(By.xpath("//*[@id='new_user']/div[3]/input"));
        passwordTextBox.sendKeys(AppProperties.INSTANCE.getProperty("new_reset_password"));
        confirmPasswordTextBox.sendKeys(AppProperties.INSTANCE.getProperty("new_reset_password"));
        resetPasswordButton.click();
        WebDriverWait wait = new WebDriverWait(safariDriver,60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sortable']/div[1]/div[1]")));
        safariDriver.quit();
    }

    public static void resetPasswordInChrome(String newPassword){ ////
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.navigate().to("https://staging.perchwell.com/accounts/password/edit?reset_password_token=" + SessionVariables.getValueFromSessionVariable("resetToken"));
        AppProperties.INSTANCE.setProperty("new_reset_password",newPassword);
        WebElement passwordTextBox = chromeDriver.findElement(By.xpath("//*[@id='c74']"));
        WebElement confirmPasswordTextBox = chromeDriver.findElement(By.xpath("//*[@id='c75']"));
        WebElement resetPasswordButton = chromeDriver.findElement(By.xpath("//*[@id='new_user']/div[3]/input"));
        passwordTextBox.sendKeys(AppProperties.INSTANCE.getProperty("new_reset_password"));
        confirmPasswordTextBox.sendKeys(AppProperties.INSTANCE.getProperty("new_reset_password"));
        resetPasswordButton.click();
        WebDriverWait wait = new WebDriverWait(chromeDriver,60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sortable']/div[1]/div[1]")));
        chromeDriver.quit();
    }

    public static void acceptInvitation() {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.navigate().to("https://staging.perchwell.com/accept_invitation?invitation_token=" + SessionVariables.getValueFromSessionVariable("resetToken"));
        WebDriverWait wait = new WebDriverWait(chromeDriver,60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(@class, 'ui-modals-title')]")));
        chromeDriver.quit();
    }

    public static void returnOldPasswordInSafari(){
        WebDriver safariDriver = new SafariDriver();

        safariDriver.navigate().to("https://staging.perchwell.com/accounts/password/edit?reset_password_token=" + SessionVariables.getValueFromSessionVariable("resetToken"));
        WebElement passwordTextBox = safariDriver.findElement(By.xpath("//*[@id='c74']"));
        WebElement confirmPasswordTextBox = safariDriver.findElement(By.xpath("//*[@id='c75']"));
        WebElement resetPasswordButton = safariDriver.findElement(By.xpath("//*[@id='new_user']/div[3]/input"));
        passwordTextBox.sendKeys(AppProperties.INSTANCE.getProperty("old_reset_password"));
        confirmPasswordTextBox.sendKeys(AppProperties.INSTANCE.getProperty("old_reset_password"));
        resetPasswordButton.click();
        WebDriverWait wait = new WebDriverWait(safariDriver,60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sortable']/div[1]/div[1]")));
        safariDriver.quit();
    }

    public static void resetPasswordBySafariOrChrome(String newPassword){ ////
//        if (Config.isAndroid()){
            resetPasswordInChrome(newPassword);
//        }else {
//            resetPasswordInSafari(newPassword);
//        }
    }

    public static void returnOldPasswordBySafariOrChrome(){
//        if (Config.isAndroid()){
            returnOldPasswordInChrome();
//        }else {
//            returnOldPasswordInSafari();
//        }
    }

    private static void returnOldPasswordInChrome() { ////
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.navigate().to("https://staging.perchwell.com/accounts/password/edit?reset_password_token=" + SessionVariables.getValueFromSessionVariable("resetToken"));
        WebElement passwordTextBox = chromeDriver.findElement(By.xpath("//*[@id='c45']"));
        WebElement confirmPasswordTextBox = chromeDriver.findElement(By.xpath("//*[@id='c46']"));
        WebElement resetPasswordButton = chromeDriver.findElement(By.xpath("//*[@id='new_user']/div[3]/input"));
        passwordTextBox.sendKeys(AppProperties.INSTANCE.getProperty("old_reset_password"));
        confirmPasswordTextBox.sendKeys(AppProperties.INSTANCE.getProperty("old_reset_password"));
        resetPasswordButton.click();
        WebDriverWait wait = new WebDriverWait(chromeDriver,60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sortable']/div[1]/div[1]")));
        chromeDriver.quit();
    }
}
