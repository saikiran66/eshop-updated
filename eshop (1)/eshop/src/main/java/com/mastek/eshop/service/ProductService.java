package com.mastek.eshop.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mastek.eshop.model.Product;
import com.mastek.eshop.repository.IProductRepository;



@Service
public class ProductService {
	@Autowired(required=true)
	private IProductRepository repository;
	
	public Iterable<Product> findAll(){
		return repository.findAll();
	}
	
    public Product findById(int id) {
    	return repository.findById(id).get();
    }
    public String deleteById(int id) {
    	repository.deleteById(id);
    	return "Deleted";
    }
    
    public String save(Product entity) {
    	Product newProd=repository.save(entity);
		return "Saved"+newProd;
    	
    }
    public String update(int id,double price) {
    	Product prod=findById(id);
    	prod.setPrice(price);
    	repository.save(prod);
    	return "Update"+prod;

}
}
