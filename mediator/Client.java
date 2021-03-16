package com.cts.mediator;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		ChatMediator chatMediator = new ChatMediator();
		chatMediator.setUsers(new ArrayList<IUser>());
		
		BasicUser bUser = new BasicUser(chatMediator,"Basic User");
		PremiumUser pUser = new PremiumUser(chatMediator,"Premium User");
		BasicUser bUser2 = new BasicUser(chatMediator,"John");
		chatMediator.addUser(pUser);
		chatMediator.addUser(bUser);
		
		
		bUser2.sendMessage("Hi, Im John!");
	}

}
