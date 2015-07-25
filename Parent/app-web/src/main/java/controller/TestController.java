package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import service.TestService;

@Controller
public class TestController {

	@Resource(name = "testServiceImpl")
	TestService testServiceImpl;

	@RequestMapping(value = "/test")
	@ResponseBody
	public String test(String username) {
		System.out.println("username: " + username);
		return testServiceImpl.test(username);
	}
}
