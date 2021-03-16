package com.cts.mediator;

import java.util.List;

public class ChatMediator implements IChatMediator {

	private List<IUser> users;

	public List<IUser> getUsers() {
		return users;
	}

	public void setUsers(List<IUser> users) {
		this.users = users;
	}

	@Override
	public void sendMessage(String msg) {
		for (IUser iUser : users) {
			iUser.receiveMessage(msg);
		}
	}

	@Override
	public void addUser(IUser user) {
		users.add(user);
	}

}
