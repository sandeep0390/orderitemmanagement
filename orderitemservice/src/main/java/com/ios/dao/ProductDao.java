package com.ios.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ios.model.OrderItem;

@Repository
public interface ProductDao extends JpaRepository<OrderItem, Long>{

}
