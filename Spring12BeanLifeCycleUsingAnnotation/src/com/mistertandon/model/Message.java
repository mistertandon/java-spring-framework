package com.mistertandon.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Message {

	private int messageId;

	private String message;

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@PostConstruct
	public void init() {

		System.out.println("Beans post initialization logic will take place here.");
	}

	@PreDestroy
	public void destroy() {

		System.out.println("Beans pre destroy logic will take place here.");
	}

}
