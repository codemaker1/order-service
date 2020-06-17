package com.micro.orders.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.micro.orders.entity.Orders;

public interface OrdersRepository extends CrudRepository<Orders, Integer> {
	
	public List<Orders> findByUserId(int id);

}
