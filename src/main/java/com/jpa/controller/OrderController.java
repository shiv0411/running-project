package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.dto.OrderRequest;
import com.jpa.enitity.Customer;
import com.jpa.repository.CustomerRepository;
import com.jpa.repository.ProductRepository;

@RestController
public class OrderController {
	
	
	@Autowired
	private CustomerRepository  customerRepository;
	
	@Autowired
	private ProductRepository  productRepository;
	
	
	@PostMapping("/Customer")
	public Customer placeOrder(@RequestBody OrderRequest request) {
		
	   return customerRepository.save(request.getCustomer());
		
	}
	@GetMapping("/Customer")
	public List<Customer> findAllOrders(){
		return customerRepository.findAll();
		
	}
	
	

}
