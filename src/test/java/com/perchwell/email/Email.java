package com.perchwell.email;

import com.perchwell.entity.MailTrapResponse;
import com.perchwell.helpers.SessionVariables;

import static com.perchwell.email.MailTrap.getTextBody;


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
                if (getTextBody(my_responce.getTxt_path()).contains(userName)) {
                    emailWasFound = true;
                    SessionVariables.addValueInSessionVariable("emailText", getTextBody(my_responce.getTxt_path()));
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
