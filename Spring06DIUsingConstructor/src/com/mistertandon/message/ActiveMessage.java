package com.mistertandon.message;

public class ActiveMessage implements Messaging {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mistertandon.message.Messaging#sendMessage()
	 */
	@Override
	public void sendMessage() {

		System.out.println("Active Message is about to send.");
	}
}
