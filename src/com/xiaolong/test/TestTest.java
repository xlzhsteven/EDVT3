package com.xiaolong.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaolong.svc.UserSvc;

public class TestTest {

	ApplicationContext apc;
	
	@Before
	public void setUp() throws Exception {
		apc = new ClassPathXmlApplicationContext("/applicationContext.xml");
	}

	@Test
	
	public void test() {
		UserSvc userSvc = (UserSvc) apc.getBean("userSvc");
		String expected = "asdfghj";
		assertTrue(expected.equalsIgnoreCase(userSvc.getPasswordByUserId(1)));;
	}

}
