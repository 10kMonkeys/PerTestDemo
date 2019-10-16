package com.perchwell.pages.perchwell;

import com.perchwell.crossPlatform.Config;
import com.perchwell.data.EmailAddresses;
import com.perchwell.data.EmailData;
import com.perchwell.email.MailTrap;
import com.perchwell.entity.AppProperties;
import com.perchwell.entity.MailTrapResponse;
import com.perchwell.helpers.RandomGenerator;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.perchwell.email.MailTrap.*;

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

    @AndroidFindBy(id = "com.perchwell.re.staging:id/shrink_button")
    @iOSXCUITFindBy(accessibility = "shrink")
    private WebElement collapseButton;

    @AndroidFindBy(accessibility = "Subject textField")
    private WebElement subjectTextField;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/tag_text")
    private List<WebElement> toEmailText;

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
        String subjectForSearch = SessionVariables.getValueFromSessionVariable("subjectForSearch").replace(" ", "");
        MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(subjectForSearch);
        String textBody;

        for (MailTrapResponse email : mailTrapResponse) {
            textBody = getTextBody(email.getTxt_path());
            System.out.println(getTextBody(email.getRaw_path()));
            String fromEmail = AppProperties.INSTANCE.getProperty("email");
            String toEmail = SessionVariables.getValueFromSessionVariable("toEmail1");
            if ((textBody.toUpperCase().contains("I'M INTERESTED IN " + address + SessionVariables.getValueFromSessionVariable("Agent_message")))
                    & textBody.toUpperCase().contains(SessionVariables.getValueFromSessionVariable("building address"))
            ) {
                String rawBody = getTextBody(email.getRaw_path());
                Assert.assertTrue(rawBody.contains("Cc: " + fromEmail));
                Assert.assertEquals(email.getTo_email(), toEmail);
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
        element(agentMessagetextBox).sendKeys(generateAgentMessage() + agent_message);
//        System.out.println(agentMessagetextBox.getAttribute("text"));
        if(!Config.isAndroid()) {
            element(collapseButton).click();
        }
    }

    public void countNumberEmailsSentToTwoSellersAgents() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        boolean isMessageSentToTwoAgents = false;

        String address = SessionVariables.getValueFromSessionVariable("address");
        String subjectForSearch = SessionVariables.getValueFromSessionVariable("subjectForSearch").replace(" ", "");
        MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(subjectForSearch);
        String rawBody;
        for (MailTrapResponse email : mailTrapResponse) {
            String message = SessionVariables.getValueFromSessionVariable("Agent_message");
            rawBody = getTextBody(email.getRaw_path());
            if (Config.isAndroid()) {
                if (rawBody.contains(message) && rawBody.contains("To: " + EmailAddresses.AGENT_1) && rawBody.contains("Cc: " + EmailAddresses.AND_BROKER + ", \n " +
                        EmailAddresses.AGENT_2)) {
                    isMessageSentToTwoAgents = true;
                    break;
                }
            } else {
                if (rawBody.contains(message) && rawBody.contains("To: " + EmailAddresses.AGENT_1) && rawBody.contains("Cc: " + EmailAddresses.IOS_BROKER + ", \n " +
                        EmailAddresses.CLIENT0 + ", \n " + EmailAddresses.AGENT_2) && !rawBody.contains(EmailAddresses.AGENT_2 + ",")) {
                    isMessageSentToTwoAgents = true;
                    break;
                }
            }
        }
        Assert.assertTrue(isMessageSentToTwoAgents);
    }

//    public void shouldInterestEmailSentToTwoAgent() {
//        Assert.assertTrue(countNumberEmailsSentToTwoSellersAgents());
//    }

    public void shouldContactEmailSentToOneAgent() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String subjectForSearch = SessionVariables.getValueFromSessionVariable("Contact_subject").replace(" ", "");
        String subject = SessionVariables.getValueFromSessionVariable("Contact_subject");
        String message = SessionVariables.getValueFromSessionVariable("Contact_message");
        String rawBody;

        MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(subjectForSearch);
        rawBody = getTextBody(mailTrapResponse[0].getRaw_path());

        Assert.assertEquals(1, mailTrapResponse.length);
        Assert.assertTrue(rawBody.contains("Subject: " + subjectForSearch));
        Assert.assertTrue(rawBody.contains(message));
        Assert.assertTrue(rawBody.contains("To: " + SessionVariables.getValueFromSessionVariable("Test_agent")));
        if (Config.isAndroid()) {
            Assert.assertTrue(rawBody.contains("Cc: " + EmailAddresses.AND_BROKER));
            Assert.assertFalse(rawBody.contains("Cc: " + EmailAddresses.AND_BROKER + ","));
        } else {
            Assert.assertTrue(rawBody.contains("Cc: " + EmailAddresses.IOS_BROKER));
            Assert.assertFalse(rawBody.contains("Cc: " + EmailAddresses.IOS_BROKER + ","));
        }
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
            if(Config.isAndroid()) {
                if (rawBody.contains(message) && rawBody.contains("To: " + EmailAddresses.AGENT_1) && rawBody.contains("Cc: " + EmailAddresses.AND_BROKER + ", \n " +
                        EmailAddresses.CLIENT0 + ", \n " + EmailAddresses.AGENT_2) && !rawBody.contains(EmailAddresses.AGENT_2 + ",")) {
                    isMessageSentToTwoAgents = true;
                    break;
                }
            } else {
                if (rawBody.contains(message) && rawBody.contains("To: " + EmailAddresses.AGENT_1) && rawBody.contains("Cc: " + EmailAddresses.IOS_BROKER + ", \n " +
                        EmailAddresses.CLIENT0 + ", \n " + EmailAddresses.AGENT_2) && !rawBody.contains(EmailAddresses.AGENT_2 + ",")) {
                    isMessageSentToTwoAgents = true;
                    break;
                }
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

         for (int i = 0; i < 3; i++) {
             textBody = getTextBody(mailTrapResponse[i].getTxt_path());
             if (!(textBody.contains(SessionVariables.getValueFromSessionVariable("listingAddress1"))
                     || textBody.contains(SessionVariables.getValueFromSessionVariable("listingAddress2"))
                     || textBody.contains(SessionVariables.getValueFromSessionVariable("listingAddress3")))) {
                 emailsSent = false;
             }
             Assert.assertTrue(emailsSent);
         }
     }

    public void updateSubject() {
        element(subjectTextField).clear();
        String subjectForSearch = generateAgentMessage();
        SessionVariables.addValueInSessionVariable("subjectForSearch", subjectForSearch);
        element(subjectTextField).sendKeys(subjectForSearch);
    }

    public void getEmailData() {

        for (int i = 0; i < toEmailText.size(); i++) {
            SessionVariables.addValueInSessionVariable("toEmail" + (i+1),element(toEmailText.get(i)).getAttribute("text"));
        }
        System.out.println(SessionVariables.getValueFromSessionVariable("toEmail1"));
        System.out.println(SessionVariables.getValueFromSessionVariable("toEmail2"));
    }
}

