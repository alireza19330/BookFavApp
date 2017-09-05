package com.developairs.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.developairs.demo.model.User;
import com.developairs.demo.service.BookService;
import com.developairs.demo.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=DemoApplication.class)
public class DemoApplicationTests {
	
	@Autowired
	private UserService userService;
	
//	@Autowired
//	private RoleService roleService;
	
	@Autowired
	private BookService bookService;

	@Test
	public void userSave() {
//		User user = new User();
//		String email = "test@example.com";
//		user.setEmail(email);
//		user.setLastName("lastName");
//		user.setName("fname");
//		user.setPassword("pass");
//		userService.saveUser(user);
//		User findUserByEmail = userService.findUserByEmail(email);
		//Assert.assertNotNull(findUserByEmail);
	}

}
