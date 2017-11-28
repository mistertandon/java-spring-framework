package com.mistertandon.communication;

import com.mistertandon.message.Messaging;

public class Communication {

	Messaging activeMessageObj;

	public Communication(Messaging activeMessageObj) {

		super();
		this.activeMessageObj = activeMessageObj;
	}

	public void communicate() {

		activeMessageObj.sendMessage();
	}
}
