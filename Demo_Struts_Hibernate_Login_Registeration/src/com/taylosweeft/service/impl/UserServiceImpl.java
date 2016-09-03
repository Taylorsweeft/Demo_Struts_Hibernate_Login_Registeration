package com.taylosweeft.service.impl;

import com.taylosweeft.dao.Userdao;
import com.taylosweeft.dao.impl.UserdaoImpl;
import com.taylosweeft.model.User;
import com.taylosweeft.service.UserService;

public class UserServiceImpl implements UserService {
	private Userdao userdao = new UserdaoImpl();

	public Userdao getUserdao() {
		return userdao;
	}

	public void setUserdao(Userdao userdao) {
		this.userdao = userdao;
	}

	public boolean exists(User u) throws Exception {
		return userdao.userExit(u);
	}

	public void add(User u) throws Exception {
		userdao.addUser(u);
	}

	public boolean login(User u) throws Exception {
		return userdao.login(u);
	}
}
