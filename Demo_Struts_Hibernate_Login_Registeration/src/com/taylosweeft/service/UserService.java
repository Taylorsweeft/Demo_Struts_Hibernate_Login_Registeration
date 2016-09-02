package com.taylosweeft.service;

import com.taylosweeft.model.User;

public interface UserService {
	public boolean exists(User u) throws Exception;

	public abstract void add(User u) throws Exception;
}
