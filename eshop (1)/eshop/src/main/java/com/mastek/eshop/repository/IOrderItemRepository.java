package com.mastek.eshop.repository;

import org.springframework.data.repository.CrudRepository;


import com.mastek.eshop.model.OrderItem;

public interface IOrderItemRepository extends CrudRepository<OrderItem, Integer> {

}
