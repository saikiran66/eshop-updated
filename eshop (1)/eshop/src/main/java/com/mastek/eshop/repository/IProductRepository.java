package com.mastek.eshop.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.eshop.model.Product;
@Repository
public interface IProductRepository extends CrudRepository<Product, Integer> {

}
