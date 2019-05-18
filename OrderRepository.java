package com.dxc.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxc.model.Order;

public interface OrderRepository extends MongoRepository<Order, String> {

}
