package com.mastek.eshop.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mastek.eshop.model.Product;
import com.mastek.eshop.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired(required=true)
	ProductService service;
	
	
       @GetMapping({"/","/products"})
       public Iterable<Product> findAll(){
    	   return service.findAll();
       }
       @GetMapping("/product/{prodId}")
       public Product findById(@PathVariable int prodId){
    	   return service.findById(prodId);
       }
       @PostMapping("/product_save")
       public String save(@RequestBody Product product) {
    	   return service.save(product);
       }
       @PutMapping("/product/update/{prodId}/{price}")
       public String update(@PathVariable int prodId,@PathVariable double price) {
    	   return service.update(prodId,price);
       }
       @DeleteMapping("/product/delete/{prodId}")
       public String delete(@PathVariable int prodId) {
    	   return service.deleteById(prodId);
       }
}