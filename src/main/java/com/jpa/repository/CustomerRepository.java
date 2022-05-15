package com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.enitity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer,Integer>{
	
	

}
