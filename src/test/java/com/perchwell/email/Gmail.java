package com.perchwell.email;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import java.io.IOException;
import java.util.Properties;



import java.util.Properties;

public abstract class Gmail {

public void automateGmailUsingImap(String username, String password) {
	Folder folder = null;
	Store store = null;
	System.out.println("***Reading mailbox...");
	try {
		Properties props = new Properties();
		props.put("mail.store.protocol", "imaps");
		Session session = Session.getInstance(props);
		store = session.getStore("imaps");
		store.connect("imap.gmail.com", username, password);
		folder = store.getFolder("INBOX");
		folder.open(Folder.READ_ONLY);
		Message[] messages = folder.getMessages();
		System.out.println("No of Messages : " + folder.getMessageCount());
		System.out.println("No of Unread Messages : " + folder.getUnreadMessageCount());
		for (int i=0; i < messages.length; i++) {
			//System.out.println("Reading MESSAGE # " + (i + 1) + "...");
			Message msg = messages[i];
			String strMailSubject ="", strMailBody ="";
			String strAddress="";

			strAddress= InternetAddress.toString(msg.getFrom());
			Object subject = msg.getSubject();
			strMailSubject = (String)subject;
			//Getting mail subject

			//Getting mail body
			Object content = msg.getContent();
			//Casting objects of mail subject and body into String

			//strMailBody = (String)content;
			//Printing mail subject and body
			System.out.println(strAddress);
			System.out.println(strMailSubject);
			System.out.println(strMailBody);

		}
	}catch(MessagingException messagingException){
		messagingException.printStackTrace();
	}catch(IOException ioException){
		ioException.printStackTrace();
	}finally {
		if (folder != null) {
			try {
				folder.close(true);
			} catch (MessagingException e) {

				e.printStackTrace();
			}
		}
		if (store != null) {
			try {
				store.close();
			} catch (MessagingException e) {

				e.printStackTrace();
			}
		}
	}
}

	}

