package com.dxc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.model.Order;
import com.dxc.repos.OrderRepository;
import com.dxc.repos.UserRepository;

@Service
public class OrderServiceimpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;

	@Override
	public void addTocart(Order order) {
		orderRepository.save(order);
		
	}

	@Override
	public List<Order> GetOrderByUserName(String userName) {
		List<Order> orders = orderRepository.findAll();
		List<Order> resultOrders = new ArrayList<Order>();
		for(Order order : orders) {
			if(order.getUsername().equals(userName)) {
				resultOrders.add(order);
			}
		}
		return resultOrders;
	}


}
