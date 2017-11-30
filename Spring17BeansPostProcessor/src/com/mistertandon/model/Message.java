package com.mistertandon.model;

public class Message {

	private int messageId;

	private String message;

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {

		System.out.println("Message:setMessageId called.");

		this.messageId = messageId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {

		System.out.println("Message:setMessage called.");

		this.message = message;
	}

	public void init() {

		System.out.println("Init method called after Bean creation and setter function.");
	}

	public void destroy() {

		System.out.println("destroy method called before Bean destroy.");
	}
}
