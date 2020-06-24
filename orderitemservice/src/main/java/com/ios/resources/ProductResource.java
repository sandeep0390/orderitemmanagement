package com.ios.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ios.model.OrderItem;
import com.ios.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductResource {
	
	@Autowired
	ProductService productService;
	@PostMapping("/product")
   public void saveProduct(@RequestBody OrderItem orderItem) {
	   productService.saveProduct(orderItem);
   }
   
	@GetMapping("/list")
   public List<OrderItem> getProducts(){
	   return productService.getProductsList();
   }
   
}
