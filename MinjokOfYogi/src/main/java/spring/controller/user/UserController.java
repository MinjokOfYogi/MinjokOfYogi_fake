package spring.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import spring.data.user.UserDao;
import spring.data.user.UserDto;

@Controller
public class UserController {
	@Autowired
	UserDao dao;
	
	@GetMapping("/join/user")
	public String registform() {
		return "/user/user_join";
	}
	
	@PostMapping("/join/user_insert")
	public String insert_user(@ModelAttribute UserDto dto) {
		dao.insert_user(dto);
		
		return "redirect:/";
	}
}
