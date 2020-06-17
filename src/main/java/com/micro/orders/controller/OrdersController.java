package com.micro.orders.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.micro.orders.entity.Orders;
import com.micro.orders.repository.OrdersRepository;


@RestController
@Produces(MediaType.APPLICATION_JSON)
public class OrdersController {
	
	@Autowired
	OrdersRepository ordersRepository;
	
	@GetMapping("/check")
	public String check()
	{
		return "ok";
	}
	
	@GetMapping("/orders/{id}")
	public List<Orders> getUser(@PathVariable int id)
	{
	  List<Orders> orders = ordersRepository.findByUserId(id);
	  return orders;
		
	}
	

}
