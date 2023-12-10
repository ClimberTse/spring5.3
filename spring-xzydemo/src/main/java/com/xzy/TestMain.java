package com.xzy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-demo.xml");

		IUserService userService = (IUserService)applicationContext.getBean("userService");
		System.out.println(userService.getUser("123"));
	}
}
