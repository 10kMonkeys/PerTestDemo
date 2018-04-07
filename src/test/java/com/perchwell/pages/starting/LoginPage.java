package com.perchwell.pages.starting;

import com.perchwell.email.MailTrap;
import com.perchwell.entity.AppProperties;
import com.perchwell.entity.MailTrapAttachment;
import com.perchwell.entity.MailTrapResponse;
import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;


public class LoginPage extends BasePage {
    Random random = new Random();

    public LoginPage(WebDriver driver){ super (driver);}
    @AndroidFindBy(id ="com.perchwell.perchwellapp:id/email" )
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField")
    private WebElement emailTextBox;

    @AndroidFindBy(id ="com.perchwell.perchwellapp:id/password" )
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSecureTextField")
    private WebElement passwordField;

    @AndroidFindBy(id ="com.perchwell.perchwellapp:id/log_in" )
    @iOSXCUITFindBy(accessibility = "LOG IN")
    private WebElement loginButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField")
    private WebElement resetEmailTextBox;

    @iOSXCUITFindBy(accessibility = "RESET PASSWORD")
    private WebElement resetPasswordButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Perchwell_Staging.ForgotPasswordSuccessResetView\"]/XCUIElementTypeButton")
    private WebElement backButton;

    @iOSXCUITFindBy(accessibility = "ACCOUNT NEEDED TO SIGN IN")
    private WebElement accountNeededToSignInText;

    @iOSXCUITFindBy(accessibility = "OK")
    private WebElement okButton;

    public void setEmail(String email) {
      element(emailTextBox).type(email);
    }

    public void clickLogin() {
        element(loginButton).click();
    }

    public void setPassword(String password) {
        element(passwordField).type(password);
    }

    public void setRestEmail(String email){
      element(resetEmailTextBox).type(email);
    }

    public void resetPasswordButtonClick(){
      element(resetPasswordButton).click();
    }

    public void addValueInSessionVariable(String name, String value) {
        Serenity.setSessionVariable(name).to(value);
    }

    public String getValueFromSessionVariable(String name) {
        return Serenity.sessionVariableCalled(name);
    }

    public Boolean shouldFindSentEmail(String email) {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Boolean reportWasFound =false;
        MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(AppProperties.INSTANCE.getProperty("HEADER_RESET_EMAIL"));
        if (mailTrapResponse.length > 0) {
            for (MailTrapResponse my_responce : mailTrapResponse) {
                if (my_responce.getText_body().contains(email)) {
                    reportWasFound = true;
                    addValueInSessionVariable("emailText",my_responce.getText_body());
                    break;
                }
            }
        }
        return reportWasFound;
    }

    public void getResetToken(String emailText){
        emailText = emailText.substring(emailText.lastIndexOf('=')+1, emailText.length() );
        emailText = emailText.substring(0, emailText.indexOf(" )"));
        addValueInSessionVariable("resetToken",emailText);
    }

    public void backButtonClick(){
        element(backButton).click();
    }

    public boolean isAccountNeededToSignInMessageDisplayed(){
       return element(accountNeededToSignInText).isDisplayed();
    }

    public void okButtonCLick(){
        element(okButton).click();
    }

    public String generateNewPassword(){
        String newPassword = "1";
        for(int i=0;i<5;i++){
           newPassword = newPassword + String.valueOf(random.nextInt(10));
        }
        return  newPassword;
    }
}
