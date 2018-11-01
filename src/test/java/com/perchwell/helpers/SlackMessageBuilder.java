package com.perchwell.helpers;

import com.perchwell.SampleTest;
import net.thucydides.core.steps.StepEventBus;

public class SlackMessageBuilder {

    private String slackTestFailedMessage;

    public void buildMessage(String testName, String failedStep, String AdditionalErrorMessage) {
        SlackMessageSender slackSender = new SlackMessageSender();

        //FAILED TEST
        String[] splittedTestName = testName.split("\\.");
        failedStep = failedStep.split("[\\(\\)]")[1];

        slackTestFailedMessage = ":no_entry: FAILED TEST: " + splittedTestName[splittedTestName.length-1]
                + "\n\nFAILED STEP: " + failedStep
                + "\r\n ```" + AdditionalErrorMessage + "```";
        slackSender.sendMessage(slackTestFailedMessage);



        if (SampleTest.listener != null) {
            StepEventBus.getEventBus().dropListener(SampleTest.listener );
        }
    }
}
