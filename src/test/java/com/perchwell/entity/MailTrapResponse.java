package com.perchwell.entity;

import java.util.Date;

public class MailTrapResponse {
	private int id;
	private int inbox_id;
	private String subject;
	private Date sent_at;
	private String from_email;
	private String from_name;
	private String to_email;
	private String to_name;
	private String html_body;
	private String text_body;


	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getInbox_id() {
		return inbox_id;
	}

	public void setInbox_id(int inbox_id) {
		this.inbox_id = inbox_id;
	}

	public Date getSent_at() {
		return sent_at;
	}

	public void setSent_at(Date sent_at) {
		this.sent_at = sent_at;
	}

	public String getFrom_email() {
		return from_email;
	}

	public void setFrom_email(String from_email) {
		this.from_email = from_email;
	}

	public String getFrom_name() {
		return from_name;
	}

	public void setFrom_name(String from_name) {
		this.from_name = from_name;
	}

	public String getTo_email() {
		return to_email;
	}

	public void setTo_email(String to_email) {
		this.to_email = to_email;
	}

	public String getTo_name() {
		return to_name;
	}

	public void setTo_name(String to_name) {
		this.to_name = to_name;
	}

	public String getHtml_body() {
		return html_body;
	}

	public void setHtml_body(String html_body) {
		this.html_body = html_body;
	}

	public String getText_body() {
		return text_body;
	}

	public void setText_body(String txt_body) {
		this.text_body = txt_body;
	}
}
