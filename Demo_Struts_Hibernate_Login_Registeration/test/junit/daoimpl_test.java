package junit;

import org.junit.Test;

import com.taylosweeft.dao.Userdao;
import com.taylosweeft.dao.impl.UserdaoImpl;
import com.taylosweeft.model.User;

public class daoimpl_test {

	@Test
	public void testAddUser() {
		User u = new User(null, "s", "ss", "sss@qq.com");
		Userdao userdao = new UserdaoImpl();
		userdao.addUser(u);

	}

	@Test
	public void testUserExit() {

	}

	@Test
	public void testLogin() {

	}

}
