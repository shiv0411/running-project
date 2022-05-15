package com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.enitity.Product;

public interface ProductRepository  extends JpaRepository<Product,Integer> {

}
