package junit;


import java.util.Random;

import org.junit.Test;

import com.taylosweeft.dao.Userdao;
import com.taylosweeft.dao.impl.UserdaoImpl;
import com.taylosweeft.model.User;

public class daoimpl_test {
	private Userdao userdao = new UserdaoImpl();
	Random random = new Random();
	private User u = new User(null, "dd","", "adsd@qq.com");

	@Test
	public void testAddUser() {
		userdao.addUser(u);

	}

	@Test
	public void testUserExit() {
		userdao.userExit(u.getUsername());
	}

	@Test
	public void testLogin() {
		userdao.login(u);
	}

}
