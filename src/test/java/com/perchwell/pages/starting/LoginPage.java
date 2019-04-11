package com.perchwell.pages.starting;

import com.perchwell.crossPlatform.Config;
import com.perchwell.email.MailTrap;
import com.perchwell.entity.AppProperties;
import com.perchwell.entity.MailTrapResponse;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;

import static com.perchwell.email.MailTrap.getTextBody;


public class LoginPage extends TechHelper {

    private Random random = new Random();

    //region WebElements

    @AndroidFindBy(id ="com.perchwell.re.staging:id/email")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField")
    private WebElement emailTextBox;

    @AndroidFindBy(id ="com.perchwell.re.staging:id/password")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSecureTextField")
    private WebElement passwordField;

    @AndroidFindBy(id ="com.perchwell.re.staging:id/log_in")
    @iOSXCUITFindBy(accessibility = "LOG IN")
    private WebElement loginButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/email")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField")
    private WebElement resetEmailTextBox;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/reset_password")
    @iOSXCUITFindBy(accessibility = "RESET PASSWORD")
    private WebElement resetPasswordButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeNavigationBar[$name=='Perchwell_Staging.ForgotPasswordSuccessResetView'$]/XCUIElementTypeButton")
    private WebElement backButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/title")
    @iOSXCUITFindBy(accessibility = "ACCOUNT NEEDED TO SIGN IN")
    private WebElement accountNeededToSignInText;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/ok")
    @iOSXCUITFindBy(accessibility = "OK")
    private WebElement okButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[1]")
    private WebElement loginBackButton;

    @iOSXCUITFindBy(accessibility = "Back")
    private WebElement backFromEmailButton;

    //endregion

    public LoginPage(WebDriver driver) {
        super (driver);
    }

    public void setEmail(String email) {
//      element(emailTextBox).type(email);
      element(emailTextBox).sendKeys(email);
    }

    public void clickOnLoginButton() {
        element(loginButton).click();
    }

    public void setPassword(String password) {
//        element(passwordField).type(password);
        element(passwordField).sendKeys(password);
    }

    public void setRestEmail(String email){
//      element(resetEmailTextBox).type(email);
        element(resetEmailTextBox).sendKeys(email);
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
                if (getTextBody(my_responce.getTxt_path()).contains(email)) {
                    reportWasFound = true;
                    SessionVariables.addValueInSessionVariable("emailText", getTextBody(my_responce.getTxt_path()));
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

    public void backButtonClick() {
        if (Config.isAndroid()){
            getDriver().navigate().back();
        }else {
            element(backButton).click();
        }
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

    public void clickOnBackFromLogin() {
        if(Config.isAndroid()) {
            getDriver().navigate().back();
        } else {
            element(loginBackButton).click();
        }
    }

    public void backFromEmailPageClick() {
        if(!Config.isAndroid()) {
            element(backFromEmailButton).click();
        }
    }
}
