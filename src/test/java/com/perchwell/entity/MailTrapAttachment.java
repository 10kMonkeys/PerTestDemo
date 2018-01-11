package com.perchwell.entity;

import java.util.Date;

public class MailTrapAttachment {
private int id;
private int message_id;
private String filename;
private Date created_at;
private int attachment_size;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getMessage_id() {
	return message_id;
}

public void setMessage_id(int message_id) {
	this.message_id = message_id;
}

public String getFilename() {
	return filename;
}

public void setFilename(String filename) {
	this.filename = filename;
}

public Date getCreated_at() {
	return created_at;
}

public void setCreated_at(Date created_at) {
	this.created_at = created_at;
}

public int getAttachment_size() {
	return attachment_size;
}

public void setAttachment_size(int attachment_size) {
	this.attachment_size = attachment_size;
}
}
