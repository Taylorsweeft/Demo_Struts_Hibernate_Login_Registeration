package com.taylosweeft.action;

import com.opensymphony.xwork2.ActionSupport;
import com.taylosweeft.model.User;
import com.taylosweeft.service.UserService;
import com.taylosweeft.service.impl.UserServiceImpl;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	private UserService service = new UserServiceImpl();

	// 要有set 和 get 方法才能拿到 用户的输入数据

	@Override
	public String execute() throws Exception {
		User u = new User(null, username, password, null);
		if (service.login(u))
			return "success";
		return "fail";
	}

	// 注册跳转
	public String register() {
		return "register";

	}

	//
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
