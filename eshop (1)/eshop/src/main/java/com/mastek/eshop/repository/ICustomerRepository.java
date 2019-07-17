package com.mastek.eshop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.eshop.model.Customer;

@Repository
public interface ICustomerRepository extends CrudRepository<Customer, Integer>{

}
