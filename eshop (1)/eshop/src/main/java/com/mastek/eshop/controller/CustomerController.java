package com.mastek.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mastek.eshop.model.Customer;

import com.mastek.eshop.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired(required=true)
	CustomerService service;
	
	
       @GetMapping({"/customers"})
       public Iterable<Customer> findAll(){
    	   return service.findAll();
       }
       @GetMapping("/customer/{customerId}")
       public Customer findById(@PathVariable int customerId){
    	   return service.findById(customerId);
       }
       @PostMapping("/customer_save")
       public String save(@RequestBody Customer customer) {
    	   return service.save(customer);
       }
       @PutMapping("/customer/update/{customerId}/{email}")
       public String update(@PathVariable int customerId,@PathVariable String email) {
    	   return service.update(customerId,email);
       }
       @DeleteMapping("/product/delete/{customerId}")
       public String delete(@PathVariable int customerId) {
    	   return service.deleteById(customerId);
       }
}
