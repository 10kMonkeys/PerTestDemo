package com.perchwell.pages.starting;

import com.perchwell.email.MailTrap;
import com.perchwell.entity.AppProperties;
import com.perchwell.entity.MailTrapResponse;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;


public class LoginPage extends BasePage {

    private Random random = new Random();

    //region WebElements

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

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeNavigationBar[$name=='Perchwell_Staging.ForgotPasswordSuccessResetView'$]/XCUIElementTypeButton")
    private WebElement backButton;

    @iOSXCUITFindBy(accessibility = "ACCOUNT NEEDED TO SIGN IN")
    private WebElement accountNeededToSignInText;

    @iOSXCUITFindBy(accessibility = "OK")
    private WebElement okButton;

    //endregion

    public LoginPage(WebDriver driver) {
        super (driver);
    }

    public void setEmail(String email) {
      element(emailTextBox).type(email);
    }

    public void clickOnLoginButton() {
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
                    SessionVariables.addValueInSessionVariable("emailText",my_responce.getText_body());
                    break;
                }
            }
        }
        return reportWasFound;
    }

    public void getResetToken(String emailText){
        emailText = emailText.substring(emailText.lastIndexOf('=')+1, emailText.length() );
        emailText = emailText.substring(0, emailText.indexOf(" )"));
        SessionVariables.addValueInSessionVariable("resetToken",emailText);
    }

    public void backButtonClick(){
        element(backButton).click();
    }

    public void shouldSeeAccountNeededToSignInMessage(){
       element(accountNeededToSignInText).shouldBeVisible();
    }

    public void okButtonCLick(){
        element(okButton).click();
    }

    public String generateNewPassword(){
        StringBuilder newPassword = new StringBuilder("1");
        for(int i=0;i<5;i++){
           newPassword.append(String.valueOf(random.nextInt(10)));
        }
        return newPassword.toString();
    }
}
