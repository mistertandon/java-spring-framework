package com.mistertandon.communication;

import com.mistertandon.message.ActiveMessage;

public class Communication {

	ActiveMessage activeMessageObj;

	public Communication(ActiveMessage activeMessageObj) {

		super();
		this.activeMessageObj = activeMessageObj;
	}

	public void communicate() {

		activeMessageObj.sendMessage();
	}
}
