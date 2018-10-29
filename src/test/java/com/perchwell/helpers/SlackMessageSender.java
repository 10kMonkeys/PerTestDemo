package com.perchwell.helpers;

import net.gpedro.integrations.slack.SlackApi;
import net.gpedro.integrations.slack.SlackMessage;

public class SlackMessageSender {

    //https://hooks.slack.com/services/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 - iOS
    //https://hooks.slack.com/services/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 - MyTest

    public void sendMessage(String slackTestFailedMessage) {

        SlackApi api = new SlackApi("https://hooks.slack.com/services/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");
        api.call(new SlackMessage("#ios-tests", "Perchwell Bot", slackTestFailedMessage));
    }
}
