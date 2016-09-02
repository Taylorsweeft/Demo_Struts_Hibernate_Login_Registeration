package com.taylosweeft.dao;

import com.taylosweeft.model.User;

public interface Userdao {
	public void addUser(User u);

	public boolean userExit(String username);

	public void login(User u);
}
