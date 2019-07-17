package com.mastek.eshop.repository;

import org.springframework.data.repository.CrudRepository;

import com.mastek.eshop.model.Orders;

public interface IOrdersRepository extends CrudRepository<Orders, Integer> {

}
