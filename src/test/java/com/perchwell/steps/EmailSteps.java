package com.perchwell.steps;

import com.perchwell.email.Email;
import com.perchwell.email.NewInstanceSafariDriver;
import com.perchwell.entity.AppProperties;
import com.perchwell.helpers.SessionVariables;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class EmailSteps extends ScenarioSteps {

    @Step
    public void acceptClientInvitation() {
        Assert.assertTrue(this.shouldFindSentInviteEmailByNameAndGetTextBody());
        this.getToken();
        this.acceptInvitation();
    }

    @Step
    private boolean shouldFindSentInviteEmailByNameAndGetTextBody() {
        return Email.findSentEmailAndGetTextBody(
                SessionVariables.getValueFromSessionVariable("User name"),
                AppProperties.INSTANCE.getProperty("HEADER_INVITATION"));
    }

    @Step
    private void getToken() {
        Email.getToken(SessionVariables.getValueFromSessionVariable("emailText"));
    }

    @Step
    private void acceptInvitation() {
        NewInstanceSafariDriver.acceptInvitation();
    }

    @Step
    public void shouldNotSecondInvitationSent() {
        String firstInvitationText = SessionVariables.getValueFromSessionVariable("emailText");

        if (this.shouldFindSentInviteEmailByNameAndGetTextBody()) {
            Assert.assertEquals(firstInvitationText,
                    SessionVariables.getValueFromSessionVariable("emailText"));
        } else {
            Assert.assertTrue(true);
        }
    }
}
