package com.perchwell.pages.perchwell;

import com.perchwell.email.MailTrap;
import com.perchwell.entity.AppProperties;
import com.perchwell.entity.MailTrapResponse;
import com.perchwell.helpers.Helper;
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

    @iOSFindBy(accessibility = "OK")
    private WebElement oKButtonForSuccessfullySentMessage;

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

    private int countNumberEmailsSentToSellersAgents() {
        int k = 0;
        String subjectName = "New interest in your listing " + getValueFromSessionVariable("building address");
        subjectName = Helper.removeChar(subjectName, '#');

        if (element(oKButtonForSuccessfullySentMessage).isVisible()) {
            String emailHeaderToSellersAgent = AppProperties.INSTANCE.getProperty("HEADER_SELLERS_AGENT");
            MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(emailHeaderToSellersAgent);

            for (MailTrapResponse email : mailTrapResponse) {
                if (email.getSubject().equalsIgnoreCase(subjectName)) {
                    k++;
                }
            }
        }
        return k;
    }

    public boolean shouldInterestEmailSentToOneAgent() {
        return (countNumberEmailsSentToSellersAgents() > 0);
    }

    public boolean shouldInterestEmailsSentToSeveralAgents() {
        System.out.println(countNumberEmailsSentToSellersAgents());
        return (countNumberEmailsSentToSellersAgents() > 1);
    }
}
