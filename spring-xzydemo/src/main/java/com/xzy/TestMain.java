package com.xzy;

import com.sun.tools.javac.code.Attribute;
import jdk.internal.loader.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("classpath:spring-demo.xml");
		//BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("classpath:spring-demo.xml"));

		IUserService userService = (IUserService) beanFactory.getBean("userService");
		System.out.println(userService.getUser("123"));
	}
}
