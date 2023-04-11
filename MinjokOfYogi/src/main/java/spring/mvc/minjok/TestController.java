package spring.mvc.minjok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.data.testDao;

@Controller
public class TestController {

	@Autowired
	testDao dao;
	
	@GetMapping("/test")
	public ModelAndView count_test() {
		ModelAndView mview=new ModelAndView();
		
		int count= dao.count_test();
		mview.addObject("count", count);
		mview.addObject("hi", "hi");
		
		mview.setViewName("test/testList");
		
		return mview;
	}
}
