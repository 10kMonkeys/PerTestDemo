package com.perchwell.email;


import com.perchwell.entity.AppProperties;
import com.perchwell.entity.MailTrapAttachment;
import com.perchwell.entity.MailTrapResponse;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.map.DeserializationConfig;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class MailTrap {

	public static void getEmails() {
		ObjectMapper objectMapper = new ObjectMapper();
		HttpClient client = HttpClientBuilder.create().build();
		// HttpGet request = new HttpGet("https://mailtrap.io/api/v1/inboxes"); //"id":239589 //search=&page=&last_id=
		HttpGet request = new HttpGet("https://mailtrap.io/api/v1/inboxes/239589/messages?");
		request.addHeader("Api-Token", AppProperties.INSTANCE.getProperty("API_TOKEN"));
		try {
			HttpResponse response = client.execute(request);
			HttpEntity entity = response.getEntity();
			int responseCode = response.getStatusLine().getStatusCode();
			if (responseCode == 200) {
				String str = null;
				try {
					str = new String(EntityUtils.toByteArray(response.getEntity()));
				} catch (IOException e) {
					e.printStackTrace();
				}
				objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
				MailTrapResponse[] mailTrapResponse = objectMapper.readValue(str, MailTrapResponse[].class);

				for (MailTrapResponse me : mailTrapResponse) {
					System.out.println("MESSAGE " + me.getId() + me.getSubject());
	//			if (me.getName().equalsIgnoreCase("Cookie2")) {
	//				System.out.printf("Removing cookie!\n");
	//				listOfCookies.remove(me);
	//			}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static MailTrapAttachment[] getMassageAttachment(int message_id) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		MailTrapAttachment[] mailTrapResponse = new MailTrapAttachment[0];
		HttpClient client = HttpClientBuilder.create().build();
		//Rest (get)
		HttpGet request = new HttpGet("https://private-anon-7b61566ab2-mailtrap.apiary-proxy.com/api/v1/inboxes/239589/messages/" + message_id + "/attachments");
		//Token is provided MailTrap
		request.addHeader("Api-Token", AppProperties.INSTANCE.getProperty("API_TOKEN"));
		try {
			HttpResponse response = client.execute(request);

			if (response.getStatusLine().getStatusCode() == 200) {
				String str = new String(EntityUtils.toByteArray(response.getEntity()));

				mailTrapResponse = objectMapper.readValue(str, MailTrapAttachment[].class);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mailTrapResponse;
	}

	public static MailTrapResponse[] getEmail(String search) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		HttpClient client = HttpClientBuilder.create().build();

		HttpGet request = new HttpGet("https://mailtrap.io/api/v1/inboxes/239589/messages?search=" + search);
		//Token is provided MailTrap
		request.addHeader("Api-Token", AppProperties.INSTANCE.getProperty("API_TOKEN"));
		MailTrapResponse[] mailTrapResponse = new MailTrapResponse[0];
		try {
			HttpResponse response = client.execute(request);

			if (response.getStatusLine().getStatusCode() == 200) {
				String str = null;
				try {
					str = new String(EntityUtils.toByteArray(response.getEntity()));
				} catch (IOException e) {
					e.printStackTrace();
				}
				objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
				mailTrapResponse = objectMapper.readValue(str, MailTrapResponse[].class);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mailTrapResponse;
	}
}