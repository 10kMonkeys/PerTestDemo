package com.perchwell.email;


import com.perchwell.data.ReportTypes;
import com.perchwell.entity.AppProperties;
import com.perchwell.entity.MailTrapAttachment;
import com.perchwell.entity.MailTrapResponse;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.reportWizard.CreateReportPage;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.map.DeserializationConfig;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;

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
		HttpGet request = new HttpGet("https://mailtrap.io/api/v1/inboxes/239589/messages/" + message_id + "/attachments");
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

	public static String getTextBody(String path) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		HttpClient client = HttpClientBuilder.create().build();

		HttpGet request = new HttpGet("https://mailtrap.io" + path);
		//Token is provided MailTrap
		request.addHeader("Api-Token", AppProperties.INSTANCE.getProperty("API_TOKEN"));
		String textBody = null;

		try {
			HttpResponse response = client.execute(request);

			if (response.getStatusLine().getStatusCode() == 200) {
				try {
					textBody = EntityUtils.toString(response.getEntity());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return textBody;
	}

	public static void checkListingsOrderIsSavedInEmailAndNotDeletedListings() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		List<String> listingsAddress = new ArrayList<>();
		String subject = SessionVariables.getValueFromSessionVariable("Report_subject");
		String rawBody;

		MailTrapResponse[] mailTrapResponse = getEmail(subject);
		rawBody = getTextBody(mailTrapResponse[0].getTxt_path());

		String address = "([0-9]{1,10}[#0-9]{1,10}.*#[\\S]{1,30})|([0-9]{1,10}.*St.)";
		Pattern patternForAddress = Pattern.compile(address);
		Matcher matcherForAddress = patternForAddress.matcher(rawBody);

		while (matcherForAddress.find()) {
			listingsAddress.add(rawBody.substring(matcherForAddress.start(), matcherForAddress.end()));
		}

		for(int i = 0; i < listingsAddress.size(); i++) {
			Assert.assertEquals(CreateReportPage.orderListing.get(i), listingsAddress.get(i));
		}
	}

	public static void shouldFindSentReportBySubjectAndMessage() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		String subject = SessionVariables.getValueFromSessionVariable("Report_subject");
		String message = SessionVariables.getValueFromSessionVariable("Report_message");
		String rawBody;

		MailTrapResponse[] mailTrapResponse = getEmail(subject);
		rawBody = getTextBody(mailTrapResponse[0].getRaw_path());

		Assert.assertTrue(rawBody.contains("Subject: " + subject));
		Assert.assertTrue(rawBody.contains(message));
	}

	public static boolean shouldFindAttachmentWithReport() {
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String subject = SessionVariables.getValueFromSessionVariable("Report_subject");
		boolean reportWasFound = false;
		MailTrapResponse[] mailTrapResponse = getEmail(subject);
		if(mailTrapResponse.length != 0) {
			MailTrapAttachment[] mailTrapAttachment = MailTrap.getMassageAttachment(mailTrapResponse[0].getId());
			for (MailTrapAttachment my_attachment : mailTrapAttachment) {
				if (my_attachment.getFilename().equalsIgnoreCase(ReportTypes.CMA_REPORT)) {
						reportWasFound = true;
						break;
				}
			}
		}
		return reportWasFound;
	}
}