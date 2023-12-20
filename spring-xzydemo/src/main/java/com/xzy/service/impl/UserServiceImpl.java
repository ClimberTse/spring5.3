package com.xzy.service.impl;

import com.xzy.service.IOrderService;
import com.xzy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl extends UserServiceParent implements IUserService {
	private IOrderService orderService;

	@Autowired
	public UserServiceImpl(OrderServiceImpl orderService) {
		this.orderService = orderService;
	}

	@Override
	public String getUser(String s) {
		return s;
	}

	public static void main(String[] args) {

	}

	public UserServiceImpl() {
	}

	public IOrderService getOrderService() {
		return orderService;
	}

	public void setOrderService(IOrderService orderService) {
		this.orderService = orderService;
	}
}
