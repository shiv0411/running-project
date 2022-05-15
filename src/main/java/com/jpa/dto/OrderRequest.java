package com.jpa.dto;

import org.springframework.stereotype.Component;

import com.jpa.enitity.Customer;

@Component
public class OrderRequest {
    
	
	
	private Customer customer;

	     
	@Override
	public String toString() {
		return "OrderRequest [customer=" + customer + "]";
	}

	public OrderRequest(Customer customer) {
		super();
		this.customer = customer;
	}

	public OrderRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	
}
