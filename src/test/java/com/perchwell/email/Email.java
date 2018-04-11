package com.perchwell.email;

import com.perchwell.entity.MailTrapResponse;
import com.perchwell.helpers.SessionVariables;


public abstract class Email {

    public static boolean findSentEmailAndGetTextBody(String userName, String emailHeader) {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Boolean emailWasFound = false;
        MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(emailHeader);
        if (mailTrapResponse.length > 0) {
            for (MailTrapResponse my_responce : mailTrapResponse) {
                if (my_responce.getText_body().contains(userName)) {
                    emailWasFound = true;
                    SessionVariables.addValueInSessionVariable("emailText",my_responce.getText_body());
                    break;
                }
            }
        }
        return emailWasFound;
    }

    public static void getToken(String emailText) {
        emailText = emailText.substring(emailText.lastIndexOf('=')+1, emailText.length() );
        emailText = emailText.substring(0, emailText.indexOf(" )"));
        SessionVariables.addValueInSessionVariable("resetToken",emailText);
    }
}
