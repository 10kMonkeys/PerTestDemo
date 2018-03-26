package com.perchwell.pages.perchwell;

import com.perchwell.email.MailTrap;
import com.perchwell.entity.AppProperties;
import com.perchwell.entity.MailTrapResponse;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.util.concurrent.TimeUnit.SECONDS;

public class SellersAgentPage extends BasePage {

    public SellersAgentPage(WebDriver driver) {
        super(driver);
    }

    @iOSFindBy(accessibility = "SendEmailButton")
    private WebElement sendEmailButton;

    @iOSFindBy(accessibility = "CONFIRM")
    private WebElement confirmButton;

    public void clickSendEmailButton() {
        element(sendEmailButton).click();
    }

    public void clickConfirmButton() {
        element(confirmButton).click();
    }

    public void addValueInSessionVariable(String name, String value) {
        Serenity.setSessionVariable(name).to(value);
    }

    public String getValueFromSessionVariable(String name) {
        return Serenity.sessionVariableCalled(name);
    }

    private String removeChar(String s, char charToRemove) {
        String newString = "";
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) != charToRemove) {
                newString += s.charAt(i);
            }
        }
        return newString;
    }

    public boolean shouldInterestEmailSentToOneAgent() {
        int k = 0;
        String subjectName = "New interest in your listing " + getValueFromSessionVariable("building address");
        subjectName = removeChar(subjectName, '#');

        String emailHeaderToSellersAgent = AppProperties.INSTANCE.getProperty("HEADER_SELLERS_AGENT");
        setImplicitTimeout(10, SECONDS);
        MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(emailHeaderToSellersAgent);
        resetImplicitTimeout();

        for(MailTrapResponse email : mailTrapResponse) {
            if (email.getSubject().equalsIgnoreCase(subjectName)) {
                k++;
            }
        }
        return (k > 0);
    }
}
