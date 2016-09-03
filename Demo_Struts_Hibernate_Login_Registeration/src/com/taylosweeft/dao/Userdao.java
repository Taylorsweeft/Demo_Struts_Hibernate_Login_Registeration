package com.taylosweeft.dao;

import com.taylosweeft.model.User;

public interface Userdao {
	public void addUser(User u);

	public boolean userExit(User u);

	public boolean login(User u);
}
