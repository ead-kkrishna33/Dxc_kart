package com.dxc.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.model.Order;
import com.dxc.service.OrderService;

@RestController
@RequestMapping("/api/v1/order")
@CrossOrigin(origins ="*")
public class OrderController {
	@Autowired
	OrderService orderService;
	
	@PostMapping("/saveOrder")
	public boolean addTocart(@RequestBody Order order) {			
		 orderService.addTocart(order);	
		 return true;
	}
	
	@GetMapping("/get/{username}")	
	public List<Order> getOrderList(@PathVariable("username") String username){
		List<Order> orders= orderService.GetOrderByUserName(username);
	   return orders;
		
	}
}
