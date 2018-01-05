package com.perchwell.email;

import com.perchwell.entity.Account;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MailTrap {
public void getEmails() {
	HttpClient client = HttpClientBuilder.create().build();
	// HttpGet request = new HttpGet("https://mailtrap.io/api/v1/inboxes"); //"id":239589 //search=&page=&last_id=
	HttpGet request = new HttpGet("https://mailtrap.io/api/v1/inboxes/239589/messages?");
	request.addHeader("Api-Token", Account.API_TOKEN);
	try {
		HttpResponse response = client.execute(request);
		HttpEntity entity = response.getEntity();
		if (entity != null) {
			try (InputStream stream = entity.getContent()) {
				BufferedReader reader =
						new BufferedReader(new InputStreamReader(stream));
				String line;
				while ((line = reader.readLine()) != null) {
					System.out.println(line);
				}
			}
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
}

public static Boolean getEmail(String search) {

	HttpClient client = HttpClientBuilder.create().build();
	// HttpGet request = new HttpGet("https://mailtrap.io/api/v1/inboxes"); //"id":239589 //search=&page=&last_id=
	HttpGet request = new HttpGet("https://mailtrap.io/api/v1/inboxes/239589/messages?search=" + search);
	request.addHeader("Api-Token", Account.API_TOKEN);
	HttpEntity entity = null;
	try {
		HttpResponse response = client.execute(request);
		entity = response.getEntity();
	} catch (IOException e) {
		e.printStackTrace();
	}

	return (entity != null);
}
}