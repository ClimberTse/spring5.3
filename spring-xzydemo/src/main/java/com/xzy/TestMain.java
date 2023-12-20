package com.xzy;

import com.xzy.entity.User;
import com.xzy.entity.UserFactory;
import com.xzy.service.IUserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("classpath:spring-demo.xml");
		//BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("classpath:spring-demo.xml"));

//		Resource resource = new ClassPathResource("spring-demo.xml");
//		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//		BeanDefinitionReader bdr = new XmlBeanDefinitionReader(beanFactory);
//		bdr.loadBeanDefinitions(resource);
//
//		IUserService userService = (IUserService) beanFactory.getBean("userService");
//		System.out.println(userService.getUser("123"));

		User user = (User) beanFactory.getBean("user");
		System.out.println(user);

		UserFactory userFactory = (UserFactory) beanFactory.getBean("&&user");
		System.out.println(userFactory);
	}
}
