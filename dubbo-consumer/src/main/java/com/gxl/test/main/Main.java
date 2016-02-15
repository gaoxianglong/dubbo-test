package com.gxl.test.main;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gxl.test.service.user.UserService;

public class Main {
	private static ApplicationContext context;
	private Logger logger = LoggerFactory.getLogger(Main.class);

	public @BeforeClass static void init() {
		context = new ClassPathXmlApplicationContext("classpath:root-context.xml");
	}

	public @Test void testMethod() {
		try {
			UserService userService = (UserService) context.getBean("userService");
			logger.info(userService.userLogin("admin", "1235456") ? "login success" : "login fail");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}