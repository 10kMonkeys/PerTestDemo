package com.perchwell.pages.perchwell;

import com.perchwell.email.MailTrap;
import com.perchwell.entity.AppProperties;
import com.perchwell.entity.MailTrapResponse;
import com.perchwell.helpers.Helper;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SellersAgentPage extends BasePage {

    //region WebElements

    @iOSFindBy(accessibility = "SendEmailButton")
    private WebElement sendEmailButton;

    @iOSFindBy(accessibility = "CONFIRM")
    private WebElement confirmButton;

    //endregion

    public SellersAgentPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSendEmailButton() {
        element(sendEmailButton).click();
    }

    public void clickOnConfirmButton() {
        element(confirmButton).click();
    }

    private int countNumberEmailsSentToSellersAgents() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int k = 0;
        String subjectName = "New interest in your listing " + SessionVariables.getValueFromSessionVariable("building address");
        subjectName = Helper.removeChar(subjectName, '#');

            String emailHeaderToSellersAgent = AppProperties.INSTANCE.getProperty("HEADER_SELLERS_AGENT");
            MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(emailHeaderToSellersAgent);

            for (MailTrapResponse email : mailTrapResponse) {
                if (email.getSubject().equalsIgnoreCase(subjectName)) {
                    k++;
                }
            }
        return k;
    }

    public void shouldInterestEmailSentToOneAgent() {
        Assert.assertTrue(countNumberEmailsSentToSellersAgents() > 0);
    }

    public boolean shouldInterestEmailsSentToSeveralAgents() {
        System.out.println(countNumberEmailsSentToSellersAgents());
        return (countNumberEmailsSentToSellersAgents() > 1);
    }
}
