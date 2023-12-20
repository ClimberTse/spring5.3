package com.xzy.entity;

import org.springframework.beans.factory.FactoryBean;

public class UserFactory implements FactoryBean<User> {
	@Override
	public User getObject() throws Exception {
		User user = new User();
		user.setAddress("翻身");
		user.setName("汤圆");
		user.setAge(18);
		return user;
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
