package com.xzy.service.impl;

import com.xzy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements IUserService {
	@Override
	public String getUser(String s) {
		return s;
	}

	public static void main(String[] args) {

	}

	public UserServiceImpl() {
	}
}
