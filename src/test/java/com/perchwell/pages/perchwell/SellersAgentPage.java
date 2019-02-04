package com.perchwell.pages.perchwell;

import com.perchwell.data.EmailAddresses;
import com.perchwell.data.EmailData;
import com.perchwell.email.MailTrap;
import com.perchwell.entity.AppProperties;
import com.perchwell.entity.MailTrapResponse;
import com.perchwell.helpers.Helper;
import com.perchwell.helpers.RandomGenerator;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static com.perchwell.email.MailTrap.getTextBody;

public class SellersAgentPage extends TechHelper {

    //region WebElements

    @AndroidFindBy(id = "com.perchwell.re.staging:id/send_email_button")
    @iOSFindBy(accessibility = "SendEmailButton")
    private WebElement sendEmailButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/positive_button")
    @iOSFindBy(accessibility = "CONFIRM")
    private WebElement confirmButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/email_body")
    @iOSXCUITFindBy(accessibility = "textView")
    private WebElement agentMessagetextBox;

    @iOSXCUITFindBy(accessibility = "shrink")
    private WebElement collapseButton;

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

        String address = SessionVariables.getValueFromSessionVariable("building address");
        address = Helper.removeChar(address, '#');
        String subjectName = "New interest in your listing " + SessionVariables.getValueFromSessionVariable("building address");
//        subjectName = Helper.removeChar(subjectName, '#');

        String emailHeaderToSellersAgent = AppProperties.INSTANCE.getProperty("HEADER_SELLERS_AGENT");
        MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(emailHeaderToSellersAgent);
        String textBody;

        for (MailTrapResponse email : mailTrapResponse) {
            textBody = getTextBody(email.getTxt_path());
            if ((email.getSubject().equalsIgnoreCase(subjectName))
                    & (textBody.toUpperCase().contains("I'M INTERESTED IN " + address + SessionVariables.getValueFromSessionVariable("Agent_message")))
                    & textBody.toUpperCase().contains(SessionVariables.getValueFromSessionVariable("building address"))) {
                k++;
            }
        }

//        for (MailTrapResponse email : mailTrapResponse) {
//            if ((email.getSubject().equalsIgnoreCase(subjectName))
//                & (getTextBody(email.getTxt_path()).toUpperCase().contains("I'M INTERESTED IN " + address + SessionVariables.getValueFromSessionVariable("Agent_message")))
//                & getTextBody(email.getTxt_path()).toUpperCase().contains(SessionVariables.getValueFromSessionVariable("building address"))) {
//                k++;
//            }
//        }
        return k;
    }

    public void shouldInterestEmailSentToOneAgent() {
        Assert.assertEquals(1, countNumberEmailsSentToSellersAgents());
    }

    public boolean shouldInterestEmailsSentToSeveralAgents() {
        System.out.println(countNumberEmailsSentToSellersAgents());
        return (countNumberEmailsSentToSellersAgents() > 1);
    }

    public String generateAgentMessage() {
        return RandomGenerator.getRandomString(" ");
    }

    public void updateMessage(String agent_message) {
        element(agentMessagetextBox).sendKeys("I'M INTERESTED IN "
                + SessionVariables.getValueFromSessionVariable("building address").replace("#", "")
                + agent_message);
        element(collapseButton).click();
    }

    public boolean countNumberEmailsSentToTwoSellersAgents() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int k = 0;
        int l = 0;

        String address = SessionVariables.getValueFromSessionVariable("First_building_address");
        String emailHeaderToSellersAgent = AppProperties.INSTANCE.getProperty("HEADER_SELLERS_AGENT");

        MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(emailHeaderToSellersAgent);
        String textBody;

        for (MailTrapResponse email : mailTrapResponse) {
            textBody = getTextBody(email.getTxt_path());
            if (textBody.toUpperCase().contains("I'M INTERESTED IN " + address + SessionVariables.getValueFromSessionVariable("Agent_message"))
                    && textBody.toUpperCase().contains(SessionVariables.getValueFromSessionVariable("First_building_address"))) {
                if (email.getTo_email().equals((AppProperties.INSTANCE.getProperty("agent1_email")))) {
                    k += 1;
                } else if (email.getTo_email().equals((AppProperties.INSTANCE.getProperty("agent2_email")))) {
                    l += 1;
                }
            }

//            if (getTextBody(email.getTxt_path()).toUpperCase().contains("I'M INTERESTED IN " + address + SessionVariables.getValueFromSessionVariable("Agent_message"))
//                    && getTextBody(email.getTxt_path()).toUpperCase().contains(SessionVariables.getValueFromSessionVariable("First_building_address"))) {
//                if (email.getTo_email().equals((AppProperties.INSTANCE.getProperty("agent1_email")))) {
//                    k += 1;
//                } else if (email.getTo_email().equals((AppProperties.INSTANCE.getProperty("agent2_email")))) {
//                    l += 1;
//                }
//            }
        }
        return (k == l) && ((k + l) == 2);
    }

    public void shouldInterestEmailSentToTwoAgent() {
        Assert.assertTrue(countNumberEmailsSentToTwoSellersAgents());
    }

    public void shouldContactEmailSentToOneAgent() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String subject = SessionVariables.getValueFromSessionVariable("Contact_subject");
        String message = SessionVariables.getValueFromSessionVariable("Contact_message");
        String rawBody;

        MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(subject);
        rawBody = getTextBody(mailTrapResponse[0].getRaw_path());

        Assert.assertEquals(1, mailTrapResponse.length);
        Assert.assertTrue(rawBody.contains("Subject: " + subject));
        Assert.assertTrue(rawBody.contains(message));
        Assert.assertTrue(rawBody.contains("To: " + SessionVariables.getValueFromSessionVariable("Test_agent")));
        Assert.assertTrue(rawBody.contains("Cc: " + EmailAddresses.IOS_BROKER));
        Assert.assertFalse(rawBody.contains("Cc: " + EmailAddresses.IOS_BROKER + ","));
    }

    public void shouldContactEmailSentToTwoAgents() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String subject = EmailData.DEFAULT_SUBJECT;
        String message = SessionVariables.getValueFromSessionVariable("Contact_message");
        String rawBody;
        boolean isMessageSentToTwoAgents = false;

        MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(subject);

        for (MailTrapResponse email : mailTrapResponse) {
            rawBody = getTextBody(email.getRaw_path());
            if (rawBody.contains(message) && rawBody.contains("To: " + EmailAddresses.AGENT_1) && rawBody.contains("Cc: " + EmailAddresses.IOS_BROKER + ", \n " +
                    EmailAddresses.CLIENT0 + ", \n " + EmailAddresses.AGENT_2) && !rawBody.contains(EmailAddresses.AGENT_2 + ",")) {
                isMessageSentToTwoAgents = true;
                break;
            }

        }
        Assert.assertTrue(isMessageSentToTwoAgents);
    }

     public void shouldContactEmailSentToThreeMessage() {
         try {
             Thread.sleep(10000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

        String subject = SessionVariables.getValueFromSessionVariable("Contact_subject");
        String textBody;
        boolean emailsSent = true;

        MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(subject);

        for(int i = 0; i < 3; i++) {
            textBody = getTextBody(mailTrapResponse[i].getTxt_path());
            if(!(textBody.contains(SessionVariables.getValueFromSessionVariable("listingAddress1"))
                    || textBody.contains(SessionVariables.getValueFromSessionVariable("listingAddress2"))
                    || textBody.contains(SessionVariables.getValueFromSessionVariable("listingAddress3" )))) {
                emailsSent = false;
            }
            Assert.assertTrue(emailsSent);
        }
    }
}
