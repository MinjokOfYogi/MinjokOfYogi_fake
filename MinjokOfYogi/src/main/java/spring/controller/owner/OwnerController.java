package spring.controller.owner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OwnerController {

	@GetMapping("owner-join")
	public String join() {
		return "owner/join";
	}
}
