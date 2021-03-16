package com.cts.mediator;

public class PremiumUser implements IUser {
	private ChatMediator chatMediator;
	private String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public PremiumUser() {
		super();
	}

	
	public PremiumUser(ChatMediator chatMediator, String name) {
		super();
		this.chatMediator = chatMediator;
		this.name = name;
	}


	@Override
	public void receiveMessage(String message) {
		System.out.println(message+" received by: "+name);
	}

	@Override
	public void sendMessage(String message) {
		chatMediator.sendMessage(message+" sent by: "+name);
	}

}
