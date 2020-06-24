package com.ios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ios.dao.ProductDao;
import com.ios.model.OrderItem;

@Service
public class ProductService {
	@Autowired
	ProductDao productDao;
	
	public void saveProduct(OrderItem orderItem) {
		productDao.save(orderItem);
	}
	
	public List<OrderItem> getProductsList(){
		return productDao.findAll();
	}
}
