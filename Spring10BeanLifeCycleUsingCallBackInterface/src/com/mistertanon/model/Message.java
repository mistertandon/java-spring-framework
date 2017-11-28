package com.mistertanon.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Message implements InitializingBean, DisposableBean {

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

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("Bean is going throug initialization proces.");
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("Bean is going through destroy proces.");
	}

}
