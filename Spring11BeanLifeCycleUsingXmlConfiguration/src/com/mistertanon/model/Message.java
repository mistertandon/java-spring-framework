package com.mistertanon.model;

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

	public void init() throws Exception {

		System.out.println("Bean is going through initialization proces ( XML configuration ).");
	}

	public void destroy() throws Exception {

		System.out.println("Bean is going through destroy proces ( XML configuration ).");
	}

}
