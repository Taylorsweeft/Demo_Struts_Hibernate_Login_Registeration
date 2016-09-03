package junit;

import org.junit.Test;

import com.taylosweeft.dao.Userdao;
import com.taylosweeft.dao.impl.UserdaoImpl;
import com.taylosweeft.model.User;
import com.taylosweeft.service.UserService;
import com.taylosweeft.service.impl.UserServiceImpl;
import com.taylosweeft.util.StringUtil;

public class daoimpl_test {

	private Userdao userdao = new UserdaoImpl();
	String randomSting = new StringUtil().getRandomString();

	@Test
	public void testAddUser() {
		User u = new User(null, randomSting, randomSting, randomSting
				+ "@qq.com");
		userdao.addUser(u);
	}

	@Test
	public void testUserExit() throws Exception {
		User u = new User(null, "ddff", "dd", "dd" + "@qq.com");
		UserService service = new UserServiceImpl();
		System.out.println(service.exists(u));
		
	}

	@Test
	public void testLogin() {
		User u = new User(null, "dd", "dd", "dd" + "@qq.com");
		userdao.login(u);
	}

}
