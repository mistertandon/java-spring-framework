package com.mistertandon.model;

import org.springframework.beans.factory.annotation.Required;

public class Message {

	private int id;

	private String content;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	@Required
	public void setContent(String content) {
		this.content = content;
	}

}
