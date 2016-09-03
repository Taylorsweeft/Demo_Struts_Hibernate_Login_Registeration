package com.taylosweeft.action;

import com.opensymphony.xwork2.ActionSupport;
import com.taylosweeft.model.User;
import com.taylosweeft.service.UserService;
import com.taylosweeft.service.impl.UserServiceImpl;

@SuppressWarnings("serial")
public class RegisterAction extends ActionSupport {
	private String username;
	private String password;
	private String eMail;
	private UserService service = new UserServiceImpl();

	public String execute() throws Exception {
		User u = new User(null, username, password, eMail);
		System.out.println(service.exists(u));
		if (service.exists(u))
			return "fail";
		service.add(u);
		return "success";

	}

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

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

}
