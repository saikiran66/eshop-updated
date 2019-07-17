package com.mastek.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mastek.eshop.model.OrderItem;
import com.mastek.eshop.service.OrderItemService;

@RestController
public class OrderItemController {

	@Autowired(required = true)
	private OrderItemService service;
	
	@GetMapping({"/orderitems"})
	private Iterable<OrderItem> findAll(){
		return service.findAll();
	}
	@GetMapping("/orderitem/{orderitemid}")
	private OrderItem findById(int id) {
		return service.findById(id);
		
	}
	@PostMapping("/orderitem_save")
	private String save(@RequestBody OrderItem orderitem) {
		return service.save(orderitem);
	}
	 @PutMapping("/orderitem/update/{orderitemid}/{quantity}")
     public String update(@PathVariable int orderitemid,@PathVariable double quantity) {
  	   return service.update(orderitemid,quantity);
     }
     @DeleteMapping("/product/delete/{orderitemid}")
     public String delete(@PathVariable int orderitemid) {
  	   return service.deleteById(orderitemid);
     }
}
