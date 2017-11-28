package com.mistertandon.service;

import com.mistertandon.message.Messaging;

public class Communication {

	private Messaging messagingObj;

	public Messaging getMessagingObj() {
		return messagingObj;
	}

	public void setMessagingObj(Messaging messagingObj) {
		this.messagingObj = messagingObj;
	}

	public void communicate() {

		this.messagingObj.sendMessage();
	}
}
