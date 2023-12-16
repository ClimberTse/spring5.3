package com.xzy.service.impl;

import com.xzy.service.IUserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl extends UserServiceParent implements IUserService {
	@Override
	public String getUser(String s) {
		return s;
	}

	public static void main(String[] args) {

	}

	public UserServiceImpl() {
	}
}
