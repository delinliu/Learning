package service.impl;

import java.util.List;

import javax.annotation.Resource;

import mapper.TestMapper;

import org.springframework.stereotype.Service;

import service.TestService;

@Service("testServiceImpl")
public class TestServiceImpl implements TestService{

	@Resource(name = "testMapper")
	TestMapper testMapper;
	
	public String test(String username) {
		System.out.println("test service");
		List list = testMapper.test(null);
		System.out.println(list);
		return username;
	}

}
