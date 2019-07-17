package com.mastek.eshop.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mastek.eshop.model.Orders;
import com.mastek.eshop.service.OrdersService;

@RestController
public class OrdersController {

	@Autowired
	private OrdersService service;
	
	@GetMapping({"/orders"})
	private Iterable<Orders> findAll(){
		return service.findAll();
	}
		@GetMapping("/orders/{ordersid}")
		private Optional<Orders> findById(int id) {
			return service.findById(id);
			
		}
		
	}

