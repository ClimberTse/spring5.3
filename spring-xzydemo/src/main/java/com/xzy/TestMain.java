package com.xzy;

import com.xzy.service.IUserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestMain {
	public static void main(String[] args) {
		//ApplicationContext beanFactory = new ClassPathXmlApplicationContext("classpath:spring-demo.xml");
		//BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("classpath:spring-demo.xml"));

		Resource resource = new ClassPathResource("spring-demo.xml");
		BeanFactory beanFactory = new DefaultListableBeanFactory();
		BeanDefinitionReader bdr = new XmlBeanDefinitionReader((BeanDefinitionRegistry) beanFactory);
		bdr.loadBeanDefinitions(resource);

		IUserService userService = (IUserService) beanFactory.getBean("userService");
		System.out.println(userService.getUser("123"));
		IUserService userService2 = (IUserService) beanFactory.getBean("userService");
	}
}
