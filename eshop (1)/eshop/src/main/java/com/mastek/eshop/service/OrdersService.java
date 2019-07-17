package com.mastek.eshop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mastek.eshop.model.Orders;
import com.mastek.eshop.repository.IOrdersRepository;

@Service
public class OrdersService {

	@Autowired(required = true)
	private IOrdersRepository repository;
	
	public Iterable<Orders> findAll(){
		return repository.findAll();
	}
	public  Optional<Orders> findById(int id) {
		return repository.findById(id);
	}
	
	
}
