package spring.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import spring.data.user.UserDao;

@Controller
public class UserController {
	@Autowired
	UserDao dao;
	
	@GetMapping("/join/user")
	public String registform() {
		return "/user/user_join";
	}
}
