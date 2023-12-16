package com.xzy.service.impl;

import com.xzy.service.IOrderService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceParent {
	private IOrderService orderService;

	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
