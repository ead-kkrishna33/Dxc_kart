package com.dxc.service;

import java.util.List;

import com.dxc.model.Order;

public interface OrderService {
	public void addTocart(Order order);
	public List<Order> GetOrderByUserName(String userName);
}
