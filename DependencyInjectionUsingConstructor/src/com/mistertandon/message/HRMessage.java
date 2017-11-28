package com.mistertandon.message;

public class HRMessage implements Messaging {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mistertandon.message.Messaging#sendMessage()
	 */
	@Override
	public void sendMessage() {

		System.out.println("HR Message is about to send.");
	}
}
