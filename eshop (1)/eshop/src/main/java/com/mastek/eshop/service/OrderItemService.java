package com.mastek.eshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mastek.eshop.model.OrderItem;

import com.mastek.eshop.repository.IOrderItemRepository;

@Service
public class OrderItemService {

	@Autowired(required = true)
	private IOrderItemRepository repository;
	
	public Iterable<OrderItem> findAll(){
		return repository.findAll();
	}
	public OrderItem findById(int id) {
		return repository.findById(id).get();
	}
	public String deleteById(int id) {
    	repository.deleteById(id);
    	return "Deleted";
    }
    
    public String save(OrderItem entity) {
    	OrderItem newOrd=repository.save(entity);
		return "Saved"+newOrd;
    	
    }
    public String update(int id,double quantity) {
    	OrderItem ord=findById(id);
    	ord.setQuantity(quantity);
    	repository.save(ord);
    	return "Update"+ord;

}
}
