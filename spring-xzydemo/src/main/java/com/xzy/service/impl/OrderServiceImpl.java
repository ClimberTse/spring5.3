package com.xzy.service.impl;

import com.xzy.service.IOrderService;
import com.xzy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements IOrderService {
	private IUserService userService;

	@Override
	public String getOrder() {
		return "getOrder";
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
}
