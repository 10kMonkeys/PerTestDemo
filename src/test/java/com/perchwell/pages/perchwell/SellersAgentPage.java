package com.perchwell.pages.perchwell;

import com.perchwell.email.MailTrap;
import com.perchwell.entity.AppProperties;
import com.perchwell.entity.MailTrapResponse;
import com.perchwell.helpers.Helper;
import com.perchwell.helpers.RandomGenerator;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.perchwell.email.MailTrap.getTextBody;

public class SellersAgentPage extends BasePage {

    //region WebElements

    @iOSFindBy(accessibility = "SendEmailButton")
    private WebElement sendEmailButton;

    @iOSFindBy(accessibility = "CONFIRM")
    private WebElement confirmButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextView")
//    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextView")
    private WebElement agentMessagetextBox;

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
        element(agentMessagetextBox).sendKeys(agent_message);
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
}
