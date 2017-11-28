package com.mistertandon.message;

public class ActiveMessage implements Messaging {

	@Override
	public void sendMessage() {

		System.out.println("Active Message is about to send.");
	}

}
