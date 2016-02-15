package com.gxl.test.main;
import java.io.IOException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	private ApplicationContext context;

	public @Test void init() {
		context = new ClassPathXmlApplicationContext("classpath:root-context.xml");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}